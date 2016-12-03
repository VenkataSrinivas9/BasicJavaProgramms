package basic.java.demo.project.Modify_XML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
// @XmlRootElement(namespace = 'practice.projects.example.Country')
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "State")
public class State {

    private String stateName;

    long statePopulation;

    public State() {

    }

    public State(String stateName, long statePopulation) {
        super();
        this.stateName = stateName;
        this.statePopulation = statePopulation;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public long getStatePopulation() {
        return statePopulation;
    }

    public void setStatePopulation(long statePopulation) {
        this.statePopulation = statePopulation;
    }

}
