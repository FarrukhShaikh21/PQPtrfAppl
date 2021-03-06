package pqt.dss.ptrf.model.lov;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jan 24 19:47:30 PKT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PolicyNoVoLOVImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public PolicyNoVoLOVImpl() {
    }
    
    String PolicyNo = null;

    /**
     * Returns the variable value for VC_Policy_No.
     * @return variable value for VC_Policy_No
     */
    public String getVC_Policy_No() {
        return (String) ensureVariableManager().getVariableValue("VC_Policy_No");
    }

    /**
     * Sets <code>value</code> for variable VC_Policy_No.
     * @param value value to bind as VC_Policy_No
     */
    public void setVC_Policy_No(String value) {
        ensureVariableManager().setVariableValue("VC_Policy_No", value);
    }


    /**
     * Returns the bind variable value for BV_AGENT_NO_FK.
     * @return bind variable value for BV_AGENT_NO_FK
     */
    public Number getBV_AGENT_NO_FK() {
        return (Number) getNamedWhereClauseParam("BV_AGENT_NO_FK");
    }

    /**
     * Sets <code>value</code> for bind variable BV_AGENT_NO_FK.
     * @param value value to bind as BV_AGENT_NO_FK
     */
    public void setBV_AGENT_NO_FK(Number value) {
        setNamedWhereClauseParam("BV_AGENT_NO_FK", value);
    }


    /**
     * Returns the bind variable value for BV_HDR_ID.
     * @return bind variable value for BV_HDR_ID
     */
    public Number getBV_HDR_ID() {
        return (Number) getNamedWhereClauseParam("BV_HDR_ID");
    }

    /**
     * Sets <code>value</code> for bind variable BV_HDR_ID.
     * @param value value to bind as BV_HDR_ID
     */
    public void setBV_HDR_ID(Number value) {
        setNamedWhereClauseParam("BV_HDR_ID", value);
    }

    @Override
    public void executeQuery() {
        System.out.println(getBV_AGENT_NO_FK());
        System.out.println(getBV_HDR_ID());
        System.out.println(getPolicyNo());
        this.setWhereClause("V_POLICY_NO NOT IN ("+ this.getPolicyNo() + ")");
        System.out.println(getQuery());
        super.executeQuery();
    }

    public void setPolicyNo(String PolicyNo) {
        this.PolicyNo = PolicyNo;
    }

    public String getPolicyNo() {
        return PolicyNo;
    }
}

