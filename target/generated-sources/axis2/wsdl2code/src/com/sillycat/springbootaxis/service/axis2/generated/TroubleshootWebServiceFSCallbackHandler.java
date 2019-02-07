/**
 * TroubleshootWebServiceFSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.sillycat.springbootaxis.service.axis2.generated;


/**
 *  TroubleshootWebServiceFSCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class TroubleshootWebServiceFSCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public TroubleshootWebServiceFSCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public TroubleshootWebServiceFSCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for connectionError method
     * override this method for handling normal response from connectionError operation
     */
    public void receiveResultconnectionError(
        com.intuit.developer.ConnectionErrorResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from connectionError operation
     */
    public void receiveErrorconnectionError(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for sendRequestXML method
     * override this method for handling normal response from sendRequestXML operation
     */
    public void receiveResultsendRequestXML(
        com.intuit.developer.SendRequestXMLResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from sendRequestXML operation
     */
    public void receiveErrorsendRequestXML(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for serverVersion method
     * override this method for handling normal response from serverVersion operation
     */
    public void receiveResultserverVersion(
        com.intuit.developer.ServerVersionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from serverVersion operation
     */
    public void receiveErrorserverVersion(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getLastError method
     * override this method for handling normal response from getLastError operation
     */
    public void receiveResultgetLastError(
        com.intuit.developer.GetLastErrorResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getLastError operation
     */
    public void receiveErrorgetLastError(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for authenticate method
     * override this method for handling normal response from authenticate operation
     */
    public void receiveResultauthenticate(
        com.intuit.developer.AuthenticateResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from authenticate operation
     */
    public void receiveErrorauthenticate(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for receiveResponseXML method
     * override this method for handling normal response from receiveResponseXML operation
     */
    public void receiveResultreceiveResponseXML(
        com.intuit.developer.ReceiveResponseXMLResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from receiveResponseXML operation
     */
    public void receiveErrorreceiveResponseXML(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for clientVersion method
     * override this method for handling normal response from clientVersion operation
     */
    public void receiveResultclientVersion(
        com.intuit.developer.ClientVersionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from clientVersion operation
     */
    public void receiveErrorclientVersion(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for closeConnection method
     * override this method for handling normal response from closeConnection operation
     */
    public void receiveResultcloseConnection(
        com.intuit.developer.CloseConnectionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from closeConnection operation
     */
    public void receiveErrorcloseConnection(java.lang.Exception e) {
    }
}
