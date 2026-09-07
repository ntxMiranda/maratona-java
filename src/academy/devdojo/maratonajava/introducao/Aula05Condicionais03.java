package academy.devdojo.maratonajava.introducao;

public class Aula05Condicionais03 {
    public static void main(String[] args) {
        double sal = 5001;
        String msgNDoar = "Não vai doar (vai faltar grana no fim do mês)";
        String msgDoar = "Pode doar (ta com grana ein pai) >< ";
        String res = sal > 5000 ? msgDoar : msgNDoar;


        if (sal >= 5000) {
            res = msgDoar;
        } else {
            res = msgNDoar;
        }
        System.out.println(res);




    }
}
