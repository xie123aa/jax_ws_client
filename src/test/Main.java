package test;

import com.georgexie.weather.WeatherInterfaceImpl;
import com.georgexie.weather.WeatherInterfaceImplService;

public class Main {
	//ͨ���ͻ��˵���
	public static void main(String[] args) {
		WeatherInterfaceImplService service = new WeatherInterfaceImplService();
		WeatherInterfaceImpl weatherservice = service.getPort(WeatherInterfaceImpl.class);
		String weather = weatherservice.getWeather("����");
		System.out.println(weather);
	}

}
