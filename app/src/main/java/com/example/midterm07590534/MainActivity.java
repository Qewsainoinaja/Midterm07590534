package com.example.midterm07590534;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         class Authh {
            private static final String EMAIL = "aaa"; //**
            private static final String PASSWORD = "111"; //**

            private String mEmail;
            private String mPassword;

            public Authh(String email, String password) {
                this.mEmail = email;
                this.mPassword = password;
            }

            public boolean check() {
                if (mEmail.equals(EMAIL) && mPassword.equals(PASSWORD)) {
                    return true;
                } else {
                    return false;
                }
            }

            Authh auth = new Authh(mEmail, mPassword);
            boolean result = auth.check();

            public boolean isResult() {
                return result;
            }

            {
                Toast.makeText(MainActivity.this, "Welcome Ronnayot Jaisai", Toast.LENGTH_SHORT).show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent intent = new Intent(MainActivity.this, com.example.midterm07590534.MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }, 3000);
            }
        }
    }
}




