package ohjelmisto.bean;

import javax.validation.constraints.Size;

/**
 * Created by bferr on 2.5.2017.
 */
public class VaihtoehtoImpl implements Vaihtoehto {

    private int id;

    @Size(min = 1, max = 200)
    private String nimi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public String toString() {
        return "VaihtoehtoImpl{" +
                "id=" + id +
                ", nimi='" + nimi + '\'' +
                '}';
    }
}
