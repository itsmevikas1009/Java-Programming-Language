public class BinaryToDecimal {
     public static void BinToDeci(int binNum){
         int pow = 0;
         int deciNum = 0;
         int myNum = binNum;
         while(binNum > 0){
             int lastD = binNum % 10;
             deciNum += lastD * Math.pow(2,pow);
             pow++;
             binNum /= 10;
         }
         System.out.println("Decimal of " + myNum + " = " + deciNum);
     }

     public static void main(String[] args){
         BinToDeci(101);
     }
}
