import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.swing.text.StyledEditorKit;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
    }

    @Test
    public void testgetHamletData() {
        //Given
        //When
       String actual = hamletParser.getHamletData();
        //Then
        Assert.assertNotNull(actual);
    }

    @Test
    public void testChangeHamletToLeon() {
        //Given
        String oldStr = "Hamlet";
        String newStr = "Leon";
        //When
        Boolean actual = hamletParser.getHamletData(oldStr, newStr).contains(oldStr);
        //Then
        System.out.println(actual);
        Assert.assertFalse(actual);

    }

    @Test
    public void testChangeHoratioToTariq() {
        //Given
        String oldStr = "Horatio";
        String newStr = "Tariq";
        //When
        Boolean actual = hamletParser.getHamletData(oldStr, newStr).contains(oldStr);
        //Then
        System.out.println(actual);
        Assert.assertFalse(actual);
    }

}