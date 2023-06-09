package au.com.langdale.cimtool.generated;
import javax.persistence.*;
/**
 * Annotated java for ADS_OMS_Profile
 * Generated by CIMTool http://cimtool.org
 */
public class ADS_OMS_Profile
{
    /**
     * Date and time the asset was last tested using the 'type' of test and yielding
     * the current status in 'success' attribute.
     */
    public String getDateTime () { return dateTime; }
    public void setDateTime ( String dateTime ) { this.dateTime = dateTime; }
    @Basic()
    @Column(name="\"dateTime\"")
    private String dateTime ;
     
    /**
     * True if asset has passed acceptance test and may be placed in or is in
     * service. It is set to false if asset is removed from service and is required
     * to be tested again before being placed back in service, possibly in a new
     * location. Since asset may go through multiple tests during its lifecycle,
     * the date of each acceptance test may be recorded in 'Asset.ActivityRecord.status.dateTime'.
     */
    public Boolean getSuccess () { return success; }
    public void setSuccess ( Boolean success ) { this.success = success; }
    @Basic()
    @Column(name="\"success\"")
    private Boolean success ;
     
    /**
     * Type of test or group of tests that was conducted on 'dateTime'.
     */
    public String getType () { return type; }
    public void setType ( String type ) { this.type = type; }
    @Basic()
    @Column(name="\"type\"")
    private String type ;
     
    /**
     * Records activity for an entity at a point in time; activity may be for
     * an event that has already occurred or for a planned activity.
     */
    @Entity
    @Table(name="\"ActivityRecord\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class ActivityRecord
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
        /**
         * Date and time this activity record has been created (different from the
         * 'status.dateTime', which is the time of a status change of the associated
         * object, if applicable).
         */
        public String getCreatedDateTime () { return createdDateTime; }
        public void setCreatedDateTime ( String createdDateTime ) { this.createdDateTime = createdDateTime; }
        @Basic()
        @Column(name="\"createdDateTime\"")
        private String createdDateTime ;
         
        /**
         * Reason for event resulting in this activity record, typically supplied
         * when user initiated.
         */
        public String getReason () { return reason; }
        public void setReason ( String reason ) { this.reason = reason; }
        @Basic()
        @Column(name="\"reason\"")
        private String reason ;
         
        /**
         * Severity level of event resulting in this activity record.
         */
        public String getSeverity () { return severity; }
        public void setSeverity ( String severity ) { this.severity = severity; }
        @Basic()
        @Column(name="\"severity\"")
        private String severity ;
         
        /**
         * Type of event resulting in this activity record.
         */
        public String getType () { return type; }
        public void setType ( String type ) { this.type = type; }
        @Basic()
        @Column(name="\"type\"")
        private String type ;
         
    }
    /**
     * An algorithm or calculation for making an assessment about an asset or
     * asset grouping for lifecycle decision making.
     */
    @Entity
    @Table(name="\"Analytic\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class Analytic
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
        /**
         * Value that indicates best possible numeric value.
         */
        public Double getBestValue () { return bestValue; }
        public void setBestValue ( Double bestValue ) { this.bestValue = bestValue; }
        @Basic()
        @Column(name="\"bestValue\"")
        private Double bestValue ;
         
        /**
         * Kind of analytic this analytic is.
         */
        public String getKind () { return kind; }
        public void setKind ( String kind ) { this.kind = kind; }
        @Basic()
        @Column(name="\"kind\"")
        private String kind ;
         
        /**
         * The scoring scale kind.
         */
        public ScaleKind getScaleKind () { return scaleKind; }
        public void setScaleKind ( ScaleKind scaleKind ) { this.scaleKind = scaleKind; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"scaleKind\"")
        private ScaleKind scaleKind ;
         
        /**
         * Value that indicates worst possible numeric value.
         */
        public Double getWorstValue () { return worstValue; }
        public void setWorstValue ( Double worstValue ) { this.worstValue = worstValue; }
        @Basic()
        @Column(name="\"worstValue\"")
        private Double worstValue ;
         
    }
     
