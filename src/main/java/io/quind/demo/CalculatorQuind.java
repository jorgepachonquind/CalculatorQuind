package io.quind.demo;

import io.quind.demo.Models.Div;
import io.quind.demo.Models.Multi;
import io.quind.demo.Models.Sub;
import io.quind.demo.Models.Sum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorQuind {

   @GetMapping("/sum/{num1}/{num2}")
    public int sum(@PathVariable int num1, @PathVariable int num2){
       Sum operationSum = new Sum(num1, num2, 0);
       return operationSum.sum(num1, num2);
   }

    @GetMapping("/sub/{num1}/{num2}")
    public int sub(@PathVariable int num1, @PathVariable int num2){
        Sub operationSub = new Sub(num1, num2, 0);
        return operationSub.sub(num1, num2);
    }

    @GetMapping("/div/{num1}/{num2}")
    public double div(@PathVariable double num1, @PathVariable double num2){
        Div operationDiv = new Div(num1, num2, 0);
        return operationDiv.div(num1, num2);
    }

    @GetMapping("/multi/{num1}/{num2}")
    public int multi(@PathVariable int num1, @PathVariable int num2){
        Multi operationMulti = new Multi(num1, num2, 0);
        return operationMulti.multi(num1, num2);
    }
}
