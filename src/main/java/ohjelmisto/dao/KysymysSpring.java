package ohjelmisto.dao;

import ohjelmisto.bean.Kysymys;
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
public class KysymysSpring implements KysymysDAO{

    @Inject
    public JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    /*
    public void lisaaKysymys(Kysymys t){

         Pitää saada otsikko sisään kysymykseen
            SELECT p.productid, p.name, p.price, COUNT(pv.viewid) AS totalviews, COUNT(s.salesid) AS totalsales
            FROM Products p
            LEFT JOIN Sales s ON s.productid = p.productid
            LEFT JOIN ProductViews pv ON pv.productid = p.productid
            GROUP BY p.productid, p.name, p.price

            Ehkä toimisi tuollaisella pohjalla?

        final String sql = "insert into kysymys(otsikko, kysymysteksti) values(?,?)";
        final Otsikko otsikko = t.getOtsikko();
        final String teksti = t.getKysymysteksti();

        KeyHolder idHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement pre = con.prepareStatement(sql, new String[]{"id"});
                pre.setString(1, otsikko);
                pre.setString(2, teksti);
                return pre;
            }
        }, idHolder);
        t.setId(idHolder.getKey().intValue());
    }
    */
    public void poista(int id){

        String sql = "delete from kysymys where id = ?";
        jdbcTemplate.update(sql, id);
        System.out.println("Deleted Record with ID = " + id );
        return;
    }

    public List<Kysymys> haekaikki() {
        String sql = "SELECT kysymys.id, kysymys.kysymysteksti, kysymys.otsikko_id, otsikko.nimi FROM kysymys INNER JOIN otsikko ON kysymys.otsikko_id = otsikko.id;";
        RowMapper<Kysymys> mapper = new KysymysRowMapper();
        List<Kysymys> kysymykset = jdbcTemplate.query(sql, mapper);
        return kysymykset;
    }

     /* Pitää saada otsikko sisään kysymykseen
            SELECT p.productid, p.name, p.price, COUNT(pv.viewid) AS totalviews, COUNT(s.salesid) AS totalsales
            FROM Products p
            LEFT JOIN Sales s ON s.productid = p.productid
            LEFT JOIN ProductViews pv ON pv.productid = p.productid
            GROUP BY p.productid, p.name, p.price

            Ehkä toimisi tuollaisella pohjalla?
         */



}
