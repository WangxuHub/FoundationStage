package com.dysoft.myandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 王礁龙 on 2016/12/24.
 */

public class LoginActivity extends Activity {

  //  private TextView textview1,textview2;
    private EditText editText1,editText2;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        editText1 = (EditText) findViewById(R.id.edit_text1);
        editText2 = (EditText) findViewById(R.id.edit_text2);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("","======="+editText1.getText().toString());
                if (editText1.getText().toString().equals("") || editText2.getText().toString().equals("")){
                    Toast.makeText(LoginActivity.this,"用户名和密码不能为空",Toast.LENGTH_LONG).show();
                }else if (editText1.getText().toString().equals("20161223") && editText2.getText().toString().equals("123456")){
                    startActivity(new Intent(LoginActivity.this,HomeActivity.class));
                    editText1.setText("");
                    editText2.setText("");
                    finish();
                }else {
                    Toast.makeText(LoginActivity.this,"用户名或密码错误",Toast.LENGTH_LONG).show();
                    editText1.setText("");
                    editText2.setText("");
                }
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
