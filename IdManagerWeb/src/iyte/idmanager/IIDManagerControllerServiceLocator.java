/**
 * IIDManagerControllerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package iyte.idmanager;

public class IIDManagerControllerServiceLocator extends org.apache.axis.client.Service implements iyte.idmanager.IIDManagerControllerService {

    public IIDManagerControllerServiceLocator() {
    }


    public IIDManagerControllerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IIDManagerControllerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IIDManagerController
    private java.lang.String IIDManagerController_address = "http://localhost:8080/IdManagerWeb/services/IIDManagerController";

    public java.lang.String getIIDManagerControllerAddress() {
        return IIDManagerController_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IIDManagerControllerWSDDServiceName = "IIDManagerController";

    public java.lang.String getIIDManagerControllerWSDDServiceName() {
        return IIDManagerControllerWSDDServiceName;
    }

    public void setIIDManagerControllerWSDDServiceName(java.lang.String name) {
        IIDManagerControllerWSDDServiceName = name;
    }

    public iyte.idmanager.IIDManagerController getIIDManagerController() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IIDManagerController_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIIDManagerController(endpoint);
    }

    public iyte.idmanager.IIDManagerController getIIDManagerController(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iyte.idmanager.IIDManagerControllerSoapBindingStub _stub = new iyte.idmanager.IIDManagerControllerSoapBindingStub(portAddress, this);
            _stub.setPortName(getIIDManagerControllerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIIDManagerControllerEndpointAddress(java.lang.String address) {
        IIDManagerController_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iyte.idmanager.IIDManagerController.class.isAssignableFrom(serviceEndpointInterface)) {
                iyte.idmanager.IIDManagerControllerSoapBindingStub _stub = new iyte.idmanager.IIDManagerControllerSoapBindingStub(new java.net.URL(IIDManagerController_address), this);
                _stub.setPortName(getIIDManagerControllerWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IIDManagerController".equals(inputPortName)) {
            return getIIDManagerController();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:idmanager.iyte", "IIDManagerControllerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:idmanager.iyte", "IIDManagerController"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IIDManagerController".equals(portName)) {
            setIIDManagerControllerEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
