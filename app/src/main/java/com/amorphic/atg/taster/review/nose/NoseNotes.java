package com.amorphic.atg.taster.review.nose;

import com.amorphic.atg.taster.review.common.Characteristics;

import java.util.List;

/**
 * Created by adam on 12/06/16.
 */
public interface NoseNotes extends Characteristics {

    void setCondition(Condition condition);
    Condition getCondition();

    void setIntensity(NoseIntensity intensity);
    NoseIntensity getIntensity();

}
