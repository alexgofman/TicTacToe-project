package com.example.tictactoe;

import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends Activity {

	String playerOneS, playerTwoS;
	TextView player;
	ImageView one,two,three,four,five,six,seven,eight,nine;
	Boolean check = true;
	Boolean tickedOne1=false, tickedTwo1=false, tickedThree1=false, tickedFour1=false, tickedFive1=false, tickedSix1=false, tickedSeven1=false, tickedEight1=false, tickedNine1=false;
	Boolean tickedOne2=false, tickedTwo2=false, tickedThree2=false, tickedFour2=false, tickedFive2=false, tickedSix2=false, tickedSeven2=false, tickedEight2=false, tickedNine2=false;
	SharedPref userData1;
	SharedPref userData2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game_activity);
		
	//	Intent ob=getIntent();
	//	playerOneS=ob.getStringExtra("Player1");
	//	playerTwoS=ob.getStringExtra("Player2");
		
		userData1=new SharedPref(getApplicationContext());
		userData2=new SharedPref(getApplicationContext());
		
		HashMap<String, String> saveU1=userData1.getUser1();
		HashMap<String, String> saveU2=userData2.getUser2();
				
		playerOneS=saveU1.get("User1");
		playerTwoS=saveU2.get("User2");
		
		player=(TextView)findViewById(R.id.textView1);
		
		one=(ImageView)findViewById(R.id.imageView1);
		two=(ImageView)findViewById(R.id.ImageView01);
		three=(ImageView)findViewById(R.id.imageView4);
		four=(ImageView)findViewById(R.id.imageView3);
		five=(ImageView)findViewById(R.id.imageView2);
		six=(ImageView)findViewById(R.id.ImageView02);
		seven=(ImageView)findViewById(R.id.ImageView03);
		eight=(ImageView)findViewById(R.id.imageView5);
		nine=(ImageView)findViewById(R.id.imageView6);
		
		player.setText(playerOneS);
		
		
		one.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (check) {
					one.setImageResource(R.drawable.tickmem);
					tickedOne1 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
					//	newPlayer1=playerOne.getText().toString();
					//	newPlayer2=playerTwo.getText().toString();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
					//	in.putExtra("Player1", newPlayer1);
					//	in.putExtra("Player2", newPlayer2);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else		
					check=false;
					player.setText(playerTwoS);
				} else {
					one.setImageResource(R.drawable.toemem);
					tickedOne2 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else		
					check=true;
					player.setText(playerOneS);
				}
				
				
				
			}
			
			
		});
		
		two.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (check) {
					two.setImageResource(R.drawable.tickmem);
					tickedTwo1 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
					//	newPlayer1=playerOne.getText().toString();
					//	newPlayer2=playerTwo.getText().toString();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
					//	in.putExtra("Player1", newPlayer1);
					//	in.putExtra("Player2", newPlayer2);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else
					check=false;
					player.setText(playerTwoS);
				} else {
					two.setImageResource(R.drawable.toemem);
					tickedTwo2 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else	
					check=true;
					player.setText(playerOneS);
				}
				
			}
		});
		
		three.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (check) {
					three.setImageResource(R.drawable.tickmem);
					tickedThree1 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
					//	newPlayer1=playerOne.getText().toString();
					//	newPlayer2=playerTwo.getText().toString();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
					//	in.putExtra("Player1", newPlayer1);
					//	in.putExtra("Player2", newPlayer2);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else	
					check=false;
					player.setText(playerTwoS);
				} else {
					three.setImageResource(R.drawable.toemem);
					tickedThree2 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else	
					check=true;
					player.setText(playerOneS);
				}
			}
		});
		
		four.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (check) {
					four.setImageResource(R.drawable.tickmem);
					tickedFour1 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
					//	newPlayer1=playerOne.getText().toString();
					//	newPlayer2=playerTwo.getText().toString();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
					//	in.putExtra("Player1", newPlayer1);
					//	in.putExtra("Player2", newPlayer2);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else
					check=false;
					player.setText(playerTwoS);
				} else {
					four.setImageResource(R.drawable.toemem);
					tickedFour2 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else	
					check=true;
					player.setText(playerOneS);
				}
				
			}
		});
		
		five.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (check) {
					five.setImageResource(R.drawable.tickmem);
					tickedFive1 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
					//	newPlayer1=playerOne.getText().toString();
					//	newPlayer2=playerTwo.getText().toString();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
					//	in.putExtra("Player1", newPlayer1);
					//	in.putExtra("Player2", newPlayer2);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else
					check=false;
					player.setText(playerTwoS);
				} else {
					five.setImageResource(R.drawable.toemem);
					tickedFive2 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else	
					check=true;
					player.setText(playerOneS);
				}
				
			}
		});
		
		six.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (check) {
					six.setImageResource(R.drawable.tickmem);
					tickedSix1 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
					//	newPlayer1=playerOne.getText().toString();
					//	newPlayer2=playerTwo.getText().toString();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
					//	in.putExtra("Player1", newPlayer1);
					//	in.putExtra("Player2", newPlayer2);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else	
					check=false;
					player.setText(playerTwoS);
				} else {
					six.setImageResource(R.drawable.toemem);
					tickedSix2 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else		
					check=true;
					player.setText(playerOneS);
				}
				
			}
		});
		
		seven.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (check) {
					seven.setImageResource(R.drawable.tickmem);
					tickedSeven1 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
					//	newPlayer1=playerOne.getText().toString();
					//	newPlayer2=playerTwo.getText().toString();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
					//	in.putExtra("Player1", newPlayer1);
					//	in.putExtra("Player2", newPlayer2);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else	
					check=false;
					player.setText(playerTwoS);
				} else {
					seven.setImageResource(R.drawable.toemem);
					tickedSeven2 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else	
					check=true;
					player.setText(playerOneS);
				}
				
			}
		});
		
		eight.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (check) {
					eight.setImageResource(R.drawable.tickmem);
					tickedEight1 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
					//	newPlayer1=playerOne.getText().toString();
					//	newPlayer2=playerTwo.getText().toString();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
					//	in.putExtra("Player1", newPlayer1);
					//	in.putExtra("Player2", newPlayer2);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else	
					check=false;
					player.setText(playerTwoS);
				} else {
					eight.setImageResource(R.drawable.toemem);
					tickedEight2 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else	
					check=true;
					player.setText(playerOneS);
				}
				
			}
		});
		
		nine.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (check) {
					nine.setImageResource(R.drawable.tickmem);
					tickedNine1 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
					//	newPlayer1=playerOne.getText().toString();
					//	newPlayer2=playerTwo.getText().toString();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
					//	in.putExtra("Player1", newPlayer1);
					//	in.putExtra("Player2", newPlayer2);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else
					check=false;
					player.setText(playerTwoS);
				} else {
					nine.setImageResource(R.drawable.toemem);
					tickedNine2 = true;
					if (tickedOne1==true&&tickedTwo1==true&&tickedThree1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFour1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne1==true&&tickedFive1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedTwo2==true&&tickedThree2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFour2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedOne2==true&&tickedFive2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo1==true&&tickedFive1==true&&tickedEight1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedTwo2==true&&tickedFive2==true&&tickedEight2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedSix1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree1==true&&tickedFive1==true&&tickedSeven1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedSix2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedThree2==true&&tickedFive2==true&&tickedSeven2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour1==true&&tickedFive1==true&&tickedSix1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedFour2==true&&tickedFive2==true&&tickedSix2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven1==true&&tickedEight1==true&&tickedNine1==true) {
						Toast.makeText(getApplicationContext(),"PLAYER ONE WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else if (tickedSeven2==true&&tickedEight2==true&&tickedNine2==true) {
						Toast.makeText(getApplicationContext(),"PLAYER TWO WINS!!!", Toast.LENGTH_LONG).show();
						Intent in=new Intent(GameActivity.this,WinnerActivity.class);
						startActivity(in);
					} else		
					check=true;
					player.setText(playerOneS);
				}
				
			}
		});


		
	 	
	}
}
