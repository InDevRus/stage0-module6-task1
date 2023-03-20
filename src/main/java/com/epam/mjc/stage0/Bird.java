package com.epam.mjc.stage0;

import java.text.MessageFormat;

public class Bird extends Animal {
    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        return MessageFormat.format("{0} Moreover, it has 2 wings and can fly.", super.getDescription());
    }
}
