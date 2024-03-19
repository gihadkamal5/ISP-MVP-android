package com.example.myapplication.Presenter;

import android.os.Handler;

public class LoginPresenter {
    private LoginView view;
    private UserModel userModel;

    public LoginPresenter(LoginView view) {
        this.view = view;
        this.userModel = new UserModel();
    }

    public void validateCredentials(String username, String password) {
        if (username.isEmpty()) {
            view.setUsernameError();
            return;
        }

        if (password.isEmpty()) {
            view.setPasswordError();
            return;
        }

        // Simulate login process
        view.showProgress();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.hideProgress();
                view.navigateToHome();
            }
        }, 2000);
    }
}

