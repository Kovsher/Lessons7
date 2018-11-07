import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = getInputNoRecursion(sc,1,5);
        System.out.println(number);
        int number2 = getInputWithRecursion (sc,1,5);
        System.out.println(number2);
            }
public static int getInputNoRecursion(Scanner scanner, int min, int max){
        int result;
        while ((true)){
            System.out.println("Ведите число от " +min+"до"+max);
            try {
                String stringNumber = scanner.next();
                result = Integer.valueOf(stringNumber);
            }catch (NumberFormatException e){
                System.out.println("Вы ввели не число");
                continue;
            }
            if (result<min||result>max){
                System.out.println("Число не от"+min+"до"+max);
                continue;
            }
            break;
        }
        return result;
}

    public static int getInputWithRecursion(Scanner scanner, int min, int max) {
    int result;
        System.out.println("Введите число от"+min+"до"+max);
        try {
            String stringNumber =scanner.next();
            result=Integer.valueOf(stringNumber);

        }catch (NumberFormatException e){
            System.out.println("Вы ввели не число");
            return getInputNoRecursion(scanner,min,max);

        }
        if (result<min||result>max){
            System.out.println("число не от"+min+"до"+max);
            return getInputNoRecursion(scanner,min,max);

        }
        return result;
    }
}
