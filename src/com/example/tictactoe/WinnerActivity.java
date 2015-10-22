package com.example.tictactoe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class WinnerActivity extends Activity {
	
	Button startAgain, vibrate, silent, normal;
	TextView winnerField;
	String playerOneT;
	String playerTwoT;
	RatingBar bar;
	Button videoButton;
	SeekBar sb;
	AudioManager sound;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.winner_activity);
		
		Intent ob=getIntent();
		playerOneT=ob.getStringExtra("Player1");
		playerTwoT=ob.getStringExtra("Player2");
		
		 sound = (AudioManager)getSystemService(Context.AUDIO_SERVICE); // getting audio services context

		winnerField=(TextView)findViewById(R.id.textView1);		
		startAgain=(Button)findViewById(R.id.button1);
		bar=(RatingBar)findViewById(R.id.ratingBar1);
		videoButton=(Button)findViewById(R.id.button2);
		sb=(SeekBar)findViewById(R.id.seekBar1);
		vibrate=(Button)findViewById(R.id.button3);
		silent=(Button)findViewById(R.id.button5);
		normal=(Button)findViewById(R.id.button4);
		
		
		silent.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				sound.setRingerMode(AudioManager.RINGER_MODE_SILENT);
			}
		});
		
		
		normal.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				sound.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
			}
		});
		
		
		vibrate.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				sound.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
			}
		});
		
		
		 sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), String.valueOf(progress), Toast.LENGTH_SHORT).show();
				//sound.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_SHOW_UI);
				sound.setStreamVolume(AudioManager.STREAM_MUSIC,
                        progress, 0);
			
			
			}
		});
		
		bar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(),"Hey, Thanks for your rate!", Toast.LENGTH_LONG).show();
			}
		});
		
		winnerField.setText(playerOneT);

		
		startAgain.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				TicTacMainActivity.mp.stop();
				Intent in=new Intent(WinnerActivity.this,TicTacMainActivity.class);
				startActivity(in);
			}
		});
		
		
		
		videoButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				TicTacMainActivity.mp.stop();
				Intent in=new Intent(WinnerActivity.this,VideoActivity.class);
				startActivity(in);
			}
		});
		
		

	}

}