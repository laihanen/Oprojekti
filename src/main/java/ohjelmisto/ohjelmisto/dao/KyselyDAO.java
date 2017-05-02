package ohjelmisto.ohjelmisto.dao;

import ohjelmisto.bean.Kysely;

import java.util.List;

/**
 * Created by bferr on 2.5.2017.
 */
public interface KyselyDAO {

    public abstract void lisaaKysely(Kysely kysely);

    public abstract void poista(int id);

    public abstract List<Kysely> haeKysely(int id);

    public abstract List<Kysely> haeOmat();

    public abstract List<Kysely> haeKaikki();
}
