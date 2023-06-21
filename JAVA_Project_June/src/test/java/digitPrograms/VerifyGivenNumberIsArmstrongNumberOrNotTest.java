package digitPrograms;

import org.testng.annotations.Test;

public class VerifyGivenNumberIsArmstrongNumberOrNotTest {
	@Test
	public void armstrongNumberMethod() {
		int numb =153, temp=numb, temp1=temp,sum=0, count=0;
		while (numb>0) {
			numb=numb/10;
			count++;
		}
		//System.out.println(count);
		while (temp>0) {
			int rem= temp%10;
			int mul=1;
			int power=count;
			while (power>0) {
				mul=mul*rem;
				power--;
			}
			sum=sum+mul;
			temp=temp/10;
		}
		if (temp1==sum) {
			System.out.println("Given :- "+sum+" is Armstrong Number !");
		} else {
			System.out.println("Given :- "+sum+" isnot Armstrong Number !");
		}
	}
}
