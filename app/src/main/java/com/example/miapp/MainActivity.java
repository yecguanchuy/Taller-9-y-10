package com.example.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            Toast.makeText(this, "Bienvenida", Toast.LENGTH_SHORT).show();
            Intent item3 = new Intent( this, MainActivity3.class);
            startActivity(item3);
        }
        return super.onOptionsItemSelected(item);

    }
}