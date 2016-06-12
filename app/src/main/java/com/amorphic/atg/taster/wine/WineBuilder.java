package com.amorphic.atg.taster.wine;

import com.amorphic.atg.taster.review.WineReview;

import java.util.Map;

/**
 * Created by adam on 12/06/16.
 */
public interface WineBuilder {

    WineBuilder name(String name);

    WineBuilder producer(String producer);

    WineBuilder grape(String grape, float proportion);

    WineBuilder region(String region);

    WineBuilder vintage(int vintage);

    WineBuilder country(String country);

    WineBuilder alcohol(float alcohol);

    WineBuilder price(float price);

    WineBuilder supplier(String supplier);

    WineBuilder review(WineReview review);

    Wine build();

    void reset();

}
