package local.home.model;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<String> productList;

    public ProductList() {
        this.productList = new ArrayList<>();
        productList.add("Товар 1");
        productList.add("Товар 2");
        productList.add("Товар 3");
        productList.add("Товар 4");
        productList.add("Товар 5");
    }

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }
}
