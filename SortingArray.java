public class SortingArray {
    public static void main(String[] args){
        int[] arr={1,2,3,5,4};

        boolean sorted=true;
        for(int j=1;j<arr.length;j++){
            if (arr[j] < arr[j-1]){
                sorted= false;
                break;
            }
        }
        System.out.println(sorted?"sorted":"not sorted");
    }
}
