package ohjelmisto.dao;

import ohjelmisto.bean.Vastaus;
import java.util.List;

/**
 * Created by bferr on 2.5.2017.
 */
public interface VastausDAO {


        public abstract void lisaaVastaus(Vastaus vastaus);

        public abstract void poista(int id);

        public abstract List<Vastaus> haeKaikki();

}
