package com.example.seniordesign;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * MainActivity holds Login Screen, which user authenticates credentials to access payment app.
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.login_login_button).setOnClickListener(loginButton);
    }

    View.OnClickListener loginButton = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, PostLoginActivity.class);
            startActivity(intent);
        }
    };
}
