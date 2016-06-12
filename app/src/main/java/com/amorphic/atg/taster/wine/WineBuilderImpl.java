package com.amorphic.atg.taster.wine;

import com.amorphic.atg.taster.review.WineReview;

/**
 * Created by adam on 12/06/16.
 */
public class WineBuilderImpl implements WineBuilder {

    private Wine wine;

    public WineBuilderImpl() {
        wine = new WineImpl();
    }

    @Override
    public WineBuilder name(final String name) {
        wine.setName(name);
        return this;
    }

    @Override
    public WineBuilder producer(final String producer) {
        wine.setProducer(producer);
        return this;
    }

    @Override
    public WineBuilder grape(final String grape, final float proportion) {
        wine.addGrape(grape, proportion);
        return this;
    }

    @Override
    public WineBuilder region(final String region) {
        wine.setRegion(region);
        return this;
    }

    @Override
    public WineBuilder vintage(final int vintage) {
        wine.setVintage(vintage);
        return this;
    }

    @Override
    public WineBuilder country(final String country) {
        wine.setCountry(country);
        return this;
    }

    @Override
    public WineBuilder alcohol(final float alcohol) {
        wine.setAlcohol(alcohol);
        return this;
    }

    @Override
    public WineBuilder price(final float price) {
        wine.setPrice(price);
        return this;
    }

    @Override
    public WineBuilder supplier(final String supplier) {
        wine.setSupplier(supplier);
        return this;
    }

    @Override
    public WineBuilder review(final WineReview review) {
        wine.addReview(review);
        return this;
    }

    @Override
    public Wine build() {
        final Wine currentWine = wine;
        wine = new WineImpl();
        return currentWine;
    }

    @Override
    public void reset() {
        wine.clear();
    }
}
