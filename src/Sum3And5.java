public class Sum3And5 {
    public static void main(String[] args) {
        int sumOfMatch = 0;
        int countOfMatch= 0;
        for(int i = 0; i<=1000;i++){
            if(i%3==0&& i%5 ==0){
                countOfMatch++;
                sumOfMatch+=i;
                System.out.println("Match Found:: "+i);
            }
            if(countOfMatch==5){
                break;
            }
        }
        System.out.println("Sum = "+sumOfMatch);
    }
}
