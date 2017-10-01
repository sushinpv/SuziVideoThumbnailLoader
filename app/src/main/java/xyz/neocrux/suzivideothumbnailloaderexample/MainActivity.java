package xyz.neocrux.suzivideothumbnailloaderexample;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import xyz.neocrux.suziloader.SuziLoader;

public class MainActivity extends AppCompatActivity {

    private SuziLoader loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mThumbnail = (ImageView) findViewById(R.id.thumbnail);

        loader = new SuziLoader();
        String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/video.mp4";
        Log.e("sample", path);
        loader.with(MainActivity.this)
                .load(path)
                .into(mThumbnail)
                .type("mini")
                .show();
    }
}
