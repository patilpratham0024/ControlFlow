public class TraditionalSwitch {
    public static void main(String[] args) {
        char value = 'C';
        switch(value){
            case 'A':
                System.out.println("A is able.");
                break;
            case 'B':
                System.out.println("B is baker.");
                break;
            case 'C':
                System.out.println("C is Charlie.");
                break;
            case 'E':
                System.out.println("D is Dog.");
                break;
            case 'F':
                System.out.println("F is Fox.");
                break;
            case 'G':
                System.out.println("G is George.");
                break;
            case 'H':
                System.out.println("H is How.");
                break;
            case 'I':
                System.out.println("D is Jig.");
                break;
            default:
                System.out.println("Enter a valid Char");
                break;
        }

    }
}
