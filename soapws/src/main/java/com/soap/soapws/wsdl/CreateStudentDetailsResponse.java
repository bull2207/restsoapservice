
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
 *         <element name="StudentCreated" type="{http://in28minutes.com/students}StudentCreated"/>
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
    "studentCreated"
})
@XmlRootElement(name = "CreateStudentDetailsResponse")
public class CreateStudentDetailsResponse {

    @XmlElement(name = "StudentCreated", required = true)
    protected StudentCreated studentCreated;

    /**
     * Gets the value of the studentCreated property.
     * 
     * @return
     *     possible object is
     *     {@link StudentCreated }
     *     
     */
    public StudentCreated getStudentCreated() {
        return studentCreated;
    }

    /**
     * Sets the value of the studentCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentCreated }
     *     
     */
    public void setStudentCreated(StudentCreated value) {
        this.studentCreated = value;
    }

}
