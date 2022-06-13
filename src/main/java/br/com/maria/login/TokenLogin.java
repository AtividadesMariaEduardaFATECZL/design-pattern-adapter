package br.com.maria.login;

import br.com.maria.user.User;

public class TokenLogin {
    public void authenticate(User user) {
        System.out.println("Usuário autenticado com o token " + user.getToken());
    }
}
