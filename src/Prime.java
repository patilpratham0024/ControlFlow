public class Prime {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 10; count < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
            }
        }
    }
    public static boolean isPrime(int wholeNumber){
//        int counter=0;
//        for (i =10;i<=50;i++){
//            if(i%2!=0){
//                System.out.println("Prime Number Is:: "+ i);
//                counter++;
//            }
//        }
//        System.out.println("Number of Prime Numbers Found:: "+counter);
//    }
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}

