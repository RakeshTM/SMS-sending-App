package com.rakesh.smsdemo;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class SmsActivity extends Activity {
	
	  EditText etNum;
	 EditText etBody;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sms_layout);
		etNum = (EditText) findViewById(R.id.etNum);
		etBody = (EditText) findViewById(R.id.etBody);
	}

	public  void send(View view) {
		
	
		SmsManager smsManager = SmsManager.getDefault();
		smsManager.sendTextMessage(etNum.getText().toString(), null, etBody.getText().toString(), null, null);
		
		
		
	}
}
