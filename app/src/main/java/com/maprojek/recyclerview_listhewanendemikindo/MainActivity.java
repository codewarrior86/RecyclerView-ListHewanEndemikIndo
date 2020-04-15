package com.maprojek.recyclerview_listhewanendemikindo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvEndemik;
    private ArrayList<Endemik> list = new ArrayList<>();

    private String title = "Hewan Endemik Indonesia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvEndemik = findViewById(R.id.rv_endemik);
        rvEndemik.setHasFixedSize(true);
        list.addAll(EndemikData.getListData());

        rvEndemik.setLayoutManager(new LinearLayoutManager(this));
        ListEndemikAdapter listEndemikAdapter = new ListEndemikAdapter(list);
        rvEndemik.setAdapter(listEndemikAdapter);

        listEndemikAdapter.setOnItemClickCallback(new ListEndemikAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Endemik data) {
                showSelectedEndemik(data);

            }
        });

    }


    private void showSelectedEndemik(Endemik end) {
        //Toast.makeText(this, "Kamu memilih " + end.getNama(), Toast.LENGTH_SHORT).show();

        Intent move = new Intent(MainActivity.this,DetailList.class);
        move.putExtra(DetailList.EXTRA_FOTO,end.getFoto());
        move.putExtra(DetailList.EXTRA_NAMA,end.getNama());
        move.putExtra(DetailList.EXTRA_CONTENT,end.getDetail());
        startActivity(move);

    }

    //menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);

    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                Intent moveAbout = new Intent(MainActivity.this,About.class);
                startActivity(moveAbout);
                break;
        }
        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

}
