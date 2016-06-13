package com.amorphic.atg.taster.review;

import com.amorphic.atg.taster.review.appearance.AppearanceNotes;
import com.amorphic.atg.taster.review.nose.NoseNotes;
import com.amorphic.atg.taster.review.general.GeneralComments;
import com.amorphic.atg.taster.review.palate.PalateNotes;

/**
 * Created by adam on 12/06/16.
 */
public interface WineReview {

    AppearanceNotes getAppearanceNotes();

    NoseNotes getNoseNotes();

    PalateNotes getPalateNotes();

    GeneralComments getOtherComments();

    void setRating(float rating);
    float getRating();

}
