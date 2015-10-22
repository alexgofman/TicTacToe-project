package com.example.tictactoe;

import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BeaverWinner extends Activity {
		SharedPref winnerScore;
		Button startAgain;
		TextView winnerField;
		String pppoints;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.beaverwinner_layout);
			
		//	NewGameActivity.stopTaskMain();
			
			//Intent ob=getIntent();
			//playerOneT=ob.getStringExtra("Player1");
			//playerTwoT=ob.getStringExtra("Player2");
			

			winnerField=(TextView)findViewById(R.id.textView1);		
			startAgain=(Button)findViewById(R.id.button1);
			
			winnerScore=new SharedPref(getApplicationContext());
			
			HashMap<String, String> saveScore=winnerScore.getScore();
					
			pppoints=saveScore.get("Score");
			
			winnerField.setText(pppoints);


			
			startAgain.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					TicTacMainActivity.mp.stop();
					Intent in=new Intent(BeaverWinner.this,TicTacMainActivity.class);
					startActivity(in);
				}
			});
			
			
			
			
			

		}

	}
