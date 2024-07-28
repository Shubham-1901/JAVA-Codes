public class Casting{
public static void main(String[] args){
int myint = 9;
double mydouble = myint;
//widening casting 
System.out.println(mydouble+"\n");
System.out.println(myint+"\n");
//narrow casting
mydouble = 9.78d;
myint = (int)mydouble;
System.out.println(mydouble+"\n");
System.out.println(myint+"\n");
}
}