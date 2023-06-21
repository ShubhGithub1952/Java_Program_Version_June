package digitPrograms;

import org.testng.annotations.Test;

public class VerifyTheGivenNumberIsPalindromOrNotTest {
	@Test
	public void palindromMethod() {
		int numb=12321;
		int temp=numb;
		//int count=0;
		int sum=0;
		while (numb>0) {
			int rem= numb%10;
			//System.out.println(rem);
			sum=sum*10+rem;
			numb=numb/10;
		}
		System.out.println(sum);
		if (temp==sum) {
			System.out.println("Given number "+sum+" is Palindrom !");
		} else {
			System.out.println("Given number "+sum+" isnot Palindrom !");
		}
	}
}
