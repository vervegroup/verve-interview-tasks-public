package com.verve.android.interviewkit;

import android.app.Activity;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Public class for loading and displaying interstitial ads.
 */
public class VerveInterstitialAd {

    private static final String TAG = "VerveInterstitialAd";
    private final Activity mActivity;
    private final VerveInterstitialAdListener mListener;
    private boolean mIsReady = false;
    private boolean mIsDestroyed = false;

    /**
     * Creates a new VerveInterstitialAd instance.
     *
     * @param activity The activity context used to launch the interstitial
     * @param listener Callback listener for ad events
     */
    public VerveInterstitialAd(@NonNull Activity activity, @NonNull VerveInterstitialAdListener listener) {
        this.mActivity = activity;
        this.mListener = listener;
    }

    public void loadAdWithMarkup(@Nullable String htmlMarkup) {
        if (mIsDestroyed) {
            Log.w(TAG, "Cannot load ad - instance has been destroyed");
            return;
        }

        Log.d(TAG, "loadAdWithMarkup() called - TODO: Implement this method");
    }

    public void showAd() {
        if (mIsDestroyed) {
            Log.w(TAG, "Cannot show ad - instance has been destroyed");
            return;
        }

        Log.d(TAG, "showAd() called - TODO: Implement this method");
    }

    /**
     * Returns whether the ad is ready to be shown.
     */
    public boolean isReady() {
        return mIsReady && !mIsDestroyed;
    }

    public void destroy() {
        Log.d(TAG, "destroy() called - TODO: Implement this method");
    }
}

