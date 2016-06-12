package com.amorphic.atg.taster.wine;

import com.amorphic.atg.taster.review.WineReview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by adam on 12/06/16.
 */
public class WineImpl implements Wine {

    private String mName;
    private String mProducer;
    private Map<String, Float> mGrapes;
    private String mRegion;
    private int mVintage;
    private String mCountry;
    private float mAlcohol;
    private float mPrice;
    private String mSupplier;
    private List<WineReview> reviews;

    public WineImpl() {
        mGrapes = new HashMap<>();
        reviews = new ArrayList<>();
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public void setName(final String name) {
        mName = name;
    }

    @Override
    public String getProducer() {
        return mProducer;
    }

    @Override
    public void setProducer(final String producer) {
        mProducer = producer;
    }

    @Override
    public Map<String, Float> getGrapes() {
        return mGrapes;
    }

    @Override
    public void addGrape(final String grape, final float proportion) {
        mGrapes.put(grape, proportion);
    }

    @Override
    public void removeGrape(final String grape) {
        mGrapes.remove(grape);
    }

    @Override
    public String getRegion() {
        return mRegion;
    }

    @Override
    public void setRegion(final String region) {
        mRegion = region;
    }

    @Override
    public int getVintage() {
        return mVintage;
    }

    @Override
    public void setVintage(final int vintage) {
        mVintage = vintage;
    }

    @Override
    public String getCountry() {
        return mCountry;
    }

    @Override
    public void setCountry(final String country) {
        mCountry = country;
    }

    @Override
    public float getAlcohol() {
        return mAlcohol;
    }

    @Override
    public void setAlcohol(final float alcohol) {
        mAlcohol = alcohol;
    }

    @Override
    public float getPrice() {
        return mPrice;
    }

    @Override
    public void setPrice(final float price) {
        mPrice = price;
    }

    @Override
    public String getSupplier() {
        return mSupplier;
    }

    @Override
    public void setSupplier(final String supplier) {
        mSupplier = supplier;
    }

    @Override
    public List<WineReview> getReviews() {
        return reviews;
    }

    @Override
    public void addReview(final WineReview review) {
        if (!reviews.contains(review)) reviews.add(review);
    }

    @Override
    public void removeReview(final WineReview review) {
        reviews.remove(review);
    }

    @Override
    public float getAverageRating() {
        float totalRating = 0;
        for (final WineReview r : reviews) {
            totalRating += r.getRating();
        }
        return totalRating > 0 ? totalRating / (float) reviews.size() : 0;
    }

    @Override
    public void clear() {
        mName = null;
        mProducer = null;
        mGrapes.clear();
        reviews.clear();
        mRegion = null;
        mVintage = 0;
        mCountry = null;
        mAlcohol = 0;
        mPrice = 0;
        mSupplier = null;
    }
}
