import java.util.ArrayList;

/**
 *
 * @author dan
 */
public class Lecturer {
    private String name;
    private int age;
    private String dob;
    private static long id;
    private long lecturerId;
    private String username;
    private ArrayList<Module> modules = new ArrayList<Module>();;

    public Lecturer(String n, int age, String dob){
        this.name = n;
        this.age = age;
        this.dob = dob;
        this.lecturerId = id++;
    }

    public String getUsername(){
        this.username = this.name.replaceAll("\\s", "") + this.age;
        return this.username;
    }

    public void addModule(Module module){
        this.modules.add(module);
    }

    public ArrayList<Module> getModules(){
        return this.modules;
    }

    public long getLecturerId() {
        return lecturerId;
    }

}
