package com.example.tictactoe;

import java.util.HashMap;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SharedPref {
	// Shared Preferences
    SharedPreferences pref;
     Context _context;
     int PRIVATE_MODE = 0;
    // Editor for Shared preferences
    Editor editor;
    private static final String PREF_NAME = "Settings";
    
    // All Shared Preferences Keys

     
    // User name (make variable public to access from outside)
    public static final String KEY_PASS = "password";
    public static final String KEY_USER1 = "User1";
    public static final String KEY_USER2 = "User2";
    public static final String KEY_SCORE = "Score";
    // Email address (make variable public to access from outside)
 //   public static final String KEY_HOPCOUNT = "hopcount";
   // public static final String KEY_RANK = "rank";
    
    

	@SuppressLint("CommitPrefEdits")
	public SharedPref(Context context){
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
       
        editor = pref.edit();
    }
    
    
  /*  public void SaveRank(int rank)
    
    {
    	 editor.putInt(KEY_RANK, rank);
    	
    }
    
    */
    public void Savepassword(String name){
         
        // Storing name in pref
        editor.putString(KEY_PASS, name);
         
       // editor.putInt(KEY_HOPCOUNT, HopCount);
       // commit changes
        editor.commit();
    }

    public void Saveuser1(String name){
        
        // Storing name in pref
        editor.putString(KEY_USER1, name);
         
       // editor.putInt(KEY_HOPCOUNT, HopCount);
       // commit changes
        editor.commit();
    }
    
    public void Saveuser2(String name){
        
        // Storing name in pref
        editor.putString(KEY_USER2, name);
         
       // editor.putInt(KEY_HOPCOUNT, HopCount);
       // commit changes
        editor.commit();
    }
    
    public void SaveScore(String score){
        
        // Storing name in pref
        editor.putString(KEY_SCORE, score);         
       // editor.putInt(KEY_HOPCOUNT, HopCount);
       // commit changes
        editor.commit();
    }
    
 /* public void PeerSelection(int selection)
  
  {
  	 editor.putInt(KEY_SelectionId, selection);
  	 
  	 editor.commit();
  }*/
 
    public HashMap<String, String> getScore(){
        HashMap<String, String> scoring = new HashMap<String, String>();
        // user name
        scoring.put(KEY_SCORE, pref.getString(KEY_SCORE, null));
         
        // return user
        return scoring;
    }
    
    public HashMap<String, String> getPassword(){
        HashMap<String, String> password = new HashMap<String, String>();
        // user name
        password.put(KEY_PASS, pref.getString(KEY_PASS, null));
         
        // return user
        return password;
    }
    
    public HashMap<String, String> getUser1(){
        HashMap<String, String> userName = new HashMap<String, String>();
        // user name
        userName.put(KEY_USER1, pref.getString(KEY_USER1, null));
         
        // return user
        return userName;
    }
    
    public HashMap<String, String> getUser2(){
        HashMap<String, String> userName = new HashMap<String, String>();
        // user name
        userName.put(KEY_USER2, pref.getString(KEY_USER2, null));
         
        // return user
        return userName;
    }

    
}