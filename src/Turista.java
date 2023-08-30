public class Turista {
    //Atributos
    private String Nome;
    private String cpf;

   //metodos
    public String viajar(){
        return "Viajando....";
    }
    //Construtor Padrao
    Turista(){

    }

    //Construtor
    Turista(String _nome){
        this.Nome = _nome;
    }
    //encapsulamento - getters and setters

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
