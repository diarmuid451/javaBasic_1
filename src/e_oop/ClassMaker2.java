package e_oop;

public class ClassMaker2 {
	public static void main(String[] args){
		ClassMaker2 cm = new ClassMaker2();
		System.out.println(cm.dual);
	}
	
	
	//전역변수 하나를 선언하고 명시적으로 초기화 해주세요.
	
	String dual = " ";

	//위에서 선언한 전역변수를 초기화 블럭을 사용해 초기화 해주세요.
	
	{
		dual = "듀얼";
		}
	
	
	//위에서 선언한 전역변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	ClassMaker2(String dual){
		this.dual = this.dual + "리스트\t" + dual;		
	}
	
	//위에서 선언한 전역변수를 생성자를 하나 더 만들어서 초기화 해주세요.
	ClassMaker2(){
		this("200");
	}
	
}
