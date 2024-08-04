class StringBuilderExample{
public static void main(String[] args){
StringBuilder sb = new StringBuilder("Hello ");
StringBuilder sb1 = new StringBuilder("Hello ");
StringBuilder sb2 = new StringBuilder("Hello ");
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