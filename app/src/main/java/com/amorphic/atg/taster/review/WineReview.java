package com.amorphic.atg.taster.review;

import com.amorphic.atg.taster.review.notes.AppearanceNotes;
import com.amorphic.atg.taster.review.notes.NoseNotes;
import com.amorphic.atg.taster.review.notes.OtherComments;
import com.amorphic.atg.taster.review.notes.PalateNotes;

/**
 * Created by adam on 12/06/16.
 */
public interface WineReview {

    AppearanceNotes getAppearanceNotes();

    NoseNotes getNoseNotes();

    PalateNotes getPalateNotes();

    OtherComments getOtherComments();

    void setRating(float rating);
    float getRating();

}
