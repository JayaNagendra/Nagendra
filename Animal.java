record Animal(String name, String location, int age, float weight){
Animal(){
this("Tiger", "india", 20, 75.8f);
}
public static void main(String[] args){
Animal a=new Animal("Tiger", "india", 20, 75.8f);
Animal a1=new Animal("Lion", "india", 23, 88.8f);
System.out.println(a);
System.out.println(a1);
}
}