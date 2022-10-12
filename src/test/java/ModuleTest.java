import junit.framework.TestCase;
import java.util.ArrayList;


/**
 *
 * @author dan
 */
public class ModuleTest extends TestCase {
    private Module module;

    public void setUp() {
        Lecturer lecturer = null;
        ArrayList<CourseProgramme> courses = new ArrayList<>();

        this.module = new Module("Digital Systems 1", courses, lecturer);
    }

    public void tearDown() {
    }

    /**
     * Test of addStudents method, of class Module.
     */
    public void testAddStudents() {
        System.out.println("addStudents");
        CourseProgramme course = null;
        ArrayList<Module> modules = new ArrayList<>();

        Student instance = new Student("Mickey", 22, "24/04/2000", course, modules);
        ArrayList<Student> students = new ArrayList<>();
        students.add(instance);

        this.module.addStudents(students);

        ArrayList<Student> expResult = students;
        ArrayList<Student> result = module.getStudents();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Module.
     */
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Digital Systems 1";
        String result = this.module.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourses & getCourses methods, of class Module.
     */
    public void testSetCourses() {
        System.out.println("setCourses");
        CourseProgramme course = new CourseProgramme("ECE");
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        courses.add(course);

        this.module.setCourses(courses);

        ArrayList<CourseProgramme> expResult = courses;
        ArrayList<CourseProgramme> result = this.module.getCourses();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLecturer & getLecturer methods, of class Module.
     */
    public void testSetLecturer() {
        System.out.println("setLecturer");
        Lecturer lecturer = new Lecturer("Buck", 42, "06/08/1980");
        this.module.setLecturer(lecturer);

        Lecturer expResult = lecturer;
        Lecturer result = this.module.getLecturer();
        assertEquals(expResult, result);
    }
}