package com.dialog;


import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.content.Intent;
import android.widget.RadioButton;

public class select extends Activity {
    /** Called when the activity is first created. */
    RadioButton r1,r2;
	@Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select);
        r1=(RadioButton)findViewById(R.id.stopage);
        r2=(RadioButton)findViewById(R.id.route);
        r1.setOnClickListener(myOptionOnClickListener);
        r1.setOnClickListener(myOptionOnClickListener);
    }
	
	RadioButton.OnClickListener myOptionOnClickListener =
		   new RadioButton.OnClickListener()
		  {

		  public void onClick(View v) {
		   // TODO Auto-generated method stub
		   if(v==r1)
		   {
			   Intent intent=new Intent(select.this,stopage.class);
   			   startActivity(intent);
		   }
		   if(v==r2)
		   {
			   Intent intent=new Intent(select.this,route.class);
   			   startActivity(intent);
			   
		   }

		  }
		   
		   
		  };
	
}