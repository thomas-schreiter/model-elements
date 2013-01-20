/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * A scenario represents the state of the world now and projected
   * into the future, to the extent that can be known in advance.
   *
   * The configuration that belongs in a scenario and the objects that it
   * contains are just those parameters that make an assertion about the 
   * world, an assertion which is observable, and verifiable. So, for example,
   * choice of CTM algorithm does not belong here, but FD parameters do,
   * and signal control algorithms do. (The CTM choice should be in the
   * Context.) */
public class Scenario extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Scenario\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* A scenario represents the state of the world now and projected\\r\\n   * into the future, to the extent that can be known in advance.\\r\\n   *\\r\\n   * The configuration that belongs in a scenario and the objects that it\\r\\n   * contains are just those parameters that make an assertion about the \\r\\n   * world, an assertion which is observable, and verifiable. So, for example,\\r\\n   * choice of CTM algorithm does not belong here, but FD parameters do,\\r\\n   * and signal control algorithms do. (The CTM choice should be in the\\r\\n   * Context.)\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"projectId\",\"type\":[\"null\",\"string\"]},{\"name\":\"networks\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Network\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"projectId\",\"type\":[\"null\",\"string\"]},{\"name\":\"nodes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Node\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}},\"default\":[]},{\"name\":\"links\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Link\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"laneCount\",\"type\":[\"null\",\"double\"]},{\"name\":\"length\",\"type\":[\"null\",\"double\"]},{\"name\":\"laneOffset\",\"type\":[\"null\",\"int\"],\"doc\":\"* index of the first lane of this link in case the road is\\r\\n     * divided into paralell links.\"},{\"name\":\"speedLimit\",\"type\":[\"null\",\"double\"]},{\"name\":\"detailLevel\",\"type\":[\"null\",\"int\"]},{\"name\":\"beginId\",\"type\":\"string\"},{\"name\":\"endId\",\"type\":\"string\"}]}},\"default\":[]},{\"name\":\"modstamp\",\"type\":\"long\"}]}},\"default\":[]},{\"name\":\"initialDensity\",\"type\":{\"type\":\"record\",\"name\":\"DensitySet\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"projectId\",\"type\":[\"null\",\"string\"]},{\"name\":\"density\",\"type\":{\"type\":\"record\",\"name\":\"DensityMap\",\"doc\":\"* Density on each link at a point in time\",\"fields\":[{\"name\":\"vehiclesPerMeter\",\"type\":{\"type\":\"map\",\"values\":\"double\"},\"doc\":\"map key is linkId\",\"default\":{}}]}}]},\"default\":null},{\"name\":\"initialVelocity\",\"type\":{\"type\":\"record\",\"name\":\"VelocitySet\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"projectId\",\"type\":[\"null\",\"string\"]},{\"name\":\"velocity\",\"type\":{\"type\":\"record\",\"name\":\"VelocityMap\",\"doc\":\"* Velocity on each link at a point in time\",\"fields\":[{\"name\":\"metersPerSecond\",\"type\":{\"type\":\"map\",\"values\":\"double\"},\"doc\":\"map key is linkId\",\"default\":{}}]}}]},\"default\":null},{\"name\":\"fdSet\",\"type\":{\"type\":\"record\",\"name\":\"FDSet\",\"doc\":\"* Specification of Fundamental diagram time series across one or more\\r\\n   * networks, for use in a scenario.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"projectId\",\"type\":[\"null\",\"string\"]},{\"name\":\"type\",\"type\":{\"type\":\"record\",\"name\":\"FDType\",\"doc\":\"* Referenced by FDSet to indicate the way the contained FDs should\\r\\n   * be interpreted.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]}]}},{\"name\":\"profile\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"FDProfile\",\"doc\":\"* FD time series at a link. The link ID is not stored\\r\\n   * in this record, but as the map key in the FDSet.profile.\",\"fields\":[{\"name\":\"startTime\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 0\",\"default\":0.0},{\"name\":\"sampleRate\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 300 seconds\",\"default\":300.0},{\"name\":\"fd\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FD\",\"doc\":\"* Fundamental diagram parameters on one link at one time.\\r\\n   * Flow and density values are per lane in SI units.\",\"fields\":[{\"name\":\"freeFlowSpeed\",\"type\":[\"null\",\"double\"]},{\"name\":\"criticalSpeed\",\"type\":[\"null\",\"double\"]},{\"name\":\"congestionWaveSpeed\",\"type\":[\"null\",\"double\"]},{\"name\":\"capacity\",\"type\":[\"null\",\"double\"]},{\"name\":\"jamDensity\",\"type\":[\"null\",\"double\"]},{\"name\":\"capacityDrop\",\"type\":[\"null\",\"double\"]},{\"name\":\"freeFlowSpeedStd\",\"type\":[\"null\",\"double\"]},{\"name\":\"congestionWaveSpeedStd\",\"type\":[\"null\",\"double\"]},{\"name\":\"capacityStd\",\"type\":[\"null\",\"double\"]}]}},\"doc\":\"* time series of FDs;\\r\\n     * array index is index in time series (\\\"DIAG_ORDER\\\" in db)\"}]}},\"doc\":\"* map key is linkId\"},{\"name\":\"modstamp\",\"type\":\"long\"}]},\"default\":null},{\"name\":\"demandSet\",\"type\":{\"type\":\"record\",\"name\":\"DemandSet\",\"doc\":\"* Specification of demand time series across one or more networks,\\r\\n   * for use in a scenario.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"projectId\",\"type\":[\"null\",\"string\"]},{\"name\":\"profile\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"DemandProfile\",\"doc\":\"* Demand time series at a link. The origin link ID is not stored\\r\\n   * in this record, but as the map key in the DemandSet.profile.\",\"fields\":[{\"name\":\"destinationNetworkId\",\"type\":[\"null\",\"string\"],\"doc\":\"* if null, this profile governs background flow, not OD flow.\"},{\"name\":\"startTime\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 0\",\"default\":0.0},{\"name\":\"sampleRate\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 300 seconds\",\"default\":300.0},{\"name\":\"knob\",\"type\":[\"null\",\"double\"],\"doc\":\"* demand scale factor\",\"default\":1.0},{\"name\":\"stdDevAdd\",\"type\":[\"null\",\"double\"],\"default\":0.0},{\"name\":\"stdDevMult\",\"type\":[\"null\",\"double\"],\"default\":1.0},{\"name\":\"flow\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"double\"}},\"doc\":\"* time series of flows;\\r\\n     * map keys is vehTypeId;\\r\\n     * array index is index in time series (\\\"DEMAND_ORDER\\\" in db)\"}]}},\"doc\":\"* map key is originLinkId\"},{\"name\":\"modstamp\",\"type\":\"long\"}]},\"default\":null},{\"name\":\"splitratioSet\",\"type\":{\"type\":\"record\",\"name\":\"SplitRatioSet\",\"doc\":\"* Specification of split ratio time series across one or more networks,\\r\\n   * for use in a scenario.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"projectId\",\"type\":[\"null\",\"string\"]},{\"name\":\"profile\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"SplitRatioProfile\",\"doc\":\"* Split ratio time series at a node. The node ID is not stored\\r\\n   * in this record, but as the map key in the SplitRatioSet.profile.\",\"fields\":[{\"name\":\"destinationNetworkId\",\"type\":[\"null\",\"string\"],\"doc\":\"* if null, this profile governs background flow, not OD flow.\"},{\"name\":\"startTime\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 0\",\"default\":0.0},{\"name\":\"sampleRate\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 300 seconds\",\"default\":300.0},{\"name\":\"ratio\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"double\"}}}},\"doc\":\"* time series of ratios;\\r\\n     * map keys are: inLinkId, outLinkId, vehTypeId;\\r\\n     * array index is index in time series (\\\"RATIO_ORDER\\\" in db)\"}]}},\"doc\":\"* map key is nodeId\"},{\"name\":\"modstamp\",\"type\":\"long\"}]},\"default\":null},{\"name\":\"sensorSet\",\"type\":{\"type\":\"record\",\"name\":\"SensorSet\",\"doc\":\"* Set of sensors residing on links in potentially multiple networks.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"projectId\",\"type\":[\"null\",\"string\"]},{\"name\":\"sensors\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Sensor\",\"doc\":\"* Sensor that can describe loop detector, magnetic detector, TMC,\\r\\n   * camera, radar, etc.\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"doc\":\"* \\\"Loop\\\", etc. Translated to numeric type in the DB.\"},{\"name\":\"entityId\",\"type\":[\"null\",\"string\"],\"doc\":\"* ID of original detector, e.g. VDS ID\"},{\"name\":\"measurementFeedId\",\"type\":[\"null\",\"string\"],\"doc\":\"* data feed associated with this sensor\"},{\"name\":\"linkId\",\"type\":\"string\"},{\"name\":\"linkOffset\",\"type\":\"double\",\"default\":0},{\"name\":\"laneNum\",\"type\":\"double\",\"default\":1},{\"name\":\"healthStatus\",\"type\":\"double\",\"doc\":\"* healthy by default\",\"default\":1}]}}},{\"name\":\"modstamp\",\"type\":\"long\"}]},\"default\":null},{\"name\":\"modstamp\",\"type\":\"long\"}]}");
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence description;
  @Deprecated public java.lang.CharSequence projectId;
  @Deprecated public java.util.List<edu.berkeley.path.model_elements_base.Network> networks;
  @Deprecated public edu.berkeley.path.model_elements_base.DensitySet initialDensity;
  @Deprecated public edu.berkeley.path.model_elements_base.VelocitySet initialVelocity;
  @Deprecated public edu.berkeley.path.model_elements_base.FDSet fdSet;
  @Deprecated public edu.berkeley.path.model_elements_base.DemandSet demandSet;
  @Deprecated public edu.berkeley.path.model_elements_base.SplitRatioSet splitratioSet;
  @Deprecated public edu.berkeley.path.model_elements_base.SensorSet sensorSet;
  @Deprecated public long modstamp;

  /**
   * Default constructor.
   */
  public Scenario() {}

  /**
   * All-args constructor.
   */
  public Scenario(java.lang.CharSequence id, java.lang.CharSequence name, java.lang.CharSequence description, java.lang.CharSequence projectId, java.util.List<edu.berkeley.path.model_elements_base.Network> networks, edu.berkeley.path.model_elements_base.DensitySet initialDensity, edu.berkeley.path.model_elements_base.VelocitySet initialVelocity, edu.berkeley.path.model_elements_base.FDSet fdSet, edu.berkeley.path.model_elements_base.DemandSet demandSet, edu.berkeley.path.model_elements_base.SplitRatioSet splitratioSet, edu.berkeley.path.model_elements_base.SensorSet sensorSet, java.lang.Long modstamp) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.projectId = projectId;
    this.networks = networks;
    this.initialDensity = initialDensity;
    this.initialVelocity = initialVelocity;
    this.fdSet = fdSet;
    this.demandSet = demandSet;
    this.splitratioSet = splitratioSet;
    this.sensorSet = sensorSet;
    this.modstamp = modstamp;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return description;
    case 3: return projectId;
    case 4: return networks;
    case 5: return initialDensity;
    case 6: return initialVelocity;
    case 7: return fdSet;
    case 8: return demandSet;
    case 9: return splitratioSet;
    case 10: return sensorSet;
    case 11: return modstamp;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: description = (java.lang.CharSequence)value$; break;
    case 3: projectId = (java.lang.CharSequence)value$; break;
    case 4: networks = (java.util.List<edu.berkeley.path.model_elements_base.Network>)value$; break;
    case 5: initialDensity = (edu.berkeley.path.model_elements_base.DensitySet)value$; break;
    case 6: initialVelocity = (edu.berkeley.path.model_elements_base.VelocitySet)value$; break;
    case 7: fdSet = (edu.berkeley.path.model_elements_base.FDSet)value$; break;
    case 8: demandSet = (edu.berkeley.path.model_elements_base.DemandSet)value$; break;
    case 9: splitratioSet = (edu.berkeley.path.model_elements_base.SplitRatioSet)value$; break;
    case 10: sensorSet = (edu.berkeley.path.model_elements_base.SensorSet)value$; break;
    case 11: modstamp = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'projectId' field.
   */
  public java.lang.CharSequence getProjectId() {
    return projectId;
  }

  /**
   * Sets the value of the 'projectId' field.
   * @param value the value to set.
   */
  public void setProjectId(java.lang.CharSequence value) {
    this.projectId = value;
  }

  /**
   * Gets the value of the 'networks' field.
   */
  public java.util.List<edu.berkeley.path.model_elements_base.Network> getNetworks() {
    return networks;
  }

  /**
   * Sets the value of the 'networks' field.
   * @param value the value to set.
   */
  public void setNetworks(java.util.List<edu.berkeley.path.model_elements_base.Network> value) {
    this.networks = value;
  }

  /**
   * Gets the value of the 'initialDensity' field.
   */
  public edu.berkeley.path.model_elements_base.DensitySet getInitialDensity() {
    return initialDensity;
  }

  /**
   * Sets the value of the 'initialDensity' field.
   * @param value the value to set.
   */
  public void setInitialDensity(edu.berkeley.path.model_elements_base.DensitySet value) {
    this.initialDensity = value;
  }

  /**
   * Gets the value of the 'initialVelocity' field.
   */
  public edu.berkeley.path.model_elements_base.VelocitySet getInitialVelocity() {
    return initialVelocity;
  }

  /**
   * Sets the value of the 'initialVelocity' field.
   * @param value the value to set.
   */
  public void setInitialVelocity(edu.berkeley.path.model_elements_base.VelocitySet value) {
    this.initialVelocity = value;
  }

  /**
   * Gets the value of the 'fdSet' field.
   */
  public edu.berkeley.path.model_elements_base.FDSet getFdSet() {
    return fdSet;
  }

  /**
   * Sets the value of the 'fdSet' field.
   * @param value the value to set.
   */
  public void setFdSet(edu.berkeley.path.model_elements_base.FDSet value) {
    this.fdSet = value;
  }

  /**
   * Gets the value of the 'demandSet' field.
   */
  public edu.berkeley.path.model_elements_base.DemandSet getDemandSet() {
    return demandSet;
  }

  /**
   * Sets the value of the 'demandSet' field.
   * @param value the value to set.
   */
  public void setDemandSet(edu.berkeley.path.model_elements_base.DemandSet value) {
    this.demandSet = value;
  }

  /**
   * Gets the value of the 'splitratioSet' field.
   */
  public edu.berkeley.path.model_elements_base.SplitRatioSet getSplitratioSet() {
    return splitratioSet;
  }

  /**
   * Sets the value of the 'splitratioSet' field.
   * @param value the value to set.
   */
  public void setSplitratioSet(edu.berkeley.path.model_elements_base.SplitRatioSet value) {
    this.splitratioSet = value;
  }

  /**
   * Gets the value of the 'sensorSet' field.
   */
  public edu.berkeley.path.model_elements_base.SensorSet getSensorSet() {
    return sensorSet;
  }

  /**
   * Sets the value of the 'sensorSet' field.
   * @param value the value to set.
   */
  public void setSensorSet(edu.berkeley.path.model_elements_base.SensorSet value) {
    this.sensorSet = value;
  }

  /**
   * Gets the value of the 'modstamp' field.
   */
  public java.lang.Long getModstamp() {
    return modstamp;
  }

  /**
   * Sets the value of the 'modstamp' field.
   * @param value the value to set.
   */
  public void setModstamp(java.lang.Long value) {
    this.modstamp = value;
  }

  /** Creates a new Scenario RecordBuilder */
  public static edu.berkeley.path.model_elements_base.Scenario.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.Scenario.Builder();
  }
  
  /** Creates a new Scenario RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.Scenario.Builder newBuilder(edu.berkeley.path.model_elements_base.Scenario.Builder other) {
    return new edu.berkeley.path.model_elements_base.Scenario.Builder(other);
  }
  
  /** Creates a new Scenario RecordBuilder by copying an existing Scenario instance */
  public static edu.berkeley.path.model_elements_base.Scenario.Builder newBuilder(edu.berkeley.path.model_elements_base.Scenario other) {
    return new edu.berkeley.path.model_elements_base.Scenario.Builder(other);
  }
  
  /**
   * RecordBuilder for Scenario instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Scenario>
    implements org.apache.avro.data.RecordBuilder<Scenario> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence description;
    private java.lang.CharSequence projectId;
    private java.util.List<edu.berkeley.path.model_elements_base.Network> networks;
    private edu.berkeley.path.model_elements_base.DensitySet initialDensity;
    private edu.berkeley.path.model_elements_base.VelocitySet initialVelocity;
    private edu.berkeley.path.model_elements_base.FDSet fdSet;
    private edu.berkeley.path.model_elements_base.DemandSet demandSet;
    private edu.berkeley.path.model_elements_base.SplitRatioSet splitratioSet;
    private edu.berkeley.path.model_elements_base.SensorSet sensorSet;
    private long modstamp;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.Scenario.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.Scenario.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Scenario instance */
    private Builder(edu.berkeley.path.model_elements_base.Scenario other) {
            super(edu.berkeley.path.model_elements_base.Scenario.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.projectId)) {
        this.projectId = (java.lang.CharSequence) data().deepCopy(fields()[3].schema(), other.projectId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.networks)) {
        this.networks = (java.util.List<edu.berkeley.path.model_elements_base.Network>) data().deepCopy(fields()[4].schema(), other.networks);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.initialDensity)) {
        this.initialDensity = (edu.berkeley.path.model_elements_base.DensitySet) data().deepCopy(fields()[5].schema(), other.initialDensity);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.initialVelocity)) {
        this.initialVelocity = (edu.berkeley.path.model_elements_base.VelocitySet) data().deepCopy(fields()[6].schema(), other.initialVelocity);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.fdSet)) {
        this.fdSet = (edu.berkeley.path.model_elements_base.FDSet) data().deepCopy(fields()[7].schema(), other.fdSet);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.demandSet)) {
        this.demandSet = (edu.berkeley.path.model_elements_base.DemandSet) data().deepCopy(fields()[8].schema(), other.demandSet);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.splitratioSet)) {
        this.splitratioSet = (edu.berkeley.path.model_elements_base.SplitRatioSet) data().deepCopy(fields()[9].schema(), other.splitratioSet);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.sensorSet)) {
        this.sensorSet = (edu.berkeley.path.model_elements_base.SensorSet) data().deepCopy(fields()[10].schema(), other.sensorSet);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.modstamp)) {
        this.modstamp = (java.lang.Long) data().deepCopy(fields()[11].schema(), other.modstamp);
        fieldSetFlags()[11] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.CharSequence getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.description = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'description' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder clearDescription() {
      description = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'projectId' field */
    public java.lang.CharSequence getProjectId() {
      return projectId;
    }
    
    /** Sets the value of the 'projectId' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder setProjectId(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.projectId = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'projectId' field has been set */
    public boolean hasProjectId() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'projectId' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder clearProjectId() {
      projectId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'networks' field */
    public java.util.List<edu.berkeley.path.model_elements_base.Network> getNetworks() {
      return networks;
    }
    
    /** Sets the value of the 'networks' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder setNetworks(java.util.List<edu.berkeley.path.model_elements_base.Network> value) {
      validate(fields()[4], value);
      this.networks = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'networks' field has been set */
    public boolean hasNetworks() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'networks' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder clearNetworks() {
      networks = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'initialDensity' field */
    public edu.berkeley.path.model_elements_base.DensitySet getInitialDensity() {
      return initialDensity;
    }
    
    /** Sets the value of the 'initialDensity' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder setInitialDensity(edu.berkeley.path.model_elements_base.DensitySet value) {
      validate(fields()[5], value);
      this.initialDensity = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'initialDensity' field has been set */
    public boolean hasInitialDensity() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'initialDensity' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder clearInitialDensity() {
      initialDensity = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'initialVelocity' field */
    public edu.berkeley.path.model_elements_base.VelocitySet getInitialVelocity() {
      return initialVelocity;
    }
    
    /** Sets the value of the 'initialVelocity' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder setInitialVelocity(edu.berkeley.path.model_elements_base.VelocitySet value) {
      validate(fields()[6], value);
      this.initialVelocity = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'initialVelocity' field has been set */
    public boolean hasInitialVelocity() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'initialVelocity' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder clearInitialVelocity() {
      initialVelocity = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'fdSet' field */
    public edu.berkeley.path.model_elements_base.FDSet getFdSet() {
      return fdSet;
    }
    
    /** Sets the value of the 'fdSet' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder setFdSet(edu.berkeley.path.model_elements_base.FDSet value) {
      validate(fields()[7], value);
      this.fdSet = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'fdSet' field has been set */
    public boolean hasFdSet() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'fdSet' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder clearFdSet() {
      fdSet = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'demandSet' field */
    public edu.berkeley.path.model_elements_base.DemandSet getDemandSet() {
      return demandSet;
    }
    
    /** Sets the value of the 'demandSet' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder setDemandSet(edu.berkeley.path.model_elements_base.DemandSet value) {
      validate(fields()[8], value);
      this.demandSet = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'demandSet' field has been set */
    public boolean hasDemandSet() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'demandSet' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder clearDemandSet() {
      demandSet = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'splitratioSet' field */
    public edu.berkeley.path.model_elements_base.SplitRatioSet getSplitratioSet() {
      return splitratioSet;
    }
    
    /** Sets the value of the 'splitratioSet' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder setSplitratioSet(edu.berkeley.path.model_elements_base.SplitRatioSet value) {
      validate(fields()[9], value);
      this.splitratioSet = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'splitratioSet' field has been set */
    public boolean hasSplitratioSet() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'splitratioSet' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder clearSplitratioSet() {
      splitratioSet = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'sensorSet' field */
    public edu.berkeley.path.model_elements_base.SensorSet getSensorSet() {
      return sensorSet;
    }
    
    /** Sets the value of the 'sensorSet' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder setSensorSet(edu.berkeley.path.model_elements_base.SensorSet value) {
      validate(fields()[10], value);
      this.sensorSet = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'sensorSet' field has been set */
    public boolean hasSensorSet() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'sensorSet' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder clearSensorSet() {
      sensorSet = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'modstamp' field */
    public java.lang.Long getModstamp() {
      return modstamp;
    }
    
    /** Sets the value of the 'modstamp' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder setModstamp(long value) {
      validate(fields()[11], value);
      this.modstamp = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'modstamp' field has been set */
    public boolean hasModstamp() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'modstamp' field */
    public edu.berkeley.path.model_elements_base.Scenario.Builder clearModstamp() {
      fieldSetFlags()[11] = false;
      return this;
    }

    @Override
    public Scenario build() {
      try {
        Scenario record = new Scenario();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.description = fieldSetFlags()[2] ? this.description : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.projectId = fieldSetFlags()[3] ? this.projectId : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.networks = fieldSetFlags()[4] ? this.networks : (java.util.List<edu.berkeley.path.model_elements_base.Network>) defaultValue(fields()[4]);
        record.initialDensity = fieldSetFlags()[5] ? this.initialDensity : (edu.berkeley.path.model_elements_base.DensitySet) defaultValue(fields()[5]);
        record.initialVelocity = fieldSetFlags()[6] ? this.initialVelocity : (edu.berkeley.path.model_elements_base.VelocitySet) defaultValue(fields()[6]);
        record.fdSet = fieldSetFlags()[7] ? this.fdSet : (edu.berkeley.path.model_elements_base.FDSet) defaultValue(fields()[7]);
        record.demandSet = fieldSetFlags()[8] ? this.demandSet : (edu.berkeley.path.model_elements_base.DemandSet) defaultValue(fields()[8]);
        record.splitratioSet = fieldSetFlags()[9] ? this.splitratioSet : (edu.berkeley.path.model_elements_base.SplitRatioSet) defaultValue(fields()[9]);
        record.sensorSet = fieldSetFlags()[10] ? this.sensorSet : (edu.berkeley.path.model_elements_base.SensorSet) defaultValue(fields()[10]);
        record.modstamp = fieldSetFlags()[11] ? this.modstamp : (java.lang.Long) defaultValue(fields()[11]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
