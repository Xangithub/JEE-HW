package local.home.model;

import javax.persistence.*;
import java.util.ArrayList;

/**
 * Это будет модель товара
 */

@Entity
@Table
public class Product {
    @Id
    int id;
    @Column
    String nameProduct;
    @Column
    String descrProduct;

    @OneToMany
    ArrayList<Category> categories;

    public Product() {
    }

    public Product(int id, String nameProduct, String descrProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.descrProduct = descrProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescrProduct() {
        return descrProduct;
    }

    public void setDescrProduct(String descrProduct) {
        this.descrProduct = descrProduct;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }
}
