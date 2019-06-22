package com.bigdig.mvptestproject.presenter;

import com.bigdig.mvptestproject.model.User;
import com.bigdig.mvptestproject.view.UserView;

public class UserPresenter {
    private UserView userView;
    private User currentUser;

    public UserPresenter(UserView userView) {
        this.userView = userView;

        currentUser = new User(0, "santoni7",
                "bigdig.904@gmail.com", "password");

        this.userView.displayUser(currentUser);
    }

    public void changeUser(User currentUser){
        this.currentUser = currentUser;

    }
}
