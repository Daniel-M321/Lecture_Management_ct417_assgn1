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
public class LecturerTest {
    private Lecturer lecturer;

    @BeforeEach
    public void setUp() {
        this.lecturer = new Lecturer("Buck Buck", 42, "06/08/1980");
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
        System.out.println("Testing complete for Lecturer");
    }

    /**
     * Test of getUsername method, of class Lecturer.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        String expResult = "BuckBuck42";
        String result = this.lecturer.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of addModules & getModules methods, of class Lecturer.
     */
    @Test
    public void testAddModules() {
        System.out.println("addModules");
        CourseProgramme course = new CourseProgramme("ECE");
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        courses.add(course);

        Module module = new Module("Digital Systems 1", courses, this.lecturer);

        this.lecturer.addModule(module);

        Module expResult = module;
        Module result = this.lecturer.getModules().get(0);
        assertEquals(expResult, result);
    }

    /**
     * Test of getLecturerId method, of class Lecturer.
     */
    @Test
    public void testGetLecturerId() {
        System.out.println("getLecturerId");
        double expResult = 1;
        double result = this.lecturer.getLecturerId();
        assertEquals(expResult, result, 1);
    }
}