package academy.devdojo.maratonajava.introducao;

public class Aula06Repeticoes02 {
    public static void main(String[] args) {
        int num = 0;

//        while (num < 1000000) {
//            num++;
//            System.out.println(num);
//
//        }

        for (int i = 3; i <= 1000000; i++) {
            if (i % 2 == 0){
                System.out.println("par   " + i);
            } else{
                System.out.println("impar " + i);
            }



        }
    }
}
