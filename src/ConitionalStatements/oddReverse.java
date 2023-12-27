package ConitionalStatements;

public class oddReverse {
	
		public void ReverseOrder()
	    {
	        int number=25;
	        int a;

	        for(int i=number-1; i>0; i--){
	        	a=1+i*2;
	                System.out.println(a);
	        }
	    }
		public static void main(String[] args) {
			oddReverse R=new oddReverse();
			R.ReverseOrder();
		}
	}


