import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marchans.aspect.shop.Shop;
import com.marchans.aspect.shop.VipClient;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AspectBeansS.xml");
		 Shop shop = (Shop) context.getBean("cashier");
		shop.getNewClient();
		VipClient vipclient = (VipClient) context.getBean("vipclient");
		Shop vipshop = (Shop) context.getBean("vipcashier");

		vipclient.giveDiscount(15);

		System.out.println(vipshop.getDiscount());
		
		
		System.out.println("\n" + "Example of annotations." + "\n");
		
		 ApplicationContext contextA = new ClassPathXmlApplicationContext("AspectBeansAnnotationsS.xml");
		 com.marchans.aspect.annotations.shop.Shop cashierA= ( com.marchans.aspect.annotations.shop.Shop) contextA.getBean("cashier");
			cashierA.getNewClient();   

	}
}
