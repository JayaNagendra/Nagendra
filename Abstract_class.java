interface laptop{
void copy();
void past();
void cut();
void keyboard();
}
abstract class Lenovo implements laptop{
public void copy () {
System.out.println("Lenovo copy");
}
public void past () {
System.out.println("Lenovo past");
}
public void cut () {
System.out.println("Lenovo cut");
}

public abstract void keyboard();
}

abstract class Hp implements laptop{
public void copy() {
System.out.println(" Hp copy");
}
public void past() {
System.out.println("Hp past");
}
public void cut () {
System.out.println("Hp cut");
}
}

class add extends Lenovo{
public void keyboard() {
System.out.println("Lenovo keyboard");
}
}
public class Abstract_class{
public static void main(String[] args){
add a=new add();
a.copy();
a.past();
a.cut();
a.keyboard();

}
}
