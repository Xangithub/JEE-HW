package local.home.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "oderslist", eager = true)
@RequestScoped
public class OdersList {
    private List<String> odersList;

    public OdersList() {
        this.odersList = new ArrayList<>();
        odersList.add("Спорт товары");
        odersList.add("Бельё");
        odersList.add("Игрушки");
    }

    public List<String> getOdersList() {
        return odersList;
    }

    public void setOdersList(List<String> odersList) {
        this.odersList = odersList;
    }
}
