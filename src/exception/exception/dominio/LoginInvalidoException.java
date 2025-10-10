package exception.exception.dominio;

public class LoginInvalidoException extends RuntimeException {
    public LoginInvalidoException(String message) {
      super(message);
    }

  public LoginInvalidoException() {
      super("Login Inválido");
  }
}
