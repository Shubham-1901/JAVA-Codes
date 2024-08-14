public class File9{
public void fullThrottle(){
System.out.println("The car is going as fast as it can!");
}
public void speed(int maxSpeed){
System.out.println("Max speed is: "+ maxSpeed);
}
public static void main(String[] args){
File9 myCar = new File9();
myCar.fullThrottle();
myCar.speed(200);
}
}