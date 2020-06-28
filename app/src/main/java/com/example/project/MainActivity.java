package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private String githubUserName = null;
    private String LinkedInUserName = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openGithub(View view) {
        String githubUrl = "https://github.com/AbhishekTilwar";
        if (!TextUtils.isEmpty(githubUserName)) {
            githubUrl = String.format("https://github.com/%s/", githubUserName);
        }
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(githubUrl));
        startActivity(intent);
    }
    public void openLinkedIn(View view) {
        String LinkedInUrl = "https://www.linkedin.com/in/abhishek-tilwar-84008b10b/";
        if (!TextUtils.isEmpty(LinkedInUserName)) {
            LinkedInUrl = String.format("https://www.linkedin.com/%s/", LinkedInUserName);
        }
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(LinkedInUrl));
        startActivity(intent);
    }
}