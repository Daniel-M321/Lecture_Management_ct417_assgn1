import junit.framework.TestCase;
import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author dan
 */
public class CourseProgrammeTest extends TestCase {
    public CourseProgramme course;
    public ArrayList<CourseProgramme> courses;
    private Lecturer lecturer;

    public void setUp() {
        this.course = new CourseProgramme("ECE");
        this.courses = new ArrayList<>();
        courses.add(this.course);

        this.lecturer = null;
    }

    public void tearDown() {
    }

    /**
     * Test of addStudents & getStudents methods, of class CourseProgramme.
     */
    public void testAddStudents() {
        System.out.println("addStudents");

        Module module = new Module("Digital Systems 1", this.courses, this.lecturer);
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(module);

        Student instance = new Student("Mickey", 22, "24/04/2000", this.course, modules);
        ArrayList<Student> students = new ArrayList<>();
        students.add(instance);

        this.course.addStudents(students);

        Student expResult = instance;
        Student result = course.getStudents().get(0);
        assertEquals(expResult, result);
    }

    /**
     * Test of setStartDate & getStartDate methods, of class CourseProgramme.
     */
    public void testSetStartDate() {
        System.out.println("setStartDate");
        DateTime date = new DateTime();;
        this.course.setStartDate(date);

        DateTime result = this.course.getStartDate();
        assertEquals(date, result);
    }

    /**
     * Test of setEndDate & getEndDate methods, of class CourseProgramme.
     */
    public void testSetEndDate() {
        System.out.println("setEndDate");
        DateTime date = new DateTime();;
        this.course.setEndDate(date);

        DateTime result = this.course.getEndDate();
        assertEquals(date, result);
    }

    /**
     * Test of getName method, of class CourseProgramme.
     */
    public void testGetName() {
        System.out.println("getName");
        String expResult = "ECE";
        String result = this.course.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of addModule & getModules methods, of class CourseProgramme.
     */
    public void testAddModule() {
        System.out.println("addModule");
        Module module = new Module("Digital Systems 1", this.courses, this.lecturer);

        this.course.addModule(module);

        ArrayList<Module> expResult = new ArrayList<Module>();
        expResult.add(module);

        ArrayList<Module> result = this.course.getModules();
        assertEquals(expResult, result);
    }
}