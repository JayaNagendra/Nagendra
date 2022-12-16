import java.util.function.*;
import java.util.*;

class Bajaj{
String name;
int price;
int model;
Bajaj (String name,int pr,int model){
this.name=name;
price=pr;
this.model=model;
}
}
public class Lamda_Expresion{
public static void main(String[] args){
ArrayList<Bajaj> list=new ArrayList<Bajaj>();
list.add(new Bajaj ("pulser" , 90000, 125));
list.add(new Bajaj ("pulser" , 140000, 150));
list.add(new Bajaj ("pulserNS" , 120000, 160));
list.add(new Bajaj ("pulser" , 150000, 220));

Function<Bajaj,Integer> fn= f->{
int p= f.price;
if(p>=90000 && p<=120000)
return (p*10/100);
else if(p>=140000 && p<=150000)
return (p*20/100);
else 
return(p*50/100);
};

Predicate<Integer> pc=d->d>10000;


Consumer<Bajaj> c=f->{
System.out.println(f.name);
System.out.println(f.price);
System.out.println(f.model);
};

for(Bajaj b:list){
int discount =fn.apply(b);
if(pc.test(discount)){
c.accept(b);
System.out.println("Discount is:" +discount);
}
}
}
}






