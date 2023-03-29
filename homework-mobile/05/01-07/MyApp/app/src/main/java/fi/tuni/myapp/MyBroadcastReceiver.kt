package fi.tuni.myapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Time Changed", Toast.LENGTH_SHORT).show()
        Log.d("MyBroadCastReceiver", "Time Changed")
    }
}