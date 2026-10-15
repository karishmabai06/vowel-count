import org.junit.Test;
import static org.junit.Assert.assertEquals;
 
public class VowelCountTest {
    @Test
    public void testCountVowels() {
        VowelCount obj = new VowelCount();
        assertEquals(3, obj.countVowels("Hello World"));
    }
}
