public class Sort{
	static void bubble(int[] a){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
				    a[i]=a[i]-a[j]; }
			}
		}
	}
	public static void main(String[] args){
		int a[]={4,7,6,5,8,9,33,22,55,77};
		for(int k=0;k<a.length;k++){
			System.out.print(" "+a[k]);
			bubble(a);
		}
	}
}