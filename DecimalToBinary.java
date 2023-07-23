public class DecimalToBinary {
    public static void DeciToBin(int DeciNum){
        int myNum = DeciNum;
        int binNum = 0;
        int pow = 0;
        while(DeciNum > 0){
            int rem = DeciNum % 2;
            binNum += rem  * Math.pow(10,pow);
            pow++;
            DeciNum /= 2;
        }
        System.out.println("Binary of " + myNum + " = " + binNum);
    }

    public static void main(String[] args){
        DeciToBin(9);
    }
}
