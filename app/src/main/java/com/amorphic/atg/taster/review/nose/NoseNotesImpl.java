package com.amorphic.atg.taster.review.nose;

import com.amorphic.atg.taster.review.common.AbstractCharacteristics;
import java.util.Collections;
import java.util.List;

/**
 * Created by adam on 12/06/16.
 */
public class NoseNotesImpl extends AbstractCharacteristics implements NoseNotes {

    private Condition mCondition;

    private NoseIntensity mNoseIntensity;

    private final List<String> mAromasUnmodifiable;

    public NoseNotesImpl() {
        mAromasUnmodifiable = Collections.unmodifiableList(super.getCharacteristics());
    }

    @Override
    public void setCondition(final Condition condition) {
        if (condition == null) throw new IllegalArgumentException("Condition cannot be null");
        mCondition = condition;
    }

    @Override
    public Condition getCondition() {
        return mCondition;
    }

    @Override
    public void setIntensity(final NoseIntensity intensity) {
        if (intensity == null) throw new IllegalArgumentException("Intensity cannot be null");
        mNoseIntensity = intensity;
    }

    @Override
    public NoseIntensity getIntensity() {
        return mNoseIntensity;
    }


    @Override
    public List<String> getCharacteristics() {
        return mAromasUnmodifiable;
    }
}
