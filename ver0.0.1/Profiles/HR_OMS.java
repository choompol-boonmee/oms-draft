package au.com.langdale.cimtool.generated;
import javax.persistence.*;
/**
 * Annotated java for HR_OMS_Profile
 * Generated by CIMTool http://cimtool.org
 */
public class HR_OMS_Profile
{
    /**
     * Meeting time and location.
     */
    @Entity
    @Table(name="\"Appointment\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class Appointment
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
    }
    /**
     * Used to report details on creation, change or deletion of an entity or
     * its configuration.
     */
    @Entity
    @Table(name="\"ConfigurationEvent\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class ConfigurationEvent
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
    }
    /**
     * Coordinate reference system.
     */
    @Entity
    @Table(name="\"CoordinateSystem\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class CoordinateSystem
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
        /**
         * A Uniform Resource Name (URN) for the coordinate reference system (crs)
         * used to define 'Location.PositionPoints'.
         * An example would be the European Petroleum Survey Group (EPSG) code for
         * a coordinate reference system, defined in URN under the Open Geospatial
         * Consortium (OGC) namespace as: urn:ogc:def:crs:EPSG::XXXX, where XXXX is
         * an EPSG code (a full list of codes can be found at the EPSG Registry web
         * site http://www.epsg-registry.org/). To define the coordinate system as
         * being WGS84 (latitude, longitude) using an EPSG OGC, this attribute would
         * be urn:ogc:def:crs:EPSG::4.3.2.6
         * A profile should limit this code to a set of allowed URNs agreed to by
         * all sending and receiving parties.
         */
        public String getCrsUrn () { return crsUrn; }
        public void setCrsUrn ( String crsUrn ) { this.crsUrn = crsUrn; }
        @Basic()
        @Column(name="\"crsUrn\"")
        private String crsUrn ;
         
    }
    /**
     * Group of people with specific skills, tools, and vehicles.
     */
    @Entity
    @Table(name="\"Crew\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class Crew
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
        /**
         * The aliasName is free text human readable name of the object alternative
         * to IdentifiedObject.name. It may be non unique and may not correlate to
         * a naming hierarchy.
         * The attribute aliasName is retained because of backwards compatibility
         * between CIM relases. It is however recommended to replace aliasName with
         * the Name class as aliasName is planned for retirement at a future time.
         */
        public String getAliasName () { return aliasName; }
        public void setAliasName ( String aliasName ) { this.aliasName = aliasName; }
        @Basic()
        @Column(name="\"aliasName\"")
        private String aliasName ;
         
        /**
         * The description is a free human readable text describing or naming the
         * object. It may be non unique and may not correlate to a naming hierarchy.
         */
        public String getDescription () { return description; }
        public void setDescription ( String description ) { this.description = description; }
        @Basic()
        @Column(name="\"description\"")
        private String description ;
         
        /**
         * The name is any free human readable and possibly non unique text naming
         * the object.
         */
        public String getName () { return name; }
        public void setName ( String name ) { this.name = name; }
        @Basic()
        @Column(name="\"name\"")
        private String name ;
         
        /**
         * Type of this crew.
         */
        public CrewType getCrewType () { return crewType; }
        public void setCrewType ( CrewType crewType ) { this.crewType = crewType; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"CrewType\"")
        private CrewType crewType ;
         
        /**
         * The location this crew is assigned to.
         */
        public Location getLocation () { return location; }
        public void setLocation ( Location location ) { this.location = location; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"Location\"")
        private Location location ;
         
        /**
         * Status of this crew.
         */
        public Status getStatus () { return status; }
        public void setStatus ( Status status ) { this.status = status; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"status\"")
        private Status status ;
         
    }
    /**
     * Member of a crew.
     */
    @Entity
    @Table(name="\"CrewMember\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class CrewMember
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
        /**
         * The aliasName is free text human readable name of the object alternative
         * to IdentifiedObject.name. It may be non unique and may not correlate to
         * a naming hierarchy.
         * The attribute aliasName is retained because of backwards compatibility
         * between CIM relases. It is however recommended to replace aliasName with
         * the Name class as aliasName is planned for retirement at a future time.
         */
        public String getAliasName () { return aliasName; }
        public void setAliasName ( String aliasName ) { this.aliasName = aliasName; }
        @Basic()
        @Column(name="\"aliasName\"")
        private String aliasName ;
         
        /**
         * The description is a free human readable text describing or naming the
         * object. It may be non unique and may not correlate to a naming hierarchy.
         */
        public String getDescription () { return description; }
        public void setDescription ( String description ) { this.description = description; }
        @Basic()
        @Column(name="\"description\"")
        private String description ;
         
        /**
         * The name is any free human readable and possibly non unique text naming
         * the object.
         */
        public String getName () { return name; }
        public void setName ( String name ) { this.name = name; }
        @Basic()
        @Column(name="\"name\"")
        private String name ;
         
        /**
         * Person having this role.
         */
        public Person getPerson () { return person; }
        public void setPerson ( Person person ) { this.person = person; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"Person\"")
        private Person person ;
         
    }
    /**
     * Custom description of the type of crew. This may be used to determine the
     * type of work the crew can be assigned to. Examples include repair, tree
     * trimming, switching, etc.
     */
    @Entity
    @Table(name="\"CrewType\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class CrewType
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
        /**
         * The aliasName is free text human readable name of the object alternative
         * to IdentifiedObject.name. It may be non unique and may not correlate to
         * a naming hierarchy.
         * The attribute aliasName is retained because of backwards compatibility
         * between CIM relases. It is however recommended to replace aliasName with
         * the Name class as aliasName is planned for retirement at a future time.
         */
        public String getAliasName () { return aliasName; }
        public void setAliasName ( String aliasName ) { this.aliasName = aliasName; }
        @Basic()
        @Column(name="\"aliasName\"")
        private String aliasName ;
         
        /**
         * The description is a free human readable text describing or naming the
         * object. It may be non unique and may not correlate to a naming hierarchy.
         */
        public String getDescription () { return description; }
        public void setDescription ( String description ) { this.description = description; }
        @Basic()
        @Column(name="\"description\"")
        private String description ;
         
        /**
         * The name is any free human readable and possibly non unique text naming
         * the object.
         */
        public String getName () { return name; }
        public void setName ( String name ) { this.name = name; }
        @Basic()
        @Column(name="\"name\"")
        private String name ;
         
    }
    /**
     * Primary email address.
     */
    public String getEmail1 () { return email1; }
    public void setEmail1 ( String email1 ) { this.email1 = email1; }
    @Basic()
    @Column(name="\"email1\"")
    private String email1 ;
     
