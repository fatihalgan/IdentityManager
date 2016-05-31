/**
 * IIDManagerControllerSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package iyte.idmanager;

public class IIDManagerControllerSoapBindingSkeleton implements iyte.idmanager.IIDManagerController, org.apache.axis.wsdl.Skeleton {
    private iyte.idmanager.IIDManagerController impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getAuthenticableSubject", _params, new javax.xml.namespace.QName("", "getAuthenticableSubjectReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("urn:idmanager.iyte", "IYTEOrgPerson"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:idmanager.iyte", "getAuthenticableSubject"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAuthenticableSubject") == null) {
            _myOperations.put("getAuthenticableSubject", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAuthenticableSubject")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:idmanager.iyte", "IYTEOrgPerson"), iyte.idmanager.IYTEOrgPerson.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("authenticate", _params, new javax.xml.namespace.QName("", "authenticateReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("urn:idmanager.iyte", "IYTEOrgPerson"));
        _oper.setElementQName(new javax.xml.namespace.QName("urn:idmanager.iyte", "authenticate"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("authenticate") == null) {
            _myOperations.put("authenticate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("authenticate")).add(_oper);
    }

    public IIDManagerControllerSoapBindingSkeleton() {
        this.impl = new iyte.idmanager.IIDManagerControllerSoapBindingImpl();
    }

    public IIDManagerControllerSoapBindingSkeleton(iyte.idmanager.IIDManagerController impl) {
        this.impl = impl;
    }
    public iyte.idmanager.IYTEOrgPerson getAuthenticableSubject(java.lang.String in0) throws java.rmi.RemoteException
    {
        iyte.idmanager.IYTEOrgPerson ret = impl.getAuthenticableSubject(in0);
        return ret;
    }

    public iyte.idmanager.IYTEOrgPerson authenticate(iyte.idmanager.IYTEOrgPerson in0, java.lang.String in1) throws java.rmi.RemoteException
    {
        iyte.idmanager.IYTEOrgPerson ret = impl.authenticate(in0, in1);
        return ret;
    }

}
