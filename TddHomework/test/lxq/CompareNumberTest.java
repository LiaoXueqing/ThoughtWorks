package lxq;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CompareNumberTest {
    private CompareNumber compareNumber = new CompareNumber();

    @Test
    public void should_0A0B_Return_0A0B() {
        assertEquals("0A0B", compareNumber.compareToAnswer(1234, 5678));
    }

    @Test
    public void should_1A0B_Return_1A0B() {
        assertEquals("1A0B", compareNumber.compareToAnswer(1234, 1756));
    }

    @Test
    public void should_2A0B_Return_2A0B() {
        assertEquals("2A0B", compareNumber.compareToAnswer(1234, 1536));
    }

    @Test
    public void should_3A0B_Return_3A0B() {
        assertEquals("3A0B", compareNumber.compareToAnswer(1234, 1034));
    }

    @Test
    public void should_4A0B_Return_4A0B() {
        assertEquals("4A0B", compareNumber.compareToAnswer(1234, 1234));
    }

    @Test
    public void should_0A1B_Return_0A1B() {
        assertEquals("0A1B", compareNumber.compareToAnswer(1234, 7389));
    }

    @Test
    public void should_1A1B_Return_1A1B() {
        assertEquals("1A1B", compareNumber.compareToAnswer(1234, 1356));
    }

    @Test
    public void should_2A1B_Return_2A1B() {
        assertEquals("2A1B", compareNumber.compareToAnswer(1234, 1354));
    }

    @Test
    public void should_0A2B_Return_0A2B() {
        assertEquals("0A2B", compareNumber.compareToAnswer(1234, 5326));
    }

    @Test
    public void should_1A2B_Return_1A2B() {
        assertEquals("1A2B", compareNumber.compareToAnswer(1234, 1326));
    }

    @Test
    public void should_2A2B_Return_2A2B() {
        assertEquals("2A2B", compareNumber.compareToAnswer(1234, 1243));
    }

    @Test
    public void should_0A3B_Return_0A3B() {
        assertEquals("0A3B", compareNumber.compareToAnswer(1234, 3126));
    }

    @Test
    public void should_1A3B_Return_1A3B() {
        assertEquals("1A3B", compareNumber.compareToAnswer(1234, 1342));
    }

    @Test
    public void should_0A4B_Return_0A4B() {
        assertEquals("0A4B", compareNumber.compareToAnswer(1234, 4123));
    }
}
