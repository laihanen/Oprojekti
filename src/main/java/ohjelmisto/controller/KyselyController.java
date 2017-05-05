package ohjelmisto.controller;

import ohjelmisto.bean.Kysely;
import ohjelmisto.dao.KyselyDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by bferr on 2.5.2017.
 */
@Controller
@RequestMapping(value="/secure")
public class KyselyController {

    @Inject
    KyselyDAO dao;

    public KyselyDAO getDao() {
        return dao;
    }

    public void setDao(KyselyDAO dao) {
        this.dao = dao;
    }
/*
    @RequestMapping (value="id", method = RequestMethod.GET)
    public String getCreateForm(Model model){
        Kysely tyhjaKysely = new KyselyImpl();
        tyhjaKysely.setNimi("oletusnimi");
        model.addAttribute("kysely", tyhjaKysely);
        return "secure/add";
    }

    @RequestMapping (value = "id", method = RequestMethod.GET)
    public String create(@ModelAttribute(value="kysely") KyselyImpl kysely){
        dao.lisaaKysely(kysely);
        return "redirect:/kysely/" + kysely.getId();
    }

    @RequestMapping (value = "id", method = RequestMethod.GET)
    public String getView(@PathVariable Integer id, Model model){
        List<Kysely> kysely = dao.haeKysely();
        model.addAttribute("kysely", kysely);
        return "secure/view";
    }
    */

    @RequestMapping ("kyselyt.json")
    public @ResponseBody List<Kysely> haeKyselytJSON () {
        List<Kysely> kyselyt = dao.haeKaikki();
        return kyselyt;

    }
    @RequestMapping("kyselyt")
    public String naytaKyselyt() {
        return "kyselyt/kyselylista";
    }
}

