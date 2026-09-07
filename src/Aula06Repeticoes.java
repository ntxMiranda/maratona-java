public class Aula06Repeticoes {
    public static void main(String[] args) {

       int count = 101;
        while (count < 100) {

            System.out.println(count);
            count++;
        }

        do {
            System.out.println("dentro do do-while");
        }while (count < 100) ;

        for (int i = 0 ; i < 10; i++ ) {
            System.out.println( "For " +i);
        }
    }
}
