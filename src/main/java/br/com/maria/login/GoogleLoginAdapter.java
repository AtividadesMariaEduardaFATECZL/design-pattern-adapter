package br.com.maria.login;

import br.com.maria.user.User;

public class GoogleLoginAdapter implements LoginAuthenticate{
    private final GoogleLogin googleLogin;

    public GoogleLoginAdapter(GoogleLogin googleLogin) {
        this.googleLogin = googleLogin;
    }

    @Override
    public void authenticate(User user) {
        googleLogin.authenticate(user);
    }
}
