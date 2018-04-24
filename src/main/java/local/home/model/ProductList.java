package local.home.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;
@ManagedBean(name = "list", eager = true)
@RequestScoped
public class ProductList {
    private List<Product> productList;

    public ProductList() {
        this.productList = new ArrayList<>();
        productList.add(new Product(1,"Товар 1","Описание 1"));
        productList.add(new Product(2,"Товар 2","Описание 2"));
        productList.add(new Product(3,"Товар 3","Описание 3"));
        productList.add(new Product(4,"Товар 4","Описание 4"));
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
