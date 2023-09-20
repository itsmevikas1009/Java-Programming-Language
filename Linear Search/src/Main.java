public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 43, 56, 4, 44, 76, 98, 23, 12, 92};
        int target = 76;
        int ans = linearSearch(nums, target);
        int ans2 = linearSearch2(nums, target);
        boolean ans3 = linearSearch3(nums, target);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }
    //Search in the array: return the index if item found
    //Otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }

        //this line will execute if none of the return statement above executed
        //hence the target not found
        return -1;
    }

    //Search the target and return element
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        //this line will execute if none of the return statement above executed
        //hence the target not found
        return Integer.MAX_VALUE;
    }

    //Search the target and return true or false
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        //this line will execute if none of the return statement above executed
        //hence the target not found
        return false;
    }
}