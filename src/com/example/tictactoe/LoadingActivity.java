package com.example.tictactoe;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;



public class LoadingActivity extends Activity {
	
	ProgressBar bar;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loading_layout);
		
		bar=(ProgressBar)findViewById(R.id.progr);
		bar.setProgress(0);
        new Thread(new Task()).start();
		
	}
		
	    class Task implements Runnable {
	        @Override
	        public void run() {
	            for (int i = 0; i <= 9; i+=3) {
	                final int value = i;
	                try {
	                    Thread.sleep(1000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                bar.setProgress(value);
	            }
	            Intent in = new Intent(LoadingActivity.this, TicTacMainActivity.class);
				startActivity(in);
	        }
	        
	    }
	    

	}
