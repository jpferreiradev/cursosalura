public class Contato {


    private static int contador = 0;

    private String nome;
    private String telefone;
    private int  identificador;
    private String email;

    public Contato(){
        contador++;
        identificador = contador;
    }



    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public int getIdentificador(){
        return this.identificador;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        String s = "[";
        s += "Identificador: " + identificador;
        s += ", Nome: " + nome;
        s += ", Telefone: " + telefone;
        s += ", Email: " + email;
        s += " ]";
        return s;
    }
}
