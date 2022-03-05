package assignment2;

public class Prg4 {

	public static void main(String[] args) {
		int i = -5;
		int j = 8;
		int k = 6;
		int ans;
		ans = i+j*k;
		System.out.println(ans);
		i = 55;
		j = 9;
		k = 9;
		ans = (i+j)%k;
		System.out.println(ans);
		i = 20;
		j = -3;
		k = 5;
		ans = i+j*k/8;
		System.out.println(ans);
		ans = 5+15/3*2-8%3;
		System.out.println(ans);
	}

}
/* Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3 */