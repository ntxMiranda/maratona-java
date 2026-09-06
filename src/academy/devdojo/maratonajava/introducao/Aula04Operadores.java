package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        double divisao = num1 / (double) num2;
        System.out.println(divisao);

        int rest = 20 / 3;
        System.out.println(rest);


        boolean comparacao1 = 10 > 20;
        boolean comparacao2 = 10 < 20;
        boolean comparacao3 = 10 == 20;
        boolean comparacao4 = 10 == 10;
        System.out.println(comparacao1);
        System.out.println(comparacao2);
        System.out.println(comparacao3);
        System.out.println(comparacao4);

        int idade = 340;
        float salario = 5000;
        boolean DentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean DentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("maior que 30 " + DentroDaLeiMaiorQueTrinta);
        System.out.println("Menor que 30 " + DentroDaLeiMenorQueTrinta);

        double ValorTotalConta = 200;
        double ValorTotalPoupanca = 10000;
        float ValorPlaystation = 5000F;

        boolean VideoGameCompravel = ValorTotalConta >=ValorPlaystation || ValorTotalPoupanca > ValorPlaystation;
        System.out.println("Compravel ou não " + VideoGameCompravel);

        double bonus = 1800;
        bonus += 1000;
        bonus -=1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        int contador = 0;
        contador ++;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2) ;
    }
}

