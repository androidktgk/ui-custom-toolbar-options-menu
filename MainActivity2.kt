package com.example.uidesigns

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity2 : AppCompatActivity() {
    lateinit var toolbar: Toolbar
    @SuppressLint("AppCompatMethod", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        toolbar=findViewById(R.id.toolbarMainActivity2)
        toolbar.title=""
        setSupportActionBar(toolbar)



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.favourite -> Toast.makeText(this,"Item Added To Favourite",Toast.LENGTH_SHORT).show()
            else -> Toast.makeText(this,"Nothing selected",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
