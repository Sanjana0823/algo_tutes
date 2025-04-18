package findMissing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author klaus
 */
public class FindMissing {

    /*
     * Find the smallest missing nonnegative value
     */
    public static int findMissing(ArrayList<Integer> numbers){
        return -1;  // Dummy value
    }

    public static ArrayList<Integer> createInput(int size, boolean shuffle){
        ArrayList<Integer> result = new ArrayList<>(size);
        for (int i = 0; i < size; i++)
            result.add(i);
        if (shuffle) 
            Collections.shuffle(result);
        return result;
    }

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // How many values to generate
        int numValues = 10; 
        // Whether to print data. Only use with small numbers of values.
        boolean printData = false; 
		// Whether to sort the data
		boolean sort = false;
        
        // Create some data, either sorted or unsorted
        ArrayList<Integer> data = createInput(numValues, true);
        // Optionally print the data (to check correctness)
        if(printData){
            System.out.print("Input values: ");
            for(int i=0;i<data.size(); i++)
                System.out.print(data.get(i) + " ");
            System.out.println();
        }

	if(sort)
            Collections.sort(data);
        
        // Run the find function; 
        // Check time before and after to measure runtime 
        long start = System.currentTimeMillis();
        int result = findMissing(data);
        long now = System.currentTimeMillis();
        double elapsed = (now - start) / 1000.0;
        if(result >= 0)
            System.out.println("Result: " + result + " (value: " + data.get(result) + ")");
        else
            System.out.println("Result: nothing found");
        System.out.println("Elapsed time = " + elapsed + " seconds");        

    }
  
}
