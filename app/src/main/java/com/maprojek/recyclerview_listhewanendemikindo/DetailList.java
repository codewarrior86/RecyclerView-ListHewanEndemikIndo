package com.maprojek.recyclerview_listhewanendemikindo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailList extends AppCompatActivity {

    public static final String EXTRA_FOTO= "extra_foto";
    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_CONTENT = "extra_content";

    private String title = "Hewan Endemik Indonesia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list);
        setActionBarTitle(title);

        ImageView imgdet = findViewById(R.id.detail_foto);
        TextView namadet = findViewById(R.id.detail_nama);
        TextView contdet = findViewById(R.id.detail_content);

        int foto = getIntent().getIntExtra(EXTRA_FOTO,0);
        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        String content = getIntent().getStringExtra(EXTRA_CONTENT);

        imgdet.setImageResource(foto);
        namadet.setText(nama);
        contdet.setText(content);

    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }



}
