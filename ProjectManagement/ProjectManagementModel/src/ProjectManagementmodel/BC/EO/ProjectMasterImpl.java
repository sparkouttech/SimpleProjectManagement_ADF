package ProjectManagementmodel.BC.EO;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jan 27 15:32:09 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ProjectMasterImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ProjectCode,
        ProjectName,
        ProjectDescription,
        ManagerCode,
        Status,
        ProjectRequests,
        Users,
        DependencyRequests;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int PROJECTCODE = AttributesEnum.ProjectCode.index();
    public static final int PROJECTNAME = AttributesEnum.ProjectName.index();
    public static final int PROJECTDESCRIPTION = AttributesEnum.ProjectDescription.index();
    public static final int MANAGERCODE = AttributesEnum.ManagerCode.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int PROJECTREQUESTS = AttributesEnum.ProjectRequests.index();
    public static final int USERS = AttributesEnum.Users.index();
    public static final int DEPENDENCYREQUESTS = AttributesEnum.DependencyRequests.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ProjectMasterImpl() {
    }

    /**
     * Gets the attribute value for ProjectCode, using the alias name ProjectCode.
     * @return the value of ProjectCode
     */
    public BigDecimal getProjectCode() {
        return (BigDecimal) getAttributeInternal(PROJECTCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectCode.
     * @param value value to set the ProjectCode
     */
    public void setProjectCode(BigDecimal value) {
        setAttributeInternal(PROJECTCODE, value);
    }

    /**
     * Gets the attribute value for ProjectName, using the alias name ProjectName.
     * @return the value of ProjectName
     */
    public String getProjectName() {
        return (String) getAttributeInternal(PROJECTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectName.
     * @param value value to set the ProjectName
     */
    public void setProjectName(String value) {
        setAttributeInternal(PROJECTNAME, value);
    }

    /**
     * Gets the attribute value for ProjectDescription, using the alias name ProjectDescription.
     * @return the value of ProjectDescription
     */
    public String getProjectDescription() {
        return (String) getAttributeInternal(PROJECTDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectDescription.
     * @param value value to set the ProjectDescription
     */
    public void setProjectDescription(String value) {
        setAttributeInternal(PROJECTDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for ManagerCode, using the alias name ManagerCode.
     * @return the value of ManagerCode
     */
    public BigDecimal getManagerCode() {
        return (BigDecimal) getAttributeInternal(MANAGERCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ManagerCode.
     * @param value value to set the ManagerCode
     */
    public void setManagerCode(BigDecimal value) {
        setAttributeInternal(MANAGERCODE, value);
    }

    /**
     * Gets the attribute value for Status, using the alias name Status.
     * @return the value of Status
     */
    public String getStatus() {
        return (String) getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Status.
     * @param value value to set the Status
     */
    public void setStatus(String value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getProjectRequests() {
        return (RowIterator) getAttributeInternal(PROJECTREQUESTS);
    }

    /**
     * @return the associated entity UsersImpl.
     */
    public UsersImpl getUsers() {
        return (UsersImpl) getAttributeInternal(USERS);
    }

    /**
     * Sets <code>value</code> as the associated entity UsersImpl.
     */
    public void setUsers(UsersImpl value) {
        setAttributeInternal(USERS, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDependencyRequests() {
        return (RowIterator) getAttributeInternal(DEPENDENCYREQUESTS);
    }

    /**
     * @param projectCode key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal projectCode) {
        return new Key(new Object[] { projectCode });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("ProjectManagementmodel.BC.EO.ProjectMaster");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation == DML_INSERT){
            SequenceImpl s = new SequenceImpl("PROJ_SEQ", getDBTransaction());
            BigDecimal cuser_seq = new BigDecimal(s.getSequenceNumber().toString());
            setProjectCode(cuser_seq);
            }
        super.doDML(operation, e);
    }
}

