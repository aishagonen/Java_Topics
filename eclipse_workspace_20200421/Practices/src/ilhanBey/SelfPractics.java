package ilhanBey;

public class SelfPractics {

	public static void main(String[] args) {

//1. 
		SelfPractics calculator = new SelfPractics();
		calculator.setFirstNum(5);
		calculator.setSecondNum(4);

		System.out.println(calculator.getAdditionResult());
		System.out.println(calculator.getSubtractionResult());
		System.out.println(calculator.getMultiplicationResult());
		System.out.println(calculator.getDivisionResult());
		
//2. 
		SelfPractics area = new SelfPractics();
		area.setWidth(5.0);
		area.setHeight(4.0);
		System.out.println(area.getArea());
		System.out.println(area.getHeight());
				
	}

//1. 
	double firstNum;
	double secondNum;

	public double getFirstNum() {
		return firstNum;
	}
	public double getSecondNum() {
		return secondNum;
	}
	public void setFirstNum(double firstNum) {
		this.firstNum = firstNum;
	}
	public void setSecondNum(double secondNum) {
		this.secondNum = secondNum;
	}
	
	public double getAdditionResult() {
		return firstNum + secondNum;
		
	}
	public double getSubtractionResult() {
		return firstNum - secondNum;
	}
	public double getMultiplicationResult() {
		return firstNum * secondNum;
	}
	public double getDivisionResult() {
		if (secondNum == 0) {
			return 0;
		} else {
			return firstNum / secondNum;
		}
	}
//1.
//Write aa class with the name SimpleCalculator. The class needs two fields 
//(instance variables) with names firstNumber and secondNumber both of type double.
//Write the following methods (instance methods):
//*Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
//*Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
//*Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
//*Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
//*Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
//*Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
//*Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
//*Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. 
//In case the value of secondNumber is 0 then return 0.

	
// 2. 	
	double width;
	double height;
	
	public SelfPractics() {       // Bu bir constructors. Asagidaki parametreli constructori yazarsan bunu yazmak zorundasin. Yoksa error verir.   	
	}
	public SelfPractics(double width,double height) {
        this.width=width;
        this.height=height;
        if(width<0){
            this.width=0;
        }if(height <0){
            this.height=0;
        }
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWidth(double width){
        if(width<0){
            this.width = 0;
        }else{
        this.width=width;
        }
    }
    public void setHeight(double height){
        if(height<0){
            this.height = 0;
        }else{
        this.height=height;
        }
    }
    public double getArea(){
        return getWidth() * getHeight();
    }
}
//2. 
//Write aa class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.
//The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). 
//The second constructor has parameters width and height of type double and it needs to initialize the fields. 
//In case the width is less than 0 it needs to set the width field value to 0, 
//in case the height parameter is less than 0 it needs to set the height field value to 0.
//Write the following methods (instance methods):
//* Method named getWidth without any parameters, it needs to return the value of width field.
//* Method named getHeight without any parameters, it needs to return the value of height field.
//* Method named setWidth with one parameter of type double, it needs to set the value of the width field. 
//If the parameter is less than 0 it needs to set the width field value to 0.
//* Method named setHeight with one parameter of type double, it needs to set the value of the height field. 
//If the parameter is less than 0 it needs to set the height field value to 0.
//* Method named getArea without any parameters, it needs to return the area of the wall.


