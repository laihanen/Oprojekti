package ohjelmisto.ohjelmisto.dao;

import ohjelmisto.bean.Kysymys;
import ohjelmisto.bean.KysymysImpl;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by bferr on 3.5.2017.
 */
public class KysymysRowMapper implements RowMapper<Kysymys> {

    public Kysymys mapRow(ResultSet rs, int rowNum) throws SQLException
        Kysymys k = new KysymysImpl();
        k.setId(rs.getInt("id"));
        k.setNimi(rs.getString("nimi"));
        return k;
}
