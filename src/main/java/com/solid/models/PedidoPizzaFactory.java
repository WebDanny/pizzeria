package com.solid.models;

import com.solid.reository.IPizza;
import com.solid.reository.IPromocion;
import com.solid.reository.PizzeriaFactory;

public class PedidoPizzaFactory extends PizzeriaFactory {

    @Override
    public IPizza crearPedidoPizza(String code) {
        IPizza pizza;
        switch( code )
        {
            case "COD1":
                pizza = new PizzaMargarita();
                break;
            case "COD2":
                pizza = new PizzaPepperoni();
                break;
            case "COD3":
                pizza = new PizzaPersonalizada();
                break;
            default:
                pizza = null;
        }
        return pizza;
    }

}
