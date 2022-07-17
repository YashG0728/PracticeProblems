public class ConstructorOne {
	public String language;
	
	//constructor
	ConstructorOne() {
		this.language = "Java";
		}
	
	ConstructorOne(String language) {
		this.language = language;
	}
	
	void getname() {
	System.out.println("Programming language: " +this.language);	
	}
	
	
	public static void main(String[] args) {
		ConstructorOne S1 = new ConstructorOne();
		ConstructorOne S2 = new ConstructorOne("Python");
		ConstructorOne S3 = new ConstructorOne("rython");
		S1.getname();
		S2.getname();
		S3.getname();
	}

}

