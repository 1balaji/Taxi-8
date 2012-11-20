package ua.dp.kulish.taxi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Favorits extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorits);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_favorits, menu);
        return true;
    }
}
