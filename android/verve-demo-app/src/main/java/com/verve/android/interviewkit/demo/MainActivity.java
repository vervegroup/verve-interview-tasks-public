package com.verve.android.interviewkit.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.verve.android.interviewkit.demo.databinding.ActivityMainBinding;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Main Activity for the Verve Demo App.
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ActivityMainBinding binding;

    // Sample HTML creative for testing
    private static final String SAMPLE_CREATIVE =
        "<html>" +
        "<head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"></head>" +
        "<body style=\"margin:0;padding:0;background:linear-gradient(135deg, #667eea 0%, #764ba2 100%);" +
        "display:flex;justify-content:center;align-items:center;height:100vh;font-family:Arial,sans-serif;\">" +
        "<div style=\"text-align:center;color:white;padding:20px;\">" +
        "<h1 style=\"font-size:28px;margin-bottom:20px;\">🎉 Interstitial Ad</h1>" +
        "<p style=\"font-size:16px;margin-bottom:30px;\">This is a sample HTML creative.</p>" +
        "<a href=\"https://verve.com\" style=\"background:white;color:#667eea;padding:15px 40px;" +
        "border-radius:30px;text-decoration:none;font-weight:bold;font-size:16px;\">Learn More</a>" +
        "</div>" +
        "</body>" +
        "</html>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupViews();
    }

    /**
     * Sets up view bindings and click listeners.
     */
    private void setupViews() {

        // Use sample creative button
        binding.btnUseSample.setOnClickListener(v -> {
            binding.etCreative.setText(SAMPLE_CREATIVE);
            logCallback("Sample creative loaded into EditText");
        });


    }

    /**
     * Logs a callback message to the UI log view.
     */
    private void logCallback(String message) {
        runOnUiThread(() -> {
            String timestamp = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
            String logMessage = "[" + timestamp + "] " + message + "\n";
            binding.tvCallbackLog.append(logMessage);

        });
    }

    /**
     * Updates the status text.
     */
    private void updateStatus(String status) {
        runOnUiThread(() -> binding.tvStatus.setText("Status: " + status));
    }

    /**
     * Enables or disables the Show Ad button.
     */
    private void setShowButtonEnabled(boolean enabled) {
        runOnUiThread(() -> binding.btnShowAd.setEnabled(enabled));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

