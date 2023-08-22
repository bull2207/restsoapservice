
package com.soap.soapws.wsdl;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.soapws.wsdl package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.soapws.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStudentDetailsRequest }
     * 
     * @return
     *     the new instance of {@link GetStudentDetailsRequest }
     */
    public GetStudentDetailsRequest createGetStudentDetailsRequest() {
        return new GetStudentDetailsRequest();
    }

    /**
     * Create an instance of {@link GetStudentDetailsResponse }
     * 
     * @return
     *     the new instance of {@link GetStudentDetailsResponse }
     */
    public GetStudentDetailsResponse createGetStudentDetailsResponse() {
        return new GetStudentDetailsResponse();
    }

    /**
     * Create an instance of {@link StudentDetails }
     * 
     * @return
     *     the new instance of {@link StudentDetails }
     */
    public StudentDetails createStudentDetails() {
        return new StudentDetails();
    }

    /**
     * Create an instance of {@link CreateStudentDetailsRequest }
     * 
     * @return
     *     the new instance of {@link CreateStudentDetailsRequest }
     */
    public CreateStudentDetailsRequest createCreateStudentDetailsRequest() {
        return new CreateStudentDetailsRequest();
    }

    /**
     * Create an instance of {@link CreateStudentDetailsResponse }
     * 
     * @return
     *     the new instance of {@link CreateStudentDetailsResponse }
     */
    public CreateStudentDetailsResponse createCreateStudentDetailsResponse() {
        return new CreateStudentDetailsResponse();
    }

    /**
     * Create an instance of {@link StudentCreated }
     * 
     * @return
     *     the new instance of {@link StudentCreated }
     */
    public StudentCreated createStudentCreated() {
        return new StudentCreated();
    }

    /**
     * Create an instance of {@link DeleteStudentDetailsRequest }
     * 
     * @return
     *     the new instance of {@link DeleteStudentDetailsRequest }
     */
    public DeleteStudentDetailsRequest createDeleteStudentDetailsRequest() {
        return new DeleteStudentDetailsRequest();
    }

    /**
     * Create an instance of {@link DeleteStudentDetailsResponse }
     * 
     * @return
     *     the new instance of {@link DeleteStudentDetailsResponse }
     */
    public DeleteStudentDetailsResponse createDeleteStudentDetailsResponse() {
        return new DeleteStudentDetailsResponse();
    }

    /**
     * Create an instance of {@link StudentDeleted }
     * 
     * @return
     *     the new instance of {@link StudentDeleted }
     */
    public StudentDeleted createStudentDeleted() {
        return new StudentDeleted();
    }

    /**
     * Create an instance of {@link UpdateStudentDetailsRequest }
     * 
     * @return
     *     the new instance of {@link UpdateStudentDetailsRequest }
     */
    public UpdateStudentDetailsRequest createUpdateStudentDetailsRequest() {
        return new UpdateStudentDetailsRequest();
    }

    /**
     * Create an instance of {@link UpdateStudentDetailsResponse }
     * 
     * @return
     *     the new instance of {@link UpdateStudentDetailsResponse }
     */
    public UpdateStudentDetailsResponse createUpdateStudentDetailsResponse() {
        return new UpdateStudentDetailsResponse();
    }

    /**
     * Create an instance of {@link StudentUpdated }
     * 
     * @return
     *     the new instance of {@link StudentUpdated }
     */
    public StudentUpdated createStudentUpdated() {
        return new StudentUpdated();
    }

}
