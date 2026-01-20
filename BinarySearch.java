public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={4,3,2,6,2,9,11,67};
        int target=77;

        int low=0;
        int high=arr.length-1;

        while(low<high){
            int mid=(low+high)/2;

            if (arr[mid]==target){
                System.out.println("Element found at index:" +mid);
                return;
            }
            else if (arr[mid]<target){
                low=mid+1;

            }
            else {
                high=mid-1;
            }
        }
        System.out.println("Element not found");
    }
}
