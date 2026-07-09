package com.verve.android.interviewkit;

/**
 * Public interface for receiving interstitial ad callbacks.
 */
public interface VerveInterstitialAdListener {

    /**
     * Called when the ad has been successfully loaded and is ready to be shown.
     */
    void onAdLoaded();

    /**
     * Called when the ad fails to load.
     * @param error Description of the error
     */
    void onAdFailedToLoad(String error);

    /**
     * Called when the ad is displayed to the user (impression).
     */
    void onAdImpression();

    /**
     * Called when the user clicks on the ad.
     */
    void onAdClicked();

    /**
     * Called when the ad is closed by the user.
     */
    void onAdClosed();

    /**
     * Called when an error occurs during ad display or interaction.
     * @param error Description of the error
     */
    void onAdError(String error);
}

