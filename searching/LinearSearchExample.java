public class LinearSearchExample {

    static int search(int array[],int searchingElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchingElement)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 1, 7, 5};
        int searchingElement = 10;

        int index = search(array,searchingElement);
        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index);
    }
}

