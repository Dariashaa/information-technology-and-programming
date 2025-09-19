public class Primes{
    public static void main(String[] args){
        for (int j=1; j<100; j++){
            if (isPrime(j)){
                System.out.println(j);
            }
        }
    }
        
    public static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i=2; i<Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}