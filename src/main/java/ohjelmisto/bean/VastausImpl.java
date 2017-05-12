package ohjelmisto.bean;

/**
 * Created by bferr on 2.5.2017.
 */
public class VastausImpl implements Vastaus {

    private int id;

    private String avointekstivastaus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvointekstivastaus() {
        return avointekstivastaus;
    }

    public void setAvointekstivastaus(String avointekstivastaus) {
        this.avointekstivastaus = avointekstivastaus;
    }

    @Override
    public String toString() {
        return "VastausImpl{" +
                "id=" + id +
                ", avointekstivastaus='" + avointekstivastaus + '\'' +
                '}';
    }
}