    /**
     * Possible kinds of analytics.
     */
    @Entity
    @Table(name="\"AnalyticKind\"")
    public static class AnalyticKind
    {
        public String getName () { return name; }
        public void setName ( String name ) { this.name = name; }
        @Id
        @Column(name="\"name\"")
        private String name ;
         
    };
    /**
     * An indicative scoring by an analytic that can be used to characterize the
     * health of or the risk associated with one or more assets. The analytic
     * score reflects the results of an execution of an analytic against an asset
     * or group of assets.
     */
    @Entity
    @Table(name="\"AnalyticScore\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class AnalyticScore
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
        /**
         * Timestamp of when the score was calculated.
         */
        public String getCalculationDateTime () { return calculationDateTime; }
        public void setCalculationDateTime ( String calculationDateTime ) { this.calculationDateTime = calculationDateTime; }
        @Basic()
        @Column(name="\"calculationDateTime\"")
        private String calculationDateTime ;
         
        /**
         * Date-time for when the score applies.
         */
        public String getEffectiveDateTime () { return effectiveDateTime; }
        public void setEffectiveDateTime ( String effectiveDateTime ) { this.effectiveDateTime = effectiveDateTime; }
        @Basic()
        @Column(name="\"effectiveDateTime\"")
        private String effectiveDateTime ;
         
        /**
         * Asset health score value.
         */
        public Double getValue () { return value; }
        public void setValue ( Double value ) { this.value = value; }
        @Basic()
        @Column(name="\"value\"")
        private Double value ;
         
    }
    /**
     * Tangible resource of the utility, including power system equipment, various
     * end devices, cabinets, buildings, etc. For electrical network equipment,
     * the role of the asset is defined through PowerSystemResource and its subclasses,
     * defined mainly in the Wires model (refer to IEC61970-301 and model package
     * IEC61970::Wires). Asset description places emphasis on the physical characteristics
     * of the equipment fulfilling that role.
     */
    @Entity
    @Table(name="\"Asset\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class Asset
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
        /**
         * True if asset is considered critical for some reason (for example, a pole
         * with critical attachments).
         */
        public Boolean getCritical () { return critical; }
        public void setCritical ( Boolean critical ) { this.critical = critical; }
        @Basic()
        @Column(name="\"critical\"")
        private Boolean critical ;
         
        /**
         * Condition of asset at last baseline. Examples include new, rebuilt, overhaul
         * required, other. Refer to inspection data for information on the most current
         * condition of the asset.
         */
        public String getInitialCondition () { return initialCondition; }
        public void setInitialCondition ( String initialCondition ) { this.initialCondition = initialCondition; }
        @Basic()
        @Column(name="\"initialCondition\"")
        private String initialCondition ;
         
        /**
         * Percentage of initial life expectancy that has been lost as of the last
         * life expectancy baseline. Represents
         * (initial life expectancy - current life expectancy) / initial life expectancy.
         */
        public Double getInitialLossOfLife () { return initialLossOfLife; }
        public void setInitialLossOfLife ( Double initialLossOfLife ) { this.initialLossOfLife = initialLossOfLife; }
        @Basic()
        @Column(name="\"initialLossOfLife\"")
        private Double initialLossOfLife ;
         
        /**
         * Indication of whether asset is currently deployed (in use), ready to be
         * put into use or not available for use.
         */
        public InUseStateKind getInUseState () { return inUseState; }
        public void setInUseState ( InUseStateKind inUseState ) { this.inUseState = inUseState; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"inUseState\"")
        private InUseStateKind inUseState ;
         
        /**
         * Kind of asset. Used in description of asset components in asset instance
         * templates.
         */
        public String getKind () { return kind; }
        public void setKind ( String kind ) { this.kind = kind; }
        @Basic()
        @Column(name="\"kind\"")
        private String kind ;
         
        /**
         * Current lifecycle state of asset.
         */
        public String getLifecycleState () { return lifecycleState; }
        public void setLifecycleState ( String lifecycleState ) { this.lifecycleState = lifecycleState; }
        @Basic()
        @Column(name="\"lifecycleState\"")
        private String lifecycleState ;
         
        /**
         * Lot number for this asset. Even for the same model and version number,
         * many assets are manufactured in lots.
         */
        public String getLotNumber () { return lotNumber; }
        public void setLotNumber ( String lotNumber ) { this.lotNumber = lotNumber; }
        @Basic()
        @Column(name="\"lotNumber\"")
        private String lotNumber ;
         
        /**
         * Position of asset or asset component. May often be in relation to other
         * assets or components.
         */
        public String getPosition () { return position; }
        public void setPosition ( String position ) { this.position = position; }
        @Basic()
        @Column(name="\"position\"")
        private String position ;
         
        /**
         * Purchase price of asset.
         */
        public String getPurchasePrice () { return purchasePrice; }
        public void setPurchasePrice ( String purchasePrice ) { this.purchasePrice = purchasePrice; }
        @Basic()
        @Column(name="\"purchasePrice\"")
        private String purchasePrice ;
         
        /**
         * Reason asset retired.
         */
        public RetiredReasonKind getRetiredReason () { return retiredReason; }
        public void setRetiredReason ( RetiredReasonKind retiredReason ) { this.retiredReason = retiredReason; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"retiredReason\"")
        private RetiredReasonKind retiredReason ;
         
        /**
         * Serial number of this asset.
         */
        public String getSerialNumber () { return serialNumber; }
        public void setSerialNumber ( String serialNumber ) { this.serialNumber = serialNumber; }
        @Basic()
        @Column(name="\"serialNumber\"")
        private String serialNumber ;
         
        /**
         * Utility-specific classification of Asset and its subtypes, according to
         * their corporate standards, practices, and existing IT systems (e.g., for
         * management of assets, maintenance, work, outage, customers, etc.).
         */
        public String getType () { return type; }
        public void setType ( String type ) { this.type = type; }
        @Basic()
        @Column(name="\"type\"")
        private String type ;
         
        /**
         * Uniquely tracked commodity (UTC) number.
         */
        public String getUtcNumber () { return utcNumber; }
        public void setUtcNumber ( String utcNumber ) { this.utcNumber = utcNumber; }
        @Basic()
        @Column(name="\"utcNumber\"")
        private String utcNumber ;
         
        /**
         * Information on acceptance test.
         */
        public AcceptanceTest getAcceptanceTest () { return acceptanceTest; }
        public void setAcceptanceTest ( AcceptanceTest acceptanceTest ) { this.acceptanceTest = acceptanceTest; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"acceptanceTest\"")
        private AcceptanceTest acceptanceTest ;
         
        /**
         * Electronic address.
         */
        public ElectronicAddress getElectronicAddress () { return electronicAddress; }
        public void setElectronicAddress ( ElectronicAddress electronicAddress ) { this.electronicAddress = electronicAddress; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"electronicAddress\"")
        private ElectronicAddress electronicAddress ;
         
        /**
         */
        public ErpInventory getErpInventory () { return erpInventory; }
        public void setErpInventory ( ErpInventory erpInventory ) { this.erpInventory = erpInventory; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"ErpInventory\"")
        private ErpInventory erpInventory ;
         
        /**
         */
        public ErpItemMaster getErpItemMaster () { return erpItemMaster; }
        public void setErpItemMaster ( ErpItemMaster erpItemMaster ) { this.erpItemMaster = erpItemMaster; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"ErpItemMaster\"")
        private ErpItemMaster erpItemMaster ;
         
        /**
         * In use dates for this asset.
         */
        public InUseDate getInUseDate () { return inUseDate; }
        public void setInUseDate ( InUseDate inUseDate ) { this.inUseDate = inUseDate; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"inUseDate\"")
        private InUseDate inUseDate ;
         
        /**
         * <was lifecycle>
         * Lifecycle dates for this asset.
         */
        public LifecycleDate getLifecycleDate () { return lifecycleDate; }
        public void setLifecycleDate ( LifecycleDate lifecycleDate ) { this.lifecycleDate = lifecycleDate; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"lifecycleDate\"")
        private LifecycleDate lifecycleDate ;
         
        /**
         * Location of this asset.
         */
        public Location getLocation () { return location; }
        public void setLocation ( Location location ) { this.location = location; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"Location\"")
        private Location location ;
         
        /**
         * Status of this asset.
         */
        public Status getStatus () { return status; }
        public void setStatus ( Status status ) { this.status = status; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"status\"")
        private Status status ;
         
    }
     
