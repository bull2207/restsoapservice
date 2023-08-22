
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
 *         <element name="StudentDeleted" type="{http://in28minutes.com/students}StudentDeleted"/>
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
    "studentDeleted"
})
@XmlRootElement(name = "DeleteStudentDetailsResponse")
public class DeleteStudentDetailsResponse {

    @XmlElement(name = "StudentDeleted", required = true)
    protected StudentDeleted studentDeleted;

    /**
     * Gets the value of the studentDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link StudentDeleted }
     *     
     */
    public StudentDeleted getStudentDeleted() {
        return studentDeleted;
    }

    /**
     * Sets the value of the studentDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentDeleted }
     *     
     */
    public void setStudentDeleted(StudentDeleted value) {
        this.studentDeleted = value;
    }

}
