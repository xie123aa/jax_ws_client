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
 * ʹ��service��������webservice�ӿ�
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
