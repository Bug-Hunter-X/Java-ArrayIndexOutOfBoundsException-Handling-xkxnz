public class MyClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 10;

        try {
            if (index >= 0 && index < arr.length) {
                System.out.println(arr[index]);
            } else {
                System.out.println("Index out of bounds");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}