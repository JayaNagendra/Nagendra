import java.util.ArrayList;
public class Lab_Assesment2 {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	public ArrayList<Integer> saveEvenNumbers(int N) {
		list = new ArrayList<Integer>();
		
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) list.add(i);
		}
		
		return list;
	}
	
	public ArrayList<Integer> printEvenNumbers() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		for (int item : list) {
			newList.add(item * 2);
			
		}
		System.out.println(newList);
		System.out.println("retrieveEvenNumber");
		
		System.out.println(newList.contains(20));
		return newList;
		
	}
          //System.out.println(newList.contains(50));
	public static void main(String[] args) {
		Lab_Assesment2 asg = new Lab_Assesment2();
		asg.saveEvenNumbers(50);
		asg.printEvenNumbers();
		
		
	}

}