package com.solid.models;

import com.solid.reository.IPromocion;

public class PromotionContext {
    private IPromocion promotionStrategy;

    public PromotionContext(IPromocion promotionStrategy) {

        this.promotionStrategy = promotionStrategy;
    }

    public String procesar() {

        return promotionStrategy.aplicarPromocion();
    }
}
