import java.util.Scanner;
public class UI{
    public static void main(String[] args) {
        calc calcu = new calc();

        int opc = 0;
        Scanner sc = new Scanner(System.in);

        while (opc < 4) {
            System.out.println("..::BIENVENIDO::..\n 1. Suma\n 2. Resta\n 3. Multiplicacion\n 4. Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese sus 2 valores (ingrese enter en cada valor)");
                    int n1 = sc.nextInt();
                    int n2 = sc.nextInt();
                    int n3 = calcu.suma(n1, n2);
                    System.out.println("La respuesta es: " + n3);
                    break;
                case 2:
                    System.out.println("Ingrese sus 2 valores (ingrese enter en cada valor)");
                    int n4 = sc.nextInt();
                    int n5 = sc.nextInt();
                    int n6 = calcu.resta(n4, n5);
                    System.out.println("La respuesta es: " + n6);
                    break;
                case 3:
                    System.out.println("Ingrese sus 2 valores (ingrese enter en cada valor)");
                    int n7 = sc.nextInt();
                    int n8 = sc.nextInt();
                    int n9 = calcu.multiplicacion(n7, n8);
                    System.out.println("La respuesta es: " + n9);
                    break;
                default:
                    break;
            }
        }
    }
}
