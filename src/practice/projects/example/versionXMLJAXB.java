package practice.projects.example;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import basic.java.demo.project.JAXB_XML_Java.Country;

/**
 * 
 */
public class versionXMLJAXB {

    /**
     * @param args
     * @throws IOException 
     * @throws SAXException 
     * @throws ParserConfigurationException 
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        // TODO Auto-generated method stub

        loadProductDetails();
    }

    private static void loadProductDetails() throws ParserConfigurationException, SAXException, IOException {

        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        File xmlFile = new File("D:\\VenkataMedapati\\BasicJava_Demos\\src\\practice\\projects\\example\\version.xml");
        if(xmlFile.isFile() && xmlFile.canRead()){
            Document document = builder.parse(xmlFile);
            Element root = document.getDocumentElement();
            NodeList nodeList = root.getChildNodes();
            String data = null;
            for(int a = 0; a < nodeList.getLength(); a++){
                Node node = nodeList.item(a);
                if(node instanceof Element){
                    if(node.getNodeName().equals("ProductInformation")){
                        data = ((Element)node).getAttribute("name");
                        System.out.println("ProductInformation:" + data);
                    }
                    if(node.getNodeName().equals("ZoneInformation")){
                        data = ((Element)node).getAttribute("zone");
                        System.out.println("ProductInformation:" + data);
                    }
                }
            }
        }
        
    }

}
