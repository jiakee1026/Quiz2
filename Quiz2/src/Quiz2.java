public class Quiz2 {

	public static void main(String[] args) {
		
		// 1.
		System.out.println("1.");
		int max = 5;
		int n = 1;
		while (n <= max) {
			System.out.println(n);
			n++;
		}
		System.out.println();
		
		// 2.
		System.out.println("2.");
		int ttl = 25;
		int number = 1;
		while (number <= (ttl / 2)) {
			ttl = ttl - number;
			System.out.println(ttl + " " + number);
			number++;
		}
		System.out.println();
		
		
		//3.
		System.out.println("3.");
		int i = 1;
		while (i <= 2) {
			int j = 1;
			while (j <= 3) {
				int k = 1;
				while(k <= 4) {
					System.out.print("*");
					k++;
				}
				System.out.print("!");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		
		// 4.
		System.out.println("4.");
		int num = 4;
		int count = 1;
			while (count <= num) {
				System.out.println(num);
				num = num / 2;
				count++;
		}
	}
}
