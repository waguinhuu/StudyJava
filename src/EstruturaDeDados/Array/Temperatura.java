package EstruturaDeDados.Array;

public class Temperatura {
    public static void main(String[] args) {
        double[] temperaturas = new double[365];

        temperaturas[0] = 10;
        temperaturas[1] = 20;
        temperaturas[2] = 30;
        temperaturas[3] = 40;
        temperaturas[4] = 50;

        System.out.printf("O valor da temperatura 1 é: %.2f %n", temperaturas[0]);

        for (int i = 1; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura " + (i+1) + " é: " + temperaturas[i]);
        }

        for(double temp : temperaturas) {
            System.out.println(temp);
        }

    }
}
