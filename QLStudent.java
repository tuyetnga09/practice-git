import java.util.ArrayList;
import java.util.Scanner;

public class QLStudent {
	ArrayList<Student> listStudent = new ArrayList<>();
	
    Scanner sc = new Scanner(System.in);

    public void inputInformation() {
        while (true) {
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter email:");
            String email = sc.nextLine();
            System.out.println("Enter age :");
            int age = Integer.parseInt(sc.nextLine());

            //create student object passing properties
            Student SV = new Student(name, email, age);
            
            //method add(SV) --> add infomation of the Student 
            listStudent.add(SV);
            
            //Ask users if they want to add students
            System.out.println("Do you want add a new student??? Y/n");
            String option = sc.nextLine();
            //equals: so sanh chu in hoa và in thường 
            //compare 2 strings based on uppercase and lowercase 
            if (option.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    //use for each --> output info 
    public void outputInfomation() {
        for (Student SV : listStudent) {
            SV.println();
        }
    }
    // search for student based on email 
    public void searchInfo(){
        System.out.println("Enter enmail of the student you are looking for:");
        String enterEmail = sc.nextLine();
        for (Student SV : listStudent){
            if(enterEmail.equalsIgnoreCase(SV.getEmail())){
               SV.println();
            //Bổ sung trường hợp xử lý tìm không thấy student
            }else {
            	System.out.println("No data!");
            }
        }
        
    }
    // delete for student based email 
    public void deleteInfo(){
        System.out.println("Enter email of the student you want to delete:");
        String enterEmail = sc.nextLine();
        for(Student SV : listStudent){
            if(enterEmail.equalsIgnoreCase(SV.getEmail())){
                listStudent.remove(SV);
                System.out.println(" Dleted student " + enterEmail );
                SV.println(); 
                break;
            }
           
            
        }
    }
    //Bổ sung 1 method tìm kiếm student với tham số đầu vào là name,
    //và đầu ra là danh sách student có name như đầu vào
    
    public String timKiem(String name) {
    	
    	System.out.print("Nhap ten ban muon tim kiem: ");
    	name = sc.nextLine();
    
    	for(Student SV1 : listStudent) {
    		if(name.equalsIgnoreCase(SV1.getName())) {
    			SV1.println();
    		}else {
    			System.out.println("No data");
    		}
    	}
    	return name;
    }
    
    //Cập nhật thông tin của một student theo email chỉ định,
//    public void updateInfo() {
//    	System.out.print("Nhap email can cap nhat: ");
//    	String email = sc.nextLine();
//    	
//    	for(Student SV2 : listStudent) {
//    		if(SV2.getEmail().equals(email)) {
//    			SV2.println();
//    		}
//    	}
//    	
//    }
   
	

}