    /**
     * Alternate email address.
     */
    public String getEmail2 () { return email2; }
    public void setEmail2 ( String email2 ) { this.email2 = email2; }
    @Basic()
    @Column(name="\"email2\"")
    private String email2 ;
     
    /**
     * Radio address.
     */
    public String getRadio () { return radio; }
    public void setRadio ( String radio ) { this.radio = radio; }
    @Basic()
    @Column(name="\"radio\"")
    private String radio ;
     
    /**
     * The place, scene, or point of something where someone or something has
     * been, is, and/or will be at a given moment in time. It can be defined with
     * one or more position points (coordinates) in a given coordinate system.
     */
    @Entity
    @Table(name="\"Location\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class Location
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
        /**
         * (if applicable) Direction that allows field crews to quickly find a given
         * asset. For a given location, such as a street address, this is the relative
         * direction in which to find the asset. For example, a streetlight may be
         * located at the 'NW' (northwest) corner of the customer's site, or a usage
         * point may be located on the second floor of an apartment building.
         */
        public String getDirection () { return direction; }
        public void setDirection ( String direction ) { this.direction = direction; }
        @Basic()
        @Column(name="\"direction\"")
        private String direction ;
         
        /**
         * (if applicable) Reference to geographical information source, often external
         * to the utility.
         */
        public String getGeoInfoReference () { return geoInfoReference; }
        public void setGeoInfoReference ( String geoInfoReference ) { this.geoInfoReference = geoInfoReference; }
        @Basic()
        @Column(name="\"geoInfoReference\"")
        private String geoInfoReference ;
         
        /**
         * Classification by utility's corporate standards and practices, relative
         * to the location itself (e.g., geographical, functional accounting, etc.,
         * not a given property that happens to exist at that location).
         */
        public String getType () { return type; }
        public void setType ( String type ) { this.type = type; }
        @Basic()
        @Column(name="\"type\"")
        private String type ;
         
        /**
         * Coordinate system used to describe position points of this location.
         */
        public CoordinateSystem getCoordinateSystem () { return coordinateSystem; }
        public void setCoordinateSystem ( CoordinateSystem coordinateSystem ) { this.coordinateSystem = coordinateSystem; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"CoordinateSystem\"")
        private CoordinateSystem coordinateSystem ;
         
    }
    /**
     * The Name class provides the means to define any number of human readable
     * names for an object. A name is <b>not</b> to be used for defining inter-object
     * relationships. For inter-object relationships instead use the object identification
     * 'mRID'.
     */
    @Entity
    @Table(name="\"Name\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class Name
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
        /**
         * Any free text that name the object.
         */
        public String getName () { return name; }
        public void setName ( String name ) { this.name = name; }
        @Basic()
        @Column(name="\"name\"")
        private String name ;
         
        /**
         * Identified object that this name designates.
         */
        public IdentifiedObject getIdentifiedObject () { return identifiedObject; }
        public void setIdentifiedObject ( IdentifiedObject identifiedObject ) { this.identifiedObject = identifiedObject; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"IdentifiedObject\"")
        private IdentifiedObject identifiedObject ;
         
        /**
         * Type of this name.
         */
        public NameType getNameType () { return nameType; }
        public void setNameType ( NameType nameType ) { this.nameType = nameType; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"NameType\"")
        private NameType nameType ;
         
    }
    /**
     * Type of name. Possible values for attribute 'name' are implementation dependent
     * but standard profiles may specify types. An enterprise may have multiple
     * IT systems each having its own local name for the same object, e.g. a planning
     * system may have different names from an EMS. An object may also have different
     * names within the same IT system, e.g. localName as defined in CIM version
     * 14. The definition from CIM14 is:
     * The localName is a human readable name of the object. It is a free text
     * name local to a node in a naming hierarchy similar to a file directory
     * structure. A power system related naming hierarchy may be: Substation,
     * VoltageLevel, Equipment etc. Children of the same parent in such a hierarchy
     * have names that typically are unique among them.
     */
    @Entity
    @Table(name="\"NameType\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class NameType
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
        /**
         * Description of the name type.
         */
        public String getDescription () { return description; }
        public void setDescription ( String description ) { this.description = description; }
        @Basic()
        @Column(name="\"description\"")
        private String description ;
         
        /**
         * Name of the name type.
         */
        public String getName () { return name; }
        public void setName ( String name ) { this.name = name; }
        @Basic()
        @Column(name="\"name\"")
        private String name ;
         
        /**
         * Authority responsible for managing names of this type.
         */
        public NameTypeAuthority getNameTypeAuthority () { return nameTypeAuthority; }
        public void setNameTypeAuthority ( NameTypeAuthority nameTypeAuthority ) { this.nameTypeAuthority = nameTypeAuthority; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"NameTypeAuthority\"")
        private NameTypeAuthority nameTypeAuthority ;
         
    }
    /**
     * Authority responsible for creation and management of names of a given type;
     * typically an organization or an enterprise system.
     */
    @Entity
    @Table(name="\"NameTypeAuthority\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class NameTypeAuthority
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
        /**
         * Description of the name type authority.
         */
        public String getDescription () { return description; }
        public void setDescription ( String description ) { this.description = description; }
        @Basic()
        @Column(name="\"description\"")
        private String description ;
         
        /**
         * Name of the name type authority.
         */
        public String getName () { return name; }
        public void setName ( String name ) { this.name = name; }
        @Basic()
        @Column(name="\"name\"")
        private String name ;
         
    }
    /**
     * General purpose information for name and other information to contact people.
     */
    @Entity
    @Table(name="\"Person\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class Person
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
        /**
         * The aliasName is free text human readable name of the object alternative
         * to IdentifiedObject.name. It may be non unique and may not correlate to
         * a naming hierarchy.
         * The attribute aliasName is retained because of backwards compatibility
         * between CIM relases. It is however recommended to replace aliasName with
         * the Name class as aliasName is planned for retirement at a future time.
         */
        public String getAliasName () { return aliasName; }
        public void setAliasName ( String aliasName ) { this.aliasName = aliasName; }
        @Basic()
        @Column(name="\"aliasName\"")
        private String aliasName ;
         
        /**
         * The description is a free human readable text describing or naming the
         * object. It may be non unique and may not correlate to a naming hierarchy.
         */
        public String getDescription () { return description; }
        public void setDescription ( String description ) { this.description = description; }
        @Basic()
        @Column(name="\"description\"")
        private String description ;
         
        /**
         * Person's first name.
         */
        public String getFirstName () { return firstName; }
        public void setFirstName ( String firstName ) { this.firstName = firstName; }
        @Basic()
        @Column(name="\"firstName\"")
        private String firstName ;
         
        /**
         * Person's last (family, sir) name.
         */
        public String getLastName () { return lastName; }
        public void setLastName ( String lastName ) { this.lastName = lastName; }
        @Basic()
        @Column(name="\"lastName\"")
        private String lastName ;
         
        /**
         * Middle name(s) or initial(s).
         */
        public String getMName () { return mName; }
        public void setMName ( String mName ) { this.mName = mName; }
        @Basic()
        @Column(name="\"mName\"")
        private String mName ;
         
        /**
         * The name is any free human readable and possibly non unique text naming
         * the object.
         */
        public String getName () { return name; }
        public void setName ( String name ) { this.name = name; }
        @Basic()
        @Column(name="\"name\"")
        private String name ;
         
        /**
         * A prefix or title for the person's name, such as Miss, Mister, Doctor,
         * etc.
         */
        public String getPrefix () { return prefix; }
        public void setPrefix ( String prefix ) { this.prefix = prefix; }
        @Basic()
        @Column(name="\"prefix\"")
        private String prefix ;
         
        /**
         * Special service needs for the person (contact) are described; examples
         * include life support, etc.
         */
        public String getSpecialNeed () { return specialNeed; }
        public void setSpecialNeed ( String specialNeed ) { this.specialNeed = specialNeed; }
        @Basic()
        @Column(name="\"specialNeed\"")
        private String specialNeed ;
         
        /**
         * Electronic address.
         */
        public ElectronicAddress getElectronicAddress () { return electronicAddress; }
        public void setElectronicAddress ( ElectronicAddress electronicAddress ) { this.electronicAddress = electronicAddress; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"electronicAddress\"")
        private ElectronicAddress electronicAddress ;
         
        /**
         * Landline phone number.
         */
        public TelephoneNumber getLandlinePhone () { return landlinePhone; }
        public void setLandlinePhone ( TelephoneNumber landlinePhone ) { this.landlinePhone = landlinePhone; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"landlinePhone\"")
        private TelephoneNumber landlinePhone ;
         
        /**
         * Mobile phone number.
         */
        public TelephoneNumber getMobilePhone () { return mobilePhone; }
        public void setMobilePhone ( TelephoneNumber mobilePhone ) { this.mobilePhone = mobilePhone; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"mobilePhone\"")
        private TelephoneNumber mobilePhone ;
         
    }
    /**
     * Set of spatial coordinates that determine a point, defined in the coordinate
     * system specified in 'Location.CoordinateSystem'. Use a single position
     * point instance to describe a point-oriented location. Use a sequence of
     * position points to describe a line-oriented object (physical location of
     * non-point oriented objects like cables or lines), or area of an object
     * (like a substation or a geographical zone - in this case, have first and
     * last position point with the same values).
     */
    @Entity
    @Table(name="\"PositionPoint\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class PositionPoint
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
        /**
         * Zero-relative sequence number of this point within a series of points.
         */
        public Integer getSequenceNumber () { return sequenceNumber; }
        public void setSequenceNumber ( Integer sequenceNumber ) { this.sequenceNumber = sequenceNumber; }
        @Basic()
        @Column(name="\"sequenceNumber\"")
        private Integer sequenceNumber ;
         
        /**
         * X axis position.
         */
        public String getXPosition () { return xPosition; }
        public void setXPosition ( String xPosition ) { this.xPosition = xPosition; }
        @Basic()
        @Column(name="\"xPosition\"")
        private String xPosition ;
         
        /**
         * Y axis position.
         */
        public String getYPosition () { return yPosition; }
        public void setYPosition ( String yPosition ) { this.yPosition = yPosition; }
        @Basic()
        @Column(name="\"yPosition\"")
        private String yPosition ;
         
    }
    /**
     * Main (local) part of this telephone number.
     */
    public String getLocalNumber () { return localNumber; }
    public void setLocalNumber ( String localNumber ) { this.localNumber = localNumber; }
    @Basic()
    @Column(name="\"localNumber\"")
    private String localNumber ;
     
     
    public static final Class[] allClasses = new Class[]
    {
        Appointment.class,
        ConfigurationEvent.class,
        CoordinateSystem.class,
        Crew.class,
        CrewMember.class,
        CrewType.class,
        Location.class,
        Name.class,
        NameType.class,
        NameTypeAuthority.class,
        Person.class,
        PositionPoint.class
    };
}