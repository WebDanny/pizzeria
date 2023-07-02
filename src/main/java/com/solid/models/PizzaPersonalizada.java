package com.solid.models;

import com.solid.reository.IPizza;

public class PizzaPersonalizada implements IPizza {
    @Override
    public String preparar() {
        return "Se preparó una pizza Personalizada!";
    }
}
