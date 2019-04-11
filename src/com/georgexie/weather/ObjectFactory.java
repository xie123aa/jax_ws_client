
package com.georgexie.weather;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.georgexie.weather package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetWeatherResponse_QNAME = new QName("http://weather.georgexie.com/", "getWeatherResponse");
    private final static QName _GetWeather_QNAME = new QName("http://weather.georgexie.com/", "getWeather");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.georgexie.weather
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWeather }
     * 
     */
    public GetWeather createGetWeather() {
        return new GetWeather();
    }

    /**
     * Create an instance of {@link GetWeatherResponse }
     * 
     */
    public GetWeatherResponse createGetWeatherResponse() {
        return new GetWeatherResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://weather.georgexie.com/", name = "getWeatherResponse")
    public JAXBElement<GetWeatherResponse> createGetWeatherResponse(GetWeatherResponse value) {
        return new JAXBElement<GetWeatherResponse>(_GetWeatherResponse_QNAME, GetWeatherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://weather.georgexie.com/", name = "getWeather")
    public JAXBElement<GetWeather> createGetWeather(GetWeather value) {
        return new JAXBElement<GetWeather>(_GetWeather_QNAME, GetWeather.class, null, value);
    }

}
