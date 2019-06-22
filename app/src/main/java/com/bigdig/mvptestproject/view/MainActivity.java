package com.bigdig.mvptestproject.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.bigdig.mvptestproject.R;
import com.bigdig.mvptestproject.model.User;
import com.bigdig.mvptestproject.presenter.UserPresenter;

public class MainActivity extends AppCompatActivity
                            implements UserView {

    private TextView userTextView;
    private UserPresenter mUserPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userTextView = findViewById(R.id.user_text_view);


        mUserPresenter = new UserPresenter(this);
    }

    @Override
    public void displayUser(User u) {
        userTextView.setText(String.format("Id: %d; Login: %s; Email: %s; Password: %s",
                u.getId(), u.getLogin(), u.getEmail(), u.getPassword()));
    }
}
