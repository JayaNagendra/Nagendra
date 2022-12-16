/*Develop a java class with a instance variable CountryMap HashMap (M1) add a method 
  storeCountryCapital(String CountryName, String capital) , the method should add the 
 passed country and capital as key/value in the map M1 and return the Map (M1)*/
 
import java.util.HashMap;
import java.util.Iterator;
public class Assesment5_Country_Map{    
public static void main(String[] args){
HashMap<String,String> hm=new HashMap<String,String>();
hm.put("India","Delhi");
hm.put("pak","Islamabad");
hm.put("Italy","Rome");
hm.put("Japan","Tokyo");
hm.put("Russia","Moscow");

System.out.println(hm);

}
}