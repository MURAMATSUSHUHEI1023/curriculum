package check;

import constants.Constants;

public class Check {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	printName("村松", "脩平");
	Pet pet=new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
	pet.introduce();
	RobotPet pet2 =new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
	pet2.introduce();
	
	}
	
	
	private static void printName(String firstName,String lastName) {
		System.out.println("printNameは　→　"+firstName+lastName);
	
	}

}
