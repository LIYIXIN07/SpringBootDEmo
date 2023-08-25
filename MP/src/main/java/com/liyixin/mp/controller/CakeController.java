package com.liyixin.mp.controller;

import com.liyixin.mp.pojo.Cake;
import com.liyixin.mp.service.CakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static net.sf.jsqlparser.util.validation.metadata.NamedObject.index;

@RestController
@RequestMapping("/select")
public class CakeController {
    @Autowired
    private CakeService cakeService;
    @RequestMapping("/selectCake")
    public List<Cake> cake(){
        return cakeService.selectCake();
    }
    @RequestMapping("/inde")
    public String page(){
        return "/index";
    }
    @RequestMapping("/model")
    public Model select(Model model){
        Model model1 = model.addAttribute("name", "liyixin");
        return model1;
    }
}
