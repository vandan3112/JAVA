package covariantexample;

public class B extends A{
	
	@Override
	B show() {
		super.show();
		System.out.println("This is SubClass.");
		return this;
	}
}
