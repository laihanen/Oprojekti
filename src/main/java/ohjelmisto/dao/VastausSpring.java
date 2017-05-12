package ohjelmisto.dao;

import ohjelmisto.bean.Vastaus;
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

@Repository
public class VastausSpring implements VastausDAO {

    @Inject
    public JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void lisaaVastaukset(Vastaus v) {

        final String sql = "insert into vastaus(avointeksti) values(?)";
        final String avointeksti = v.getAvointeksti();

        KeyHolder idHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement pre = con.prepareStatement(sql, new String[]{"id"});
                pre.setString(1, avointeksti);
                return pre;
            }
        }, idHolder);
        v.setId(idHolder.getKey().intValue());

    }


    public poista(int id) {


        String sql = "delete from vastaus where id = ?";
        jdbcTemplate.update(sql, id);
        System.out.println("Deleted Record with ID = " + id);
        return;

    }


    public List<Vastaus> haeKaikki() {
        String sql ="SELECT * FROM vastaus";
        RowMapper<Vastaus> mapper = new VastausRowMapper();
        List<Vastaus> vastaukset = jdbcTemplate.query(sql, mapper);
        return vastaukset;
    }

    }


