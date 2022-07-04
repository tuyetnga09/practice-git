import java.util.Scanner;
/*
 * Step 1: Create a class has name : Student
 * Step 2: Create a class QLsv
 * /
 */

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        QLStudent QL = new QLStudent();
	        
	        //Phần này nên thêm phần password và use 
	        //Khi người dùng nhập đúng thì  cho chạy memnu, người dùng nhập sai --> nhập lại
	        
	        while (true) {
	            System.out.println("1. Input information");
	            System.out.println("2. Output infomation");
	            System.out.println("3. Search information");
	            System.out.println("4.Delete information");
	            System.out.println("5. Search");
	            System.out.println("Exit");
	            System.out.print("Enter option :");
	            int op = Integer.parseInt(sc.nextLine());

	            switch (op) {
	                case 1:
	                    QL.inputInformation();;
	                    break;
	                case 2:
	                    QL.outputInfomation();
	                    break;
	                case 3:
	                    QL.searchInfo();
	                    break;
	                case 4:
	                    QL.deleteInfo();
	                    break;
	                case 5: QL.timKiem(null);
	                break;
	                case 0: 
	                	System.exit(0);
	                default:
	                	System.out.println("Nhap tu 1 den 5 thoi");
	                    
	            }

	        }

	}

}
