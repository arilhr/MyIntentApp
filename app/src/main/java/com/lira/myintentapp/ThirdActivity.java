package com.lira.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvNama;
    Button btnPindahactivity1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvNama = findViewById(R.id.tv_nama);

        btnPindahactivity1 = findViewById(R.id.btn_pindah_activity1);
        btnPindahactivity1.setOnClickListener(this);

        String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);

        if (TextUtils.isEmpty(nama)) {
            tvNama.setText("Nama : ");
        } else {
            tvNama.setText(nama);
        }
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_pindah_activity1) {
            pindahActivity1();
        }
    }

    private void pindahActivity1() {
        Intent moveIntent = new Intent(ThirdActivity.this, MainActivity.class);
        startActivity(moveIntent);
    }
}