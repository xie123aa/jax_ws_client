package test;

import com.georgexie.weather.WeatherInterfaceImpl;
import com.georgexie.weather.WeatherInterfaceImplService;
/** 
* @Description:  �ð�����ͨ��wsimport �Cs . http://127.0.0.1:12345/weather?wsdl��������com.georgexie.weather�ļ�
 * ��ͬʱ�����Լ�������JAX-WS webservice����
* @Param:  
* @returns:  
* @Author: georgexie 
* @Date: 2019/5/29 0029 15:42
*/
public class Main {
	//ͨ���ͻ��˵���
	public static void main(String[] args) {
		WeatherInterfaceImplService service = new WeatherInterfaceImplService();
		WeatherInterfaceImpl weatherservice = service.getPort(WeatherInterfaceImpl.class);
		String weather = weatherservice.getWeather("����");
		System.out.println(weather);
	}

}
