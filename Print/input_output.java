import java.util.*;

// 백준: 10951
class Main{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       while(scanner.hasNextInt()){
           int a = scanner.nextInt();
           if (scanner.hasNextInt()){
               int b = scanner.nextInt();
               System.out.println(a+b);
           }else{
               break;
           }
       }
       scanner.close();
    }
}