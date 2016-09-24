package com.dialog;

import android.app.Activity;
import android.os.Bundle;



import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


public class stopage extends Activity {
    /** Called when the activity is first created. */
   
	@Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.source_dest);
        final String[] List= getResources().getStringArray(R.array.Stopages);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,List);
        
        AutoCompleteTextView a1 = (AutoCompleteTextView)findViewById(R.id.source);
        a1.setThreshold(1);
        a1.setAdapter(adapter);
        AutoCompleteTextView a2 = (AutoCompleteTextView)findViewById(R.id.destination);
        a2.setThreshold(1);
        a2.setAdapter(adapter);
    }
	
	
		
	
}