/**
 * TroubleshootWebServiceFSSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.sillycat.springbootaxis.service.axis2.generated;

/**
 *  TroubleshootWebServiceFSSkeletonInterface java skeleton interface for the axisService
 */
public interface TroubleshootWebServiceFSSkeletonInterface {
    /**
     * Auto generated method signature
     * This web method facilitates web service to handle connection error between QBWC and QB
     * @param connectionError
     */
    public com.intuit.developer.ConnectionErrorResponse connectionError(
        com.intuit.developer.ConnectionError connectionError);

    /**
     * Auto generated method signature
     * This web method facilitates web service to send request XML to QuickBooks via QBWebConnector
     * @param sendRequestXML
     */
    public com.intuit.developer.SendRequestXMLResponse sendRequestXML(
        com.intuit.developer.SendRequestXML sendRequestXML);

    /**
     * Auto generated method signature
     *
     * @param serverVersion
     */
    public com.intuit.developer.ServerVersionResponse serverVersion(
        com.intuit.developer.ServerVersion serverVersion);

    /**
     * Auto generated method signature
     *
     * @param getLastError
     */
    public com.intuit.developer.GetLastErrorResponse getLastError(
        com.intuit.developer.GetLastError getLastError);

    /**
     * Auto generated method signature
     *
     * @param authenticate
     */
    public com.intuit.developer.AuthenticateResponse authenticate(
        com.intuit.developer.Authenticate authenticate);

    /**
     * Auto generated method signature
     * This web method facilitates web service to receive response XML from QuickBooks via QBWebConnector
     * @param receiveResponseXML
     */
    public com.intuit.developer.ReceiveResponseXMLResponse receiveResponseXML(
        com.intuit.developer.ReceiveResponseXML receiveResponseXML);

    /**
     * Auto generated method signature
     *
     * @param clientVersion
     */
    public com.intuit.developer.ClientVersionResponse clientVersion(
        com.intuit.developer.ClientVersion clientVersion);

    /**
     * Auto generated method signature
     *
     * @param closeConnection
     */
    public com.intuit.developer.CloseConnectionResponse closeConnection(
        com.intuit.developer.CloseConnection closeConnection);
}
