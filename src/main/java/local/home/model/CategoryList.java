package local.home.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "categoryList", eager = true)
@RequestScoped
public class CategoryList {
    private List<String> categoryList;

    public CategoryList() {
        this.categoryList = new ArrayList<>();
        categoryList.add("Спорт товары");
        categoryList.add("Бельё");
        categoryList.add("Игрушки");
    }

    public List<String> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<String> categoryList) {
        this.categoryList = categoryList;
    }
}
