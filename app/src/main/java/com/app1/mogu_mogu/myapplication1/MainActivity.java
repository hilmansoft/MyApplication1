package com.app1.mogu_mogu.myapplication1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nama,email;
    RadioButton lakilaki,perempuan;
    CheckBox hobi1,hobi2;
    Button buttonOk;

    public String infoBiodata(){
        String namaLengkap = nama.getText().toString();
        String alamatEmail = email.getText().toString();

        String jk = "";
            if (lakilaki.isChecked()){
                jk = "Laki-Laki";
            }else {
                jk = "Perempuan";
            }
        String hobi = "";
            if (hobi1.isChecked()){
                hobi += "Membaca";
            }else {
                hobi += "Main Game";
            }
        return "Nama : "+namaLengkap+
                "\n Email : "+alamatEmail+
                "\n Jenis Kelamin : "+jk+
                "\n Hobi : "+hobi;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        nama = (EditText)findViewById(R.id.eT_nama);
        email = (EditText)findViewById(R.id.eT_email);
        lakilaki = (RadioButton)findViewById(R.id.rB_l);
        perempuan = (RadioButton)findViewById(R.id.rB_p);
        hobi1 = (CheckBox)findViewById(R.id.cB_membaca);
        hobi2 = (CheckBox)findViewById(R.id.cB_main);
        buttonOk = (Button)findViewById(R.id.btn_ok);

        buttonOk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getBaseContext(),infoBiodata(),Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
