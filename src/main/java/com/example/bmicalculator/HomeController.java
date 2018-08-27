package com.example.bmicalculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;


@Controller
public class HomeController {

    private BmiCalculator bmiCalculator = new BmiCalculator();

    @GetMapping("/")
    public  String home(){
        return "home";
    }

    @GetMapping("/result")
    public String result(
            @RequestParam String first_number,
            @RequestParam String second_number,
            @RequestParam String options,
            ModelMap map) {


        if (options.equals("woman")) {

            int result = bmiCalculator.woman(parseInt(first_number),parseInt(second_number));
            map.put("result", result);
        }
        if (options.equals("man")) {
            int result = bmiCalculator.man(parseInt(first_number),parseInt(second_number));

            map.put("result", result);
        }
        return "result";
    }


}
