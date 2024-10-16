import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
    **Descripción del programa:**
     Realice un programa que simula un sistema básico de gestión educativa. Contiene tres clases:
     `Estudiante`, `Curso` y `Universidad`, cada una con atributos que representan sus características principales.
     Se implementan métodos `getter` y `setter` para acceder y modificar los atributos, así como tres constructores
     para crear instancias de cada clase de distintas maneras. Esto proporciona una base para la gestión de información
     académica en una institución.*/
public class Main {
    public static void main(String[] args) throws IOException {
        int i, cantidad, id;
        Estudiante student = new Estudiante(); //objetos generales
        Notas grades = new Notas();
        Universidad udla = new Universidad();
        String names, lastNames, banner, subject;
        Double n1, n2, n3, nfinal;
        String infoestudiantes, infonotas, infogeneral;
        String infoAcumulada = "", aux; //estas variables sirven para no confundirse
        //Scanner scan = new Scanner(System.in); //lector de la clase Scanner, propia de Java
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in)); //lector de la clase bufferedreader

        //preguntar la cantidad de estudiantes
        System.out.println("Ingrese la cantidad de estudiantes: ");
        //cantidad = scan.nextInt();
        cantidad = Integer.parseInt(rd.readLine());

        //ingreso de datos
        for(i = 0 ; i < cantidad ; i++){
            //DATOS DEL ESTUDIANTE
            System.out.println("Ingrese los nombres del estudiante " + (i + 1) + ":");
            student.Nombres = rd.readLine();
            names = student.Nombres;
            System.out.println("Ingrese los apellidos del estudiante " + (i + 1) + ":");
            student.Apellidos = rd.readLine();
            lastNames = student.Apellidos;
            System.out.println("ID Banner: ");
            student.banner = rd.readLine();
            banner = student.banner;
            System.out.println("Cedula de Identidad: ");
            student.CI = Integer.parseInt(rd.readLine());
            id = student.CI;

            //juntamos informacion de estudiante
            infoestudiantes = student.detallesEstudiante(udla.codigo, names, lastNames, banner, id);

            //DATOS DE CALIFICACIONES Y MATERIA
            System.out.println("Ingrese la materia que curso: ");
            grades.materia = rd.readLine();
            subject = grades.materia;
            System.out.println("Calificacion del 1er progreso: ");
            grades.N1 = Double.parseDouble(rd.readLine());
            n1 = grades.N1;
            System.out.println("Calificaion del 2do progreso: ");
            grades.N2 = Double.parseDouble(rd.readLine());
            n2 = grades.N2;
            System.out.println("Calificacion del 3er progreso: ");
            grades.N3 = Double.parseDouble(rd.readLine());
            n3 = grades.N3;
            nfinal = grades.notaFinal(n1, n2, n3);

            //juntamos informacion de sus calificaciones
            infonotas = grades.infoCalificaciones(subject, n1, n2, n3, nfinal);

            //INFORMACION DE TODO EL ESTUDIANTE JUNTA
            infogeneral = udla.udlaEstudiantes(infoestudiantes, infonotas);

            //acumulacion de informacion
            aux = infogeneral;
            infoAcumulada = infoAcumulada + aux + "\n";
        }

        //impresion de datos
        System.out.println("==============================================================================================================================================");
        System.out.println("Univesidad \t Nombres \t Apellidos \t Banner \t Cedula de Identidad \t Materia \t Nota 1 \t Nota 2 \t Nota 3 \t Nota final (Promedio)");
        System.out.println("==============================================================================================================================================");
        System.out.println(infoAcumulada);

        //devoré
    }
}