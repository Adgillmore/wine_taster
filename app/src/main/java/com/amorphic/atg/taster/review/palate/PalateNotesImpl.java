package com.amorphic.atg.taster.review.palate;

import com.amorphic.atg.taster.review.common.AbstractCharacteristics;

import java.util.Collections;
import java.util.List;

/**
 * Created by adam on 12/06/16.
 */
public class PalateNotesImpl extends AbstractCharacteristics implements PalateNotes {

    private Sweetness mSweetness;

    private Acidity mAcidity;

    private Tannin mTannin;

    private Body mBody;

    private Finish mFinish;

    private final List<String> mAromasUnmodifiable;

    public PalateNotesImpl() {
        mAromasUnmodifiable = Collections.unmodifiableList(super.getCharacteristics());
    }

    @Override
    public void setSweetness(final Sweetness sweetness) {
        if (sweetness == null) throw new IllegalArgumentException("Sweetness cannot be null");
        mSweetness = sweetness;
    }

    @Override
    public Sweetness getSweetness() {
        return mSweetness;
    }

    @Override
    public void setAcidity(final Acidity acidity) {
        if (acidity == null) throw new IllegalArgumentException("Acidity cannot be null");
        mAcidity = acidity;
    }

    @Override
    public Acidity getAcidity() {
        return mAcidity;
    }

    @Override
    public void setTannin(final Tannin tannin) {
        if (tannin == null) throw new IllegalArgumentException("Tannin cannot be null");
        mTannin = tannin;
    }

    @Override
    public Tannin getTannin() {
        return mTannin;
    }

    @Override
    public void setBody(final Body body) {
        if (body == null) throw new IllegalArgumentException("Body cannot be null");
        mBody = body;
    }

    @Override
    public Body getBody() {
        return mBody;
    }

    @Override
    public void setFinish(final Finish finish) {
        if (finish == null) throw new IllegalArgumentException("Finish cannot be null");
        mFinish = finish;
    }

    @Override
    public Finish getFinish() {
        return mFinish;
    }

    @Override
    public List<String> getCharacteristics() {
        return mAromasUnmodifiable;
    }
}
