
public class teste {

	public static void main(String[] args) {
		int a,b,c,d,resultado, i, j;
		
		a = 6;
		b = 4;
		c = 3;
		
		d = a + b + c;
		
		resultado = d;
		
		System.out.println("O resultado é " + resultado);
		
		for(i=0;i<=10;i++) {
			System.out.println("3 * " + i +" = " + (i*c));
		}
		
		for(i=1;i<=10;i++) {
				System.out.println("\n");
			for(j=1;j<=10;j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}

}