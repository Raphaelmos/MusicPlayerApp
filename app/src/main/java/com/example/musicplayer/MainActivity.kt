package com.example.musicplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)



		val mediaplayer : MediaPlayer! = MediaPlayer.create( context: this,R.raw.music 

		play_btn.setOnClickListener { it:View!

			if(!mediaplayer.isPlaying){
			    mediaplayer.start()
			    play_btn.setImageResource(R.drawable.ic_pause_black_24dp)
			}else{
			mediaplayer.pause()
			play_btn.setImageResource(R.drawable.ic_pause_black_24dp)
			}
		}
	}
}
*/

/*
