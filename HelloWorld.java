public class HelloWorld{
	public String show(){
		return "你好世界!";	
	}
	public void run(){
		System.out.println("CPU正在高速运算着！");
	}
	public static void main(String[] arg0s){
		HelloWorld hello=new HelloWorld();
		System.out.println(hello.show());
	}
}
