package com.amorphic.atg.taster.review.palate;

import com.amorphic.atg.taster.review.common.Characteristics;

/**
 * Created by adam on 12/06/16.
 */
public interface PalateNotes extends Characteristics {

    void setSweetness(Sweetness sweetness);
    Sweetness getSweetness();

    void setAcidity(Acidity acidity);
    Acidity getAcidity();

    void setTannin(Tannin tannin);
    Tannin getTannin();

    void setBody(Body body);
    Body getBody();

    void setFinish(Finish finish);
    Finish getFinish();

}
