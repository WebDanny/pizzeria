package com.solid.models;

import com.solid.reository.IPizza;

public class PizzaMargarita implements IPizza {
    @Override
    public String preparar() {
        return "Se preparó una pizza Margarita!";
    }
}
