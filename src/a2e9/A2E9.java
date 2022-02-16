import java.util.Scanner;

public class A2E9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // definir variables
        int SumTemperatura1 = 0;
        int SumTemperatura2 = 0;
        int NumTem1 = 0;
        int NumTem2 = 0;
        float Promedio1;
        float Promedio2;
        int T1;
        int T2;
        boolean ciclo = true;

        //hacer un funcion que hasta el ciclo se salso se detenga 
        do {

            //pedir datos
            System.out.println("Ingrese el par de temperaturas 1");
            T1 = sc.nextInt();
            System.out.println("Ingrese el par de temperaturas 2");
            T2 = sc.nextInt();

            //ver si alguna temperatura cumple su funcion
            if (5 <= T1 & T1 <= 15) {
                SumTemperatura1 = SumTemperatura1 + T1;
                NumTem1 = NumTem1 + 1;
            }
            if (5 <= T2 & T2 <= 15) {
                SumTemperatura2 = SumTemperatura2 + T2;
                NumTem2 = NumTem2 + 1;
            }
            if (T1 == 0) {

                ciclo = false;

            }

        } while (ciclo != false);

        //hacer operaciones
        Promedio1 = (float) SumTemperatura1 / NumTem1;
        Promedio2 = (float) SumTemperatura2 / NumTem2;
        
        System.out.println("El promedio de T1 es: " + Promedio1);
        System.out.println("El promedio de T2 es: " + Promedio2);
    }

}
