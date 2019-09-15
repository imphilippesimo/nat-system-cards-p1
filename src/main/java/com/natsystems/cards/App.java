package com.natsystems.cards;

import com.natsystems.cards.model.Card;
import com.natsystems.cards.model.Category;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        constructCards();
    }

    static void constructCards() {
        String label;
        for (Category cat : Category.values()) {
            for (int i = 2; i <= 13; i++) {
                if (i == 11) {
                    label = "Valet";
                } else if (i == 12) {
                    label = "Reine";
                } else if (i == 13) {
                    label = "Roi";
                } else {
                    label = String.valueOf(i);
                }
                logger.info(new Card(label, cat));
            }
            logger.info(new Card("As", cat));
        }
    }
}
