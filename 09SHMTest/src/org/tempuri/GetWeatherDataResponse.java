
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.shmslibrary_module.ArrayOfWeatherItem;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetWeatherDataResult" type="{http://schemas.datacontract.org/2004/07/SHMSLibrary.Module.Weather}ArrayOfWeatherItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getWeatherDataResult"
})
@XmlRootElement(name = "GetWeatherDataResponse")
public class GetWeatherDataResponse {

    @XmlElementRef(name = "GetWeatherDataResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWeatherItem> getWeatherDataResult;

    /**
     * Gets the value of the getWeatherDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWeatherItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWeatherItem> getGetWeatherDataResult() {
        return getWeatherDataResult;
    }

    /**
     * Sets the value of the getWeatherDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWeatherItem }{@code >}
     *     
     */
    public void setGetWeatherDataResult(JAXBElement<ArrayOfWeatherItem> value) {
        this.getWeatherDataResult = value;
    }

}
