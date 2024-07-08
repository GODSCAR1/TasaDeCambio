import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Consultar consultar = new Consultar();
        while(true){
            String sigla1 = "";
            String sigla2 = "";
            int numero;
            Scanner lectura = new Scanner(System.in);
            menu();

            try {
                numero = lectura.nextInt();
            }
            catch (Exception e){
                continue;
            }

            switch (numero) {
                case 1:
                    sigla1 = "USD";
                    sigla2 = "ARS";
                    break;

                case 2:
                    sigla1 = "ARS";
                    sigla2 = "USD";
                    break;

                case 3:
                    sigla1 = "USD";
                    sigla2 = "BRL";
                    break;

                case 4:
                    sigla1 = "BRL";
                    sigla2 = "USD";
                    break;

                case 5:
                    sigla1 = "USD";
                    sigla2 = "COP";
                    break;

                case 6:
                    sigla1 = "COP";
                    sigla2 = "USD";
                    break;
            }

            if(numero == 7){
                break;
            }

            System.out.println("Ingresa el valor que deseas convertir");
            double valor = lectura.nextDouble();
            Cambio consulta = consultar.ConsultaCambio(sigla1,sigla2,valor);

            System.out.println("El valor " + valor + "["+sigla1 +"]" + " corresponde al valor final de =>>> "+ consulta.conversion_result() + " [" +sigla2+ "]");
        }
        System.out.println("El programa a finalizado...");
    }

    public static void menu() {
        System.out.println("***********************");
        System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
        System.out.println("\n");
        System.out.println("1) Dólar =>> Peso argentino");
        System.out.println("2) Peso argentino =>> Dólar");
        System.out.println("3) Dólar =>> Real brasileño");
        System.out.println("4) Real brasileño =>> Dólar");
        System.out.println("5) Dólar =>> Peso colombiano");
        System.out.println("6) Peso colombiano =>> Dólar");
        System.out.println("7) Salir");
        System.out.println("Elija una opción válida");
        System.out.println("***********************");
    }

}