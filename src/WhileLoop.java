public class WhileLoop {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }

        int j=0;
        while(j<=5){
            System.out.println("Hello World");
            j++;
        }
        int k=1;
        boolean isReady= false;
        do{
            if(k>5){
                break;
            }
            System.out.println(k);
            k++;
            isReady = (k>0);
        }while(isReady);
    }
}
