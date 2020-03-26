package com.org.yogi;

class BinarySearch {

    int binarySearch(int array[], int l, int arrayLength, int searchingElement)
    {
        if (arrayLength >= l) {
            int mid = l + (arrayLength - l) / 2;
            if (array[mid] == searchingElement)
                return mid;
            if (array[mid] > searchingElement)
                return binarySearch(array, l, mid - 1, searchingElement);
            return binarySearch(array, mid + 1, arrayLength, searchingElement);
        }

        return -1;
    }

    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int array[] = { 2, 3, 4, 10, 40,45 };
        int arrayLength = array.length;
        int searchingElement = 45;
        int result = ob.binarySearch(array, 0, arrayLength - 1, searchingElement);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}

