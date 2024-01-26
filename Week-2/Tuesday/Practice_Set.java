public class Practice_Set {
    public static void main(String[] args) {
        // Problem 1
        System.out.println("Problem 1");
        float[] numbers1 = { 2.5f, 3.0f, 1.8f, 4.2f, 5.5f };
        float sum1 = 0.0f;
        for (float number : numbers1) {
            sum1 += number;
        }
        System.out.println("Array elements:");
        for (float number : numbers1) {
            System.out.print(number + " ");
        }
        System.out.println("\nSum of the array elements: " + sum1);

        // Problem 2
        System.out.println("Problem 2");
        int[] numbers2 = { 4, 7, 2, 10, 5 };
        int targetNumber = 7;
        boolean isFound = false;
        for (int number : numbers2) {
            if (number == targetNumber) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println(targetNumber + " is present in the array.");
        } else {
            System.out.println(targetNumber + " is not present in the array.");
        }

        // Problem 3
        System.out.println("Problem 3");
        int[] physicsMarks = { 78, 89, 92, 65, 75, 88, 95, 82, 79, 70 };
        int sum2 = 0;
        for (int mark : physicsMarks) {
            sum2 += mark;
        }
        double average = (double) sum2 / physicsMarks.length;
        System.out.println("Physics Marks:");
        for (int mark : physicsMarks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage Marks in Physics: " + average);

        // Problem 4
        System.out.println("Problem 4");
        int[][] matrix1 = {
                { 2, 4, 6 },
                { 1, 3, 5 }
        };
        int[][] matrix2 = {
                { 3, 6, 9 },
                { 2, 5, 8 }
        };
        int[][] resultMatrix = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);
        System.out.println("Sum of Matrices:");
        displayMatrix(resultMatrix);

        // Problem 5
        System.out.println("Problem 5");
        int[] originalArray = { 1, 2, 3, 4, 5 };
        System.out.println("Original Array:");
        displayArray(originalArray);
        reverseArray(originalArray);
        System.out.println("Reversed Array:");
        displayArray(originalArray);

        // Problem 6
        System.out.println("Problem 6");
        int[] numbers = { 7, 2, 9, 4, 6, 1, 8, 5 };
        int maxElement = findMax(numbers);
        System.out.println("Array Elements:");
        displayArray(numbers);
        System.out.println("Maximum Element: " + maxElement);

        // Problem 7
        System.out.println("Problem 7");
        boolean isSorted = true;
        int[] arr = { 1, 12, 3, 4, 5, 34, 67 };
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The Array is sorted");
        } else {
            System.out.println("The Array is not sorted");
        }

    }

    static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void displayArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static int findMax(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty.");
        }
        int maxElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

}