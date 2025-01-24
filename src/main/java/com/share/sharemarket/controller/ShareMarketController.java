package com.share.sharemarket.controller;

import com.share.sharemarket.model.ShareMarket;
import com.share.sharemarket.service.ShareMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class ShareMarketController {

    @Autowired
    private ShareMarketService shareMarketService;

    @GetMapping("/display")
    public String display(Model model){
        model.addAttribute("shares",shareMarketService.getAllShares());
        System.out.println(model.getAttribute("shares"));
        return "list.jsp";
    }

  /*  @RequestMapping(value="/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){

        boolean isValidUser = service.validateUser(name, password);

        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }

        model.put("name", name);
        model.put("password", password);

        return "welcome";
    }*/
}
