package lxq;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class CompareNumberTest {
    private CompareNumber compareNumber = new CompareNumber();
    /**
     * 0A0B 1A0B 2A0B 3A0B 4A0B
     * 0A1B 1A1B 2A1B
     * 0A2B 1A2B 2A2B
     * 0A3B 1A3B
     * 0A4B
     */
    @Test
    public void should_0A0B_Return_0A0B(){
        Assert.assertEquals("0A0B",compareNumber.compareToAnswer(1234,5678));
//        assertThat("0A0B",is(compareNumber.compareToAnswer(1234,5678)));
    }
    @Test
    public void should_1A0B_Return_1A0B(){
        assertThat("1A0B",is(compareNumber.compareToAnswer(1234,1756)));
    }
    @Test
    public void should_2A0B_Return_2A0B(){
        assertThat("2A0B",is(compareNumber.compareToAnswer(1234,1536)));
    }
    @Test
    public void should_3A0B_Return_3A0B(){
        assertThat("3A0B",is(compareNumber.compareToAnswer(1234,1034)));
    }
    @Test
    public void should_4A0B_Return_4A0B(){
        assertThat("4A0B",is(compareNumber.compareToAnswer(1234,1234)));
    }
    @Test
    public void should_0A1B_Return_0A1B(){
        assertThat("0A1B",is(compareNumber.compareToAnswer(1234,7389)));
    }
    @Test
    public void should_1A1B_Return_1A1B(){
        assertThat("1A1B",is(compareNumber.compareToAnswer(1234,1356)));
    }
    @Test
    public void should_2A1B_Return_2A1B(){
        assertThat("2A1B",is(compareNumber.compareToAnswer(1234,1354)));
    }
    @Test
    public void should_0A2B_Return_0A2B(){
        assertThat("0A2B",is(compareNumber.compareToAnswer(1234,5326)));
    }
    @Test
    public void should_1A2B_Return_1A2B(){
        assertThat("1A2B",is(compareNumber.compareToAnswer(1234,1326)));
    }
    @Test
    public void should_2A2B_Return_2A2B(){
        assertThat("2A2B",is(compareNumber.compareToAnswer(1234,1243)));
    }
    @Test
    public void should_0A3B_Return_0A3B(){
        assertThat("0A3B",is(compareNumber.compareToAnswer(1234,3126)));
    }
    @Test
    public void should_1A3B_Return_1A3B(){
        assertThat("1A3B",is(compareNumber.compareToAnswer(1234,1342)));
    }
    @Test
    public void should_0A4B_Return_0A4B(){
        assertThat("0A4B",is(compareNumber.compareToAnswer(1234,4123)));
    }
}
