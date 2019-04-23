package test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Author: georgexie
 * @Date: 2019/4/12 0012 14:57
 * @Version 1.0
 * ����httpclientƴ���ַ����ķ���������Ҫ���ɽӿ�
 */
public class Main3 {
    public static void main(String[] args) throws IOException {
        //��һ�������������ַ������WSDL��ַ
//        URL url = new URL("http://webservice.webxml.com.cn/WebServices/MobileCodeWS.asmx");
        URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx");
        //�ڶ�������һ��ͨ������ַ������
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //�����������ò���
        //3.1���ͷ�ʽ���ã�POST�����д
        connection.setRequestMethod("POST");
        //3.2�������ݸ�ʽ��content-type
        connection.setRequestProperty("content-type", "text/xml;charset=utf-8");
        connection.setRequestProperty("SOAPAction", "http://WebXml.com.cn/getMobileCodeInfo");
        //3.3���������������ΪĬ���´�����connectionû�ж�дȨ�ޣ�
        connection.setDoInput(true);
        connection.setDoOutput(true);

        //���Ĳ�����֯SOAP���ݣ���������
        String soapXML = getXML("13085082960");
        OutputStream os = connection.getOutputStream();
        os.write(soapXML.getBytes());
        //���岽�����շ������Ӧ����ӡ
        int responseCode = connection.getResponseCode();
        if (200 == responseCode) {//��ʾ�������Ӧ�ɹ�
            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            StringBuilder sb = new StringBuilder();
            String temp = null;
            while (null != (temp = br.readLine())) {
                sb.append(temp);
            }
            System.out.println(sb.toString());

            is.close();
            isr.close();
            br.close();
        }

        os.close();
    }

    /**
     * <?xml version="1.0" encoding="utf-8"?>
     * <soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
     * <soap:Body>
     * <getMobileCodeInfo xmlns="http://WebXml.com.cn/">
     * <mobileCode>string</mobileCode>
     * <userID>string</userID>
     * </getMobileCodeInfo>
     * </soap:Body>
     * </soap:Envelope>
     *
     * @param phoneNum
     * @return
     */
    public static String getXML(String phoneNum) {
        String soapXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                + "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                + "<soap:Body>"
                + "<getMobileCodeInfo xmlns=\"http://WebXml.com.cn/\">"
                + "<mobileCode>" + phoneNum + "</mobileCode>"
                + "<userID></userID>"
                + "</getMobileCodeInfo>"
                + "</soap:Body>"
                + "</soap:Envelope>";
        return soapXML;

    }
}
