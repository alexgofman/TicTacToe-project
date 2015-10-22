package com.example.tictactoe;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.widget.Toast;

public class ServicesActTicTac extends Service {
	
	Timer t = new Timer();	

	TimerTask mTimerTask;
	Handler mHandler = new Handler();

	 public void doTimerTask(){
		 
	    	mTimerTask = new TimerTask() {
	    	        public void run() {
	    	        	mHandler.post(new Runnable() {
	    	                        public void run() {
	    	                       	Toast.makeText(getApplicationContext(),"TIMER is STARTED!",Toast.LENGTH_SHORT).show();
	    	                      
	    	                        }
	    	               });
	    	        }};
	 
	            // public void schedule (TimerTask task, long delay, long period) 
	    	 //   t.schedule(mTimerTask, 500, 3000);  // 
	    	   // t.schedule(mTimerTask, 5000);
	    	    
	    	   t.scheduleAtFixedRate(mTimerTask, 10000, 4000);
	    	 }
	  public  void stopTask(){
		  
   	   if(mTimerTask!=null){
   //		Toast.makeText(getApplicationContext(),"taskstopped",Toast.LENGTH_LONG).show();
	        
   	      mTimerTask.cancel();
   	 }
	  }
	
	@Override
	public void onCreate() {
			

		Toast.makeText(getApplicationContext(), "Service is created", Toast.LENGTH_LONG).show();
		doTimerTask();
    
	};
	
	
	
	
	
	
	@Override
	public void onDestroy() {
	Toast.makeText(getApplicationContext(), "Service is destroying itself", Toast.LENGTH_LONG).show();
	stopTask();
	}
 

	
	
	
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		Toast.makeText(getApplicationContext(), "Service start command is called", Toast.LENGTH_LONG).show();
		doTimerTask();
		  
		return START_STICKY;
	}
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}
