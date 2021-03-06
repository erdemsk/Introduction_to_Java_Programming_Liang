/* Introduction to Java Programming and Data Structures, Liang, 11th Edition,
7.6 Passing Arrays to Methods, 283*/
public class TestPassArray {
    public static void main(String[] args) {
        int[] a = {1, 2};

        //use the swap() method to swap the elements
        System.out.println("Before invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");

        //use the swapFirstTwoInArray() method to swap the elements
        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swapFirstTwoInArray(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    }

    //swap two variables
    public static void swap(int n1, int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    //swap the first two elements in the array
    public static void swapFirstTwoInArray(int[] array){
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
