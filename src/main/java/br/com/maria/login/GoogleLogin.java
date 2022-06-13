package br.com.maria.login;

import br.com.maria.user.User;

public class GoogleLogin {
    public void authenticate(User user) {
        System.out.println("Usuário " + user.getLogin() + " autenticado com login e senha, recibo por smartphone enviado");
    }
}
