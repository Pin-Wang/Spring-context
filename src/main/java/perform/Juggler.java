package perform;

public class Juggler implements Performer{
	
	private int beanBags=3;
	private String age="0";
	//spring容器创建容器的时候会默认调用无参构造函数
	public Juggler() {
	}
	
	public Juggler(Integer beanBags,String age){
		this.beanBags=beanBags;
		this.age=age;
	}
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Juggler throws "+beanBags+" and age is "+age);
	}
	
}
