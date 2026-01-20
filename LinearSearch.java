public class LinearSearch {
    public static void main(String[] args){

        int[] arr= {2,4,6,8,9,7,5,3};
        int target=3;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Found on index:" +i);
                return;
            }
        }
        System.out.println("Not found");
    }

}