    /**
     * Kinds of assets or asset components.
     */
    @Entity
    @Table(name="\"AssetKind\"")
    public static class AssetKind
    {
        public String getName () { return name; }
        public void setName ( String name ) { this.name = name; }
        @Id
        @Column(name="\"name\"")
        private String name ;
         
    };
     
    /**
     * Lifecycle states an asset can be in.
     * While the possible lifecycle states are standardized, the allowed transitions
     * are not - they are intended to be defined by the business process requirements
     * of local implementations.
     */
    @Entity
    @Table(name="\"AssetLifecycleStateKind\"")
    public static class AssetLifecycleStateKind
    {
        public String getName () { return name; }
        public void setName ( String name ) { this.name = name; }
        @Id
        @Column(name="\"name\"")
        private String name ;
         
    };
    /**
     * Primary email address.
     */
    public String getEmail1 () { return email1; }
    public void setEmail1 ( String email1 ) { this.email1 = email1; }
    @Basic()
    @Column(name="\"email1\"")
    private String email1 ;
     
    /**
     * Utility inventory-related information about an item or part (and not for
     * description of the item and its attributes). It is used by ERP applications
     * to enable the synchronization of Inventory data that exists on separate
     * Item Master databases. This data is not the master data that describes
     * the attributes of the item such as dimensions, weight, or unit of measure
     * - it describes the item as it exists at a specific location.
     */
    @Entity
    @Table(name="\"ErpInventory\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class ErpInventory
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
        /**
         */
        public Status getStatus () { return status; }
        public void setStatus ( Status status ) { this.status = status; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"status\"")
        private Status status ;
         
    }
    /**
     * Any unique purchased part for manufactured product tracked by ERP systems
     * for a utility.
     * Item, as used by the OAG, refers to the basic information about an item,
     * including its attributes, cost, and locations. It does not include item
     * quantities. Compare to the Inventory, which includes all quantities and
     * other location-specific information.
     */
    @Entity
    @Table(name="\"ErpItemMaster\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class ErpItemMaster
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
    }
    /**
     * Date asset was most recently put in use.
     */
    public String getInUseDate () { return inUseDate; }
    public void setInUseDate ( String inUseDate ) { this.inUseDate = inUseDate; }
    @Basic()
    @Column(name="\"inUseDate\"")
    private String inUseDate ;
     
