import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonachi serisinin eleman sayisini girin: ");
        int count = input.nextInt();

        int num1 = 0, num2 = 1;
        System.out.print("Fibonachi serisi: "+num1 + " " + num2);

        for(int i=2; i<count;i++){
            int nextNum = num1 + num2;
            System.out.print(" " + nextNum);
            num1 = num2;
            num2 = nextNum;
        }
    }
}