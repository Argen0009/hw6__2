package com.example.home_work6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText password;
    Button Login;
    TextView forgPassword;
    TextView register;
    TextView reger;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);
        Login = findViewById(R.id.loginText);
        forgPassword = findViewById(R.id.forgPassword);
        register = findViewById(R.id.register);
        reger = findViewById(R.id.reger);





        Login.setOnClickListener(view -> {
            if(email.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                forgPassword.setAlpha(0);
                register.setAlpha(0);
                reger.setAlpha(0);
                email.setAlpha(0);
                password.setAlpha(0);
                Login.setAlpha(0);

            }else {
                Toast.makeText(MainActivity.this, "Неправильный пароль или логин", Toast.LENGTH_SHORT).show();
                forgPassword.setAlpha(1);
                register.setAlpha(1);
                reger.setAlpha(1);
                email.setAlpha(1);
                password.setAlpha(1);
                Login.setAlpha(1);
            }
        });
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               if (email.getText().toString().isEmpty()){
            Login.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
                }else{
                    Login.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orenge));

                }

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               if (password.getText().toString().isEmpty()){
                    Login.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
                }else{
                    Login.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orenge));

                }

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


    }
}