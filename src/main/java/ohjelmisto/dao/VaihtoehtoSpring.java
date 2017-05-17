package ohjelmisto.dao;

import ohjelmisto.bean.Vaihtoehto;
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
public class VaihtoehtoSpring implements VaihtoehtoDAO {

    @Inject
    public JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void lisaaVaihtoehto(Vaihtoehto v) {

        final String sql = "insert into vaihtoehto(nimi) values(?)";
        final String nimi = v.getNimi();

        KeyHolder idHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement pre = con.prepareStatement(sql, new String[]{"id"});
                pre.setString(1, nimi);
                return pre;
            }
        }, idHolder);
        v.setId(idHolder.getKey().intValue());
    }


    public void poista(int id) {

        String sql = "delete from vaihtoehto where id = ?";
        jdbcTemplate.update(sql, id);
        System.out.println("Deleted record with ID = " + id);
        return;
    }

    public List<Vaihtoehto> haeKaikki() {
        String sql = "select * from vaihtoehto";
        RowMapper<Vaihtoehto> mapper = new VaihtoehtoRowMapper();
        List<Vaihtoehto> vaihtoehdot = jdbcTemplate.query(sql, mapper);
        return vaihtoehdot;
    }
}
