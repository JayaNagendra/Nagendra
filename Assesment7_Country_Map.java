/*Develop a method retrieveCountry(String capitalName) which returns the country for the 
capital name passed from the Map M1 created in step 1.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
public class Assesment7_Country_Map{
public static void main(String[] args){
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("India","Delhi");
		hm.put("pak","Islamabad");
		hm.put("Italy","Rome");
		hm.put("Japan","Tokyo");
		hm.put("Russia","Moscow");

		System.out.println(hm);
		
		System.out.println();
		
		String s="Delhi";
		for(Entry<String, String> entry:hm.entrySet()){
		if(entry.getValue()==s){
		System.out.println(entry.getKey());
		}
		}
		}
		}