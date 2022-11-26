package tv;
public class TV{
	private String brand;
	private int year;
	private int width;
	
	TV(String brand, int year, int width){
		this.brand = brand;
		this.year = year;
		this.width = width;
	}
	
	public void show(){
		System.out.println(brand+"에서 만든"+year+"년"+width+"인치");
	}
}