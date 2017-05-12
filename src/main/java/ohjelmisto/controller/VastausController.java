package ohjelmisto.controller;

import ohjelmisto.dao.VastausDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

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
}
