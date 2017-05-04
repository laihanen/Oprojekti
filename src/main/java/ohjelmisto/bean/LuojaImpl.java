package ohjelmisto.bean;

import javax.validation.constraints.Size;

/**
 * Created by bferr on 2.5.2017.
 */
public class LuojaImpl implements Luoja {

    private int id;

    @Size(min = 1, max = 100)
    private String nimi;

    @Size(min = 1, max = 100)
    private String sposti;

    @Size(min = 6, max = 20)
    private String salasana;

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

    public String getSposti() {
        return sposti;
    }

    public void setSposti(String sposti) {
        this.sposti = sposti;
    }

    public String getSalasana() {
        return salasana;
    }

    public void setSalasana(String salasana) {
        this.salasana = salasana;
    }

    @Override
    public String toString() {
        return "LuojaImpl{" +
                "id=" + id +
                ", nimi='" + nimi + '\'' +
                ", sposti='" + sposti + '\'' +
                ", salasana='" + salasana + '\'' +
                '}';
    }
}
