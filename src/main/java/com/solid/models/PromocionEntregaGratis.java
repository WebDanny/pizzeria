package com.solid.models;

import com.solid.reository.IPromocion;

public class PromocionEntregaGratis implements IPromocion {
    @Override
    public String aplicarPromocion() {
        return "Se aplico la promocion Entrega gratis";
    }
}
