public class prime {
    public static void main(String[] args) {
        int number = 7;
        int flag = 0;
        if(number <= 1) {
            System.out.println("No");
        }
        else {
            for(int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0) {
                    System.out.println("No");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println("yes");
            }
        }
    }
}
