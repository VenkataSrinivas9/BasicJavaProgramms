package basic.java.demo.project.DOM_XML;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class DomParserDemo {
   public static void main(String[] args){

      try { 
         File inputFile = new File("D:\\JavaWorkSpace\\BasicJava_Demos\\src\\basic\\java\\demo\\project\\DOM_XML\\StudentsDetails.xml");
         
         // DOM instance
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         
         // normalize method is used to get the node value
         // as a single node value.
         // This basically means that the following XML element
         // <foo>hello
         // wor
         // ld</foo>
         // could be represented like this in a denormalized node:
         // Element foo
         // Text node: ""
         // Text node: "Hello "
         // Text node: "wor"
         // Text node: "ld"
         // When normalized, the node will look like this
         // Element foo
         // Text node: "Hello world"
         doc.getDocumentElement().normalize();
         
         System.out.println("Root element :" + doc.getDocumentElement().getNodeName()); // TO get the root node name
         NodeList nList = doc.getElementsByTagName("student"); // TO get a specific tag name as a node list
         System.out.println("----------------------------");
         for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp); // TO get a single node details from node list
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode; // TO get the element details from node
               System.out.println("Student roll no : " + eElement.getAttribute("rollno")); // TO get the attribute
               // TO get the value to the specific elements tag name
               System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
               System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
               System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
               System.out.println("Marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());
               
               if(eElement.getElementsByTagName("firstname").item(0).getTextContent().equals("Vaneet")){
                   System.out.println("Hiiiiiiiiiiiiiiiiiiiiii");
               }
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}