    /**
     * Date of most recent asset transition to ready for use state.
     */
    public String getReadyForUseDate () { return readyForUseDate; }
    public void setReadyForUseDate ( String readyForUseDate ) { this.readyForUseDate = readyForUseDate; }
    @Basic()
    @Column(name="\"readyForUseDate\"")
    private String readyForUseDate ;
     
    /**
     * Date current installation was completed, which may not be the same as the
     * in-service date. Asset may have been installed at other locations previously.
     * Ignored if asset is (1) not currently installed (e.g., stored in a depot)
     * or (2) not intended to be installed (e.g., vehicle, tool).
     */
    public String getInstallationDate () { return installationDate; }
    public void setInstallationDate ( String installationDate ) { this.installationDate = installationDate; }
    @Basic()
    @Column(name="\"installationDate\"")
    private String installationDate ;
     
    /**
     * Date the asset was manufactured.
     */
    public String getManufacturedDate () { return manufacturedDate; }
    public void setManufacturedDate ( String manufacturedDate ) { this.manufacturedDate = manufacturedDate; }
    @Basic()
    @Column(name="\"manufacturedDate\"")
    private String manufacturedDate ;
     
    /**
     * Date the asset was purchased. Note that even though an asset may have been
     * purchased, it may not have been received into inventory at the time of
     * purchase.
     */
    public String getPurchaseDate () { return purchaseDate; }
    public void setPurchaseDate ( String purchaseDate ) { this.purchaseDate = purchaseDate; }
    @Basic()
    @Column(name="\"purchaseDate\"")
    private String purchaseDate ;
     
