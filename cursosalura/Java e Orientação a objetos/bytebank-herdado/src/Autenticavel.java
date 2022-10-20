
// Definir um contrato, Autenticavel, quem assina esse contrato, precisa implementar os metodos setSenha e outro metodo autentica
public abstract interface Autenticavel {

    public abstract void setSenha(int senha);
    public abstract boolean autentica(int senha);

 }
