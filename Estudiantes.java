import java.util.Scanner;

public class Estudiantes {
    String nombre;
    String matricula;
    double promedio;
    String email;

    public Estudiantes(String nom, String mat, double prom, String em) {
        this.nombre = nom;
        this.matricula = mat;
        this.promedio = prom;
        this.email = em;
    }
   

    public String getNombres() {
        return nombre;
    }

    public void setNombres(String nom) {
        this.nombre = nom;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String mat) {
        this.matricula = mat;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double prom) {
        this.promedio = prom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String em) {
        this.email = em;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
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

        Estudiantes[] estudiantes = new Estudiantes[numEstudiantes];


        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1) + ":");

            System.out.print("Nombres: ");
            String nombres = scanner.nextLine();

            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();

            System.out.print("Promedio: ");
            double promedio = scanner.nextDouble();
            scanner.nextLine(); 
            
            System.out.print("Email: ");
            String email = scanner.nextLine();

            estudiantes[i] = new Estudiantes(nombres, matricula, promedio, email);
        }
        System.out.print("\033[H\033[2J");

        System.out.flush();

        System.out.println("\nInformación de los estudiantes:");
        for (Estudiantes estudiante : estudiantes) {
            estudiante.imprimirInformacion();
        }

        scanner.close();
    }
}


