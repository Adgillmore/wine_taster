package com.amorphic.atg.taster.utils;

/**
 * Created by adam on 12/06/16.
 */
public final class InputUtils {

    public static void checkString(final String string) throws IllegalArgumentException {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }
    }

    public static void checkYear(final int year) {
        if (year <= 0) throw new IllegalArgumentException("Year cannot be negative");
        if (year < 1800) throw new IllegalArgumentException("Year out of range");
    }



    private InputUtils() {
        // no op.
    }
}
