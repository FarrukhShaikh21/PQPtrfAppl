package pqt.dss.ptrf.model.eo;

import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.SQLException;

import java.sql.Types;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Char;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.DBTransaction;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 08 12:15:34 PKT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DssPlanTransferHeaderImpl extends EntityImpl {
    private void setLastUpdatedDate(Date date) {
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        TrHeaderIdPk,
        FromAgentNoFk,
        FromPersisSec,
        FromAgentPportfolio,
        UserIdFk,
        EnterDate,
        LastUpdatedBy,
        LastUpdatedDate,
        DssStatus,
        BranchStatus,
        BranchNotifIdFk,
        DssNotifIdFk,
        BranchCodeFk,
        FromPersisThrd,
        PtrfDocNo,
        UserBranch,
        WorkflowStatus,
        WorkflowNotificationId,
        TransactionType,
        CompltetePortfolio,
        FromQuaterlyBusPol,
        FromQuaterlyBus,
        FromHalfYearlyBusPol,
        FromHalfYearlyBus,
        FromYearlyBusPol,
        FromYearlyBus,
        GisLocationIdFk,
        DssPlanTransferLines;
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


    public static final int TRHEADERIDPK = AttributesEnum.TrHeaderIdPk.index();
    public static final int FROMAGENTNOFK = AttributesEnum.FromAgentNoFk.index();
    public static final int FROMPERSISSEC = AttributesEnum.FromPersisSec.index();
    public static final int FROMAGENTPPORTFOLIO = AttributesEnum.FromAgentPportfolio.index();
    public static final int USERIDFK = AttributesEnum.UserIdFk.index();
    public static final int ENTERDATE = AttributesEnum.EnterDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int DSSSTATUS = AttributesEnum.DssStatus.index();
    public static final int BRANCHSTATUS = AttributesEnum.BranchStatus.index();
    public static final int BRANCHNOTIFIDFK = AttributesEnum.BranchNotifIdFk.index();
    public static final int DSSNOTIFIDFK = AttributesEnum.DssNotifIdFk.index();
    public static final int BRANCHCODEFK = AttributesEnum.BranchCodeFk.index();
    public static final int FROMPERSISTHRD = AttributesEnum.FromPersisThrd.index();
    public static final int PTRFDOCNO = AttributesEnum.PtrfDocNo.index();
    public static final int USERBRANCH = AttributesEnum.UserBranch.index();
    public static final int WORKFLOWSTATUS = AttributesEnum.WorkflowStatus.index();
    public static final int WORKFLOWNOTIFICATIONID = AttributesEnum.WorkflowNotificationId.index();
    public static final int TRANSACTIONTYPE = AttributesEnum.TransactionType.index();
    public static final int COMPLTETEPORTFOLIO = AttributesEnum.CompltetePortfolio.index();
    public static final int FROMQUATERLYBUSPOL = AttributesEnum.FromQuaterlyBusPol.index();
    public static final int FROMQUATERLYBUS = AttributesEnum.FromQuaterlyBus.index();
    public static final int FROMHALFYEARLYBUSPOL = AttributesEnum.FromHalfYearlyBusPol.index();
    public static final int FROMHALFYEARLYBUS = AttributesEnum.FromHalfYearlyBus.index();
    public static final int FROMYEARLYBUSPOL = AttributesEnum.FromYearlyBusPol.index();
    public static final int FROMYEARLYBUS = AttributesEnum.FromYearlyBus.index();
    public static final int GISLOCATIONIDFK = AttributesEnum.GisLocationIdFk.index();
    public static final int DSSPLANTRANSFERLINES = AttributesEnum.DssPlanTransferLines.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DssPlanTransferHeaderImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("pqt.dss.ptrf.model.eo.DssPlanTransferHeader");
    }


    /**
     * Gets the attribute value for TrHeaderIdPk, using the alias name TrHeaderIdPk.
     * @return the value of TrHeaderIdPk
     */
    public Number getTrHeaderIdPk() {
        return (Number) getAttributeInternal(TRHEADERIDPK);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrHeaderIdPk.
     * @param value value to set the TrHeaderIdPk
     */
    public void setTrHeaderIdPk(Number value) {
        setAttributeInternal(TRHEADERIDPK, value);
    }

    /**
     * Gets the attribute value for FromAgentNoFk, using the alias name FromAgentNoFk.
     * @return the value of FromAgentNoFk
     */
    public Number getFromAgentNoFk() {
        return (Number) getAttributeInternal(FROMAGENTNOFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for FromAgentNoFk.
     * @param value value to set the FromAgentNoFk
     */
    public void setFromAgentNoFk(Number value) {
        setAttributeInternal(FROMAGENTNOFK, value);
    }

    /**
     * Gets the attribute value for FromPersisSec, using the alias name FromPersisSec.
     * @return the value of FromPersisSec
     */
    public Number getFromPersisSec() {
        return (Number) getAttributeInternal(FROMPERSISSEC);
    }

    /**
     * Sets <code>value</code> as the attribute value for FromPersisSec.
     * @param value value to set the FromPersisSec
     */
    public void setFromPersisSec(Number value) {
        setAttributeInternal(FROMPERSISSEC, value);
    }

    /**
     * Gets the attribute value for FromAgentPportfolio, using the alias name FromAgentPportfolio.
     * @return the value of FromAgentPportfolio
     */
    public Number getFromAgentPportfolio() {
        return (Number) getAttributeInternal(FROMAGENTPPORTFOLIO);
    }

    /**
     * Sets <code>value</code> as the attribute value for FromAgentPportfolio.
     * @param value value to set the FromAgentPportfolio
     */
    public void setFromAgentPportfolio(Number value) {
        setAttributeInternal(FROMAGENTPPORTFOLIO, value);
    }

    /**
     * Gets the attribute value for UserIdFk, using the alias name UserIdFk.
     * @return the value of UserIdFk
     */
    public Number getUserIdFk() {
        return (Number) getAttributeInternal(USERIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserIdFk.
     * @param value value to set the UserIdFk
     */
    public void setUserIdFk(Number value) {
        setAttributeInternal(USERIDFK, value);
    }

    /**
     * Gets the attribute value for EnterDate, using the alias name EnterDate.
     * @return the value of EnterDate
     */
    public Date getEnterDate() {
        return (Date) getAttributeInternal(ENTERDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EnterDate.
     * @param value value to set the EnterDate
     */
    public void setEnterDate(Date value) {
        setAttributeInternal(ENTERDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the value of LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedDate.
     * @param value value to set the LastUpdatedDate
     */
    public void setLastUpdatedDate(Number value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for DssStatus, using the alias name DssStatus.
     * @return the value of DssStatus
     */
    public String getDssStatus() {
        return (String) getAttributeInternal(DSSSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for DssStatus.
     * @param value value to set the DssStatus
     */
    public void setDssStatus(String value) {
        setAttributeInternal(DSSSTATUS, value);
    }

    /**
     * Gets the attribute value for BranchStatus, using the alias name BranchStatus.
     * @return the value of BranchStatus
     */
    public String getBranchStatus() {
        return (String) getAttributeInternal(BRANCHSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchStatus.
     * @param value value to set the BranchStatus
     */
    public void setBranchStatus(String value) {
        setAttributeInternal(BRANCHSTATUS, value);
    }

    /**
     * Gets the attribute value for BranchNotifIdFk, using the alias name BranchNotifIdFk.
     * @return the value of BranchNotifIdFk
     */
    public Number getBranchNotifIdFk() {
        return (Number) getAttributeInternal(BRANCHNOTIFIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchNotifIdFk.
     * @param value value to set the BranchNotifIdFk
     */
    public void setBranchNotifIdFk(Number value) {
        setAttributeInternal(BRANCHNOTIFIDFK, value);
    }

    /**
     * Gets the attribute value for DssNotifIdFk, using the alias name DssNotifIdFk.
     * @return the value of DssNotifIdFk
     */
    public Number getDssNotifIdFk() {
        return (Number) getAttributeInternal(DSSNOTIFIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for DssNotifIdFk.
     * @param value value to set the DssNotifIdFk
     */
    public void setDssNotifIdFk(Number value) {
        setAttributeInternal(DSSNOTIFIDFK, value);
    }

    /**
     * Gets the attribute value for BranchCodeFk, using the alias name BranchCodeFk.
     * @return the value of BranchCodeFk
     */
    public String getBranchCodeFk() {
        return (String) getAttributeInternal(BRANCHCODEFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchCodeFk.
     * @param value value to set the BranchCodeFk
     */
    public void setBranchCodeFk(String value) {
        setAttributeInternal(BRANCHCODEFK, value);
    }

    /**
     * Gets the attribute value for FromPersisThrd, using the alias name FromPersisThrd.
     * @return the value of FromPersisThrd
     */
    public Number getFromPersisThrd() {
        return (Number) getAttributeInternal(FROMPERSISTHRD);
    }

    /**
     * Sets <code>value</code> as the attribute value for FromPersisThrd.
     * @param value value to set the FromPersisThrd
     */
    public void setFromPersisThrd(Number value) {
        setAttributeInternal(FROMPERSISTHRD, value);
    }

    /**
     * Gets the attribute value for PtrfDocNo, using the alias name PtrfDocNo.
     * @return the value of PtrfDocNo
     */
    public String getPtrfDocNo() {
        return (String) getAttributeInternal(PTRFDOCNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for PtrfDocNo.
     * @param value value to set the PtrfDocNo
     */
    public void setPtrfDocNo(String value) {
        setAttributeInternal(PTRFDOCNO, value);
    }

    /**
     * Gets the attribute value for UserBranch, using the alias name UserBranch.
     * @return the value of UserBranch
     */
    public String getUserBranch() {
        return (String) getAttributeInternal(USERBRANCH);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserBranch.
     * @param value value to set the UserBranch
     */
    public void setUserBranch(String value) {
        setAttributeInternal(USERBRANCH, value);
    }

    /**
     * Gets the attribute value for WorkflowStatus, using the alias name WorkflowStatus.
     * @return the value of WorkflowStatus
     */
    public String getWorkflowStatus() {
        return (String) getAttributeInternal(WORKFLOWSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for WorkflowStatus.
     * @param value value to set the WorkflowStatus
     */
    public void setWorkflowStatus(String value) {
        setAttributeInternal(WORKFLOWSTATUS, value);
    }

    /**
     * Gets the attribute value for WorkflowNotificationId, using the alias name WorkflowNotificationId.
     * @return the value of WorkflowNotificationId
     */
    public Number getWorkflowNotificationId() {
        return (Number) getAttributeInternal(WORKFLOWNOTIFICATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for WorkflowNotificationId.
     * @param value value to set the WorkflowNotificationId
     */
    public void setWorkflowNotificationId(Number value) {
        setAttributeInternal(WORKFLOWNOTIFICATIONID, value);
    }

    /**
     * Gets the attribute value for TransactionType, using the alias name TransactionType.
     * @return the value of TransactionType
     */
    public String getTransactionType() {
        return (String) getAttributeInternal(TRANSACTIONTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransactionType.
     * @param value value to set the TransactionType
     */
    public void setTransactionType(String value) {
        setAttributeInternal(TRANSACTIONTYPE, value);
    }

    /**
     * Gets the attribute value for CompltetePortfolio, using the alias name CompltetePortfolio.
     * @return the value of CompltetePortfolio
     */
    public String getCompltetePortfolio() {
        return (String) getAttributeInternal(COMPLTETEPORTFOLIO);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompltetePortfolio.
     * @param value value to set the CompltetePortfolio
     */
    public void setCompltetePortfolio(String value) {
        setAttributeInternal(COMPLTETEPORTFOLIO, value);
    }

    /**
     * Gets the attribute value for FromQuaterlyBusPol, using the alias name FromQuaterlyBusPol.
     * @return the value of FromQuaterlyBusPol
     */
    public Number getFromQuaterlyBusPol() {
        return (Number) getAttributeInternal(FROMQUATERLYBUSPOL);
    }

    /**
     * Sets <code>value</code> as the attribute value for FromQuaterlyBusPol.
     * @param value value to set the FromQuaterlyBusPol
     */
    public void setFromQuaterlyBusPol(Number value) {
        setAttributeInternal(FROMQUATERLYBUSPOL, value);
    }

    /**
     * Gets the attribute value for FromQuaterlyBus, using the alias name FromQuaterlyBus.
     * @return the value of FromQuaterlyBus
     */
    public Number getFromQuaterlyBus() {
        return (Number) getAttributeInternal(FROMQUATERLYBUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for FromQuaterlyBus.
     * @param value value to set the FromQuaterlyBus
     */
    public void setFromQuaterlyBus(Number value) {
        setAttributeInternal(FROMQUATERLYBUS, value);
    }

    /**
     * Gets the attribute value for FromHalfYearlyBusPol, using the alias name FromHalfYearlyBusPol.
     * @return the value of FromHalfYearlyBusPol
     */
    public Number getFromHalfYearlyBusPol() {
        return (Number) getAttributeInternal(FROMHALFYEARLYBUSPOL);
    }

    /**
     * Sets <code>value</code> as the attribute value for FromHalfYearlyBusPol.
     * @param value value to set the FromHalfYearlyBusPol
     */
    public void setFromHalfYearlyBusPol(Number value) {
        setAttributeInternal(FROMHALFYEARLYBUSPOL, value);
    }

    /**
     * Gets the attribute value for FromHalfYearlyBus, using the alias name FromHalfYearlyBus.
     * @return the value of FromHalfYearlyBus
     */
    public Number getFromHalfYearlyBus() {
        return (Number) getAttributeInternal(FROMHALFYEARLYBUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for FromHalfYearlyBus.
     * @param value value to set the FromHalfYearlyBus
     */
    public void setFromHalfYearlyBus(Number value) {
        setAttributeInternal(FROMHALFYEARLYBUS, value);
    }

    /**
     * Gets the attribute value for FromYearlyBusPol, using the alias name FromYearlyBusPol.
     * @return the value of FromYearlyBusPol
     */
    public Number getFromYearlyBusPol() {
        return (Number) getAttributeInternal(FROMYEARLYBUSPOL);
    }

    /**
     * Sets <code>value</code> as the attribute value for FromYearlyBusPol.
     * @param value value to set the FromYearlyBusPol
     */
    public void setFromYearlyBusPol(Number value) {
        setAttributeInternal(FROMYEARLYBUSPOL, value);
    }

    /**
     * Gets the attribute value for FromYearlyBus, using the alias name FromYearlyBus.
     * @return the value of FromYearlyBus
     */
    public Number getFromYearlyBus() {
        return (Number) getAttributeInternal(FROMYEARLYBUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for FromYearlyBus.
     * @param value value to set the FromYearlyBus
     */
    public void setFromYearlyBus(Number value) {
        setAttributeInternal(FROMYEARLYBUS, value);
    }

    /**
     * Gets the attribute value for GisLocationIdFk, using the alias name GisLocationIdFk.
     * @return the value of GisLocationIdFk
     */
    public Number getGisLocationIdFk() {
        return (Number) getAttributeInternal(GISLOCATIONIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for GisLocationIdFk.
     * @param value value to set the GisLocationIdFk
     */
    public void setGisLocationIdFk(Number value) {
        setAttributeInternal(GISLOCATIONIDFK, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDssPlanTransferLines() {
        return (RowIterator) getAttributeInternal(DSSPLANTRANSFERLINES);
    }


    /**
     * @param trHeaderIdPk key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number trHeaderIdPk) {
        return new Key(new Object[] { trHeaderIdPk });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
     protected void create(AttributeList attributeList) {
      super.create(attributeList);
      Date currentDate = new Date();
      setEnterDate((Date) currentDate.getCurrentDate());
      setLastUpdatedDate((Date) currentDate.getCurrentDate());
      SequenceImpl seq = new SequenceImpl("DSS_PLAN_TRANSFER_HEADER_SEQ", getDBTransaction());
      setTrHeaderIdPk(seq.getSequenceNumber());
      
//         setCompltetePortfolio("0");
         setBranchStatus("INCOMPLETE");
         setDssStatus("INCOMPLETE");
         ViewObject vo=getDBTransaction().getRootApplicationModule().findViewObject("PlanUserLocVO");
         if (vo!=null)
           {
                   vo.remove();
           }
      
      FacesContext fctx = FacesContext.getCurrentInstance();
      ExternalContext ectx = fctx.getExternalContext();
      HttpSession userSession = (HttpSession) ectx.getSession(false);
      try {
          setUserIdFk(new Number(userSession.getAttribute("pUserId")));
          setLastUpdatedBy(new Number(userSession.getAttribute("pUserId")));
          vo=getDBTransaction().getRootApplicationModule().createViewObjectFromQueryStmt("PlanUserLocVO", "select  GIS_LOCATION_ID_FK from DSS_SM_USERS WHERE USER_ID_PK="+getUserIdFk());
          vo.executeQuery();
          setGisLocationIdFk(new Number( vo.first().getAttribute(0).toString() ) );
      } catch (SQLException ex) {
          setUserIdFk(new Number(0));
          setLastUpdatedBy(new Number(0));
      }
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
             if (operation == DML_INSERT) {
                 DBTransaction txn = getDBTransaction();
                 CallableStatement callableStatement =
                     txn.createCallableStatement("begin ? := dss_all_pkg.GET_PTRF_NUMBER; end;", DBTransaction.DEFAULT);
                 try {
                     callableStatement.registerOutParameter(1, Types.VARCHAR);
                     callableStatement.executeUpdate();
                     String vPtrfNumber = callableStatement.getString(1);
                     callableStatement.close();
                     setPtrfDocNo(vPtrfNumber);
                 } catch (SQLException sqle) {
                     try {
                         callableStatement.close();
                     } catch (SQLException f) {
                     }
                 }
             }
             Date currentDate = new Date();
             if (operation == DML_UPDATE) {
                 setLastUpdatedDate((Date) currentDate.getCurrentDate());
                 FacesContext fctx = FacesContext.getCurrentInstance();
                 ExternalContext ectx = fctx.getExternalContext();
                 HttpSession userSession = (HttpSession) ectx.getSession(false);
                 try {
     //                    setUserIdFk(new Number(userSession.getAttribute("pUserId")));
                     setLastUpdatedBy(new Number(userSession.getAttribute("pUserId")));
                 } catch (SQLException ex) {
     //                    setUserIdFk(new Number(0));
                     setLastUpdatedBy(new Number(0));
                 }
             }
             super.doDML(operation, e);
         }
}

