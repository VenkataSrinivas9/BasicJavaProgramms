package basic.java.demo.project.Modify_XML;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 */
// Defines the root element of the XML
@XmlRootElement
// // Option: TO set the order of the XML
// @XmlType(propOrder = { 'countryName','countryPopulation','listOfStates'})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Country")
public class Country {

    private String countryName;

    private double countryPopulation;

    @XmlElement(name = "States")
    private ArrayList<State> listOfStates;

    public Country() {

    }

    public String getCountryName() {
        return countryName;
    }

    // Used to define element inXML
    // @XmlElement
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getCountryPopulation() {
        return countryPopulation;
    }

    // Used to define element inXML
    // @XmlElement
    public void setCountryPopulation(double countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public ArrayList<State> getListOfStates() {
        return listOfStates;
    }

    public void setListOfStates(ArrayList<State> listOfStates) {
        this.listOfStates = listOfStates;
    }

}
