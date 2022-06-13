package br.com.maria.login;

import br.com.maria.user.User;

public class SSOLoginAdapter implements LoginAuthenticate{
    private final TokenLogin tokenLogin;

    public SSOLoginAdapter(TokenLogin tokenLogin) {
        this.tokenLogin = tokenLogin;
    }

    @Override
    public void authenticate(User user) {
        tokenLogin.authenticate(user);
    }
}
