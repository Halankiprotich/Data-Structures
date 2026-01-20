public class BinarySearchRecursive {

    static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high) return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == key) return mid;
        else if (arr[mid] < key)
            return binarySearch(arr, mid + 1, high, key);
        else
            return binarySearch(arr, low, mid - 1, key);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int key = 9;

        int result = binarySearch(arr, 0, arr.length - 1, key);

        if (result != -1)
            System.out.println("Found at index: " + result);
        else
            System.out.println("Not found");
    }
}
