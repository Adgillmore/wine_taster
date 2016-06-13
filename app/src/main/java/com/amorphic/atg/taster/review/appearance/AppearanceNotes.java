package com.amorphic.atg.taster.review.appearance;

/**
 * Created by adam on 12/06/16.
 */
public interface AppearanceNotes {

	void  setClarity(Clarity clarity);
	Clarity getClarity();

	void setIntensity(AppearanceIntensity intensity);
	AppearanceIntensity getIntensity();

	void setColour(WineColour colour);
	WineColour getColour();

}
