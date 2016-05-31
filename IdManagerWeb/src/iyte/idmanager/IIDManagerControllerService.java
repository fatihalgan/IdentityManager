/**
 * IIDManagerControllerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package iyte.idmanager;

public interface IIDManagerControllerService extends javax.xml.rpc.Service {
    public java.lang.String getIIDManagerControllerAddress();

    public iyte.idmanager.IIDManagerController getIIDManagerController() throws javax.xml.rpc.ServiceException;

    public iyte.idmanager.IIDManagerController getIIDManagerController(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
