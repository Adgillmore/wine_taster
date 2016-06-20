package com.amorphic.atg.taster.review;

import com.amorphic.atg.taster.review.appearance.AppearanceNotes;
import com.amorphic.atg.taster.review.appearance.AppearanceNotesImpl;
import com.amorphic.atg.taster.review.nose.NoseNotes;
import com.amorphic.atg.taster.review.nose.NoseNotesImpl;
import com.amorphic.atg.taster.review.general.GeneralComments;
import com.amorphic.atg.taster.review.general.GeneralCommentsImpl;
import com.amorphic.atg.taster.review.palate.PalateNotes;
import com.amorphic.atg.taster.review.palate.PalateNotesImpl;

/**
 * Created by adam on 12/06/16.
 */
public class WineReviewImpl implements WineReview {

    private final AppearanceNotes mAppearanceNotes;
    private final NoseNotes mNoseNotes;
    private final PalateNotes mPalateNotes;
    private final GeneralComments mOtherComments;
    private float mRating;

    public WineReviewImpl() {
        mAppearanceNotes = new AppearanceNotesImpl();
        mNoseNotes = new NoseNotesImpl();
        mPalateNotes = new PalateNotesImpl();
        mOtherComments = new GeneralCommentsImpl();
    }

    @Override
    public AppearanceNotes getAppearanceNotes() {
        return mAppearanceNotes;
    }

    @Override
    public NoseNotes getNoseNotes() {
        return mNoseNotes;
    }

    @Override
    public PalateNotes getPalateNotes() {
        return mPalateNotes;
    }

    @Override
    public GeneralComments getOtherComments() {
        return mOtherComments;
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
