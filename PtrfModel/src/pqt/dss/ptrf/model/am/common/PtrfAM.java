package pqt.dss.ptrf.model.am.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Aug 11 14:38:25 PDT 2016
// ---------------------------------------------------------------------
public interface PtrfAM extends ApplicationModule {
    void Apply();

    void DeleteCommit();

    void Rollback();

    void DssApprove();


    String SearchPolicy();


    void callPTRFWorkflow(oracle.jbo.domain.Number p_document_id);

    void callWorkflow(oracle.jbo.domain.Number p_document_id, String ApprovalType);

    void PopulatePolicy();

    void PupolatePolicyNo();

    void setSessionValue();
}

