package ua.dp.kulish.taxi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class Info extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_info, menu);
		return true;
	}
}
