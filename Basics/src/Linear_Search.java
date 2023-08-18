public class Linear_Search {
    public static int Linear_Search(int num[] , int key){
        for(int i = 0; i < num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 10;

        int index = Linear_Search(numbers,key);
        if(index == -1){
            System.out.println("Not Found");
        } else {
            System.out.println("key is at index " + index);
        }
    }
}
