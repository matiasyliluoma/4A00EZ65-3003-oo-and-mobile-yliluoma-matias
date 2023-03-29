package fi.tuni.myapp

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import kotlin.concurrent.thread

class MyBackgroundService : Service() {
    var mythread : Thread? = null
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        // If service is killed by android, it will try to start it again when
        // possible
        mythread = thread() {
            var i = 1
            try {
                while(true) {
                    println("moro $i")
                    i+=1
                    Thread.sleep(1000)
                    Log.d("moro", Thread.currentThread().name)
                    sendBroadcast(Intent("hellurei-broadcasti"))
                }
            } catch (e: Exception) {

            }

        }
        return START_STICKY
    }

    override fun onDestroy() {
        mythread?.interrupt()
        super.onDestroy()
    }
}