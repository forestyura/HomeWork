package com.forest.controller;

import com.forest.model.FinanceData;
import com.forest.model.FinanceFormul;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(FinanceData financeData) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject(financeData);
        return modelAndView;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView indexPost(FinanceData financeData){
        FinanceFormul financeFormul = new FinanceFormul(financeData);
        return new ModelAndView("index").addObject(financeData).addObject(financeFormul);
    }
}
