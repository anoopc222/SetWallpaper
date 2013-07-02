package com.ac.SetWallpaper;

import java.io.IOException;

import com.ac.SetWallpaper.R;

import android.app.Activity;
import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SetWallpaper extends Activity {
	Bitmap bitmap;
	int lastImageRef;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button buttonSetWallpaper = (Button) findViewById(R.id.set);
		ImageView imagePreview = (ImageView) findViewById(R.id.preview);
		imagePreview.setImageResource(R.drawable.five);

		buttonSetWallpaper.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				WallpaperManager myWallpaperManager = WallpaperManager
						.getInstance(getApplicationContext());
				try {
					myWallpaperManager.setResource(R.drawable.five);
					finish();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
}