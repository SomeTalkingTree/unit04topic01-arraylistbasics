import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ArrayListUtilitiesTest {
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
    //@Test
    public void removeLongWord(){//This needs work, needs to return but assignment says no
        /* 
        ArrayList<String> input;
        ArrayList<String> actoutput;
        input = new ArrayList<>(Arrays.asList("Something", "I", "went", "to", "go", "see"));
        ArrayList<String> exoutput =new ArrayList<>(Arrays.asList( "I", "went", "to", "go", "see"));
        actoutput = ArrayListUtilities.removeLongWords(input);
        assertEquals(exoutput, actoutput); 
        */
    }

    public void reveredtest(){//Start on this one

    }
}
