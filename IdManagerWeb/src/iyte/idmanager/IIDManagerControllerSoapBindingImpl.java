/**
 * IIDManagerControllerSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package iyte.idmanager;

public class IIDManagerControllerSoapBindingImpl implements iyte.idmanager.IIDManagerController{
	IDManagerController controller = new IDManagerController(); 
    public iyte.idmanager.IYTEOrgPerson getAuthenticableSubject(java.lang.String in0) throws java.rmi.RemoteException {
        return controller.getAuthenticableSubject(in0);
    }

    public iyte.idmanager.IYTEOrgPerson authenticate(iyte.idmanager.IYTEOrgPerson in0, java.lang.String in1) throws java.rmi.RemoteException {
        return controller.authenticate(in0,in1);
    }

}
