package com.usf.toiletbull;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ToiletBullActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        
        
        
		final Button button4 = (Button) findViewById(R.id.button4);		//same code as above but for button3 (help section)
		button4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				startActivity((new Intent(getBaseContext(),
						prefs.class)));

			}
		});
        
        
        
        
        
        
    }
}