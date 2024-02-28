import java.util.Scanner;

public class Estudiantes2 {
    String nombre;
    String matricula;
    double promedio;
    String email;

    public Estudiantes2(String nom, String mat, double prom, String em) {
        this.nombre = nom;
        this.matricula = mat;
        this.promedio = prom;
        this.email = em;
    }
   

   
    public String setygetNombre(String nom) {
        this.nombre = nom;
        return nombre;

        
    }

    public String setygetMatricula(String mat) {
        this.matricula = mat;
        return matricula;

    }


    public double setygetPromedio(double prom) {
        this.promedio = prom;
        return promedio;

    }

    

    public String setygetEmail(String em) {
        this.email = em;
        return email;
    }

    public void imprimirInformacion() {
        System.out.println("Nombres: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Promedio: " + promedio);
        System.out.println("Email: " + email);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = scanner.nextInt();
        scanner.nextLine(); 

        Estudiantes2[] estudiantes = new Estudiantes2[numEstudiantes];


        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1) + ":");

            System.out.print("Nombre: ");
            String nombres = scanner.nextLine();

            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();

            System.out.print("Promedio: ");
            double promedio = scanner.nextDouble();
            scanner.nextLine(); 
            
            System.out.print("Email: ");
            String email = scanner.nextLine();

            estudiantes[i] = new Estudiantes2(nombres, matricula, promedio, email);
        }
        System.out.print("\033[H\033[2J");

        System.out.flush();

        System.out.println("\nInformación de los estudiantes:");
        for (Estudiantes2 estudiante : estudiantes) {
            estudiante.imprimirInformacion();
        }

        scanner.close();
    }
}

