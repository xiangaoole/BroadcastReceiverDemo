package com.gaoxiang.broadcastreceiverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class StaticReceiver : BroadcastReceiver() {
    companion object {
        const val TAG = "gx_broadcast_StaticReceiver"
    }

    override fun onReceive(context: Context, intent: Intent) {
        Log.d(TAG, "onReceive: ")
    }
}
