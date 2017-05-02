package ohjelmisto.bean;

import javax.validation.constraints.Size;

/**
 * Created by bferr on 2.5.2017.
 */
public class OtsikkoImpl implements Otsikko {

    private int id;

    @Size(min = 1, max = 100)
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
        return "OtsikkoImpl{" +
                "id=" + id +
                ", nimi='" + nimi + '\'' +
                '}';
    }
}
