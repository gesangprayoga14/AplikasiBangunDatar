package com.prayoga.gproyog.kalkulatordatarbangun;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMoveActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity1);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivity = findViewById(R.id.btn_move_activity2);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivity = findViewById(R.id.btn_move_activity3);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivity = findViewById(R.id.btn_move_activity4);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivity = findViewById(R.id.btn_move_activity5);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivity = findViewById(R.id.btn_move_activity6);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivity = findViewById(R.id.btn_move_activity7);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivity = findViewById(R.id.btn_move_activity8);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivity = findViewById(R.id.btn_move_activity9);
        btnMoveActivity.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity1:
                Intent moveIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(moveIntent);
                break;
        }
        switch (v.getId()) {
            case R.id.btn_move_activity2:
                Intent moveIntent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(moveIntent);
                break;
        }
        switch (v.getId()) {
            case R.id.btn_move_activity3:
                Intent moveIntent = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(moveIntent);
                break;
        }
        switch (v.getId()) {
            case R.id.btn_move_activity4:
                Intent moveIntent = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(moveIntent);
                break;
        }
        switch (v.getId()) {
            case R.id.btn_move_activity5:
                Intent moveIntent = new Intent(MainActivity.this, Main6Activity.class);
                startActivity(moveIntent);
                break;
        }
        switch (v.getId()) {
            case R.id.btn_move_activity6:
                Intent moveIntent = new Intent(MainActivity.this, Main7Activity.class);
                startActivity(moveIntent);
                break;
        }
        switch (v.getId()) {
            case R.id.btn_move_activity7:
                Intent moveIntent = new Intent(MainActivity.this, Main8Activity.class);
                startActivity(moveIntent);
                break;
        }
        switch (v.getId()) {
            case R.id.btn_move_activity8:
                Intent moveIntent = new Intent(MainActivity.this, Main9Activity.class);
                startActivity(moveIntent);
                break;
        }
        switch (v.getId()) {
            case R.id.btn_move_activity9:
                Intent moveIntent = new Intent(MainActivity.this, Main10Activity.class);
                startActivity(moveIntent);
                break;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.rate:
                String url = "https://play.google.com/store/apps/details?id=com.example.myapplicationb";
                Intent rateIntent = new Intent(Intent.ACTION_VIEW);
                rateIntent.setData(Uri.parse(url));
                startActivity(rateIntent);
                break;
            case R.id.share:
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hai! Download aplikasi saya di https://play.google.com/store/apps/details?id=com.example.myapplicationb");
                shareIntent.setType("text/plain");
                startActivity(shareIntent);
                break;
            case R.id.feedback:
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "gesangprayoga14@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");
                startActivity(Intent.createChooser(emailIntent, "Kirim email..."));
                break;
            case R.id.about_me:
                Intent aboutMeIntent = new Intent(MainActivity.this, AboutMeActivity.class);
                startActivity(aboutMeIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
