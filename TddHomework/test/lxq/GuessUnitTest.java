package lxq;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Field;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GuessUnitTest {

    @InjectMocks
    private Guess guess = new Guess();

    @Mock
    private CompareNumber mockCompareNumber = new CompareNumber();

    @Mock
    private AnswerGenerator mockAnswerGenerator = new AnswerGenerator();

    @Before
    public void init() throws NoSuchFieldException, IllegalAccessException {
        Field f = guess.getClass().getDeclaredField("answer");
        f.setAccessible(true);
        f.set(guess, 1234);
    }

    @Test
    public void test_4A0B() {
        when(mockCompareNumber.compareToAnswer(1234, 1234)).thenReturn("4A0B");
        String result = guess.guessTheDigit(1234);
        assertTrue("4A0B".equals(result));
    }

    @Test
    public void test_0A4B() {
        when(mockCompareNumber.compareToAnswer(1234, 4321)).thenReturn("0A4B");
        String result = guess.guessTheDigit(4321);
        assertTrue("0A4B".equals(result));
    }

    @Test
    public void test_2A2B() {
        when(mockCompareNumber.compareToAnswer(1234, 1432)).thenReturn("2A2B");
        String result = guess.guessTheDigit(1432);
        assertTrue("2A2B".equals(result));
    }

}
