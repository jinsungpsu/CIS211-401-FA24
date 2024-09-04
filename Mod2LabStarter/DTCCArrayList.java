public class DTCCArrayList {
    // don't worry about generics (yet)
    private int[] array;
    // instance variable for this
    // array.. is a ref var
    // therefore... there is no array

    private int size;

    //constructor
    public DTCCArrayList(int initialArraySize) {
        // size is for the initial size of the array
        array = new int[initialArraySize];
        size = 0;
    }

    public void add(int value) {
        /*This method adds the given integer value to the next available spot in the array. - If the array is full, display a message on the console to indicate that the list is full.
         */
    }

    public int get(int index) {
        /*This method returns the integer stored at the specified index. - If the index is out of bounds (i.e., less than 0 or greater than or equal to size), it should throw an IndexOutOfBoundsException.*/
    }


    public String toString() {
        /*
        This method returns a string representation of the list in the format: [element1, element2, ..., elementN]. - If the list is empty, it should return "[]".
         */
    }

}
