package method.overriding;

public class OverridingMain {
	public static void main(String[] args) {
		Parents parentObj = new Parents();
		
		parentObj.sings();
		
		Child childObj = new Child();
		childObj.sings();

}
}
