package basic.java.demo.project.JAXB_XML_Java;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 * 
 */
public class JAXBJavaTOXML {

    public static void main(String[] args) {

        Country countryIndia = new Country();
        countryIndia.setCountryName("India");
        countryIndia.setCountryPopulation(5000000);

        ArrayList<State> stateList = new ArrayList<State>();
        State apState = new State("Andhra Pradesh", 10000);
        stateList.add(apState);
        State tnState = new State("Tamil Nadu", 200000);
        stateList.add(tnState);

        countryIndia.setListOfStates(stateList);
        try {
            // Create a instance of Context
            JAXBContext context = JAXBContext.newInstance(Country.class);
            // Create unmarshaller from this context object
            Marshaller jaxbMarshaller = context.createMarshaller();
            // Schema Factory instance
            // SchemaFactory schemafactory =
            // SchemaFactory.newInstance("http://www.w3.org/XML/1998/namespace");
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
                    Boolean.TRUE);
            // InputStream os the Schema Source
            File XMLFile = new File("D:\\VenkataMedapati\\BasicJava_Demos\\src\\basic\\java\\demo\\project\\JAXB_XML_Java\\Marshaller.xml");
            jaxbMarshaller.marshal(countryIndia, XMLFile);

            jaxbMarshaller.marshal(countryIndia, System.out);

        }
        catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

}

// tr