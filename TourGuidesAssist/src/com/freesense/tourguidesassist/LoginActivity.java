/**
 * FreeSense.com.cn
 * LoginActivity.java
 * 
 * 2015/04/28
 * Create By LiTingfang
 */
package com.freesense.tourguidesassist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 * @author LiTingfang
 *
 */
public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_activity_layout);
		
		Button loginBtn = (Button)findViewById(R.id.signin_button);
		loginBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(LoginActivity.this, "用户登录", Toast.LENGTH_SHORT).show();
				
				Intent intent = new Intent(LoginActivity.this, MainActivity.class);
				startActivity(intent);
			}
			
		});
	}
}
