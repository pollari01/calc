import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String[] act = {"+","-","/","*"};
        String[] act2 = {"\\+", "-", "/", "\\*"};
        Scanner s = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String exprasion = s.nextLine();
        int actionIndex=-1;
        for(int i = 0;i < act.length;i++) {
            if(exprasion.contains(act[i])){
                actionIndex = i;
                break;
            }
        }


        if(actionIndex==-1){
            System.out.println("Введено неккоректное выражение");
            return;
        }

            String[] act3 = exprasion.split(act2[actionIndex]);
            int a;
            int b;
            a = Integer.parseInt(act3[0]);
            b = Integer.parseInt(act3[1]);
            int result;
            switch (act[actionIndex]){
                case "+":
                    result = a+b;
                    break;
                case "-":
                    result = a-b;
                    break;
                case "/":
                    result = a/b;
                    break;
                default:
                    result = a*b;
                    break;
            }
            System.out.println(result);
        }
    }

