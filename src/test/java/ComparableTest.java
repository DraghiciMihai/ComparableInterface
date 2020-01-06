import org.junit.Assert;
import org.junit.Test;

public class ComparableTest {

    @Test
    public void comparableTestForPatrat() {
        Patrat patrat1 = new Patrat(2);
        Patrat patrat2 = new Patrat(3);
        Assert.assertEquals(1, patrat2.compareTo(patrat1));
    }

    @Test
    public void comparableTestForPerson(){
        Person person1 = new Person(20);
        Person person2 = new Person(27);
        Assert.assertEquals(1, person2.compareTo(person1));
    }
}
