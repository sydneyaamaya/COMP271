/*
 * In the class below, write two methods:
 * 
 * First, method resize() to expand the existing array data by doubling its size.
 *
 * Second, method contains(String string) that returns true if String string already
 * exists in array data and false otherwise.
 *
 * Your code must have comments explaining what is done and why it is done in the
 * way you do it.
 *
 * DO NOT USE any tools that require to be imported, ie, do not use the import command.
 *
 * To save this assignment, make sure you commit your changes to your GitHub repository,
 * following the instructions in Sakai. IF YOU DO NOT COMMIT THE CHANGES, IT IS POSSIBLE THAT
 * YOUR WORK MAY BE LOST AND YOU MAY HAVE TO START ALL OVER AGAIN.
 */
public class DynamicArray {

    /** The underlying array for this object */
    private String[] data;

    /** Currently available position in array data */
    private int position;

    /** Constant with default size */
    private static final int DEFAULT_SIZE = 10;

    /**
     * Basic constructor for the object
     * @param size initial size of array data
     */
    public DynamicArray(int size) {
        this.data = new String[size];
        this.position = 0;
    } // basic constructor

    /** Default constructor */
    public DynamicArray() {
        this(DEFAULT_SIZE);
    } // default constructor

    /**
     * Adds a new item to array data after ensurig there is 
     * sufficient room by resizing the array if necessary.
     * @param string new item to add to array
     */
    public void add(String string) {
        // Make sure there is room in array data
        if (this.position == this.data.length) {
            resize(data);
        }
        // Now array has room for more elements.
        this.data[this.position] = string;
        this.position++;
    } // method add

    /**
      * This method takes an array and returns an array with
      * twice a many elements and contains the data of the
      * input array 
      * @param myArray 
      * To double array multiple length of parameter by 2
      * To put data stored in parameter array in new array
      * use for loop to iterate though param 
      */

    public static String[] resize(String [] data){
        String [] arrayTwo = new String [2 * data.length];
        for (int i = 0; i < data.length; i++){
            arrayTwo[i] = data[i];
        }
        return arrayTwo;
    }
    /**
     * This method iterates through the string and
     * matches each element with the string param
     * Return false if none of the elements match
     * and return true if there is a match 
     * @param String string 
     */
    public boolean contains(String string){
        int i = 0;
        boolean result = false;
        while (i < length && result == false){
            if (array[i] == string){
                result = true;
            }
        }
        return result;
    }

    /** countOf method counts the number of
     * times the string param appears in the 
     * array and returns an int
     * create int variable and use a for 
     * loop to iterate through data 
     * and count how many times 
     * string appears 
     */

     public int countOf(String string){
        int number = 0;
        for (int i = 0; i < data.length; i++){
            if (data[i].equals(string)){
                number++;
            }
        }
        return number;
     } 

} // class DynamicArray
