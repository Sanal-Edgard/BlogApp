package com.blogappSE.BlogAppSE.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.blogappSE.BlogAppSE.R;

public class RegisterActivity extends AppCompatActivity {
    ImageView regUserPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        regUserPhoto = findViewById(R.id.regUserPhoto);

        regUserPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}