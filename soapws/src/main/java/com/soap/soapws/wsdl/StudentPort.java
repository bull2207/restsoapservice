
package com.soap.soapws.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "StudentPort", targetNamespace = "http://in28minutes.com/students")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentPort {


    /**
     * 
     * @param createStudentDetailsRequest
     * @return
     *     returns com.soap.soapws.wsdl.CreateStudentDetailsResponse
     */
    @WebMethod(operationName = "CreateStudentDetails")
    @WebResult(name = "CreateStudentDetailsResponse", targetNamespace = "http://in28minutes.com/students", partName = "CreateStudentDetailsResponse")
    public CreateStudentDetailsResponse createStudentDetails(
        @WebParam(name = "CreateStudentDetailsRequest", targetNamespace = "http://in28minutes.com/students", partName = "CreateStudentDetailsRequest")
        CreateStudentDetailsRequest createStudentDetailsRequest);

    /**
     * 
     * @param getStudentDetailsRequest
     * @return
     *     returns com.soap.soapws.wsdl.GetStudentDetailsResponse
     */
    @WebMethod(operationName = "GetStudentDetails")
    @WebResult(name = "GetStudentDetailsResponse", targetNamespace = "http://in28minutes.com/students", partName = "GetStudentDetailsResponse")
    public GetStudentDetailsResponse getStudentDetails(
        @WebParam(name = "GetStudentDetailsRequest", targetNamespace = "http://in28minutes.com/students", partName = "GetStudentDetailsRequest")
        GetStudentDetailsRequest getStudentDetailsRequest);

    /**
     * 
     * @param updateStudentDetailsRequest
     * @return
     *     returns com.soap.soapws.wsdl.UpdateStudentDetailsResponse
     */
    @WebMethod(operationName = "UpdateStudentDetails")
    @WebResult(name = "UpdateStudentDetailsResponse", targetNamespace = "http://in28minutes.com/students", partName = "UpdateStudentDetailsResponse")
    public UpdateStudentDetailsResponse updateStudentDetails(
        @WebParam(name = "UpdateStudentDetailsRequest", targetNamespace = "http://in28minutes.com/students", partName = "UpdateStudentDetailsRequest")
        UpdateStudentDetailsRequest updateStudentDetailsRequest);

    /**
     * 
     * @param deleteStudentDetailsRequest
     * @return
     *     returns com.soap.soapws.wsdl.DeleteStudentDetailsResponse
     */
    @WebMethod(operationName = "DeleteStudentDetails")
    @WebResult(name = "DeleteStudentDetailsResponse", targetNamespace = "http://in28minutes.com/students", partName = "DeleteStudentDetailsResponse")
    public DeleteStudentDetailsResponse deleteStudentDetails(
        @WebParam(name = "DeleteStudentDetailsRequest", targetNamespace = "http://in28minutes.com/students", partName = "DeleteStudentDetailsRequest")
        DeleteStudentDetailsRequest deleteStudentDetailsRequest);

}