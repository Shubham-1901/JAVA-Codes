public class CheckArm{
public static void main(String[] args){
System.out.println("Armstrong Numbers between 1 and 1000 are: ");
for (int num =1;num<=1000;num++){
if (isarm(num)){
System.out.println(num);
}
}
}
public static Boolean isarm(int num){
int org = num;
int sum = 0;
int numd = String.valueOf(num).length();
while (num>0){
int digit = num% 10;
sum += Math.pow(digit, numd);
num /= 10;
}
return sum == org;
}
}