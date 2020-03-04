import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Test;

public class PrepareMyBagTest {
FirstDayAtSchool school;
String[] bag = {"Books","Notebooks","Pens"};
@Before
public void setUp() throws Exception {
	System.out.println("Intialising"); 
	school = new FirstDayAtSchool();
}
@Test
public void PrepareMyBag() {
	System.out.println("Inside testPrepareMyBag()");
	assertArrayEquals(bag,school.PrepareMyBag());
};
@Test
public void testCheckMyName()
{System.out.println("Inside test check name()");
school.checkmyName("Tilaka");
assertTrue(school.res);
}

}
