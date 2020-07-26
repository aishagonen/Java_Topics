package interfAbstObjCls;

public abstract class Crashable {

	boolean carDrivable = true;
	
	public void youCrashed() {
		this.carDrivable = false;
		
	}	
}
