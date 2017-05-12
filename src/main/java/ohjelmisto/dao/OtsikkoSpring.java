package ohjelmisto.dao;

import ohjelmisto.bean.Otsikko;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by bferr on 3.5.2017.
 */
@Repository
public class OtsikkoSpring implements OtsikkoDAO {

    @Inject
    public JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void lisaaOtsikko(Otsikko o) {

        final String sql = "insert into otsikko(otsikko) values(?)";
        final String nimi = o.getOtsikko();

        KeyHolder idHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement pre = con.prepareStatement(sql, new String[]{"id"});
                pre.setString(1, nimi);
                return pre;
            }
        }, idHolder);
        o.setId(idHolder.getKey().intValue());
    }


    public void poista(int id) {

        String sql = "delete from otsikko where id = ?";
        jdbcTemplate.update(sql, id);
        System.out.println("Deleted record with ID = " + id);

        return;
    }

    public List<Otsikko> haeKaikki() {
        String sql = "select * from otsikko";
        RowMapper<Otsikko> mapper = new OtsikkoRowMapper();
        List<Otsikko> otsikot = jdbcTemplate.query(sql, mapper);
        return otsikot;
    }
}
