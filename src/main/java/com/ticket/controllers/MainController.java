package com.ticket.controllers;

/**
 * Created by Admin on 27.07.2016.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController extends BaseController{

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String index() {
        return "views/index";
    }

}
