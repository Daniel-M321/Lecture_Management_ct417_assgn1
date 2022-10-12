import java.util.ArrayList;

/**
 *
 * @author dan
 */
public class Student {
    private String name;
    private int age;
    private String dob;
    private static long id;
    private long studentId;
    private CourseProgramme course;
    private ArrayList<Module> modules = new ArrayList<>();

    public Student(String n, int age, String dob, CourseProgramme c, ArrayList<Module> m){
        this.name = n;
        this.age = age;
        this.dob = dob;
        this.course = c;
        this.modules = m;
        this.studentId = id++;
    }

    public String getUsername(){
        return this.name.replaceAll("\\s", "") + this.age;
    }

    public void updateAge(int age){
        this.age = age;
    }

    public void addModules(ArrayList<Module> modules){
        this.modules.addAll(modules);
    }

    public void removeModules(ArrayList<Module> modules){
        modules.forEach(module -> {
            this.modules.remove(module);
        });
    }

    public void updateCourse(CourseProgramme course){
        this.course = course;
    }

    public CourseProgramme getCourse() {
        return course;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public long getStudentId() {
        return studentId;
    }

}
