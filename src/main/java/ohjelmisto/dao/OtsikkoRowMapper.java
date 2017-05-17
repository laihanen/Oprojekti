package ohjelmisto.dao;

import ohjelmisto.bean.Otsikko;
import ohjelmisto.bean.OtsikkoImpl;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Iiro on 12.5.2017.
 */
public class OtsikkoRowMapper implements RowMapper<Otsikko> {

    public Otsikko mapRow(ResultSet rs, int rowNum) throws SQLException{
        Otsikko o = new OtsikkoImpl();
        o.setId(rs.getInt("id"));
        o.setNimi(rs.getString("nimi"));
        return o;
    }
}
