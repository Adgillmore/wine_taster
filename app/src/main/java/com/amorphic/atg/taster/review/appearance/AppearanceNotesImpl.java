package com.amorphic.atg.taster.review.appearance;

/**
 * Created by adam on 12/06/16.
 */
public class AppearanceNotesImpl implements AppearanceNotes {

    private Clarity mClarity;

    private AppearanceIntensity mIntensity;

    private WineColour mColour;

    @Override
    public void setClarity(final Clarity clarity) {
        if (clarity == null) throw new IllegalArgumentException("Clarity cannot be null");
        mClarity = clarity;
    }

    @Override
    public Clarity getClarity() {
        return mClarity;
    }

    @Override
    public void setIntensity(final AppearanceIntensity intensity) {
        if (intensity == null) throw new IllegalArgumentException("Intensity cannot be null");
        mIntensity = intensity;
    }

    @Override
    public AppearanceIntensity getIntensity() {
        return mIntensity;
    }

    @Override
    public void setColour(final WineColour colour) {
        if (colour == null) throw new IllegalArgumentException("Colour cnnot be null");
        mColour = colour;
    }

    @Override
    public WineColour getColour() {
        return mColour;
    }
}
