package ohjelmisto.ohjelmisto.dao;

import ohjelmisto.bean.Otsikko;

import java.util.List;

/**
 * Created by bferr on 2.5.2017.
 */
public interface OtsikkoDAO {

    public abstract void lisaaOtsikko(Otsikko otsikko);

    public abstract void poista(int id);

    public abstract List<Otsikko> haeKaikki();
}
