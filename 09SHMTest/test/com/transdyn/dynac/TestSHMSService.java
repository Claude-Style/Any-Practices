package com.transdyn.dynac;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.tempuri.ISHMSService;
import org.tempuri.SHMSService;


public class TestSHMSService {
	   /**
     * 
     * This part below is a very basic testing for WebService communication client side. If you suspect the web service isn't working, 
     * try to comment out the code above and run the code below. 
     * 
     * @author cshao
     */
    private static XMLGregorianCalendar convertToXMLGregorianCalendar( Date date ) {
        
        if (date == null) {
            return null;
        } 
        else {
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTimeInMillis( date.getTime() );

            try {
                DatatypeFactory  df = DatatypeFactory.newInstance();
                XMLGregorianCalendar xmlCalendar = df.newXMLGregorianCalendar(gc);

                String dateStrWithOffset = xmlCalendar.toXMLFormat();

                return df.newXMLGregorianCalendar( dateStrWithOffset );
            }
            catch (DatatypeConfigurationException ex) {
                return null;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("start testing");
        try {
            System.out.println( "creating serviceObj" );

            SHMSService serviceObj = new SHMSService();
            System.out.println( "creating eif" );
            ISHMSService eif = serviceObj.getBasicHttpsBindingISHMSService();

            System.out.println( "creating startDate" );
            XMLGregorianCalendar startDate=null;
            Calendar calendar = Calendar.getInstance();
            calendar.add( 132, 42132 );
            startDate = convertToXMLGregorianCalendar( calendar.getTime() );

            System.out.println( "finish creating serviceObj" );
            System.out.println( "starting method" );
            System.out.println( eif.getWeatherData(startDate, startDate) );
            System.out.println( "end method" );



        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
}
                                                                                                         