package ohjelmisto.dao;

import ohjelmisto.bean.Kysymys;

import java.util.List;

/**
 * Created by bferr on 2.5.2017.
 */
public interface KysymysDAO {

    public abstract void lisaaKysymys(Kysymys kysymys);

    public abstract void poista(int id);

    public abstract List<Kysymys> haekaikki();

}
