package ohjelmisto.controller;

import ohjelmisto.dao.OtsikkoDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;


/**
 * Created by Iiro on 12.5.2017.
 */
@Controller
@RequestMapping(value="/secure")
public class OtsikkoController {

    @Inject
    OtsikkoDAO dao;

    public OtsikkoDAO getDao() {
        return dao;
    }

    public void setDao(OtsikkoDAO dao) {
        this.dao = dao;
    }


}
