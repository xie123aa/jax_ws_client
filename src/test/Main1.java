package test;

import com.gyf.mobile.ws.MobileCodeWS;
import com.gyf.mobile.ws.MobileCodeWSSoap;

import javax.xml.namespace.QName;
import java.net.URL;
import javax.xml.ws.Service;
/** 
* @Description: 第一种:客户端方式【推荐使用】,同样需要
 * wsimport -p com.gyf.mobile.ws -s . http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl
 * 生成com.gyf.mobile文件，这次调用外部服务
* @Param:
* @returns:
* @Author: georgexie 
* @Date: 2019/5/29 0029 16:02
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
