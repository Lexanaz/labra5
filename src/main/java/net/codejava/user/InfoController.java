package net.codejava.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;



@Controller
public class InfoController {

    @Autowired
    private InfoService infoService;

    @RequestMapping("/info")
    public ModelAndView home() {
        List<Info> listInfo = infoService.listAll();
        ModelAndView mav1 = new ModelAndView("vivod");
        mav1.addObject("listInfo", listInfo);
        return mav1;
    }
    @RequestMapping("/welcome1")
    public String wel() {
        return "welcome1";
    }
    @RequestMapping("/welcome")
    public String wel1() {
        return "welcome";
    }


}