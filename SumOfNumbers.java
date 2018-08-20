import java.util.*;
public class test {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a number :");
	int n=in.nextInt();
	int sum=0;
	for(int i=n;i>0;i--) {
		sum+=i;
	}
	System.out.println(sum);
}
}
