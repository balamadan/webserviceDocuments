package model.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jan 08 12:19:10 IST 2009
// ---------------------------------------------------------------------
public interface MyLearningAM extends ApplicationModule {
    void getItemInCategory(String CategoryId);

    void initilizeNewRegLines(String productCode, String regId);

    void updateRegLinesAmt();
}
