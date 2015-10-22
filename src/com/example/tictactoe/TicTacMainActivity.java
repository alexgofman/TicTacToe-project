package com.example.tictactoe;

import java.util.HashMap;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;





import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class TicTacMainActivity extends Activity implements LocationListener {

	Timer t = new Timer();	
	TimerTask mTimerTask;
	Handler mHandler = new Handler();
/*
	 public void doTimerTask(){
		 
	    	mTimerTask = new TimerTask() {
	    	        public void run() {
	    	        	mHandler.post(new Runnable() {
	    	                        public void run() {
	    	                       	Toast.makeText(getApplicationContext(),"timerstarted",Toast.LENGTH_SHORT).show();
	    	        				Intent inGal=new Intent(TicTacMainActivity.this, GalleryActivity.class);
	    	        				startActivity(inGal);
	    	                        }
	    	               });
	    	        }};
	 
	            // public void schedule (TimerTask task, long delay, long period) 
	    	 //   t.schedule(mTimerTask, 500, 3000);  // 
	    	   t.schedule(mTimerTask, 10000);
	    	    
	    	 //  t.scheduleAtFixedRate(mTimerTask, 30000, 3000);
	    	 }
	  public  void stopTask(){
		  
   	   if(mTimerTask!=null){
   //		Toast.makeText(getApplicationContext(),"taskstopped",Toast.LENGTH_LONG).show();
	        
   	      mTimerTask.cancel();
   	 }
 }
*/
	
	Button start, newplaya, btnToGallery;
	ImageButton map;
	String newPlayer1=null, newPlayer2=null;
	SharedPref playa1;
	SharedPref playa2;
	ProgressBar bar;
	TextView coordinates;
	Location location;
	LocationManager locationManager;
	
	String latit, longit;
	
	void wifiFunc() 
	{
		locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,3000,10,this);
		
	}
	

	public static MediaPlayer mp;
	public int randomNum() {
	    Random rand = new Random();
	    int pickedNumber = rand.nextInt(2);
	    return pickedNumber;
	}
	
	
	@Override  
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tic_tac_main);
		
		Intent ser=new Intent(this,ServicesActTicTac.class);
		startService(ser);
		
		//doTimerTask();
        mp = MediaPlayer.create(this, R.raw.drake);
       	
        new Thread(new Runnable() { 
            public void run(){        
            	 mp.start();
            //	 Toast.makeText(getApplicationContext(), "thread started", Toast.LENGTH_LONG).show();
            	 
            }
        }).start();
       
		
		start=(Button)findViewById(R.id.button1);
		newplaya=(Button)findViewById(R.id.button2);
		btnToGallery=(Button)findViewById(R.id.button1);
		bar=(ProgressBar)findViewById(R.id.progressBar2);
		map=(ImageButton)findViewById(R.id.imageButton2);
		coordinates=(TextView)findViewById(R.id.textView2);
		
		locationManager=(LocationManager)getSystemService(Context.LOCATION_SERVICE);
		
		map.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				wifiFunc();
				if(latit!=null&&longit!=null)
				{
				Intent in = new Intent(TicTacMainActivity.this,Maps_Activity.class);
				in.putExtra("latit", latit);
				in.putExtra("longit", longit);
				startActivity(in);
			}
				Toast.makeText(getApplicationContext(), latit+" "+longit,Toast.LENGTH_SHORT ).show();
			}
		});
		
		
		btnToGallery.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

				Intent inGal=new Intent(TicTacMainActivity.this, GalleryActivity.class);
			//	stopTask();
				startActivity(inGal);
			}
		});
		
		newplaya.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			//	stopTask();
				randomNum();
				int random1 = randomNum();
				int random2 = randomNum();
				
				if (random1 == 1)
				{
					Intent in = new Intent(TicTacMainActivity.this, GameActivity.class);
					startActivity(in);
					
				}
				else
				{
					Intent in = new Intent(TicTacMainActivity.this, NewGameActivity.class);
					startActivity(in);
				}
				
				bar.setProgress(0);
		        new Thread(new Task()).start();
		        class Task implements Runnable {
		        @Override
		        public void run() {
		            for (int i = 0; i <= 10; i++) {
		                final int value = i;
		                try {
		                    Thread.sleep(750);
		                } catch (InterruptedException e) {
		                    e.printStackTrace();
		                }
		                bar.setProgress(value);
		            }
		        }
		    }
				
				LayoutInflater layoutInflater = LayoutInflater.from(TicTacMainActivity.this);
				View promptView = layoutInflater.inflate(R.layout.tic_alert, null);
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(TicTacMainActivity.this);
				alertDialogBuilder.setView(promptView);
				
				final EditText editText1 = (EditText) promptView.findViewById(R.id.editText1);
				final EditText editText2 = (EditText) promptView.findViewById(R.id.editText2);
				// setup a dialog window
				alertDialogBuilder.setCancelable(false)
						.setPositiveButton("OK", new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								
								newPlayer1=editText1.getText().toString();
								newPlayer2=editText2.getText().toString();
								
								if (!newPlayer1.isEmpty() && !newPlayer2.isEmpty()) {
									
										Intent in = new Intent(TicTacMainActivity.this, GameActivity.class);
										
										playa1=new SharedPref(getApplicationContext());
										playa2=new SharedPref(getApplicationContext());
										
										playa1.Saveuser1(newPlayer1);
										playa2.Saveuser2(newPlayer2);
										
										HashMap<String, String> saveU1=playa1.getUser1();
										HashMap<String, String> saveU2=playa2.getUser2();
										
										Toast.makeText(getApplicationContext(), saveU1.toString(), Toast.LENGTH_SHORT).show();
										String userrr1=saveU1.get("User1");
										String userrr2=saveU2.get("User2");
										newPlayer1=null;
										newPlayer2=null;
										startActivity(in);
								}
								else
								{
									Intent in = new Intent(TicTacMainActivity.this, GameActivity.class);
									startActivity(in);
								}
							}
						})
						.setNegativeButton("Cancel",
								new DialogInterface.OnClickListener() {
									public void onClick(DialogInterface dialog, int id) {
										dialog.cancel();
									}
								});

				// create an alert dialog
				AlertDialog alert = alertDialogBuilder.create();
				alert.show();
				
				
				
			}
		});
		
	}

	
	public void startProgress(View view) {
		        bar.setProgress(0);
		        new Thread(new Task()).start();
		    }
		    class Task implements Runnable {
		        @Override
		        public void run() {
		            for (int i = 0; i <= 10; i++) {
		                final int value = i;
		                try {
		                    Thread.sleep(750);
		                } catch (InterruptedException e) {
		                    e.printStackTrace();
		                }
		                bar.setProgress(value);
		            }
		        }
		    }
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tic_tac_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onLocationChanged(Location location) {

		String str = "Latitude " + location.getLatitude() +
				" Longitude: " + location.getLongitude();
		
		latit=String.valueOf(location.getLatitude());
		longit=String.valueOf(location.getLongitude());
		
	
			coordinates.setText(str);
		
		
		
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
		
	}
}
