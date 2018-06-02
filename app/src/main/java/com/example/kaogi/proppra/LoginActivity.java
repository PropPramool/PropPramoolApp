package com.example.kaogi.proppra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.lang.String.*;
import  	android.text.TextUtils;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {
    EditText editText;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button DEL;
    Button CLR;
    Button sub;
    String key = "9999";
    String key2 ="1010";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText = (EditText)findViewById((R.id.editText));
        b1=(Button)findViewById(R.id.n1);
        b2=(Button)findViewById(R.id.n2);
        b3=(Button)findViewById(R.id.n3);
        b4=(Button)findViewById(R.id.n4);
        b5=(Button)findViewById(R.id.n5);
        b6=(Button)findViewById(R.id.n6);
        b7=(Button)findViewById(R.id.n7);
        b8=(Button)findViewById(R.id.n8);
        b9=(Button)findViewById(R.id.n9);
        b0=(Button)findViewById(R.id.n0);
        CLR=(Button)findViewById(R.id.CLR);
        DEL=(Button)findViewById(R.id.DEL);
        sub=(Button)findViewById(R.id.buttonsub);

    b0.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            editText.setText(editText.getText().insert(editText.getText().length(),"0"));
        }
    });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"1"));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"2"));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"3"));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"4"));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"5"));
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"6"));
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"7"));
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"8"));
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"9"));
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(),"0"));
            }
        });
        CLR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
        DEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(!TextUtils.isEmpty(text)) {
                    text  = text.substring(0, text.length() - 1);
                    editText.setText(text);
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
              if(text.equals(key))
              {
                  Toast.makeText(getApplicationContext(), "CORRECT!",
                          Toast.LENGTH_LONG).show();
                  startActivity(new Intent(LoginActivity.this, MainActivity.class));
                  editText.setText("");
              }
              else if(text.equals(key2))
              {
                  Toast.makeText(getApplicationContext(), "WIP!",
                          Toast.LENGTH_LONG).show();
                  startActivity(new Intent(LoginActivity.this, PriceMapsActivity.class));
                  editText.setText("");
              }
              else
              {
                  Toast.makeText(getApplicationContext(), "Wrong Passwordlol!",
                  Toast.LENGTH_LONG).show();
                  editText.setText("");
              }
            }
        });
    }
}
