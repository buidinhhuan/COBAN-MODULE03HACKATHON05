package ra.model;

public class Catalog {
    private int catalogId;
    private String catalogName;

    public Catalog(int catalogId, String catalogName) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
    }

    public Catalog() {
    }



    public int getCatalogId() {
        return catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }


    @Override
    public String toString() {
        return "Danh mục :" +
                "| catalogId=" + catalogId + "|"+
                ",| catalogName='" + catalogName + '\''+  "|"
                ;
    }
}
