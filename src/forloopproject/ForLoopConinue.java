package forloopproject;

public class ForLoopConinue{

	public static void main(String[] args) {
		
		String colors[]= {"Blue,Red,Yellow,White,Orange,Green"};
		
		int a = 35;
		int b = 55;
		
		for(int i = 0; i<=10; i++) {
			System.out.println(i);
		}
		
		   do{
			System.out.println(a);
			a++;
		}while(a<=40);
		   
		   while (b<=60) {
			   System.out.println(b);
			   b++;
		   }
		   
		   for(String multycolors:colors) {
			   System.out.println(multycolors);
		   }

	}

}
