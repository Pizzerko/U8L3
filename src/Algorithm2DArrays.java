public class Algorithm2DArrays {
    /**
     * Return true if target is found at least once in arr; false otherwise.
     *
     * @param arr    2D array of ints
     * @param target target value to be searched for in arr
     * @return true if target is found at least once in arr; false otherwise
     */
    public static boolean isFound(int[][] arr, int target) { /* implement this method! */
    for(int[] list : arr) {
        for(int num : list) {
            if(num == target) return true;
        }
    }
    return false;
    }

    /** Return the number of elements in arr that contain searchStr as a substring
     *
     *  @param arr  2D array of Strings
     *  @param target  searchStr value to be searched for in each String of arr
     *  @return  the number of elements that contain searchStr as a substring
     */
    public static int countElementsWithSubstring(String[][] arr, String searchStr)

    { /* implement this method! */
        int count = 0;
    for(String[] list : arr) {
        for(String word : list) {
            if(word.contains(searchStr)) count++;
        }
    }
    return count;
    }

    /** Replaces all even integers in arr with 0; all odd integers are unchanged.
     *
     *  THIS METHOD MODIFIES THE ORIGINAL 2D ARRAY OBJECT!
     *
     *  @param arr  2D array of ints
     */
    public static void replaceEvensWithZero(int[][] arr)
    { /* implement this method! */
    for(int r = 0; r < arr.length; r++) {
        for(int c = 0; c < arr[0].length; c++) {
            int temp = arr[r][c];
            if(temp % 2 == 0) {
                arr[r][c] = 0;
            }
        }
    }
    }

    /** Return the sum of all elements of arr that are in the one particular row
     *
     *  @param arr  2D array of ints
     *  @param row  the row to add up
     *  @return  the sum of all elements in row
     *
     *  PRECONDITION:  0 <= row < arr.length (i.e. row will not cause out of bounds)
     */
    public static int sumForRow(int[][] arr, int row)
    { /* implement this method! */
        int sum = 0;
    int[] list = arr[row];
    for(int num : list) {
        sum += num;
    }
    return sum;
    }

    /** Return the sum of all elements of arr that are in the one particular column
     *
     *  @param arr  2D array of ints
     *  @param col  the column to add up
     *  @return  the sum of all elements in column
     *
     *  PRECONDITION:  0 <= col < arr[0].length (i.e. col will not cause out of bounds)
     */
    public static int sumForColumn(int[][] arr, int col)
    { /* implement this method! */
        int sum = 0;
        for(int r = 0; r < arr.length; r++) {
            sum += arr[r][col];
        }
        return sum;
    }

    /** Creates a 2D array of ints of size n x m, where n is number of rows and
     *  m is number of columns; the elements in the 2D array should be numbered 0
     *  through n x m - 1, with the numbers filled top to bottom, left to right.
     *  The method prints the 2D array "grid" of numbers, then finally returns
     *  the 2D array.
     *
     *  For example, for rows = 3 and cols = 4, this method should print
     *  (and return):
     *  0 1 2 3
     *  4 5 6 7
     *  8 9 10 11
     *
     *  Each element can be printed with a single space in between (no need to
     *  make it "look nice" unless you want to).
     *
     *  @param rows  number of rows
     *  @param cols  number of columns
     *  @return  the same 2D array "number grid" that gets printed by the method
     */
    public static int[][] printNumberGrid(int rows, int cols)
    { /* implement this method! */
    int num = 0;
    int[][] list = new int[rows][cols];
    for(int r = 0; r < list.length; r++) {
        for(int c = 0; c < list[0].length; c++) {
            list[r][c] = num;
            num++;
        }
    }
    return list;
    }
}