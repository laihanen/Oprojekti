package ohjelmisto.dao;

import ohjelmisto.bean.Vaihtoehto;
import ohjelmisto.bean.VaihtoehtoImpl;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Daiha on 5/17/2017.
 */
public class VaihtoehtoRowMapper implements RowMapper<Vaihtoehto> {

    public Vaihtoehto mapRow(ResultSet rs, int rowNum) throws SQLException {
        Vaihtoehto v = new VaihtoehtoImpl();
        v.setId(rs.getInt("id"));
        v.setNimi(rs.getString("nimi"));
        return v; }
}
