package com.example.tictactoe;


import java.util.HashMap;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class NewGameActivity extends Activity {

	SharedPref playerScore;
	ImageView one,two,three,four,five,six,seven,eight,nine;
	TextView points;
	int Score;
	Boolean tickedOne=false, tickedTwo=false, tickedThree=false, tickedFour=false, tickedFive=false, tickedSix=false, tickedSeven=false, tickedEight=false, tickedNine=false;
	int previousrandom=-1;

	public int randomNum() {
		Random rand = new Random();
		int pickedNumber = rand.nextInt(9);
		return pickedNumber;
	}

	Timer t = new Timer();	
	TimerTask mTimerTask;
	Handler mHandler = new Handler();

	public void doTimerTask(){

		mTimerTask = new TimerTask() {
			public void run() {
				mHandler.post(new Runnable() {
					public void run() {
						randomNum();
						int randomChoice = randomNum();
						while(randomChoice==previousrandom)
						{
							randomChoice = randomNum();
						}
						previousrandom=randomChoice;

						if (randomChoice == 1)
						{
							one.setImageResource(R.drawable.beaversmall);
							tickedOne=true;
							nine.setImageDrawable(null);
							two.setImageDrawable(null);
							three.setImageDrawable(null);
							four.setImageDrawable(null);
							five.setImageDrawable(null);
							six.setImageDrawable(null);
							seven.setImageDrawable(null);
							eight.setImageDrawable(null);
							tickedTwo=false;
							tickedThree=false;
							tickedFour=false;
							tickedFive=false;
							tickedSix=false;
							tickedSeven=false;
							tickedEight=false;
							tickedNine=false;
						}
						else if (randomChoice == 2)
						{
							two.setImageResource(R.drawable.beaversmall);
							tickedTwo=true;
							one.setImageDrawable(null);
							nine.setImageDrawable(null);
							three.setImageDrawable(null);
							four.setImageDrawable(null);
							five.setImageDrawable(null);
							six.setImageDrawable(null);
							seven.setImageDrawable(null);
							eight.setImageDrawable(null);
							tickedOne=false;
							tickedThree=false;
							tickedFour=false;
							tickedFive=false;
							tickedSix=false;
							tickedSeven=false;
							tickedEight=false;
							tickedNine=false;
						}
						else if (randomChoice == 3)
						{
							three.setImageResource(R.drawable.beaversmall);
							tickedThree=true;
							one.setImageDrawable(null);
							two.setImageDrawable(null);
							nine.setImageDrawable(null);
							four.setImageDrawable(null);
							five.setImageDrawable(null);
							six.setImageDrawable(null);
							seven.setImageDrawable(null);
							eight.setImageDrawable(null);
							tickedTwo=false;
							tickedOne=false;
							tickedFour=false;
							tickedFive=false;
							tickedSix=false;
							tickedSeven=false;
							tickedEight=false;
							tickedNine=false;
						}
						else if (randomChoice == 4)
						{
							four.setImageResource(R.drawable.beaversmall);
							tickedFour=true;
							one.setImageDrawable(null);
							two.setImageDrawable(null);
							three.setImageDrawable(null);
							nine.setImageDrawable(null);
							five.setImageDrawable(null);
							six.setImageDrawable(null);
							seven.setImageDrawable(null);
							eight.setImageDrawable(null);
							tickedTwo=false;
							tickedThree=false;
							tickedOne=false;
							tickedFive=false;
							tickedSix=false;
							tickedSeven=false;
							tickedEight=false;
							tickedNine=false;
						}
						else if (randomChoice == 5)
						{
							five.setImageResource(R.drawable.beaversmall);
							tickedFive=true;
							one.setImageDrawable(null);
							two.setImageDrawable(null);
							three.setImageDrawable(null);
							four.setImageDrawable(null);
							nine.setImageDrawable(null);
							six.setImageDrawable(null);
							seven.setImageDrawable(null);
							eight.setImageDrawable(null);
							tickedTwo=false;
							tickedThree=false;
							tickedFour=false;
							tickedOne=false;
							tickedSix=false;
							tickedSeven=false;
							tickedEight=false;
							tickedNine=false;
						}
						else if (randomChoice == 6)
						{
							six.setImageResource(R.drawable.beaversmall);
							tickedSix=true;
							one.setImageDrawable(null);
							two.setImageDrawable(null);
							three.setImageDrawable(null);
							four.setImageDrawable(null);
							five.setImageDrawable(null);
							nine.setImageDrawable(null);
							seven.setImageDrawable(null);
							eight.setImageDrawable(null);
							tickedTwo=false;
							tickedThree=false;
							tickedFour=false;
							tickedFive=false;
							tickedOne=false;
							tickedSeven=false;
							tickedEight=false;
							tickedNine=false;
						}
						else if (randomChoice == 7)
						{
							seven.setImageResource(R.drawable.beaversmall);
							tickedSeven=true;
							one.setImageDrawable(null);
							two.setImageDrawable(null);
							three.setImageDrawable(null);
							four.setImageDrawable(null);
							five.setImageDrawable(null);
							six.setImageDrawable(null);
							nine.setImageDrawable(null);
							eight.setImageDrawable(null);
							tickedTwo=false;
							tickedThree=false;
							tickedFour=false;
							tickedFive=false;
							tickedSix=false;
							tickedOne=false;
							tickedEight=false;
							tickedNine=false;
						}
						else if (randomChoice == 8)
						{
							eight.setImageResource(R.drawable.beaversmall);
							tickedEight=true;
							one.setImageDrawable(null);
							two.setImageDrawable(null);
							three.setImageDrawable(null);
							four.setImageDrawable(null);
							five.setImageDrawable(null);
							six.setImageDrawable(null);
							seven.setImageDrawable(null);
							nine.setImageDrawable(null);
							tickedTwo=false;
							tickedThree=false;
							tickedFour=false;
							tickedFive=false;
							tickedSix=false;
							tickedSeven=false;
							tickedOne=false;
							tickedNine=false;
						}
						else if (randomChoice == 9)
						{
							nine.setImageResource(R.drawable.beaversmall);
							tickedNine=true;
							one.setImageDrawable(null);
							two.setImageDrawable(null);
							three.setImageDrawable(null);
							four.setImageDrawable(null);
							five.setImageDrawable(null);
							six.setImageDrawable(null);
							seven.setImageDrawable(null);
							eight.setImageDrawable(null);
							tickedTwo=false;
							tickedThree=false;
							tickedFour=false;
							tickedFive=false;
							tickedSix=false;
							tickedSeven=false;
							tickedEight=false;
							tickedOne=false;

						}


					}
				});
			}};
			t.scheduleAtFixedRate(mTimerTask, 300, 400);
	}
	public  void stopTask(){

		if(mTimerTask!=null){
			//		Toast.makeText(getApplicationContext(),"Game Is Finished",Toast.LENGTH_LONG).show();

			mTimerTask.cancel();
		}
	}


	Timer mainTimer = new Timer();	
	static TimerTask mainTimerTask;
	Handler mainHandler = new Handler();

	public void doTimerTaskMain(){

		mainTimerTask = new TimerTask() {
			public void run() {
				mainHandler.post(new Runnable() {
					public void run() {

						playerScore=new SharedPref(getApplicationContext());

						playerScore.SaveScore(String.valueOf(Score));

						HashMap<String, String> saveScore=playerScore.getScore();

						String ppoints=saveScore.get("Score");

						Intent toResult=new Intent(NewGameActivity.this, BeaverWinner.class);
						startActivity(toResult);
					}
				});
			}};
			mainTimer.scheduleAtFixedRate(mainTimerTask, 30000, 30000);
	}
	public static void stopTaskMain(){

		if(mainTimerTask!=null){
			//		Toast.makeText(getApplicationContext(),"Game Is Finished",Toast.LENGTH_LONG).show();

			mainTimerTask.cancel();
		}
	}



	public void counterPoints() {
		Score=Score+100;
		points.setText(String.valueOf(Score));
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_game_layout);

		one=(ImageView)findViewById(R.id.imageView1);
		two=(ImageView)findViewById(R.id.ImageView01);
		three=(ImageView)findViewById(R.id.imageView4);
		four=(ImageView)findViewById(R.id.imageView3);
		five=(ImageView)findViewById(R.id.imageView2);
		six=(ImageView)findViewById(R.id.ImageView02);
		seven=(ImageView)findViewById(R.id.ImageView03);
		eight=(ImageView)findViewById(R.id.imageView5);
		nine=(ImageView)findViewById(R.id.imageView6);
		points=(TextView)findViewById(R.id.textView1);
		new Thread(new Runnable() { 
			public void run(){        
				doTimerTaskMain();

			}
		}).start();


		doTimerTask();


		one.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				if (tickedOne == true)
				{
					counterPoints();
				}


			}
		});

		two.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				if (tickedTwo == true)
				{
					counterPoints();
				}
			}
		});

		three.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				if (tickedThree == true)
				{
					counterPoints();
				}
			}
		});

		four.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				if (tickedFour == true)
				{
					counterPoints();
				}
			}
		});

		five.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				if (tickedFive == true)
				{
					counterPoints();
				}
			}
		});

		six.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				if (tickedSix == true)
				{
					counterPoints();
				}
			}
		});

		seven.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				if (tickedSeven == true)
				{
					counterPoints();
				}
			}
		});

		eight.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				if (tickedEight == true)
				{
					counterPoints();
				}
			}
		});

		nine.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				if (tickedNine == true)
				{
					counterPoints();
				}
			}
		});
	}
	@Override
	protected void onPause()
	{
		stopTaskMain();


	}

}