package com.example.unacceptable;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.Menu;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;

public class UnacceptableActivity extends Activity {

	MediaPlayer player;
	//Intent intent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_unacceptable);
		//intent = new Intent(Intent.ACTION_VIEW);
		player = MediaPlayer.create(UnacceptableActivity.this, R.raw.unacceptable);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_unacceptable, menu);
		return true;
	}	
	
	public void thisIs(View view){
		/*Uri data = Uri.parse("file:///sdcard/unacceptable.mp3");
		intent.setDataAndType(data, "audio/mp3");
		try{
			startActivity(intent);
		}
		catch(ActivityNotFoundException e){
			e.printStackTrace();
		}*/
		player.start();
		//something
		
		
	}

}
