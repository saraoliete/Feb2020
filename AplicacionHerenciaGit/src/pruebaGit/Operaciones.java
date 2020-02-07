package pruebaGit;

public class Operaciones {
	
	
	int operadorA, operadorB;
	
	
	public Operaciones(int operadorA, int operadorB) {
		
		
		this.operadorA=operadorA;
		this.operadorB=operadorB;
		
		
	}


	/**
	 * @return the operadorA
	 */
	public int getOperadorA() {
		return operadorA;
	}


	/**
	 * @param operadorA the operadorA to set
	 */
	public void setOperadorA(int operadorA) {
		this.operadorA = operadorA;
	}


	/**
	 * @return the operadorB
	 */
	public int getOperadorB() {
		return operadorB;
	}


	/**
	 * @param operadorB the operadorB to set
	 */
	public void setOperadorB(int operadorB) {
		this.operadorB = operadorB;
	}
	
	
	public int suma() {
		
		return operadorA+operadorB;
	}
	
	
	public int resta() {
		
		return operadorA-operadorB;
	}
	
	

}
