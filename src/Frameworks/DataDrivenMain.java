package Frameworks;

public class DataDrivenMain {
	public static void main(String[] args) throws Throwable {
		GenericExcelhandling main = new GenericExcelhandling();
		String val = main.getCellData("./data/input.xlsx", "Sheet1", 1, 1);
		System.out.println(val);
		
		int rrt = main.getRowCount("Sheet1", "./data/input.xlsx");
		System.out.println(rrt);
	}

	
}
