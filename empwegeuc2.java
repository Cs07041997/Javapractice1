package Empwegeproblem;

public class EmpBuilderUc2 {
	public static void main(String[] args) {
		//constant
		int IS_PRESENT = 1;
		int EMP_RATE_HR = 20;
		int EMP_HRS = 8;
		int salary = 0;
        //Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_PRESENT) {


            salary=(EMP_HRS*EMP_RATE_HR);
            System.out.println(salary);
        }

        else {

        	System.out.println (salary = 0);
        }

	}

}
