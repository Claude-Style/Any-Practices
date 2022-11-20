
package org.datacontract.schemas._2004._07.shmslibrary_module;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.shmslibrary_module package. 
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

    private final static QName _ArrayOfWeatherItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/SHMSLibrary.Module.Weather", "ArrayOfWeatherItem");
    private final static QName _WeatherItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/SHMSLibrary.Module.Weather", "WeatherItem");
    private final static QName _WeatherItemSensorName_QNAME = new QName("http://schemas.datacontract.org/2004/07/SHMSLibrary.Module.Weather", "SensorName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.shmslibrary_module
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfWeatherItem }
     * 
     */
    public ArrayOfWeatherItem createArrayOfWeatherItem() {
        return new ArrayOfWeatherItem();
    }

    /**
     * Create an instance of {@link WeatherItem }
     * 
     */
    public WeatherItem createWeatherItem() {
        return new WeatherItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWeatherItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SHMSLibrary.Module.Weather", name = "ArrayOfWeatherItem")
    public JAXBElement<ArrayOfWeatherItem> createArrayOfWeatherItem(ArrayOfWeatherItem value) {
        return new JAXBElement<ArrayOfWeatherItem>(_ArrayOfWeatherItem_QNAME, ArrayOfWeatherItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeatherItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SHMSLibrary.Module.Weather", name = "WeatherItem")
    public JAXBElement<WeatherItem> createWeatherItem(WeatherItem value) {
        return new JAXBElement<WeatherItem>(_WeatherItem_QNAME, WeatherItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SHMSLibrary.Module.Weather", name = "SensorName", scope = WeatherItem.class)
    public JAXBElement<String> createWeatherItemSensorName(String value) {
        return new JAXBElement<String>(_WeatherItemSensorName_QNAME, String.class, WeatherItem.class, value);
    }

}
