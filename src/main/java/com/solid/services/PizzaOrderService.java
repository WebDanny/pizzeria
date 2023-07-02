package com.solid.services;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.solid.models.*;
import com.solid.reository.IPizza;
import com.solid.reository.IPromocion;
import com.solid.reository.PizzeriaFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Service
public class PizzaOrderService {

    private PizzeriaFactory creator;

    public IPromocion getPromocionDay(String day){
        IPromocion promotion;
        switch( day )
        {
            case "MARTES", "MIERCOLES":
                promotion = new Promocion2x1();
                break;
            case "JUEVES":
                promotion = new PromocionEntregaGratis();
                break;
            default:
                promotion = new PromocionNormal();
                break;
        }
        return promotion;
    }

    public JSONObject getPedirPizza(String code,String day) throws JSONException {

        PizzeriaFactory creator = new PedidoPizzaFactory();
        IPizza pizza = creator.crearPedidoPizza( code );

        PromotionContext context;
        context = new PromotionContext(getPromocionDay( day ));

        JSONObject json = new JSONObject();
        json.put("pizza",pizza.preparar());
        json.put("promocion",context.procesar());

        return json;

    }
}
