package designpatterns.prototype;

public class Notebook {



    private PageType pageType;
    private int pageCount;
    private RuleType ruleType;

    public FrontPage getFrontPage() {
        return frontPage;
    }

    public void setFrontPage(FrontPage frontPage) {
        this.frontPage = frontPage;
    }

    public FactPage getFactPage() {
        return factPage;
    }

    public void setFactPage(FactPage factPage) {
        this.factPage = factPage;
    }

    private FrontPage frontPage;
    private FactPage factPage;

    public Notebook(PageType pageType, int pageCount, RuleType ruleType) {
        this.pageType = pageType;
        this.pageCount = pageCount;
        this.ruleType = ruleType;
    }
    private Notebook() {}

    public Notebook clone() {
        Notebook newNotebook = new Notebook();
        newNotebook.pageCount = this.pageCount;
        newNotebook.pageType = this.pageType;
        newNotebook.ruleType = this.ruleType;

        return newNotebook;
    }
}
