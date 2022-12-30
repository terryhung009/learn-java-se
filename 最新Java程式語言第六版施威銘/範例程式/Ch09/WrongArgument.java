class Test {
	int x,y;
	
	// 具有參數的建構方法
	Test(int initX,int initY) { // 需要2個參數
		x = initX;
		y = initY;
	}
}

public class WrongArgument {

	public static void main(String[] argv){
		Test a = new Test(30); // 少1個參數
		System.out.println("成員x：" + a.x);
		System.out.println("成員y：" + a.y);
	}
}