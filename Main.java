public class Main {

	public static void main (String[] args) {
		
		Matrix A = new Matrix(3);
		A.setElement(0,0,3);
		A.setElement(0,1,1);
		A.setElement(0,2,1);
		A.setElement(1,0,3);
		A.setElement(1,1,10);
		A.setElement(1,2,1);
		A.setElement(2,0,3);
		A.setElement(2,1,2);
		A.setElement(2,2,2);
		System.out.println(A);
		System.out.println("\n");

		A.doSortColumns();
		System.out.println(A);





		/*Matrix A = new Matrix(2);
		A.setElement(0,1,1);
		A.setElement(1,0,1);
		A.setElement(1,1,0);
	

		System.out.println(A);
		System.out.println("\n");
		Matrix B = new Matrix(A);
		for (int i = 0; i < 9; i++) {
			B = B.product(A);
			System.out.println(B);
			System.out.println("\n");
		}*/
	}
}