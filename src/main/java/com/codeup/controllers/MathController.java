package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

  @GetMapping("/multiply/{number}/times/{number2}/times/{number3}")
  @ResponseBody
  public String multiplyThreeNumbers(@PathVariable int number, @PathVariable int number2, @PathVariable int number3) {
    return ">> The Multipication Equation is: "+ number + " x " + number2 + " x " + number3 + " = " +(number * number2 * number3) + " !";
  }
  @GetMapping ("/add/{number1}/plus/{number2}")
  @ResponseBody
  public double addTwo(@PathVariable double number1, @PathVariable double number2){
    return (number1 + number2);
  }

}
