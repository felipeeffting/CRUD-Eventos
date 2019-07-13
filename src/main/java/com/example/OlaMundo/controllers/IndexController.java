package com.example.OlaMundo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController{

        @RequestMapping("/")
        public String index(){
        	//ja redireciona para pagina contendo a lista dos eventos
            return "redirect:eventos";
        }
}