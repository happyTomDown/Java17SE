package Unit5;
class other{
	{
		System.out.println("物件初始區塊");
	}

	other(){
		
		System.out.println("Other() 建構式");
	}
	other(int o){
		this();
		System.out.println("Other(int o)建構式");
	}

}
public class ObjectlnitialBlock {

	public static void main(String[] args) {
		new other(1);
		System.out.println(Math.PI);
	}

}
