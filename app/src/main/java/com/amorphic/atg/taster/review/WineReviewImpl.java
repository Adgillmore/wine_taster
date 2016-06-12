package com.amorphic.atg.taster.review;

import com.amorphic.atg.taster.review.notes.AppearanceNotes;
import com.amorphic.atg.taster.review.notes.AppearanceNotesImpl;
import com.amorphic.atg.taster.review.notes.NoseNotes;
import com.amorphic.atg.taster.review.notes.NoseNotesImpl;
import com.amorphic.atg.taster.review.notes.OtherComments;
import com.amorphic.atg.taster.review.notes.OtherCommentsImpl;
import com.amorphic.atg.taster.review.notes.PalateNotes;
import com.amorphic.atg.taster.review.notes.PalateNotesImpl;

/**
 * Created by adam on 12/06/16.
 */
public class WineReviewImpl implements WineReview {

    private final AppearanceNotes mAppearanceNotes;
    private final NoseNotes mNoseNotes;
    private final PalateNotes mPalateNotes;
    private final OtherComments mOtherComments;
    private float mRating;

    public WineReviewImpl() {
        mAppearanceNotes = new AppearanceNotesImpl();
        mNoseNotes = new NoseNotesImpl();
        mPalateNotes = new PalateNotesImpl();
        mOtherComments = new OtherCommentsImpl();
    }

    @Override
    public AppearanceNotes getAppearanceNotes() {
        return null;
    }

    @Override
    public NoseNotes getNoseNotes() {
        return null;
    }

    @Override
    public PalateNotes getPalateNotes() {
        return null;
    }

    @Override
    public OtherComments getOtherComments() {
        return null;
    }

    @Override
    public void setRating(final float rating) {
        mRating = rating;
    }

    @Override
    public float getRating() {
        return mRating;
    }
}
