
package com.virtualpairprogrammers.employeemanagement;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmployeeManagementWebService", targetNamespace = "http://employeemanagement.virtualpairprogrammers.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeManagementWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.virtualpairprogrammers.employeemanagement.Employee
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEmployeeById", targetNamespace = "http://employeemanagement.virtualpairprogrammers.com/", className = "com.virtualpairprogrammers.employeemanagement.GetEmployeeById")
    @ResponseWrapper(localName = "getEmployeeByIdResponse", targetNamespace = "http://employeemanagement.virtualpairprogrammers.com/", className = "com.virtualpairprogrammers.employeemanagement.GetEmployeeByIdResponse")
    public Employee getEmployeeById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.virtualpairprogrammers.employeemanagement.Employee>
     * @throws ServiceUnavailableException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllEmployees", targetNamespace = "http://employeemanagement.virtualpairprogrammers.com/", className = "com.virtualpairprogrammers.employeemanagement.GetAllEmployees")
    @ResponseWrapper(localName = "getAllEmployeesResponse", targetNamespace = "http://employeemanagement.virtualpairprogrammers.com/", className = "com.virtualpairprogrammers.employeemanagement.GetAllEmployeesResponse")
    public List<Employee> getAllEmployees()
        throws ServiceUnavailableException_Exception
    ;

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "registerEmployee", targetNamespace = "http://employeemanagement.virtualpairprogrammers.com/", className = "com.virtualpairprogrammers.employeemanagement.RegisterEmployee")
    @ResponseWrapper(localName = "registerEmployeeResponse", targetNamespace = "http://employeemanagement.virtualpairprogrammers.com/", className = "com.virtualpairprogrammers.employeemanagement.RegisterEmployeeResponse")
    public void registerEmployee(
        @WebParam(name = "arg0", targetNamespace = "")
        Employee arg0);

}