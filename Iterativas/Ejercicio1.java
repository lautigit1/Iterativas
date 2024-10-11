
        import java.util.Scanner;

        public class Ejercicio1 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String[] actividades = {"estudiar", "hacer ejercicios", "leer", "tiempo libre"};
                int totalHoras = 0;

                for (String actividad : actividades) {
                    System.out.println("Ingresa las horas dedicadas a " + actividad + ":");
                    int horas = scanner.nextInt();
                    totalHoras += horas;
                }

                System.out.println("El tiempo total dedicado es: " + totalHoras + " horas.");
            }
        }

