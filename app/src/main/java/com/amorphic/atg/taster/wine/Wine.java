package com.amorphic.atg.taster.wine;

import com.amorphic.atg.taster.review.WineReview;

import java.util.List;
import java.util.Map;

/**
 * Created by adam on 12/06/16.
 */
public interface Wine {


    String getName();
    void setName(String name);

    String getProducer();
    void setProducer(String producer);

    Map<String, Float> getGrapes();
    void addGrape(String grape, float proportion);
    void removeGrape(String grape);

    String getRegion();
    void setRegion(String region);

    int getVintage();
    void setVintage(int vintage);

    String getCountry();
    void setCountry(String country);

    float getAlcohol();
    void setAlcohol(float alcohol);

    float getPrice();
    void setPrice(float price);

    String getSupplier();
    void setSupplier(String supplier);

    List<WineReview> getReviews();
    void addReview(WineReview review);
    void removeReview(WineReview review);

    void clear();
}
