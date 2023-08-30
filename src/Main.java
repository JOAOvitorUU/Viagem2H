public class Main {
    public static void main(String[] args) {
        // Classe objeto       Construtor
        Turista mochileiro = new Turista();
        //Denifir formato dos obejtos
        mochileiro.setNome("Liindsay");
        mochileiro.setCpf(Validacao.cpf("321"));
        Turista mochileira = new Turista("Maria");
        //Definir comportamento
       String retorno = mochileira.viajar();
        System.out.println(retorno);
    }
}