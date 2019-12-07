package com.gaoxiang.broadcastreceiverdemo

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "gx_broadcast_MainActivity"
    }

    private val registeredReceiver = RegisteredReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sender must have permission
        registerReceiver(registeredReceiver, IntentFilter(Constants.BROADCAST_ACTION),
            Constants.SENDER_PERMISSION, null)
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }
}
