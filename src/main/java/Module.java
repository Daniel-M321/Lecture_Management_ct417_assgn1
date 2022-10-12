import java.util.ArrayList;

/**
 *
 * @author dan
 */
public class Module {
    private String name;
    private static double id;
    private double moduleId;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<CourseProgramme> courses;
    private Lecturer lecturer;

    public Module(String n, ArrayList<CourseProgramme> courses, Lecturer l){
        this.name = n;
        this.courses = courses;
        this.lecturer = l;
        this.moduleId = id++;
    }

    public void addStudents(ArrayList<Student> students){
        this.students.addAll(students);
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public String getName() {
        return name;
    }

    public ArrayList<CourseProgramme> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<CourseProgramme> courses) {
        this.courses = courses;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

}
