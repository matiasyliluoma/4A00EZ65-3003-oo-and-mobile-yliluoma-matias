package fi.tuni.myapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.Intent.ACTION_TIME_TICK
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    val receiver = MyBroadcastReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.nappi)
        val button2 : Button = findViewById(R.id.nappi2)
        var uiText : TextView = findViewById(R.id.uiupd)


        button2.setOnClickListener() {
            stopService(Intent(this, MyBackgroundService::class.java))
            Log.d("exercise stop", "service stopped")
        }

        button.setOnClickListener() {
            startService(Intent(this, MyBackgroundService::class.java))
            Log.d("exercise start", "service started")

            /*
                thread() {
                for(i in 1..10) {
                    Thread.sleep(1000)
                    runOnUiThread() {
                        uiText.text = "$i"
                        Log.d("exercise", Thread.currentThread().name)
                    }
                }
            }
             */


            Log.d("exercise", "button clicked")
            for(j in 1..10) {
                println(j)
                Log.d("exercise2", Thread.currentThread().name)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        registerReceiver(MyBroadcastReceiver(), IntentFilter("hellurei-broadcasti"))
        registerReceiver(receiver, IntentFilter(ACTION_TIME_TICK))
    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(MyBroadcastReceiver())
        unregisterReceiver(receiver)
    }
}