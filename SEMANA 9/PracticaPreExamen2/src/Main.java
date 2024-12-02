import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int op, op1, op2, op3;
        boolean repeat = true;
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        College udla = new College();
        Student estudiante = new Student(null, null, 0, null, null, null);
        Department department = new Department(null);
        Subject materia = new Subject(null, null);
        Professor professor = new Professor(null, null, null, null, null);

        while(repeat = true){
            System.out.println("Bienvenido al sistema de la " + udla.getName());
            System.out.println("1. Editar\n2. Visualizar\nRespuesta: ");
            op = Integer.parseInt(sc.readLine());

            if (op == 1){
                //EDITAR
                System.out.println("Editar informacion de: ");
                System.out.printf("1. Universidad\n2. Estudiantes\n3. Departamentos\nRespuesta: ");
                op1 = Integer.parseInt(sc.readLine());
                 if (op1 == 1){
                     System.out.printf("1. Agregar estudiante\n2. Eliminar estudiante\n3. Agregar departamento\n4. Eliminar departamento\nRespuesta: ");
                     op2 = Integer.parseInt(sc.readLine());
                     if (op2 == 1){
                         udla.addStudent(estudiante);
                     }
                     if (op2 == 2){
                         System.out.printf("Ingrese el ID del estudiante: ");
                         String id = sc.readLine();
                         udla.deleteStudent(udla.searchStudent(id));
                     }
                     if (op2 == 3){
                         udla.addDepartment(department);
                     }
                     if (op2 == 4){
                         System.out.printf("Ingrese el nombre del departamento: ");
                         String nombredepartamento = sc.readLine();
                         udla.deleteDepartment(udla.searchDepartment(nombredepartamento));
                     }
                 }

                 if (op1 == 2){
                     System.out.printf("Desea agregarle materias a un estudiante?\n1. SI\n2. NO\nRespuesta: ");
                     int siono = Integer.parseInt(sc.readLine());
                     if (siono == 1){
                         System.out.printf("Ingrese el ID del estudiante: ");
                         String id = sc.readLine();
                         udla.searchStudent(id).addSubjects(materia);
                     }
                 }

                 if (op1 == 3){
                     System.out.printf("1. Agregar profesor\n2. Eliminar profesor\nRespuesta: ");
                     op2 = Integer.parseInt(sc.readLine());
                     if (op2 == 1){
                         department.addProfesor(professor);
                     }
                     if (op2 == 2){
                         System.out.printf("Ingrese el ID del profesor: ");
                         String id = sc.readLine();
                         department.deleteProfessor(department.searchProfessor(id));
                     }
                 }
            }

            if (op == 2){
                System.out.println("Visualizar información de: ");
                System.out.printf("1. Universidad\n2. Estudiantes\n3. Departamentos\nRespuesta: ");
                op1 = Integer.parseInt(sc.readLine());
                if (op1 == 1){
                    System.out.printf("1. Ver estudiantes\n2. Ver departamentos\nRespuesta: ");
                    op2 = Integer.parseInt(sc.readLine());
                    if (op2 == 1){udla.printStudents();}else{udla.printDepartments();}
                }
                if (op1 == 2){
                    System.out.printf("Ingrese el ID del estudiante: ");
                    String id = sc.readLine();
                    udla.searchStudent(id).printSubjects();
                }
                if(op1 ==3){
                    System.out.println("Lista de profesores con sus departamentos: ");
                    department.printProfessors();
                }
            }

            System.out.printf("Desea volver al menu principal?:\n1. SI\n2. NO\nRespuesta: ");
            int mainmenu = Integer.parseInt(sc.readLine());
            if (mainmenu == 2){repeat = false;}
        }
    }
}
