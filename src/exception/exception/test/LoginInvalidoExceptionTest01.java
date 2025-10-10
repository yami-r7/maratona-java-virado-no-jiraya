package exception.exception.test;

import exception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "ssj";
        System.out.print("Usuário: ");
        String usuarioDigitado = scanner.nextLine();
        System.out.print("Senha: ");
        String senhaDigitada = scanner.nextLine();

        if (!usuarioDigitado.equals(usernameDB) || !senhaDigitada.equals(passwordDB)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos!");
        }

        System.out.println("Usuário logado com sucesso!");
    }
}
