record Mobile_Record(String name, int cost, int ram, int rom){
Mobile_Record(){
this("Redmi", 32444, 2, 7);
}
public static void main(String[] args){
Mobile_Record a=new Mobile_Record("Redmi", 32444, 6, 64);
Mobile_Record a1=new Mobile_Record("Apple", 12333, 12, 78);
System.out.println(a);
System.out.println(a1);
}
}