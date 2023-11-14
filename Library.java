// This is going to be a little library I use for projects in class, hopefully.
import java.util.Random;

public class Library {
    private static final String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789";
    
    public static void main(String[] args) 
    {        
        
    }

    /**
     * 
     * @param array array to sort alphabetically
     * @return sorted array
     */
    public static void alphabeticSort(String[] array)
    {
        for (int n = 0; n < array.length * array.length; n++)
        {
            for (int i = 0; i < array.length; i++)
            {
                try {
                    if (alphabet.indexOf(array[i].substring(0,1)) != -1 && alphabet.indexOf(array[i].substring(0,1)) > alphabet.indexOf(array[i+1].substring(0,1)))
                    {
                        String temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                    }
                }
                catch (Exception e) {}
            }
        }
    }

    
    /**
     * @param arraySize length of array to generate
     * @param minRange minimum range to generate
     * @param maxRange maximum range to generate
     * @return random int[] 
     */
    public static int[] randomIntArray(int arraySize, int minRange, int maxRange)
    {
        // Create an array to store random int numbers
        int[] randomNumbers = new int[arraySize];

        // Create a Random object
        Random random = new Random();

        // Fill the array with random int numbers in the specified range
        for (int i = 0; i < arraySize; i++) {
            // Using nextInt(int bound) to generate random int values within the range
            randomNumbers[i] = random.nextInt(maxRange - minRange + 1) + minRange;
        }
        
        return randomNumbers;
    }


    /**
     * 
     * @param array input array
     * @return string of nicely formatted int[]
     */
    public static String intArrayToString(int[] array)
    {
        String output = "";
        for (int i = 0; i < array.length; i++)
        {
            output+=array[i] + " | ";

        }
        return output;
    }

    /**
     * 
     * @param array input array
     * @return string of nicely formatted string[]
     */
    public static String stringArrayToString(String[] array)
    {
        String output = "";
        for (int i = 0; i < array.length; i++)
        {
            output+=array[i] + " | ";

        }
        return output;
    }

    /**
     * 
     * @param array array to get highest of
     * @return highest int in an array
     */
    public static int getHighest(int[] array)
    {
        int temp = 0;
        for (int i = 0; i<array.length; i++)
        {
            if (array[i] > temp)
            {
                temp = array[i];
            }
        }
        return temp;
    }

    /**
     * 
     * @param array array to get lowest of
     * @return lowest int in an array
     */
    public static int getLowest(int[] array)
    {
        int temp = array[0];
        for (int i = 0; i<array.length; i++)
        {
            if (array[i] < temp)
            {
                temp = array[i];
            }
        }
        return temp;
    }

    /**
     * 
     * @param array int[] array to sort
     */
    public static void sortIntegers(int[] array)
    {
        for (int n = 1; n<array.length*array.length; n++)
        {
            for (int i = 0; i < array.length; i++)
            {
                try
                {
                    if (array[i] > array[i+1])
                    {
                        int temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                    }
                    
                }
                catch (Exception e) {}
            }
        }
    }

    /**
     * switches the two input values, works for a few different data types
     * @param n1 value 1 
     * @param n2 value 2
     */ 
    public static void swap(int n1, int n2)
    {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
    public static void swap(String n1, String n2)
    {
        String temp = n1;
        n1 = n2;
        n2 = temp;
    }
    public static void swap(double n1, double n2)
    {
        double temp = n1;
        n1 = n2;
        n2 = temp;
    }
    public static void swap(boolean n1, boolean n2)
    {
        boolean temp = n1;
        n1 = n2;
        n2 = temp;
    }
    public static void swap(float n1, float n2)
    {
        float temp = n1;
        n1 = n2;
        n2 = temp;
    }
    public static void swap(char n1, char n2)
    {
        char temp = n1;
        n1 = n2;
        n2 = temp;
    }
    public static void swap(int[] n1, int[] n2)
    {
        int[] temp = n1;
        n1 = n2;
        n2 = temp;
    }
    public static void swap(String[] n1, String[] n2)
    {
        String[] temp = n1;
        n1 = n2;
        n2 = temp;
    }
    public static void swap(double[] n1, double[] n2)
    {
        double[] temp = n1;
        n1 = n2;
        n2 = temp;
    }

    
}
