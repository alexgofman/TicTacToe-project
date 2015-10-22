package com.example.tictactoe;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class VideoActivity extends Activity {
	VideoView vw;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.video);

		
		
		vw=(VideoView)findViewById(R.id.videoView1);
		vw.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.testandroid));
		vw.start();
		
		
		
		
		
		
		
	}
}