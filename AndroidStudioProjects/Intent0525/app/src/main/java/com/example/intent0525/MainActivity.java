package com.example.intent0525;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnOK(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);

        switch (view.getId()) {
            case R.id.button:
                intent.setData(Uri.parse("mailto:u1065211@hk.edu.tw"));

                intent.putExtra(Intent.EXTRA_SUBJECT,"好久不見");
                intent.putExtra(Intent.EXTRA_TEXT,"你好嗎!");
                break;
            case R.id.button5:
                intent.setData(Uri.parse("http://www.mgs.ccut.edu.tw"));
                break;
            case R.id.button6:
                intent.setData(Uri.parse("https://www.google.com/maps/d/viewer?mid=1aMQs3CyNQaxWKy5GNn3MVC7Our0&msa=0&hl=zh-TW&brcurrent=3%2C0x3468d667dff87d05%3A0xaec9ecc5cf8196e6%2C0%2C0x3468d6aa1a5d49ad%3A0x1348fba95f17f6da&ie=UTF8&ll=23.856758236635986%2C120.92033399999998&spn=0.015661%2C0.018196&t=h&source=embed&z=15"));
                break;
            case R.id.button7:
                intent.setAction(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"中洲科技大學");
                break;
        }
        startActivity(intent);
    }
}
