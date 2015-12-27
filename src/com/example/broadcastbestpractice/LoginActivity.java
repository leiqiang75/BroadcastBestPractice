package com.example.broadcastbestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity{

	/**
	 * 账号输入框
	 */
	EditText accountEdit;
	
	/**
	 * 密码输入框
	 */
	EditText passwordEdit;
	
	/**
	 * 登陆按钮
	 */
	Button loginBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		accountEdit = (EditText) findViewById(R.id.textAccount);
		passwordEdit = (EditText) findViewById(R.id.textPassword);
		loginBtn = (Button) findViewById(R.id.btnLogin);
		loginBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if ("admin".equals(accountEdit.getText().toString()) 
						&& "admin".equals(passwordEdit.getText().toString())) {
					Intent toMain = new Intent(LoginActivity.this, MainActivity.class);
					startActivity(toMain);
					finish();
				}
				else {
					Toast.makeText(LoginActivity.this, "Please input the right account or passowrd!", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
	}
	
}
