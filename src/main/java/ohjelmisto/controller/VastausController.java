package ohjelmisto.controller;

import ohjelmisto.bean.Vastaus;
import ohjelmisto.dao.VastausDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by bferr on 12/05/2017.
 */
@Controller
@RequestMapping
public class VastausController {

    @Inject
    VastausDAO dao;

    public VastausDAO getDao(){return dao;}

    public void setDao(VastausDAO dao){this.dao = dao;}

    @RequestMapping(value ="lisaavastaus.json", method = RequestMethod.POST)
    public Vastaus lisaaVastaus(@RequestBody Vastaus vastaus){
        return vastaus;
    }

    @RequestMapping ("vastaukset.json")
    public @ResponseBody List<Vastaus> haeVastauksetJSON (){
        List<Vastaus> vastaukset = dao.haeKaikki();
        return vastaukset;
    }




}

