package ra.model;

public class Product {
    private String  productId ;
    private  String  productName ;
    private  double  productPrice ;
    private String  description ;
    private int  stock ;
    private Catalog  catalog ;
    private boolean status  = true ;

    public Product() {
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public boolean isStatus() {
        return status;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Sản phẩm : " +
                "| productId='" + productId +  '\''+  "|"+
                ",| productName='" + productName +  '\''+  "|"+
                ",| productPrice=" + productPrice + "|"+
                ",|description='" + description + '\''+  "|"+
                ",| stock=" + stock +"|"+
                ",| catalog=" + catalog.getCatalogName() +"|"+
                ",| status=" + status +"|"
                ;
    }

}
