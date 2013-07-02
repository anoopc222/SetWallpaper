SetWallpaper
============

buttonSetWallpaper.setOnClickListener(new Button.OnClickListener(){         @Override         public void onClick(View arg0) {                WallpaperManager myWallpaperManager = WallpaperManager.getInstance(getApplicationContext());          try {             myWallpaperManager.setResource(R.drawable.five);          } catch (IOException e) {             e.printStackTrace();         }  }});
