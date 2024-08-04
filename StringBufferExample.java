class StringBufferExample{
public static void main(String[] args){
StringBuffer sb = new StringBuffer("Hello ");
StringBuffer sb1 = new StringBuffer("Hello ");
StringBuffer sb2 = new StringBuffer("Hello ");
sb.append("Java");
sb1.insert(1,"Java");
sb2.replace(1,3,"Java");
sb.reverse();
sb.delete(1,3);
System.out.println(sb);
System.out.println(sb1);
System.out.println(sb2);
System.out.println(sb);
System.out.println(sb);
}
}