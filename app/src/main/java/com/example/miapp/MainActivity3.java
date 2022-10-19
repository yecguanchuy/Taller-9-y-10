package com.example.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private ImageButton _btn_link;
    String _url = "https://facebook.com";

    private ImageButton _btn_link2;
    String _url2 = "https://www.twitter.com";
    private ImageButton _btn_link3;
    String _url3 = "https://www.instagram.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        _btn_link = findViewById(R.id.btn_link);
        _btn_link2 = findViewById(R.id.btn_link2);
        _btn_link3 = findViewById(R.id.btn_link3);

        _btn_link.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v){
                Uri _link = Uri.parse(_url);
                Intent i = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(i);
            }
        });
        _btn_link2.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v){
                Uri _link = Uri.parse(_url2);
                Intent i = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(i);
            }
        });
        _btn_link3.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v){
                Uri _link = Uri.parse(_url3);
                Intent i = new Intent(Intent.ACTION_VIEW,_link);
                startActivity(i);
            }
        });
    }
    public  boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();

        if (id == R.id.item1){
            Toast.makeText(this, "Bienvenida", Toast.LENGTH_SHORT).show();
            Intent item1 = new Intent( this, MainActivity.class);
            startActivity(item1);

        }else if (id == R.id.item2){
            Toast.makeText(this, "Creado por..", Toast.LENGTH_SHORT).show();
            Intent item2 = new Intent( this, MainActivity2.class);
            startActivity(item2);
        }else if (id == R.id.item3){
            Toast.makeText(this, "Iconos de redes", Toast.LENGTH_SHORT).show();
            Intent item3 = new Intent( this, MainActivity3.class);
            startActivity(item3);
        }
        return super.onOptionsItemSelected(item);

    }
}