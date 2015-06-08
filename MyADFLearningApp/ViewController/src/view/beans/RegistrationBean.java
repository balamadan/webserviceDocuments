package view.beans;

public class RegistrationBean 
{
    private boolean disableAddItemBtn;
    private boolean disableSearchCataBtn;
    private String regId;
    public RegistrationBean() 
    {
    }

    public void setDisableAddItemBtn(boolean disableAddItemBtn) {
        this.disableAddItemBtn = disableAddItemBtn;
    }

    public boolean isDisableAddItemBtn() {
        return disableAddItemBtn;
    }

    public void setDisableSearchCataBtn(boolean disableSearchCataBtn) {
        this.disableSearchCataBtn = disableSearchCataBtn;
    }

    public boolean isDisableSearchCataBtn() {
        return disableSearchCataBtn;
    }

    public void setRegId(String regId) {
        System.out.println("inside bean regid="+regId);
        this.regId = regId;
    }

    public String getRegId() {
        return regId;
    }
}
