import java.util.Scanner;
public class MetododsNum {

    public static void main(String[] args) {
         double valorR, valorA;
        Scanner ol = new Scanner(System.in);
        System.out.print("Ingrese el valor real: ");
        valorR = ol.nextDouble();
        System.out.print("Ingrese el valor aproximado: ");
        valorA = ol.nextDouble();
        Errores E = new Errores(valorR, valorA);
        System.out.println("_______________________________________________________________");
        System.out.println("El error absoluto es: " + E.ErrorAbsoluto());
        System.out.println("El error relativo es; " + E.ErrorRelativo());
        System.out.println("El error relativo porcentual es; " + E.ErrorRelativoPorcentual() + "%");
        System.out.println("_______________________________________________________________");
    }
}
    class Errores {
    private double valorReal;
    private double valorAproximado;
      public Errores(double vRe, double vaAp) {
        valorReal = vRe;
        valorAproximado = vaAp;
    }

 double ErrorAbsoluto() {
        double ErrorR = Math.abs(valorReal-valorAproximado);
        return ErrorR;
    }
 double ErrorRelativo() {
        double ErrorA = (ErrorAbsoluto()) / valorReal;
        return ErrorA;
    }
    double ErrorRelativoPorcentual() {
        double ErrorRP = (ErrorRelativo()) * 100;
        return ErrorRP;
    }
}
    
    

