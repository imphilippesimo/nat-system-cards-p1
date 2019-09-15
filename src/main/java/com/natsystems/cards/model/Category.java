package com.natsystems.cards.model;

public enum Category {
    TREFLE("trèfle"), CARREAU("carreau"), COEUR("coeur"), PIQUE("pique");
    private final String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
