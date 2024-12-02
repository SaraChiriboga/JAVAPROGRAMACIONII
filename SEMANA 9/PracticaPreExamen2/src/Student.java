import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentID;
    private String name;
    private int age;
    private String phone;
    private String address;
    private String career;
    //relaciones
    private List<Subject> subjects = new ArrayList<>();

    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    public Student(String studentID, String name, int age, String phone, String address, String career) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.career = career;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String subjectID) {
        this.studentID = subjectID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //asignar materias
    public void addSubjects(Subject subject) throws IOException {
        System.out.printf("Nombre de la materia: ");
        subject.setName(sc.readLine());
        System.out.printf("Departamento: ");
        subject.setDepartment(sc.readLine());

        Subject nuevo = new Subject(subject.getName(), subject.getDepartment());
        subjects.add(nuevo);
    }

    //imprimir materias
    public void printSubjects(){
        System.out.println("============== Inscrito en estas clases ==============");
        for (Subject subject : subjects){
            System.out.println("---> " + subject.getName());
        }
    }

}
