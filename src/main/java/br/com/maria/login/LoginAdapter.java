package br.com.maria.login;

import br.com.maria.user.User;

public class LoginAdapter implements LoginAuthenticate {

    private final Login login;

    public LoginAdapter(Login login) {
        this.login = login;
    }

    @Override
    public void authenticate(User user) {
        login.authenticate(user);
    }
}
