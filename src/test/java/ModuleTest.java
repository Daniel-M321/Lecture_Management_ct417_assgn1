import org.junit.jupiter.api.*;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 *
 * @author dan
 */
public class ModuleTest {
    private Module module;

    @BeforeEach
    public void setUp() {
        Lecturer lecturer = null;
        ArrayList<CourseProgramme> courses = new ArrayList<>();

        this.module = new Module("Digital Systems 1", courses, lecturer);
    }

    @AfterEach
    public void tearDown() {
    }

    @BeforeAll
    public static void setUpClass() {
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("Testing complete for Module");
    }

    /**
     * Test of addStudents method, of class Module.
     */
    @Test
    public void testaddStudents() {
        System.out.println("addStudents");
        Lecturer lecturer = null;
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
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Digital Systems 1";
        String result = this.module.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourses & getCourses methods, of class Module.
     */
    @Test
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
    @Test
    public void testSetLecturer() {
        System.out.println("setLecturer");
        Lecturer lecturer = new Lecturer("Buck", 42, "06/08/1980");
        this.module.setLecturer(lecturer);

        Lecturer expResult = lecturer;
        Lecturer result = this.module.getLecturer();
        assertEquals(expResult, result);
    }
}