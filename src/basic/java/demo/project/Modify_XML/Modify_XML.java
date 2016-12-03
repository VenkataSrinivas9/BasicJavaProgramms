package basic.java.demo.project.Modify_XML;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import basic.java.demo.project.JAXB_XML_Java.Country;
import basic.java.demo.project.JAXB_XML_Java.State;

/**
 * 
 */
public class Modify_XML {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            File file = new File("D:\\VenkataMedapati\\BasicJava_Demos\\src\\basic\\java\\demo\\project\\Modify_XML\\country.xml");
            Document doc = db.parse(file);

            NodeList country = doc.getElementsByTagName("country");
            if (country != null && country.getLength() > 0) {
                for (int i = 0; i < country.getLength(); i++) {
                    Node countrydetails = country.item(i);
                    // Adding a new Element TotalStates
                    Element totalStates = doc.createElement("TotalStates");
                    totalStates.appendChild(doc.createTextNode("29"));
                    // countrydetails.appendChild(totalStates);
                    countrydetails.insertBefore(totalStates, doc.getElementsByTagName("countryPopulation").item(0).getNextSibling());
                    System.out.println("Added");
                }
            }

//            NodeList states = doc.getElementsByTagName("States");
//            if (states != null && states.getLength() > 0) {
//                for (int i = 0; i < states.getLength(); i++) {
//                    Node statedetails = states.item(i);
//                    String str = statedetails.getTextContent();
//                    // if (str.contains("Fury")) {
//                    // if StateName = Fury, Delete its States element(its Parent
//                    // element)
//                    // statedetails.getParentNode().removeChild(statedetails);
//                    // System.out.println("Removed");
//                    // }
//
//                    // Adding a new Element age
//                    // Element age = doc.createElement("age");
//                    // age.appendChild(doc.createTextNode("28"));
//                    // statedetails.appendChild(age);
//                    // System.out.println("Added");
//                    
//                    for (int j = 0; j < statedetails.getChildNodes()
//                            .getLength(); j++) {
//                        Node stateName = statedetails.getChildNodes().item(j);
//                        String stateNameStr = stateName.getTextContent();
//
//                        // if (stateNameStr.contains("Fury")) {
//                        // if StateName = Fury, Delete its StateName element(this element only)
//                        // stateName.getParentNode().removeChild(stateName);
//                        // System.out.println("Removed");
//                        // }
//
//                        // if (stateNameStr.equals("10000")) {
//                        // // if stateNameStr = 10000, Polulation is updated to 90000
//                        // stateName.setTextContent("90000");
//                        // System.out.println("Updated");
//                        // }
//                    }
//
//                }
//            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            // used to print xml in format
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);
            System.out.println("Done");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}