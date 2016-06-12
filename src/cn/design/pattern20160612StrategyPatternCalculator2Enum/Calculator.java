package cn.design.pattern20160612StrategyPatternCalculator2Enum;

public enum Calculator {

	ADD("+"){

		@Override
		public int cal(int a, int b) {
			
			return a + b;
		}
		
	},
	SUB("-"){

		@Override
		public int cal(int a, int b) {
			
			return a - b;
		}
		
	};
	
	
	String value = "";
	
	private Calculator(String value) {
		this.value = value;
	}
	
	public abstract int cal(int a, int b);
}
