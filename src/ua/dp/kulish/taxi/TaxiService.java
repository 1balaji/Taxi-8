package ua.dp.kulish.taxi;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TaxiService extends TabActivity {
	TabHost tabHost;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxi_service);
        
        tabHost = (TabHost) findViewById(android.R.id.tabhost);
        tabHost.setup();
        
        
        //TODO Нормальное название вкладок
        TabSpec tabFavorits;
        View viewTabFavorits = getLayoutInflater().inflate(R.layout.tab_favorite, null);
        tabFavorits = tabHost.newTabSpec("favorits");
        tabFavorits.setIndicator(viewTabFavorits);
        Intent intentFavorits = new Intent(this, Favorits.class);
    	tabFavorits.setContent(intentFavorits);
        tabHost.addTab(tabFavorits);
        
        TabSpec tabCity;
        View viewTabCity = getLayoutInflater().inflate(R.layout.tab_city, null);
        tabCity = tabHost.newTabSpec("City");
        tabCity.setIndicator(viewTabCity);
        Intent intentCity = new Intent(this, City.class);
    	tabCity.setContent(intentCity);
        tabHost.addTab(tabCity);
        
        TabSpec tabOrder;
        View viewTabOrder = getLayoutInflater().inflate(R.layout.tab_order, null);
        tabOrder = tabHost.newTabSpec("Order");
        tabOrder.setIndicator(viewTabOrder);
        Intent intentOrder = new Intent(this, Order.class);
    	tabOrder.setContent(intentOrder);
        tabHost.addTab(tabOrder);
        
        TabSpec tabInfo;
        View viewTabInfo = getLayoutInflater().inflate(R.layout.tab_info, null);
        tabInfo = tabHost.newTabSpec("Info");
        tabInfo.setIndicator(viewTabInfo);
        Intent intentInfo = new Intent(this, Info.class);
    	tabInfo.setContent(intentInfo);
        tabHost.addTab(tabInfo);
      
        

    }
    
/*    private TabSpec myTabSpec(String name, Class activity) {
    	TabSpec tabSpec;
    	View viewTabHeader = getLayoutInflater().inflate(R.layout.tab_header, null);
    	tabSpec = tabHost.newTabSpec(name);
    	tabSpec.setIndicator(viewTabHeader);
    	Intent intent = new Intent(this, activity.class);
    	tabSpec.setContent(intent);
		return tabSpec;
		
	}*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_taxi_service, menu);
        return true;
    }
}
