import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 *
 * @author dan
 */
public class CourseProgramme {
    private String name;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Student> students = new ArrayList<Student>();
    private DateTime startDate;
    private DateTime endDate;

    public CourseProgramme(String n){
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void addStudents(ArrayList<Student> students){
        this.students.addAll(students);
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void addModule(Module module){
        this.modules.add(module);
    }

    public ArrayList<Module> getModules() {
        return this.modules;
    }

    public void setStartDate(DateTime date){
        this.startDate = date;
    }

    public DateTime getStartDate(){
        return this.startDate;
    }

    public void setEndDate(DateTime date){
        this.endDate = date;
    }

    public DateTime getEndDate(){
        return this.endDate;
    }

}