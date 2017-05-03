package ohjelmisto.ohjelmisto.dao;

import ohjelmisto.bean.Kysely;
import ohjelmisto.bean.KyselyImpl;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by bferr on 3.5.2017.
 */
public class KyselyRowMapper implements RowMapper<Kysely> {

    public Kysely mapRow(ResultSet rs, int rowNum) throws SQLException {
        Kysely m = new KyselyImpl();
        m.setId(rs.getInt("id"));
        m.setNimi(rs.getString("nimi"));

        return m;
    }
}