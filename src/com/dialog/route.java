package com.dialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.view.View.*;
import android.content.Intent;
import android.widget.Button;

public class route extends Activity {
    /** Called when the activity is first created. */
    Button b;
	@Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        b=(Button)findViewById(R.id.enter);
        b.setOnClickListener(new Click());
    }
	
	public class Click implements OnClickListener
	{

		public void onClick(View v) {
			
			if(v==b)
			{
				Intent intent=new Intent(route.this,select.class);
    			startActivity(intent);
				
			}
		}
		
		
	}
}