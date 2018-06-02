package com.example.kaogi.proppra;

import android.content.Intent;
import android.os.DeadObjectException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Detail extends AppCompatActivity {
    Button nerby;
    Button bid;
    TextView priceView;
    String buff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nerby=(Button)findViewById(R.id.nrby);
        bid=(Button)findViewById(R.id.bidb);
        priceView=(TextView)findViewById(R.id.priceTXT);

        nerby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Detail.this, PriceMapsActivity.class));
            }
        });

        bid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String  b  = priceView.getText().toString();

                Toast.makeText(getApplicationContext(), b,
                        Toast.LENGTH_LONG).show();

                int b2;

                b2 = Integer.parseInt(b);

                b2 = b2+10000;
                priceView.setText(String.valueOf(b2));

            }
        });
    }



}
