package ohjelmisto.dao;


import ohjelmisto.bean.Vastaus;
import ohjelmisto.bean.VastausImpl;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by bferr on 12/05/2017.
 */
public class VastausRowMapper implements RowMapper<Vastaus> {

    public Vastaus mapRow(ResultSet rs, int rowNum) throws SQLException{
        Vastaus v = new VastausImpl();
        v.setId(rs.getInt("id"));
        v.setAvointekstivastaus(rs.getString("avointekstivastaus"));
        return v;
    }

}