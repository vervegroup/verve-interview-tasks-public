package com.verve.android.interviewkit.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.verve.android.interviewkit.demo.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * Main Activity for the Verve Demo App (Kotlin version).
 */
class MainActivityKotlin : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object {
        private const val TAG = "MainActivityKotlin"

        // Sample HTML creative for testing
        private const val SAMPLE_CREATIVE = """
            <html>
            <head><meta name="viewport" content="width=device-width, initial-scale=1.0"></head>
            <body style="margin:0;padding:0;background:linear-gradient(135deg, #667eea 0%, #764ba2 100%);display:flex;justify-content:center;align-items:center;height:100vh;font-family:Arial,sans-serif;">
            <div style="text-align:center;color:white;padding:20px;">
            <h1 style="font-size:28px;margin-bottom:20px;">🎉 Interstitial Ad</h1>
            <p style="font-size:16px;margin-bottom:30px;">This is a sample HTML creative.</p>
            <a href="https://verve.com" style="background:white;color:#667eea;padding:15px 40px;border-radius:30px;text-decoration:none;font-weight:bold;font-size:16px;">Learn More</a>
            </div>
            </body>
            </html>
        """
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViews()
    }

    /**
     * Sets up view bindings and click listeners.
     */
    private fun setupViews() {
        // Use sample creative button
        binding.btnUseSample.setOnClickListener {
            binding.etCreative.setText(SAMPLE_CREATIVE.trim())
            logCallback("Sample creative loaded into EditText")
        }
    }

    /**
     * Logs a callback message to the UI log view.
     */
    private fun logCallback(message: String) {
        runOnUiThread {
            val timestamp = SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(Date())
            val logMessage = "[$timestamp] $message\n"
            binding.tvCallbackLog.append(logMessage)
        }
    }

    /**
     * Updates the status text.
     */
    private fun updateStatus(status: String) {
        runOnUiThread {
            binding.tvStatus.text = "Status: $status"
        }
    }

    /**
     * Enables or disables the Show Ad button.
     */
    private fun setShowButtonEnabled(enabled: Boolean) {
        runOnUiThread {
            binding.btnShowAd.isEnabled = enabled
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}

