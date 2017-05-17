package ohjelmisto.dao;

import ohjelmisto.bean.Kysymys;
import ohjelmisto.bean.KysymysImpl;
import ohjelmisto.bean.Otsikko;
import ohjelmisto.bean.OtsikkoImpl;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by bferr on 3.5.2017.
 */
public class KysymysRowMapper implements RowMapper<Kysymys> {

    public Kysymys mapRow(ResultSet rs, int rowNum) throws SQLException {
        Kysymys k = new KysymysImpl();
        k.setId(rs.getInt("kysymys.id"));
        k.setKysymysteksti(rs.getString("kysymysteksti"));

        Otsikko o = new OtsikkoImpl();
        o.setId(rs.getInt("kysymys.otsikko_id"));
        o.setNimi(rs.getString("nimi"));

        k.setOtsikko(o);




        /* Otsikko Id muuttujaan,
        otsikon nimi muuttujaan,
        otsikko olion luonti:
        kysymys oliolle setataan otsikko olio


         */
        return k;
    }
    }

