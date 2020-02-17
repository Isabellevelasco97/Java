package ice8;

public class Ice8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 30; i++) {
			if ((i%5)==0) {
				System.out.print("\n");
				continue;
			}
			else {
				System.out.print("*");
			}
		}
		System.out.print("\n");
		String table = "";
		int width = 20;
		
		for (int j = 0; j < width; j++) {
			table += "=";
		}
		table += "\n";
		
		for (int k = 0; k < width; k++) {
			if (k % (width/5) == 0) {
				table += "|";
			}
			else {
				table += " ";
			}
		}
		table += "\n";
		for (int k = 0; k < width; k++) {
			if (k % (width/5) == 0) {
				table += "|";
			}
			else {
				table += " ";
			}
		}
		table += "\n";
		for (int j = 0; j < width; j++) {
			table += "=";
		}
		System.out.print(table);
	}

}
