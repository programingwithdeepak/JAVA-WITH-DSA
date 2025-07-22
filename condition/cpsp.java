package conditon;

import java.util.Scanner;

public class cpsp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price :");
        double cp = sc.nextDouble();
        System.out.println("selling price :");
        double sp= sc.nextDouble();
        if(cp<sp){
        System.out.println("profit :");
        System.out.println(sp-cp);}
        if (cp>sp){
        System.out.println("loss :");
          System.out.println(sp-cp);}
        if (sp==cp){
        System.out.println("no profit no loss  :");
          System.out.println(sp-cp);}
        sc.close();
    }
}
