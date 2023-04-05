import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ArrayListUtilitiesTest {
    public ArrayList<String> input1= new ArrayList<>(Arrays.asList("Something", "I", "went", "to", "go", "see"));





    @Test
    public void testGetListMax() {//This test works
        ArrayList<Integer> input;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        input = new ArrayList<>(Arrays.asList(1, 5, 4, 9, 2, 1));
        expectedOutput = 9;
        actualOutput = ArrayListUtilities.getListMax(input);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void withoutLongWord(){//This test works
        ArrayList<String> input;
        input = new ArrayList<>(Arrays.asList("Something", "I", "went", "to", "go", "see"));
        ArrayList<String> exoutput =new ArrayList<>(Arrays.asList( "I", "went", "to", "go", "see"));
        ArrayList<String> actoutput = ArrayListUtilities.withoutLongWords(input);
        assertEquals(exoutput, actoutput);
    }
   // @Test
    public void removeLongWord(){//This needs work, needs to return but assignment says no
         
        
        //ArrayList<String> actoutput;
        
        ArrayList<String> exoutput =new ArrayList<>(Arrays.asList( "I", "went", "to", "go", "see"));
        //actoutput = ArrayListUtilities.removeLongWords(input);
        assertEquals(exoutput, input1); 
        
    }
    @Test
    public void reveredtest(){//Start on this one
        ArrayList<Double> input;
        input = new ArrayList<>(Arrays.asList(612.2,0.55,48.23,11.202,963.25));
        
        ArrayList<Double> exoutput =new ArrayList<>(Arrays.asList(963.25,11.202,48.23,0.55,612.2));
        ArrayList<Double> actoutput = ArrayListUtilities.reversed(input);
        assertEquals(exoutput, actoutput);
    }

    @Test
    public void reverseinPlacetest(){
        
    }
}
