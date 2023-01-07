public class WhileLoopChallenge {
    public static void main(String[] args) {
        int i =4;
        int OddCount = 0;
        int EvenCount = 0;
        while(i<=20){
            i++;
            if(!isEvenNumber(i)){
               OddCount++;
                continue;
            }
            System.out.println("Even Number "+i);
            EvenCount++;
if (EvenCount>=5){
    break;
}
        }
        System.out.println("Total Odd Numbers:: "+OddCount);
        System.out.println("Total Even Numbers:: "+EvenCount);
    }
  public static boolean isEvenNumber(int num){
        if(num%2==0){
            return true;
        }else {
            return false;
        }
  }
}

