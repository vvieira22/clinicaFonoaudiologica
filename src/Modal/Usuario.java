package Modal;

public class Usuario {
    
        private String login;
        private String senha;
        private String email;
        private String emailRecuperacao;
        private String dicaSenha;

    public Usuario(String login, String senha, String email, String emailRecuperacao, String dicaSenha) {
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.emailRecuperacao = emailRecuperacao;
        this.dicaSenha = dicaSenha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailRecuperacao() {
        return emailRecuperacao;
    }

    public void setEmailRecuperacao(String emailRecuperacao) {
        this.emailRecuperacao = emailRecuperacao;
    }

    public String getDicaSenha() {
        return dicaSenha;
    }

    public void setDicaSenha(String dicaSenha) {
        this.dicaSenha = dicaSenha;
    }
}
