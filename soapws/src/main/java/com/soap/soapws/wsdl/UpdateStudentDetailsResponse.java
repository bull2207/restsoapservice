
package com.soap.soapws.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StudentUpdated" type="{http://in28minutes.com/students}StudentUpdated"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentUpdated"
})
@XmlRootElement(name = "UpdateStudentDetailsResponse")
public class UpdateStudentDetailsResponse {

    @XmlElement(name = "StudentUpdated", required = true)
    protected StudentUpdated studentUpdated;

    /**
     * Gets the value of the studentUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link StudentUpdated }
     *     
     */
    public StudentUpdated getStudentUpdated() {
        return studentUpdated;
    }

    /**
     * Sets the value of the studentUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentUpdated }
     *     
     */
    public void setStudentUpdated(StudentUpdated value) {
        this.studentUpdated = value;
    }

}
