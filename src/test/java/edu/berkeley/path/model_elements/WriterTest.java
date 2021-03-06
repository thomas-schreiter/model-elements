/**
 * Copyright (c) 2012 The Regents of the University of California.
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */

package edu.berkeley.path.model_elements;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.*;

import java.io.*;
import java.nio.ByteBuffer;

import org.apache.commons.io.FileUtils;

import org.apache.avro.*;
import org.apache.avro.file.*;
import org.apache.avro.specific.*;
import org.apache.avro.io.*;

public class WriterTest {
  Network nw;
  Schema schema;
  
  @Before
  public void setup() {
    nw = new Network();
    schema = nw.getSchema();

    nw.setId(42L);
    nw.setName("test network");

    nw.setNodes(new ArrayList<edu.berkeley.path.model_elements_base.Node>());
    nw.setLinks(new ArrayList<edu.berkeley.path.model_elements_base.Link>());
    
    Node nd1;
    Node nd2;
    Link ln;

    nd1 = new Node();
    nd1.setId(1L);
    nd1.setName("one");
    nd1.setType("Highway");
    nd1.setLongitude(0.0);
    nd1.setLatitude(0.0);
    nw.getNodes().add(nd1);

    nd2 = new Node();
    nd2.setId(2L);
    nd2.setName("two");
    nd2.setType("Highway");
    nd2.setLongitude(0.0);
    nd2.setLatitude(0.0);
    nw.getNodes().add(nd2);

    ln = new Link();
    ln.setId(3L);
    ln.setName("three");
    ln.setType("Highway");
    ln.setLaneCount(4.0);
    ln.setLength(1000.0);
    
    ln.setBegin(nd1);
    ln.setEnd(nd2);

    Point p0 = new Point();
    p0.setLongitude(-75.97469);
    p0.setLatitude(40.90164);

    Point p1 = new Point();
    p1.setLongitude(-76.97469);
    p1.setLatitude(41.90164);
    
    ln.getPointList().add(p0);
    ln.getPointList().add(p1);

    nw.getLinks().add(ln);
  }

  @Test
  public void testWriteNetworkToBinaryFile() throws IOException {
    new File("tmp").mkdirs();
    File file = new File("tmp/data.avro");
    
    DatumWriter<Network> writer =
      new SpecificDatumWriter<Network>(schema);
    
    DataFileWriter<Network> dataFileWriter =
      new DataFileWriter<Network>(writer);
    
    dataFileWriter.create(schema, file);
    dataFileWriter.append(nw);
    dataFileWriter.close();
    
    // TODO assert something
  }

  @Test
  public void testWriteNetworkToByteBuffer() throws IOException {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    EncoderFactory ef = new EncoderFactory();
    Encoder e = ef.binaryEncoder(out, null);
     
    DatumWriter<Network> writer =
      new SpecificDatumWriter<Network>(schema);
    
    writer.write(nw, e);
    e.flush();
    ByteBuffer serialized = ByteBuffer.allocate(out.toByteArray().length);
    serialized.put(out.toByteArray());
    
    // TODO assert something
  }

  @Test
  public void testWriteNetworkToJson() throws IOException {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    EncoderFactory ef = new EncoderFactory();
    Encoder e = ef.jsonEncoder(schema, out);
     
    DatumWriter<Network> writer =
      new SpecificDatumWriter<Network>(schema);
    
    writer.write(nw, e);
    e.flush();
    
    String actual = out.toString();
    
//     System.out.println("serialized:\n");
//     System.out.println(actual);
//     System.out.println("---\n");
    
    String expected = FileUtils.readFileToString(
      new File("src/test/resources/fixtures/NetworkToJson.json"));

    if (expected.endsWith("\n")) {
        expected = expected.substring(0, expected.length() - 1);
    }

    if (expected.endsWith("\r")) {
        expected = expected.substring(0, expected.length() - 1);
    }

//     System.out.println("fixture:\n");
//     System.out.println(expected);
//     System.out.println("---\n");
    
    assertEquals(expected, actual);
    
    // Now check that we can read the string as a Network.
    
    // Tell Avro that we want model_elements classes instead of model_elements_base.
    Schema.Parser parser = new Schema.Parser();
    String schemaStr = schema.toString().replaceFirst(
        "\"namespace\":\"edu.berkeley.path.model_elements_base\"",
        "\"namespace\":\"edu.berkeley.path.model_elements\""
    );
    Schema schemaForReading = parser.parse(schemaStr);
    
    //System.out.println(schemaForReading);

    DatumReader<Network> reader =
      new SpecificDatumReader<Network>(schemaForReading);
    
    ByteArrayInputStream in = new ByteArrayInputStream(actual.getBytes());
    DecoderFactory df = new DecoderFactory();
    Decoder d = df.jsonDecoder(schemaForReading, in);
    
    Network nw2 = reader.read(null, d);
    
    assertEquals(nw.getId(), nw2.getId().toString());
    assertEquals(nw.getName(), nw2.getName().toString());
    assertEquals(nw.getNodes().size(), nw2.getNodes().size());
    
    assertEquals("edu.berkeley.path.model_elements.Node", nw.getNodes().get(0).getClass().getName());
    
    Node nd_in_nw = (Node)nw.getNodes().get(0);
    Node nd_in_nw2 = (Node)nw2.getNodes().get(0);
    assertEquals(nd_in_nw.getName(), nd_in_nw2.getName().toString());
  }
}
