package test;

import com.gyf.mobile.ws.MobileCodeWS;
import com.gyf.mobile.ws.MobileCodeWSSoap;

import javax.xml.namespace.QName;
import java.net.URL;
import javax.xml.ws.Service;
/** 
* @Description: ��һ��:�ͻ��˷�ʽ���Ƽ�ʹ�á�,ͬ����Ҫ
 * wsimport -p com.gyf.mobile.ws -s . http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl
 * ����com.gyf.mobile�ļ�����ε����ⲿ����
* @Param:
* @returns:
* @Author: georgexie 
* @Date: 2019/5/29 0029 16:02
*/
public class Main1 {
    //ͨ���ͻ��˵���
    public static void main(String[] args) {
        MobileCodeWS ws =new MobileCodeWS();//��ȡ���񴰿�
        MobileCodeWSSoap soap=ws.getPort(MobileCodeWSSoap.class);//ͨ�����񴰿ڻ�ȡ�����
        String info =soap.getMobileCodeInfo("13085082960",null);//���÷��񷽷�
        System.out.println(info);


    }
}
