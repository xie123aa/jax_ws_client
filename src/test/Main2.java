package test;

import com.gyf.mobile.ws.MobileCodeWSSoap;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**通过service方法调用
 * @Author: georgexie
 * @Date: 2019/4/12 0012 14:47
 * @Version 1.0
 *  *  Title: ServiceClient.java
 *  Description:Service编程实现服务端调用
 *  这种方式同样需要wsimport生成客户端代码,只不过仅需要将服务接口类引入即可，例如如果需要
 *  <wsdl:port name="MobileCodeWSSoap" binding="tns:MobileCodeWSSoap">
 *  端口服务，则需要将生成的MobileCodeWSSoap.class类引入
 *  仅需要以上接口类
 */
public class Main2 {
    public static void main(String[] args)throws Exception {
        //创建WSDL的URL，注意不是服务地址
        URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");

        //创建服务名称
        //1.namespaceURI - 命名空间地址 (wsdl文档中的targetNamespace)
        //2.localPart - 服务视图名  (wsdl文档中服务名称，例如<wsdl:service name="MobileCodeWS">)
        QName qname = new QName("http://WebXml.com.cn/", "MobileCodeWS");

        //创建服务视图
        //参数解释：
        //1.wsdlDocumentLocation - wsdl地址
        //2.serviceName - 服务名称
        Service service = Service.create(url, qname);
        //获取服务实现类
        //参数解释:serviceEndpointInterface - 服务端口(wsdl文档中服务端口的name属性，例如<wsdl:port name="MobileCodeWSSoap" binding="tns:MobileCodeWSSoap">)
        MobileCodeWSSoap mobileCodeWSSoap = service.getPort(MobileCodeWSSoap.class);
        //调用查询方法
        String result = mobileCodeWSSoap.getMobileCodeInfo("13085082960", "");
        System.out.println(result);
    }
}

