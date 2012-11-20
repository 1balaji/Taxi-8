package ua.dp.kulish.taxi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ToggleButton;

public class City extends Activity {
	ToggleButton btnDp;
	ToggleButton btnKy;
	ToggleButton btnZp;
	ToggleButton btnKr;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_city);
		findView();

		btnDp.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				if (isChecked) {

					btnZp.setChecked(false);
					btnKy.setChecked(false);
					btnKr.setChecked(false);
				}

			}
		});
		btnKy.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				if (isChecked) {
					btnZp.setChecked(false);
					btnDp.setChecked(false);
					btnKr.setChecked(false);
				}

			}
		});
		btnZp.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				if (isChecked) {
					btnDp.setChecked(false);
					btnKy.setChecked(false);
					btnKr.setChecked(false);
				}
			}
		});
		btnKr.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				if (isChecked) {
					btnZp.setChecked(false);
					btnKy.setChecked(false);
					btnDp.setChecked(false);
				}
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_city, menu);
		return true;
	}

	private void findView() {
		btnDp = (ToggleButton) findViewById(R.id.cityToggleButtonDp);
		btnKy = (ToggleButton) findViewById(R.id.cityToggleButtonKy);
		btnZp = (ToggleButton) findViewById(R.id.cityToggleButtonZp);
		btnKr = (ToggleButton) findViewById(R.id.cityToggleButtonKr);

	}

}
