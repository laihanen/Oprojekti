package ohjelmisto.bean;

/**
 * Created by bferr on 2.5.2017.
 */
public class VastausImpl {

    private int id;

    private String avointeksti;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvointeksti() {
        return avointeksti;
    }

    public void setAvointeksti(String avointeksti) {
        this.avointeksti = avointeksti;
    }

    @Override
    public String toString() {
        return "VastausImpl{" +
                "id=" + id +
                ", avointeksti='" + avointeksti + '\'' +
                '}';
    }
}
