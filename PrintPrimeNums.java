import java.util.Scanner;
public class PrintPrimeNums{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number Range to: ");
	int num=sc.nextInt();
	int temp=0;
	if(num==0||num==1){
		System.out.println("Not a Prime Number. \n Try another range!");
	}
	for (int i=2;i<=num;i++){ //for printing number range that you enter.
		for(int j=2;j<=i-1;j++){ //for checking it is prime or not.
			if(i%j==0){
				temp=1;
			}
		}
		if (temp==0){
			System.out.println(+i);//printing prime nums.
		}
		else
		{
		temp=0; //again set to trmp=0 ,so that again it will check for other number.
		}
	}
	
	
	
	
	}
}