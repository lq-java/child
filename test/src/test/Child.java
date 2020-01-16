package test;

public class Child extends Base{
	
	String name="child";
	
	@Override
	public void method() {
		System.out.println(name);
	}
}
