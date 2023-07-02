package com.solid.models;

import com.solid.reository.IPromocion;

public class PromocionNormal implements IPromocion {
    @Override
    public String aplicarPromocion() {
        return "No hay ninguna promocion";
    }
}
