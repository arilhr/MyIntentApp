package com.lira.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvNama, tvInstitusi;
    Button btnPindahActivity3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvNama = findViewById(R.id.tv_nama);
        tvInstitusi = findViewById(R.id.tv_institusi);

        btnPindahActivity3 = findViewById(R.id.btn_pindah_activity3);
        btnPindahActivity3.setOnClickListener(this);

        String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);
        String institusi = getIntent().getStringExtra(MainActivity.EXTRA_INSTITUSI);

        if (TextUtils.isEmpty(nama)) {
            tvNama.setText("Nama : ");
        } else {
            tvNama.setText("Nama : " + nama);
        }

        if (TextUtils.isEmpty(institusi)) {
            tvInstitusi.setText("Institusi : ");
        } else {
            tvInstitusi.setText("Institusi : " + institusi);
        }
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_pindah_activity3) {
            pindahActivity3();
        }
    }

    private void pindahActivity3() {
        String nama = tvNama.getText().toString();
        Intent moveIntentWithData = new Intent(SecondActivity.this, ThirdActivity.class);

        moveIntentWithData.putExtra(MainActivity.EXTRA_NAMA, nama);

        startActivity(moveIntentWithData);
    }
}