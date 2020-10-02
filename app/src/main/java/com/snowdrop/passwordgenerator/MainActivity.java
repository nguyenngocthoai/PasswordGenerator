package com.snowdrop.passwordgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1, cb2, cb3, cb4;
    EditText password, lengthPassword;
    Button btnGenerator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input();


        btnGenerator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
//                String pwd = RandomStringUtils.random( 15, characters );
//                System.out.println( pwd );

                Random random =new Random();
                int min=9000;
                int max=900000000;
                int number=random.nextInt(max-min+1)+min;
                String pass= String.valueOf(number);
                password.setText(pass);

                /**
                 * Password length
                 */
                int length=pass.length();
                lengthPassword.setText(String.valueOf(length));
            }
        });

    }

    private void input() {
        btnGenerator=findViewById(R.id.btnGenerator);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        cb4 = (CheckBox) findViewById(R.id.cb4);
        password = findViewById(R.id.txtPassword);
        lengthPassword = findViewById(R.id.txtLengthPassword);
    }
}