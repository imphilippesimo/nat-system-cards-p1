package com.natsystems.cards.model;

public class Card {
    private String label;
    private Category category;

    public Card(String label, Category category) {
        this.label = label;
        this.category = category;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return label +" de "+ category.getValue();
    }
}
