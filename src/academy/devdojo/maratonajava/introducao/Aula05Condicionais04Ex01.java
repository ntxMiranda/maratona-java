package academy.devdojo.maratonajava.introducao;

public class Aula05Condicionais04Ex01 {
    public static void main(String[] args) {
        double salAnual = 70000;
        double PriFaixa = 9.7 / 100;
        double SegFaixa = 37.35 / 100;
        double TerFaixa = 49.50 / 100;
        double ValImposto;

        if (salAnual <= 34712) {
            ValImposto = salAnual * PriFaixa;
        } else if (salAnual >=34713 && salAnual <= 68507) {
            ValImposto = salAnual * SegFaixa;
        } else {
            ValImposto = salAnual * TerFaixa;
        }

        System.out.println(ValImposto);

    }
}
