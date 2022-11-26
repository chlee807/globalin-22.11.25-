package businessman1;

class Man {
    String name;
    
    //public Man(){}
    public Man(String name) {
       this.name = name;
    }
    
    public void tellYourName() { 
        System.out.println("My name is " + name); 
    }
}


//this 생성
class BusinessMan extends Man {
    String company;
    String position;
   
    //super(){} - 부모생성자에 맞게 디폴트생성자가 만들어진다
    
	/*
	 * public BusinessMan( String company, String position) { this.company =
	 * company; this.position = position; }
	 */
    
   
     public BusinessMan(String name, String company, String position) {
    	 super(name);
    	 this.company = company;
    	 this.position = position;
     
     }
    

    public void tellYourInfo() {
        System.out.println("My company is " + this.company);
        System.out.println("My position is " + this.position);
        tellYourName();
    }
}


class MyBusinessMan {
    public static void main(String[] args) {
        BusinessMan man
                    = new BusinessMan("Lee", "Hybrid ELD", "Staff Eng.");
        
        
        man.tellYourInfo();
      
    }
}
