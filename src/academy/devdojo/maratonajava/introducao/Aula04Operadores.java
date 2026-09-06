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

    }
}

