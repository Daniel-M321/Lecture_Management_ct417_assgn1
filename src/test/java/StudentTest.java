import junit.framework.TestCase;
import java.util.ArrayList;


/**
 *
 * @author dan
 */
public class StudentTest extends TestCase {
    private Student student;
    private ArrayList<CourseProgramme> courses;

    public void setUp() {
        CourseProgramme course = new CourseProgramme("ECE");
        this.courses = new ArrayList<>();
        this.courses.add(course);

        ArrayList<Module> modules = new ArrayList<>();

        this.student = new Student("Paul McPaul", 24, "24/04/1998", course, modules);
    }

    public void tearDown() {
    }

    /**
     * Test of getUsername method, of class Student.
     */
    public void testGetUsername() {
        System.out.println("getUsername");

        String expResult = "PaulMcPaul24";
        String result = this.student.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of updateAge method, of class Student.
     */
    public void testUpdateAge() {
        System.out.println("updateAge");
        int age = 25;
        this.student.updateAge(age);

        String expResult = "PaulMcPaul25";
        String result = this.student.getUsername();
        assertEquals(expResult, result);

    }

    /**
     * Test of addModules & getModules methods, of class Student.
     */
    public void testAddModules() {
        System.out.println("addModules");
        Lecturer lecturer = null;

        Module module = new Module("Digital Systems 1", this.courses, lecturer);
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(module);

        this.student.addModules(modules);

        ArrayList<Module> expResult = modules;
        ArrayList<Module> result = this.student.getModules();
        assertEquals(expResult, result);
    }

    /**
     * Test of removeModules method, of class Student.
     */
    public void testRemoveModules() {
        System.out.println("removeModules");
        Lecturer lecturer = null;

        Module module = new Module("Digital Systems 1", this.courses, lecturer);
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(module);

        this.student.removeModules(modules);

        modules.clear();
        ArrayList<Module> expResult = modules;
        ArrayList<Module> result = this.student.getModules();
        assertEquals(expResult, result);
    }

    /**
     * Test of updateCourse & getCourse methods, of class Student.
     */
    public void testUpdateCourse() {
        System.out.println("updateCourse");
        CourseProgramme course = new CourseProgramme("EEE");
        this.student.updateCourse(course);

        CourseProgramme expResult = course;
        CourseProgramme result = this.student.getCourse();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStudentId method, of class Student.
     */
    public void testGetStudentId() {
        System.out.println("getStudentId");
        long expResult = 4;
        long result = this.student.getStudentId();
        assertEquals(expResult, result, 4);
    }
}