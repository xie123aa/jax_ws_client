package test;

import com.georgexie.weather.WeatherInterfaceImpl;
import com.georgexie.weather.WeatherInterfaceImplService;

public class Main {
	//通过客户端调用
	public static void main(String[] args) {
		WeatherInterfaceImplService service = new WeatherInterfaceImplService();
		WeatherInterfaceImpl weatherservice = service.getPort(WeatherInterfaceImpl.class);
		String weather = weatherservice.getWeather("安徽");
		System.out.println(weather);
	}

}
