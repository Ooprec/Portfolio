// This is going to be a little library I use for projects in Data Structures, hopefully.
import java.util.ArrayList;
import java.util.Random;

public class Library {
    public static int[] intArray = {10,9,88,7,6,5,4,3,2,1};

    private static final String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789";
    public static void main(String[] args) {        
        
    int[] randomNumbers = randomIntArray(20,1,20);

    // System.out.println(intArrayToString(randomNumbers));
    // sortIntegers(randomNumbers);
    // System.out.println(intArrayToString(randomNumbers));
    String[] randomWords = {
        "Elephant",
        "Sunshine",
        "Harmony",
        "Cascade",
        "Lighthouse",
        "Whimsical",
        "Serendipity",
        "Enchanting",
        "Tranquil",
        "Meadow"
    };

    System.out.println(stringArrayToString(randomWords));
    alphabeticSort(randomWords);
    System.out.println(stringArrayToString(randomWords));

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
                catch (Exception e)
                {

                }
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




}