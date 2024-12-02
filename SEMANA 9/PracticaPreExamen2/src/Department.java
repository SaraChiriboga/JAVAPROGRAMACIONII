import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    //relaciones
    private List<Professor> professors = new ArrayList<>();
    private List<Subject> subjects = new ArrayList<>();

    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    public Department(String name) {
        this.name = name;
    }

    //GETTERS Y SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //METODO PROPIOS
    public void addProfesor(Professor professor) throws IOException {
        System.out.printf("Nombre y apellido: ");
        professor.setName(sc.readLine());
        System.out.printf("ID: ");
        professor.setID(sc.readLine());
        System.out.printf("Departamento: ");
        professor.setDepartment(sc.readLine());
        System.out.printf("Correo electronico: ");
        professor.setEmail(sc.readLine());
        System.out.printf("Phone: ");
        professor.setPhone(sc.readLine());

        Professor nuevo = new Professor(professor.getName(), professor.getID(), professor.getEmail(), professor.getPhone(), professor.getDepartment());
        professors.add(nuevo);
    }

    public void deleteProfessor(Professor professor){
        professors.remove(professor);
    }

    public Professor getProfessor(int i){
        return professors.get(i);
    }

    public Professor searchProfessor(String id){
        for (Professor professor : professors)
            if (professor.getName().equals(id)) {
                return professor;
            }else {System.out.println("No se encontró un profesor con aquel nombre");;}
        return null;
    }

    public void printProfessors(){
        for(Professor professor : professors){
            System.out.println(professor.getName() + "\t" + professor.getDepartment());
        }
    }
}
