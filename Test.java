public class Test{
	private String name="Intkhab";
	public void greet(){
		System.out.println("Welcome : "+name);
	}
}
class TestDemo{
	public static void main(String args[]){
		Test test = new Test();
		test.greet();
	}
}