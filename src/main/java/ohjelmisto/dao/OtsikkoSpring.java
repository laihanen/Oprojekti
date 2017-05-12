package ohjelmisto.dao;

import ohjelmisto.bean.Otsikko;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

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

    public void lisaaOtsikko(Otsikko otsikko) {

        final String sql = "insert into"
    }
}
