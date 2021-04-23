package net.codejava.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class MorderController {

    @Autowired
    private MorderService morderService;

    @RequestMapping("/morder")
    public ModelAndView home() {
        List<Morder> listMorder = morderService.listAll();
        ModelAndView mav1 = new ModelAndView("vivod1");
        mav1.addObject("listMorder", listMorder);
        return mav1;
    }



}