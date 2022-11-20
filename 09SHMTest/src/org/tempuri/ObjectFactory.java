
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.shmslibrary_module.ArrayOfWeatherItem;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _SubmitWIMSFile_QNAME = new QName("http://tempuri.org/", "file");
    private final static QName _GetWeatherDataResponseGetWeatherDataResult_QNAME = new QName("http://tempuri.org/", "GetWeatherDataResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWeatherDataResponse }
     * 
     */
    public GetWeatherDataResponse createGetWeatherDataResponse() {
        return new GetWeatherDataResponse();
    }

    /**
     * Create an instance of {@link SubmitWIMSResponse }
     * 
     */
    public SubmitWIMSResponse createSubmitWIMSResponse() {
        return new SubmitWIMSResponse();
    }

    /**
     * Create an instance of {@link SubmitWIMS }
     * 
     */
    public SubmitWIMS createSubmitWIMS() {
        return new SubmitWIMS();
    }

    /**
     * Create an instance of {@link GetWeatherData }
     * 
     */
    public GetWeatherData createGetWeatherData() {
        return new GetWeatherData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "file", scope = SubmitWIMS.class)
    public JAXBElement<byte[]> createSubmitWIMSFile(byte[] value) {
        return new JAXBElement<byte[]>(_SubmitWIMSFile_QNAME, byte[].class, SubmitWIMS.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWeatherItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetWeatherDataResult", scope = GetWeatherDataResponse.class)
    public JAXBElement<ArrayOfWeatherItem> createGetWeatherDataResponseGetWeatherDataResult(ArrayOfWeatherItem value) {
        return new JAXBElement<ArrayOfWeatherItem>(_GetWeatherDataResponseGetWeatherDataResult_QNAME, ArrayOfWeatherItem.class, GetWeatherDataResponse.class, value);
    }

}
