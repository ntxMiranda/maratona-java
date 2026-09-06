package academy.devdojo.maratonajava.introducao;

public class Aula05Condicionais {
    public static void main(String[] args) {

        int idade =  6 ;
        boolean autorizacao = idade >= 18;

        if (autorizacao) {
            System.out.println("pode comprar bebida alcólica");
        } else {
            System.out.println("não pode comprar bebida alcólica");
        }
        boolean c = false;
        if (c = true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("fora do if");
    }
}
