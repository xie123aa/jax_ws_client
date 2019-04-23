package test;

import com.gyf.mobile.ws.MobileCodeWS;
import com.gyf.mobile.ws.MobileCodeWSSoap;

import javax.xml.namespace.QName;
import java.net.URL;
import javax.xml.ws.Service;
/**
 * @Author: georgexie
 * @Date: 2019/4/11 0011 16:51
 * @Version 1.0
 * 使用service方法调用webservice接口
 */
public class Main1 {
    //通过客户端调用
    public static void main(String[] args) {
        MobileCodeWS ws =new MobileCodeWS();//获取服务窗口
        MobileCodeWSSoap soap=ws.getPort(MobileCodeWSSoap.class);//通过服务窗口获取服务点
        String info =soap.getMobileCodeInfo("13085082960",null);//调用服务方法
        System.out.println(info);


    }
}
