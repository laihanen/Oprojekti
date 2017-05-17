package ohjelmisto.dao;

import ohjelmisto.bean.Vaihtoehto;

import java.util.List;

/**
 * Created by bferr on 2.5.2017.
 */
public interface VaihtoehtoDAO {

    public abstract void lisaaVaihtoehto(Vaihtoehto v);

    public abstract void poista(int id);

    public abstract List<Vaihtoehto> haeKaikki();

}
