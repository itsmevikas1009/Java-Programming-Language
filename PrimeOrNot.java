public class PrimeOrNot {
    //Function to Check Number is Prime or Not
    public static boolean isPrime(int num){
        if(num == 2){
            return true;
        }

        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    //Function to Print Prime Number in Range
    public static void PrimeInRange(int n){
        for( int i = 2; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        int n = 100;
        System.out.println(isPrime(2));

        PrimeInRange(n);
    }
}
