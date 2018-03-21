package com.codility.servicebackground

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings

/**
 * Created by Govind on 3/21/2018.
 */
class MyService : Service() {

    private var player: MediaPlayer? = null

    override fun onBind(intent: Intent?): IBinder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        //getting systems default ringtone
        player = MediaPlayer.create(applicationContext, Settings.System.DEFAULT_RINGTONE_URI)
        //setting loop play to true, this will make the ringtone continuously playing
        player!!.isLooping = true
        //staring the player
        player!!.start()
        //Some options for service, start sticky means service will be explicitly started and stopped
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        player!!.stop()
    }
}