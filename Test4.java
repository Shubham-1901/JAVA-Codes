class Test4{
public static void main(String[] args){
int arr[] ={1,2,3};
int cln[]=arr.clone();
System.out.println(arr == cln);
for(int i=0;i<cln.length;i++){
System.out.println(cln[i]+"");
}
}
}