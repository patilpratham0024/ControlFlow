public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(0,10));
    }
    public static boolean isOdd(int number){
        if(number<0){
            return false;
        } else if(number %2!=0){
            return true;
        }else{
            return false;
        }
    }
    public static int sumOdd(int start,int end){
        if (end < start || start < 0 || end < 0) {
            return -1;
        }
        int sum = 0;
        if (!isOdd(start)) {
            start++;
        }
        for (int i = start; i <= end; i += 2) {
            sum += i;
            System.out.println(sum);
        }
        return sum;
    }
}
