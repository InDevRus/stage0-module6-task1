package com.epam.mjc.stage0;

import java.text.MessageFormat;

public class Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        return MessageFormat.format("This animal is mostly {0}. It has {1} {3} and {2} fur.",
                color,
                Integer.toString(numberOfPaws),
                hasFur ? "a" : "no",
                numberOfPaws > 1 ? "paws" : "paw"
        );
    }
}
