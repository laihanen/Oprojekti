package ohjelmisto.ohjelmisto.dao;

import ohjelmisto.bean.Kysymystyyppi;
import java.util.List;

/**
 * Created by bferr on 2.5.2017.
 */
public interface KysymystyyppiDAO {

    public abstract void lisaaKysymystyyppi(Kysymystyyppi kysymystyyppi);

    public abstract void poista(int id);

    public abstract List<Kysymystyyppi> haeKaikki();
}
