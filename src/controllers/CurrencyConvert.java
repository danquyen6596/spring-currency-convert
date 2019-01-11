package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@Controller
public class CurrencyConvert {
@GetMapping("/")

public String converter(){
    return "index";
}

@GetMapping("/convert")
public String convert(@RequestParam float rate, @RequestParam float usd,Model modle){
    float vnd = (float) (rate * usd);
    modle.addAttribute("rate", rate);
    modle.addAttribute("usd", usd);
    modle.addAttribute("vnd", vnd);
    return "converter";
}
}
