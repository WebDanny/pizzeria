package com.solid.controller;

import com.solid.reository.IPizza;
import com.solid.reository.IPromocion;
import com.solid.services.PizzaOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PizzaOrderController {

    private final PizzaOrderService pizzaService;

    public PizzaOrderController(PizzaOrderService pizzaService) {
        this.pizzaService = pizzaService;
    }
    @GetMapping("/order/{codeOrder}/{day}")
    public ResponseEntity<String> login(@PathVariable String codeOrder,@PathVariable String day) {

        try {
            return new ResponseEntity<>(pizzaService.getPedirPizza(codeOrder,day).toString(), HttpStatus.OK);
        }catch (Exception ex)
        {
            return new ResponseEntity<>("Error ", HttpStatus.BAD_REQUEST);
        }

    }

}
