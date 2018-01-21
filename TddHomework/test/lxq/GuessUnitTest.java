package lxq;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GuessUnitTest {
    private Guess guess = new Guess();
    @Test
    public void testTheResult(){
        String result=guess.guessTheDigit(5782);
        String[] resultCollection = {"0A0B","1A0B","2A0B","3A0B","4A0B","0A1B","1A1B","2A1B","0A2B","1A2B","2A2B","0A3B","1A3B","0A4B"};
        boolean flag = false;
        for(int i=0;i<resultCollection.length;i++){
            if(resultCollection[i]==result||resultCollection[i].equals(result)){
                flag = true;
            }
        }
        assertThat(true,is(flag));
    }
}
