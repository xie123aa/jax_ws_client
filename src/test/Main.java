package test;

import com.georgexie.weather.WeatherInterfaceImpl;
import com.georgexie.weather.WeatherInterfaceImplService;
/** 
* @Description:  该案例需通过wsimport –s . http://127.0.0.1:12345/weather?wsdl命令生成com.georgexie.weather文件
 * ，同时调用自己发布的JAX-WS webservice服务
* @Param:  
* @returns:  
* @Author: georgexie 
* @Date: 2019/5/29 0029 15:42
*/
public class Main {
	//通过客户端调用
	public static void main(String[] args) {
		WeatherInterfaceImplService service = new WeatherInterfaceImplService();
		WeatherInterfaceImpl weatherservice = service.getPort(WeatherInterfaceImpl.class);
		String weather = weatherservice.getWeather("安徽");
		System.out.println(weather);
	}

}
