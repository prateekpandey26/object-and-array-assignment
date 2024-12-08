public class FindElementIndex {

    public static void main(String[] args) {
        // Initialize the integer array
        int[] numbers = {10, 20, 30, 40, 50};

        // Element to find
        int elementToFind = 30;

        // Variable to store the index
        int index = -1;  // Default value if element is not found

        // Loop through the array to find the index of the element
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == elementToFind) {
                index = i;  // Set the index when element is found
                break;  // Exit the loop once the element is found
            }
        }

        // Output the result
        if (index != -1) {
            System.out.println("Element " + elementToFind + " found at index: " + index);
        } else {
            System.out.println("Element " + elementToFind + " not found in the array.");
        }
    }
}
