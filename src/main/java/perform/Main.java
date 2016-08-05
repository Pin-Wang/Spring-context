package perform;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//得到spring容器
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//得到bean
		Performer performer=(Performer)applicationContext.getBean("Duke");
		performer.perform();
	}

}
