package com.kong.armonia.armonia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnRegist;
    private Button btnLogin;
    private EditText id;
    private EditText password;

    //hi
<<<<<<< HEAD
    //아아 마이크 테스트
=======
    //hello

>>>>>>> 393b3e37fb6fe59b06fbe5d751bb26d02cdf3860
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id = (EditText) findViewById(R.id.id);
        password = (EditText) findViewById(R.id.password);

        btnRegist = (Button) findViewById(R.id.btnRegist);
        btnRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistActivity.class);
                startActivityForResult(intent, 1000);
            }
        });

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (id.getText().toString().length() == 0) {
                    Toast.makeText(MainActivity.this, "Email을 입력하세요!", Toast.LENGTH_SHORT).show();
                    id.requestFocus();
                    return;
                }

                // 비밀번호 입력 확인
                if (password.getText().toString().length() == 0) {
                    Toast.makeText(MainActivity.this, "비밀번호를 입력하세요!", Toast.LENGTH_SHORT).show();
                    password.requestFocus();
                    return;
                }

                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivityForResult(intent, 1000);


                //getData("http://52.11.180.128/dbProject/1.php"); //수정 필요

/*
                if(flag == 1)
                {
                    flag = 0;
                    Intent intent = new Intent(getApplicationContext(), BoardActivity.class);
                    startActivityForResult(intent,2000);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "잘못입력했습니다.", Toast.LENGTH_SHORT).show();
                    return;
                }

*/
            }
        });
    }
}
