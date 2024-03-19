package com.example.myapplication.View;
//جهاد كمال حامد سيد g1
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements LoginView {
    private EditText etUsername;
    private EditText etPassword;
    private ProgressBar progressBar;

    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        progressBar = findViewById(R.id.progress_bar);

        presenter = new LoginPresenter(this);
    }

    public void onLoginClicked(View view) {
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();
        presenter.validateCredentials(username, password);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {
        etUsername.setError("Username required");
    }

    @Override
    public void setPasswordError() {
        etPassword.setError("Password required");
    }

    @Override
    public void navigateToHome() {
        // Navigate to home activity
    }
}
