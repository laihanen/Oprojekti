package ohjelmisto.controller;

import ohjelmisto.bean.Kysymys;
import ohjelmisto.dao.KyselyDAO;
import ohjelmisto.dao.KysymysDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by bferr on 2.5.2017.
 */
@Controller
public class KysymysController {

    @Inject
    KysymysDAO dao;

    public KysymysDAO getDao() {
        return dao;
    }

    public void setDao(KysymysDAO dao) {
        this.dao = dao;
    }

    @RequestMapping("kysymykset.json")
    public @ResponseBody List<Kysymys> haeKysymyksetJSON()
    { List<Kysymys> kysymykset = dao.haekaikki();
        return kysymykset;
    }
    @RequestMapping("kysymykset")
    public String lisaaKysymys() {
        return "kysymys/kysymyslista";

    }
}