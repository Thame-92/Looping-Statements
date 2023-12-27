package ConitionalStatements;

public class PrintingOddNumbers {
	public void OddNumbersUsingwile()
    {
        int number=50;
        int i=1;
        
        while(i<number) {
        	System.out.println(i+ "");
        	i=i+2;
        }
    }
	public static void main(String[] args) {
		PrintingOddNumbers O=new PrintingOddNumbers();
		O.OddNumbersUsingwile();
	}
}

