package model.entity;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 19 12:08:37 IST 2009
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RegistrationEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        RegistrationId {
            public Object get(RegistrationEOImpl obj) {
                return obj.getRegistrationId();
            }

            public void put(RegistrationEOImpl obj, Object value) {
                obj.setRegistrationId((Number)value);
            }
        }
        ,
        RegNum {
            public Object get(RegistrationEOImpl obj) {
                return obj.getRegNum();
            }

            public void put(RegistrationEOImpl obj, Object value) {
                obj.setRegNum((String)value);
            }
        }
        ,
        ProcType {
            public Object get(RegistrationEOImpl obj) {
                return obj.getProcType();
            }

            public void put(RegistrationEOImpl obj, Object value) {
                obj.setProcType((String)value);
            }
        }
        ,
        RegStatus {
            public Object get(RegistrationEOImpl obj) {
                return obj.getRegStatus();
            }

            public void put(RegistrationEOImpl obj, Object value) {
                obj.setRegStatus((String)value);
            }
        }
        ,
        TotalUsdAmt {
            public Object get(RegistrationEOImpl obj) {
                return obj.getTotalUsdAmt();
            }

            public void put(RegistrationEOImpl obj, Object value) {
                obj.setTotalUsdAmt((Number)value);
            }
        }
        ,
        TotalPfiAmt {
            public Object get(RegistrationEOImpl obj) {
                return obj.getTotalPfiAmt();
            }

            public void put(RegistrationEOImpl obj, Object value) {
                obj.setTotalPfiAmt((Number)value);
            }
        }
        ,
        RequestedBy {
            public Object get(RegistrationEOImpl obj) {
                return obj.getRequestedBy();
            }

            public void put(RegistrationEOImpl obj, Object value) {
                obj.setRequestedBy((Number)value);
            }
        }
        ,
        Urgency {
            public Object get(RegistrationEOImpl obj) {
                return obj.getUrgency();
            }

            public void put(RegistrationEOImpl obj, Object value) {
                obj.setUrgency((String)value);
            }
        }
        ,
        ConsigneeId {
            public Object get(RegistrationEOImpl obj) {
                return obj.getConsigneeId();
            }

            public void put(RegistrationEOImpl obj, Object value) {
                obj.setConsigneeId((Number)value);
            }
        }
        ,
        ShipingId {
            public Object get(RegistrationEOImpl obj) {
                return obj.getShipingId();
            }

            public void put(RegistrationEOImpl obj, Object value) {
                obj.setShipingId((Number)value);
            }
        }
        ,
        NotesBuyer {
            public Object get(RegistrationEOImpl obj) {
                return obj.getNotesBuyer();
            }

            public void put(RegistrationEOImpl obj, Object value) {
                obj.setNotesBuyer((String)value);
            }
        }
        ,
        PartyNotes {
            public Object get(RegistrationEOImpl obj) {
                return obj.getPartyNotes();
            }

            public void put(RegistrationEOImpl obj, Object value) {
                obj.setPartyNotes((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(RegistrationEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(RegistrationEOImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(RegistrationEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(RegistrationEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(RegistrationEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(RegistrationEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        RegistrationLinesEO {
            public Object get(RegistrationEOImpl obj) {
                return obj.getRegistrationLinesEO();
            }

            public void put(RegistrationEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(RegistrationEOImpl object);

        public abstract void put(RegistrationEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int REGISTRATIONID = AttributesEnum.RegistrationId.index();
    public static final int REGNUM = AttributesEnum.RegNum.index();
    public static final int PROCTYPE = AttributesEnum.ProcType.index();
    public static final int REGSTATUS = AttributesEnum.RegStatus.index();
    public static final int TOTALUSDAMT = AttributesEnum.TotalUsdAmt.index();
    public static final int TOTALPFIAMT = AttributesEnum.TotalPfiAmt.index();
    public static final int REQUESTEDBY = AttributesEnum.RequestedBy.index();
    public static final int URGENCY = AttributesEnum.Urgency.index();
    public static final int CONSIGNEEID = AttributesEnum.ConsigneeId.index();
    public static final int SHIPINGID = AttributesEnum.ShipingId.index();
    public static final int NOTESBUYER = AttributesEnum.NotesBuyer.index();
    public static final int PARTYNOTES = AttributesEnum.PartyNotes.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int REGISTRATIONLINESEO = AttributesEnum.RegistrationLinesEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public RegistrationEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.entity.RegistrationEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for RegistrationId, using the alias name RegistrationId.
     * @return the RegistrationId
     */
    public Number getRegistrationId() {
        return (Number)getAttributeInternal(REGISTRATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RegistrationId.
     * @param value value to set the RegistrationId
     */
    public void setRegistrationId(Number value) {
        setAttributeInternal(REGISTRATIONID, value);
    }

    /**
     * Gets the attribute value for RegNum, using the alias name RegNum.
     * @return the RegNum
     */
    public String getRegNum() {
        return (String)getAttributeInternal(REGNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for RegNum.
     * @param value value to set the RegNum
     */
    public void setRegNum(String value) {
        setAttributeInternal(REGNUM, value);
    }

    /**
     * Gets the attribute value for ProcType, using the alias name ProcType.
     * @return the ProcType
     */
    public String getProcType() {
        return (String)getAttributeInternal(PROCTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProcType.
     * @param value value to set the ProcType
     */
    public void setProcType(String value) {
        setAttributeInternal(PROCTYPE, value);
    }

    /**
     * Gets the attribute value for RegStatus, using the alias name RegStatus.
     * @return the RegStatus
     */
    public String getRegStatus() {
        return (String)getAttributeInternal(REGSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for RegStatus.
     * @param value value to set the RegStatus
     */
    public void setRegStatus(String value) {
        setAttributeInternal(REGSTATUS, value);
    }

    /**
     * Gets the attribute value for TotalUsdAmt, using the alias name TotalUsdAmt.
     * @return the TotalUsdAmt
     */
    public Number getTotalUsdAmt() {
        return (Number)getAttributeInternal(TOTALUSDAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalUsdAmt.
     * @param value value to set the TotalUsdAmt
     */
    public void setTotalUsdAmt(Number value) {
        setAttributeInternal(TOTALUSDAMT, value);
    }

    /**
     * Gets the attribute value for TotalPfiAmt, using the alias name TotalPfiAmt.
     * @return the TotalPfiAmt
     */
    public Number getTotalPfiAmt() {
        return (Number)getAttributeInternal(TOTALPFIAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalPfiAmt.
     * @param value value to set the TotalPfiAmt
     */
    public void setTotalPfiAmt(Number value) {
        setAttributeInternal(TOTALPFIAMT, value);
    }

    /**
     * Gets the attribute value for RequestedBy, using the alias name RequestedBy.
     * @return the RequestedBy
     */
    public Number getRequestedBy() {
        return (Number)getAttributeInternal(REQUESTEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for RequestedBy.
     * @param value value to set the RequestedBy
     */
    public void setRequestedBy(Number value) {
        setAttributeInternal(REQUESTEDBY, value);
    }

    /**
     * Gets the attribute value for Urgency, using the alias name Urgency.
     * @return the Urgency
     */
    public String getUrgency() {
        return (String)getAttributeInternal(URGENCY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Urgency.
     * @param value value to set the Urgency
     */
    public void setUrgency(String value) {
        setAttributeInternal(URGENCY, value);
    }

    /**
     * Gets the attribute value for ConsigneeId, using the alias name ConsigneeId.
     * @return the ConsigneeId
     */
    public Number getConsigneeId() {
        return (Number)getAttributeInternal(CONSIGNEEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ConsigneeId.
     * @param value value to set the ConsigneeId
     */
    public void setConsigneeId(Number value) {
        setAttributeInternal(CONSIGNEEID, value);
    }

    /**
     * Gets the attribute value for ShipingId, using the alias name ShipingId.
     * @return the ShipingId
     */
    public Number getShipingId() {
        return (Number)getAttributeInternal(SHIPINGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShipingId.
     * @param value value to set the ShipingId
     */
    public void setShipingId(Number value) {
        setAttributeInternal(SHIPINGID, value);
    }

    /**
     * Gets the attribute value for NotesBuyer, using the alias name NotesBuyer.
     * @return the NotesBuyer
     */
    public String getNotesBuyer() {
        return (String)getAttributeInternal(NOTESBUYER);
    }

    /**
     * Sets <code>value</code> as the attribute value for NotesBuyer.
     * @param value value to set the NotesBuyer
     */
    public void setNotesBuyer(String value) {
        setAttributeInternal(NOTESBUYER, value);
    }

    /**
     * Gets the attribute value for PartyNotes, using the alias name PartyNotes.
     * @return the PartyNotes
     */
    public String getPartyNotes() {
        return (String)getAttributeInternal(PARTYNOTES);
    }

    /**
     * Sets <code>value</code> as the attribute value for PartyNotes.
     * @param value value to set the PartyNotes
     */
    public void setPartyNotes(String value) {
        setAttributeInternal(PARTYNOTES, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }


    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getRegistrationLinesEO() {
        return (RowIterator)getAttributeInternal(REGISTRATIONLINESEO);
    }


    /**
     * @param registrationId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number registrationId) {
        return new Key(new Object[]{registrationId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
     protected void create(AttributeList attributeList) {
         super.create(attributeList);
         SequenceImpl s = new SequenceImpl("REGISTRATION_S",getDBTransaction());
         Number seqNum=s.getSequenceNumber();
         setRegistrationId(seqNum);
         setRegNum("MP" + seqNum);                  
     }


}
