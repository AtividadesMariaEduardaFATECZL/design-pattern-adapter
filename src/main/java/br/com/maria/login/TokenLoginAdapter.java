package br.com.maria.login;

import br.com.maria.user.User;

public class TokenLoginAdapter implements LoginAuthenticate{
    private final TokenLogin tokenLogin;

    public TokenLoginAdapter(TokenLogin tokenLogin) {
        this.tokenLogin = tokenLogin;
    }

    @Override
    public void authenticate(User user) {
        tokenLogin.authenticate(user);
    }
}
