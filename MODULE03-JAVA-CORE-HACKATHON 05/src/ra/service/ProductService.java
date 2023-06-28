package ra.service;

import ra.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> products = new ArrayList<>();
    public List<Product> getAll() {
        return products;
    }
    public int getSize(){
        return products.size();
    }
    public  void  Save(Product newProduct){
        if (finById(newProduct.getProductId()) == null){
            //thêm　mới
            products.add(newProduct);
        }else{
            //update
            int index = products.indexOf(finById(newProduct.getProductId()));
            products.set(index,newProduct );
        }
    }
    public Product finById(String id){
        for (Product product: products) {
            if (product.getProductId().equals(id) ){
                return product;
                //tìm thấy
            }
        }
        //không tìm thấy
        return null;
    }
    public  boolean deleteProduct(String delId){
        if (finById(delId)==null){
            System.err.println("không tìm thấy sản phẩm ");
            return false;
        }
        products.remove(finById(delId));
        return  true;
    }

}
