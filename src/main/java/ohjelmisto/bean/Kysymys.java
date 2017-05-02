package ohjelmisto.bean;

/**
 * Created by bferr on 2.5.2017.
 */
public interface Kysymys {

    public abstract int getId();

    public abstract void setId(int id);

    public abstract String getOtsikko();

    public abstract void setOtsikko(String Otsikko);

    public abstract String getKysymysteksti();

    public abstract void setKysymysteksti(String kysymysteksti);
}
