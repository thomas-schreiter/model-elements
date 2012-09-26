/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements;

@SuppressWarnings("all")
/** * Description of the config and state of our networks and related data.
 *
 * Note: all units in SI (meters, seconds, etc.) except where specified. */
public interface model_elements {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"model_elements\",\"namespace\":\"edu.berkeley.path.model_elements\",\"doc\":\"* Description of the config and state of our networks and related data.\\r\\n *\\r\\n * Note: all units in SI (meters, seconds, etc.) except where specified.\",\"types\":[{\"type\":\"record\",\"name\":\"Time\",\"doc\":\"seconds and milliseconds, can be absolute or relative\\r\\n     (when absolute: since epoch, utc)\",\"fields\":[{\"name\":\"seconds\",\"type\":\"long\"},{\"name\":\"milliseconds\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"NodeRef\",\"fields\":[{\"name\":\"nodeId\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"LinkRef\",\"fields\":[{\"name\":\"linkId\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"NetworkRef\",\"fields\":[{\"name\":\"networkId\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"Node\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"Link\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"laneCount\",\"type\":\"double\"},{\"name\":\"length\",\"type\":\"double\"},{\"name\":\"laneOffset\",\"type\":\"int\",\"default\":0},{\"name\":\"begin\",\"type\":\"NodeRef\"},{\"name\":\"end\",\"type\":\"NodeRef\"}]},{\"type\":\"record\",\"name\":\"Network\",\"fields\":[{\"name\":\"id\",\"type\":\"string\",\"default\":\"1\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"nodes\",\"type\":{\"type\":\"array\",\"items\":\"Node\"},\"default\":[]},{\"name\":\"links\",\"type\":{\"type\":\"array\",\"items\":\"Link\"},\"default\":[]}]},{\"type\":\"record\",\"name\":\"DensityProfile\",\"doc\":\"Density on each link and cell at a point in time\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"vehiclesPerMeter\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"double\"}},\"doc\":\"map key is linkId\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"VelocityProfile\",\"doc\":\"Velocity on each link and cell at a point in time\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"metersPerSecond\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"double\"}},\"doc\":\"map key is linkId\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"FD\",\"doc\":\"Fundamental diagram on one link at one time\",\"fields\":[{\"name\":\"freeFlowSpeed\",\"type\":\"double\"},{\"name\":\"freeFlowSpeedStdev\",\"type\":\"double\"},{\"name\":\"congestionWaveSpeed\",\"type\":\"double\"},{\"name\":\"congestionWaveSpeedStdev\",\"type\":\"double\"},{\"name\":\"capacity\",\"type\":\"double\"},{\"name\":\"capacityStdev\",\"type\":\"double\"},{\"name\":\"jamDensity\",\"type\":\"double\"},{\"name\":\"capacityDrop\",\"type\":\"double\"}]},{\"type\":\"record\",\"name\":\"FDProfile\",\"doc\":\"Fundamental diagrams on each link as time series\",\"fields\":[{\"name\":\"dt\",\"type\":\"double\",\"default\":300.0},{\"name\":\"startTime\",\"type\":\"double\",\"default\":0.0},{\"name\":\"fd\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"FD\"}},\"doc\":\"map key is linkId, array is time series, as per dt and startTime.\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"DemandProfile\",\"doc\":\"Demands on each link as time series\",\"fields\":[{\"name\":\"dt\",\"type\":\"double\",\"default\":300.0},{\"name\":\"startTime\",\"type\":\"double\",\"default\":0.0},{\"name\":\"origin\",\"type\":\"LinkRef\",\"doc\":\"may not be null\"},{\"name\":\"destination\",\"type\":\"LinkRef\",\"doc\":\"may be null\"},{\"name\":\"demand\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"double\"}},\"doc\":\"map key is linkId, array is time series, as per dt and startTime.\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"Scenario\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"network\",\"type\":\"Network\"},{\"name\":\"initialDensityProfile\",\"type\":\"DensityProfile\"},{\"name\":\"initialVelocityProfile\",\"type\":\"VelocityProfile\"},{\"name\":\"fdProfile\",\"type\":\"FDProfile\"},{\"name\":\"demandProfile\",\"type\":\"DemandProfile\"}]}],\"messages\":{}}");

  @SuppressWarnings("all")
  /** * Description of the config and state of our networks and related data.
 *
 * Note: all units in SI (meters, seconds, etc.) except where specified. */
  public interface Callback extends model_elements {
    public static final org.apache.avro.Protocol PROTOCOL = edu.berkeley.path.model_elements.model_elements.PROTOCOL;
  }
}