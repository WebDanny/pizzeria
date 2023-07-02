package com.solid.models;

import com.solid.reository.IPromocion;

public class Promocion2x1 implements IPromocion {

    @Override
    public String aplicarPromocion() {
        return "Se aplico la promocion 2x1";
    }
}
