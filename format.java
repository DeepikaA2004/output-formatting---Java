import java.util.Scanner;

public class Solution {

public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s1 = new String[3]; 
        int x[] = new int[3];

        for(int i=0;i<3;i++){
             s1[i]=sc.next();
             x[i]=sc.nextInt();
        }

        System.out.println("================================");
        for(int i = 0; i<3;i++){
            System.out.printf("%-15s%03d\n",s1[i],x[i]);
        }//"%-15s%03d%n"
        System.out.println("================================");


}
}