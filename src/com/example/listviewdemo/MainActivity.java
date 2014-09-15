package com.example.listviewdemo;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

	//data source
	String[] osList={"Windows","Linux","Mac OS", "Andoird" };

	// data adapter
	ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		adapter=new ArrayAdapter<String>(this, R.layout.list_item, R.id.txtOsName, osList);
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {	
		super.onListItemClick(l, v, position, id);
		Toast.makeText(getApplicationContext(), "Item selected position:"+position+" Item Name:"+osList[position], Toast.LENGTH_LONG).show();
	}
}
