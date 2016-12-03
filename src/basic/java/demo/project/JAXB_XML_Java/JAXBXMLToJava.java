package basic.java.demo.project.JAXB_XML_Java;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 * 
 */
public class JAXBXMLToJava {

    /**
     * @param args
     */
    public static void main(String[] args) {

        try {
            // Create a instance of Context
            JAXBContext context = JAXBContext.newInstance(Country.class);
            // Create unmarshaller from this context object
            Unmarshaller jaxbUnmarshaller = context.createUnmarshaller();
            // Schema Factory instance
            // SchemaFactory schemafactory =
            // SchemaFactory.newInstance("http://www.w3.org/XML/1998/namespace");
            // InputStream os the Schema Source
            File XMLFile = new File("D:\\VenkataMedapati\\BasicJava_Demos\\src\\basic\\java\\demo\\project\\JAXB_XML_Java\\Marshaller.xml");

            Country countryIndia = (Country) jaxbUnmarshaller
                    .unmarshal(XMLFile);

            System.out
                    .println("Country Name: " + countryIndia.getCountryName());
            System.out.println("Country Name: "
                    + countryIndia.getCountryPopulation());

            ArrayList<State> listOfStates = countryIndia.getListOfStates();

            int i = 0;
            for (State state : listOfStates) {
                i++;
                System.out.println("State: " + i + ". " + state.getStateName()
                        + " " + state.getStatePopulation());
            }

        }
        catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
