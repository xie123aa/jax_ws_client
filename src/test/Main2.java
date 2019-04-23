package test;

import com.gyf.mobile.ws.MobileCodeWSSoap;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**ͨ��service��������
 * @Author: georgexie
 * @Date: 2019/4/12 0012 14:47
 * @Version 1.0
 *  *  Title: ServiceClient.java
 *  Description:Service���ʵ�ַ���˵���
 *  ���ַ�ʽͬ����Ҫwsimport���ɿͻ��˴���,ֻ��������Ҫ������ӿ������뼴�ɣ����������Ҫ
 *  <wsdl:port name="MobileCodeWSSoap" binding="tns:MobileCodeWSSoap">
 *  �˿ڷ�������Ҫ�����ɵ�MobileCodeWSSoap.class������
 *  ����Ҫ���Ͻӿ���
 */
public class Main2 {
    public static void main(String[] args)throws Exception {
        //����WSDL��URL��ע�ⲻ�Ƿ����ַ
        URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");

        //������������
        //1.namespaceURI - �����ռ��ַ (wsdl�ĵ��е�targetNamespace)
        //2.localPart - ������ͼ��  (wsdl�ĵ��з������ƣ�����<wsdl:service name="MobileCodeWS">)
        QName qname = new QName("http://WebXml.com.cn/", "MobileCodeWS");

        //����������ͼ
        //�������ͣ�
        //1.wsdlDocumentLocation - wsdl��ַ
        //2.serviceName - ��������
        Service service = Service.create(url, qname);
        //��ȡ����ʵ����
        //��������:serviceEndpointInterface - ����˿�(wsdl�ĵ��з���˿ڵ�name���ԣ�����<wsdl:port name="MobileCodeWSSoap" binding="tns:MobileCodeWSSoap">)
        MobileCodeWSSoap mobileCodeWSSoap = service.getPort(MobileCodeWSSoap.class);
        //���ò�ѯ����
        String result = mobileCodeWSSoap.getMobileCodeInfo("13085082960", "");
        System.out.println(result);
    }
}

