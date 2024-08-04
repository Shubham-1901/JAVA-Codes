import java.util.*;
public class LCM{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int c = a*b;
int temp=0;
int LCM;
while(a!=0){
temp = b%a;
b = a;
a = temp;
}
System.out.println("LCM: "+(c/b));
}
}