    /**
     * Date the asset was received and first placed into inventory.
     */
    public String getReceivedDate () { return receivedDate; }
    public void setReceivedDate ( String receivedDate ) { this.receivedDate = receivedDate; }
    @Basic()
    @Column(name="\"receivedDate\"")
    private String receivedDate ;
     
    /**
     * Date when the asset was last removed from service. Ignored if (1) not intended
     * to be in service, or (2) currently in service.
     */
    public String getRemovalDate () { return removalDate; }
    public void setRemovalDate ( String removalDate ) { this.removalDate = removalDate; }
    @Basic()
    @Column(name="\"removalDate\"")
    private String removalDate ;
     
    /**
     * Date the asset is permanently retired from service and may be scheduled
     * for disposal. Ignored if asset is (1) currently in service, or (2) permanently
     * removed from service.
     */
    public String getRetiredDate () { return retiredDate; }
    public void setRetiredDate ( String retiredDate ) { this.retiredDate = retiredDate; }
    @Basic()
    @Column(name="\"retiredDate\"")
    private String retiredDate ;
     
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
     * A power system resource (PSR) can be an item of equipment such as a switch,
     * an equipment container containing many individual items of equipment such
     * as a substation, or an organisational entity such as sub-control area.
     * Power system resources can have measurements associated.
     */
    @Entity
    @Table(name="\"PowerSystemResource\"")
    @Inheritance(strategy=InheritanceType.JOINED)
    public static class PowerSystemResource
    {
        public String getMRID () { return mRID; }
        public void setMRID ( String mRID ) { this.mRID = mRID; }
        @Id
        @Column(name="\"mRID\"")
        private String mRID ;
         
        /**
         * Location of this power system resource.
         */
        public Location getLocation () { return location; }
        public void setLocation ( Location location ) { this.location = location; }
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="\"Location\"")
        private Location location ;
         
    }
    /**
     * Date and time for which status 'value' applies.
     */
    public String getDateTime () { return dateTime; }
    public void setDateTime ( String dateTime ) { this.dateTime = dateTime; }
    @Basic()
    @Column(name="\"dateTime\"")
    private String dateTime ;
     
    /**
     * Reason code or explanation for why an object went to the current status
     * 'value'.
     */
    public String getReason () { return reason; }
    public void setReason ( String reason ) { this.reason = reason; }
    @Basic()
    @Column(name="\"reason\"")
    private String reason ;
     
    /**
     * Pertinent information regarding the current 'value', as free form text.
     */
    public String getRemark () { return remark; }
    public void setRemark ( String remark ) { this.remark = remark; }
    @Basic()
    @Column(name="\"remark\"")
    private String remark ;
     
    /**
     * Status value at 'dateTime'; prior status changes may have been kept in
     * instances of activity records associated with the object to which this
     * status applies.
     */
    public String getValue () { return value; }
    public void setValue ( String value ) { this.value = value; }
    @Basic()
    @Column(name="\"value\"")
    private String value ;
     
     
    public static final Class[] allClasses = new Class[]
    {
        ActivityRecord.class,
        Analytic.class,
        AnalyticKind.class,
        AnalyticScore.class,
        Asset.class,
        AssetKind.class,
        AssetLifecycleStateKind.class,
        ErpInventory.class,
        ErpItemMaster.class,
        Location.class,
        PowerSystemResource.class
    };
}
