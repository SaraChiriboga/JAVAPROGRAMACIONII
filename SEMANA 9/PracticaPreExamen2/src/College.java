import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class College{
    private String name = "Universidad de las Américas";
    private String address = "Via a Nayón";
    private String phone= "22222222";
    //relaciones
    private List<Student> students = new ArrayList<>();
    private List <Department> departments = new ArrayList<>();

    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));



    //GETTERS Y SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    //metodos propios
    public void addStudent(Student student) throws IOException {
        System.out.printf("Nombre y apellido del estudiante: ");
        student.setName(sc.readLine());
        System.out.printf("Carrera: ");
        student.setCareer(sc.readLine());
        System.out.printf("ID: ");
        student.setStudentID(sc.readLine());
        System.out.printf("Edad: ");
        student.setAge(Integer.parseInt(sc.readLine()));
        System.out.printf("Direccion: ");
        student.setAddress(sc.readLine());
        System.out.printf("Telefono: ");
        student.setPhone(sc.readLine());

        System.out.println("Estudiante ingresado con éxito!");
        Student nuevo = new Student(student.getStudentID(), student.getName(), student.getAge(), student.getPhone(), student.getAddress(), student.getCareer());

        students.add(nuevo);
    }

    public void deleteStudent(Student student){
        students.remove(student);
    }

    public Student getStudent(int i){
        return students.get(i);
    }

    public void addDepartment(Department department) throws IOException {
        System.out.printf("Departamento: ");
        department.setName(sc.readLine());

        Department nuevo = new Department(department.getName());
        departments.add(nuevo);
    }

    public void deleteDepartment(Department department){
        departments.remove(department);
    }

    public Department getDepartment(int i){
        return departments.get(i);
    }

    //impresion de departamentos y estudiantes
    public void printStudents(){
        System.out.println("Nombre y apellido\tCarrera\tID del estudiante\tEdad\tDireccion\tTelefono");
        for (Student student: students){
            System.out.println(student.getName() + "\t" + student.getCareer() + "\t" + student.getStudentID() + "\t" + student.getAge() + "\t" + student.getAddress() + "\t" + student.getPhone());
        }
    }

    public void printDepartments(){
        System.out.println("Departamentos en la "+ getName() + ":");
        for (Department department : departments){
            System.out.println(department.getName());
        }
    }

    public Student searchStudent(String id){
        for (Student student : students)
            if (student.getStudentID().equals(id)) {
                return student;
            }else {System.out.println("No se encontró a ningún estudiante con aquel ID");;}
        return null;
    }
    public Department searchDepartment(String name){
        for (Department department : departments)
            if (department.getName().equals(name)) {
                return department;
            }else {System.out.println("No se encontró un departamento con aquel nombre");;}
        return null;
    }
}