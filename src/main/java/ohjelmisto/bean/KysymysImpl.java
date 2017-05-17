package ohjelmisto.bean;

import javax.validation.constraints.Size;

/**
 * Created by bferr on 2.5.2017.
 */
public class KysymysImpl implements Kysymys {

    private int id;

    @Size(min = 1, max = 255)
    private Otsikko otsikko;

    @Size(min = 1, max = 200)
    private String kysymysteksti;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Otsikko getOtsikko() {
        return otsikko;
    }

    public void setOtsikko(Otsikko otsikko) {
        this.otsikko = otsikko;
    }

    public String getKysymysteksti() {
        return kysymysteksti;
    }

    public void setKysymysteksti(String kysymysteksti) {
        this.kysymysteksti = kysymysteksti;
    }

    @Override
    public String toString() {
        return "KysymysImpl{" +
                "id=" + id +
                ", otsikko='" + otsikko + '\'' +
                ", kysymysteksti='" + kysymysteksti + '\'' +
                '}';
    }
}
