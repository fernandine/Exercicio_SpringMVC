package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Model.DAO.CarroDAO;


@Controller
@RequestMapping("carros")
public class CarroController {

    @Autowired
    private CarroDAO dao;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public ModelAndView listarCarros(ModelMap model) {
        model.addAllAttributes( dao.getCarros());
        return new ModelAndView( "/carro/list", model);
    }

}