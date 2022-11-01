package customexception;

public class ZeroBalanceException extends Exception {
		
		private double withAmt;
		private int acctno;
		
		
		public ZeroBalanceException(int acctno, double withAmt) {
			super();
			this.withAmt = withAmt;
			this.acctno = acctno;
		}


		@Override
		public String toString() {
		
			return "ZeroBalanceException [currBal=" + 0 + " (zero), withAmt=" + withAmt + ", acctno=" + acctno + "]";
		}
		
		
		
		
		
		

	}
