package ua.dp.kulish.taxi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class Order extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_order);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_order, menu);
		return true;
	}
}
