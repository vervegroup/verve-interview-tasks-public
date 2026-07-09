package com.verve.android.interviewkit.activity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import android.view.Window;
import android.view.WindowManager;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class InterstitialActivity extends AppCompatActivity {
    private static final String TAG = "InterstitialActivity";
    private FrameLayout mContainer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Make fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        setupViews();

        // Load the ad
        loadAd();
    }

    private void setupViews() {
        // Create main container
        mContainer = new FrameLayout(this);
        mContainer.setBackgroundColor(Color.BLACK);
        mContainer.setLayoutParams(new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
        ));

        WebView webView = createWebView();

        FrameLayout.LayoutParams webViewParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
        );
        mContainer.addView(webView, 0, webViewParams);

        Log.d(TAG, "setupViews() - TODO: Create close button and set content view");

        // Set content view
        setContentView(mContainer);
    }

    /**
     * Loads the HTML ad using InterstitialAdLoader.
     */
    private void loadAd() {
        Log.d(TAG, "loadAd() - TODO: Create loader, load HTML, and add WebView to container");
    }

    /**
     * Closes the ad and finishes the activity
     */
    private void closeAd() {

        Log.d(TAG, "closeAd() - TODO: Send close callback and finish activity");
    }

    private WebView createWebView(){
        WebView webView = new WebView(this);

        // Configure WebSettings
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                Log.d(TAG, "Page finished: " + url);

            }

            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);

            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                String url = request.getUrl().toString();
                return true;
            }
        });

        return webView;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        closeAd();
    }
}

