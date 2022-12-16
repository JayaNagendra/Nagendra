/*Develop a method retrieveCapital(String CountryName) which returns the capital for the 
country passed from the Map M1 created in step 1.*/

import java.util.HashMap;
import java.util.Iterator;
public class Assesment6_Country_Map{
public static void main(String[] args){
HashMap<String,String> hm=new HashMap<String,String>();
hm.put("India","Delhi");
hm.put("pak","Islamabad");
hm.put("Italy","Rome");
hm.put("Japan","Tokyo");
hm.put("Russia","Moscow");

System.out.println(hm);

System.out.println(hm.get("Italy"));


}
}