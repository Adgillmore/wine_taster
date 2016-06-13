package com.amorphic.atg.taster.review.appearance;

/**
 * Created by adam on 13/06/16.
 */
public enum WineColour {
    LEMON,
    GOLD,
    AMBER,
    PINK,
    SALMON,
    ORANGE,
    PURPLE,
    RUBY,
    GARNET,
    TAWNY;

    private static WineColour[] WHITE = new WineColour[] {LEMON, GOLD, AMBER};
    private static WineColour[] ROSE = new WineColour[] {PINK, SALMON, ORANGE};
    private static WineColour[] RED = new WineColour[] {PURPLE, RUBY, GARNET, TAWNY};

    public static WineColour[] getWhiteColours() {
        return WHITE;
    }

    public static WineColour[] getRoseColours() {
        return ROSE;
    }

    public static WineColour[] getRedColours() {
        return RED;
    }
}
