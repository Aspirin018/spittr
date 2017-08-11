package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by liyu on 2017/7/26.
 */
@Controller
//@RequestMapping("/")
@RequestMapping({"/","/homepage"})
public class HomeController {
//    @RequestMapping(value="/", method = GET)
    @RequestMapping(method=GET)
    public String home(){
        return "home";
    }
}
