package com.example.seniordesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * MainActivity holds Login Screen, which user authenticates credentials to access payment app.
 */
public class MainActivity extends BaseActivity {

    @BindView(R.id.login_login_button)
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Listener for login button
     */
    @OnClick(R.id.login_login_button)
    public void onLoginButtonClicked() {
        // todo authenticate
        // todo switch to main fragment
    }
}
