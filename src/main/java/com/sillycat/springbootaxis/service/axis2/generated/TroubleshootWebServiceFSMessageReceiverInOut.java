/**
 * TroubleshootWebServiceFSMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.sillycat.springbootaxis.service.axis2.generated;


/**
 *  TroubleshootWebServiceFSMessageReceiverInOut message receiver
 */
public class TroubleshootWebServiceFSMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    //
    private static javax.xml.namespace.QName[] qNameArray = {  };
    private static final javax.xml.bind.JAXBContext wsContext;

    static {
        javax.xml.bind.JAXBContext jc;
        jc = null;

        try {
            jc = javax.xml.bind.JAXBContext.newInstance(com.intuit.developer.ConnectionError.class,
                    com.intuit.developer.ConnectionErrorResponse.class,
                    com.intuit.developer.SendRequestXML.class,
                    com.intuit.developer.SendRequestXMLResponse.class,
                    com.intuit.developer.ServerVersion.class,
                    com.intuit.developer.ServerVersionResponse.class,
                    com.intuit.developer.GetLastError.class,
                    com.intuit.developer.GetLastErrorResponse.class,
                    com.intuit.developer.Authenticate.class,
                    com.intuit.developer.AuthenticateResponse.class,
                    com.intuit.developer.ReceiveResponseXML.class,
                    com.intuit.developer.ReceiveResponseXMLResponse.class,
                    com.intuit.developer.ClientVersion.class,
                    com.intuit.developer.ClientVersionResponse.class,
                    com.intuit.developer.CloseConnection.class,
                    com.intuit.developer.CloseConnectionResponse.class);
        } catch (javax.xml.bind.JAXBException ex) {
            System.err.println("Unable to create JAXBContext: " +
                ex.getMessage());
            ex.printStackTrace(System.err);
            Runtime.getRuntime().exit(-1);
        } finally {
            wsContext = jc;
        }
    }

    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            TroubleshootWebServiceFSSkeletonInterface skel = (TroubleshootWebServiceFSSkeletonInterface) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("connectionError".equals(methodName)) {
                    com.intuit.developer.ConnectionErrorResponse connectionErrorResponse49 =
                        null;
                    com.intuit.developer.ConnectionError wrappedParam = (com.intuit.developer.ConnectionError) fromOM(msgContext.getEnvelope()
                                                                                                                                .getBody()
                                                                                                                                .getFirstElement(),
                            com.intuit.developer.ConnectionError.class);

                    connectionErrorResponse49 = skel.connectionError(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            connectionErrorResponse49, false,
                            new javax.xml.namespace.QName(
                                "http://developer.intuit.com/",
                                "connectionErrorResponse"));
                } else
                 if ("sendRequestXML".equals(methodName)) {
                    com.intuit.developer.SendRequestXMLResponse sendRequestXMLResponse51 =
                        null;
                    com.intuit.developer.SendRequestXML wrappedParam = (com.intuit.developer.SendRequestXML) fromOM(msgContext.getEnvelope()
                                                                                                                              .getBody()
                                                                                                                              .getFirstElement(),
                            com.intuit.developer.SendRequestXML.class);

                    sendRequestXMLResponse51 = skel.sendRequestXML(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            sendRequestXMLResponse51, false,
                            new javax.xml.namespace.QName(
                                "http://developer.intuit.com/",
                                "sendRequestXMLResponse"));
                } else
                 if ("serverVersion".equals(methodName)) {
                    com.intuit.developer.ServerVersionResponse serverVersionResponse53 =
                        null;
                    com.intuit.developer.ServerVersion wrappedParam = (com.intuit.developer.ServerVersion) fromOM(msgContext.getEnvelope()
                                                                                                                            .getBody()
                                                                                                                            .getFirstElement(),
                            com.intuit.developer.ServerVersion.class);

                    serverVersionResponse53 = skel.serverVersion(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            serverVersionResponse53, false,
                            new javax.xml.namespace.QName(
                                "http://developer.intuit.com/",
                                "serverVersionResponse"));
                } else
                 if ("getLastError".equals(methodName)) {
                    com.intuit.developer.GetLastErrorResponse getLastErrorResponse55 =
                        null;
                    com.intuit.developer.GetLastError wrappedParam = (com.intuit.developer.GetLastError) fromOM(msgContext.getEnvelope()
                                                                                                                          .getBody()
                                                                                                                          .getFirstElement(),
                            com.intuit.developer.GetLastError.class);

                    getLastErrorResponse55 = skel.getLastError(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getLastErrorResponse55, false,
                            new javax.xml.namespace.QName(
                                "http://developer.intuit.com/",
                                "getLastErrorResponse"));
                } else
                 if ("authenticate".equals(methodName)) {
                    com.intuit.developer.AuthenticateResponse authenticateResponse57 =
                        null;
                    com.intuit.developer.Authenticate wrappedParam = (com.intuit.developer.Authenticate) fromOM(msgContext.getEnvelope()
                                                                                                                          .getBody()
                                                                                                                          .getFirstElement(),
                            com.intuit.developer.Authenticate.class);

                    authenticateResponse57 = skel.authenticate(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            authenticateResponse57, false,
                            new javax.xml.namespace.QName(
                                "http://developer.intuit.com/",
                                "authenticateResponse"));
                } else
                 if ("receiveResponseXML".equals(methodName)) {
                    com.intuit.developer.ReceiveResponseXMLResponse receiveResponseXMLResponse59 =
                        null;
                    com.intuit.developer.ReceiveResponseXML wrappedParam = (com.intuit.developer.ReceiveResponseXML) fromOM(msgContext.getEnvelope()
                                                                                                                                      .getBody()
                                                                                                                                      .getFirstElement(),
                            com.intuit.developer.ReceiveResponseXML.class);

                    receiveResponseXMLResponse59 = skel.receiveResponseXML(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            receiveResponseXMLResponse59, false,
                            new javax.xml.namespace.QName(
                                "http://developer.intuit.com/",
                                "receiveResponseXMLResponse"));
                } else
                 if ("clientVersion".equals(methodName)) {
                    com.intuit.developer.ClientVersionResponse clientVersionResponse61 =
                        null;
                    com.intuit.developer.ClientVersion wrappedParam = (com.intuit.developer.ClientVersion) fromOM(msgContext.getEnvelope()
                                                                                                                            .getBody()
                                                                                                                            .getFirstElement(),
                            com.intuit.developer.ClientVersion.class);

                    clientVersionResponse61 = skel.clientVersion(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            clientVersionResponse61, false,
                            new javax.xml.namespace.QName(
                                "http://developer.intuit.com/",
                                "clientVersionResponse"));
                } else
                 if ("closeConnection".equals(methodName)) {
                    com.intuit.developer.CloseConnectionResponse closeConnectionResponse63 =
                        null;
                    com.intuit.developer.CloseConnection wrappedParam = (com.intuit.developer.CloseConnection) fromOM(msgContext.getEnvelope()
                                                                                                                                .getBody()
                                                                                                                                .getFirstElement(),
                            com.intuit.developer.CloseConnection.class);

                    closeConnectionResponse63 = skel.closeConnection(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            closeConnectionResponse63, false,
                            new javax.xml.namespace.QName(
                                "http://developer.intuit.com/",
                                "closeConnectionResponse"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.intuit.developer.ConnectionError param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

        java.lang.Object object = param;
        org.apache.axiom.om.ds.jaxb.JAXBOMDataSource source = new org.apache.axiom.om.ds.jaxb.JAXBOMDataSource(wsContext,
                new javax.xml.bind.JAXBElement(elementQName, object.getClass(),
                    object));
        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(elementQName.getNamespaceURI(),
                null);

        return factory.createOMElement(source, elementQName.getLocalPart(),
            namespace);
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.intuit.developer.ConnectionError param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, elementQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.intuit.developer.ConnectionErrorResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

        java.lang.Object object = param;
        org.apache.axiom.om.ds.jaxb.JAXBOMDataSource source = new org.apache.axiom.om.ds.jaxb.JAXBOMDataSource(wsContext,
                new javax.xml.bind.JAXBElement(elementQName, object.getClass(),
                    object));
        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(elementQName.getNamespaceURI(),
                null);

        return factory.createOMElement(source, elementQName.getLocalPart(),
            namespace);
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.intuit.developer.ConnectionErrorResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, elementQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.intuit.developer.SendRequestXML param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

        java.lang.Object object = param;
        org.apache.axiom.om.ds.jaxb.JAXBOMDataSource source = new org.apache.axiom.om.ds.jaxb.JAXBOMDataSource(wsContext,
                new javax.xml.bind.JAXBElement(elementQName, object.getClass(),
                    object));
        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(elementQName.getNamespaceURI(),
                null);

        return factory.createOMElement(source, elementQName.getLocalPart(),
            namespace);
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.intuit.developer.SendRequestXML param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, elementQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.intuit.developer.SendRequestXMLResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

        java.lang.Object object = param;
        org.apache.axiom.om.ds.jaxb.JAXBOMDataSource source = new org.apache.axiom.om.ds.jaxb.JAXBOMDataSource(wsContext,
                new javax.xml.bind.JAXBElement(elementQName, object.getClass(),
                    object));
        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(elementQName.getNamespaceURI(),
                null);

        return factory.createOMElement(source, elementQName.getLocalPart(),
            namespace);
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.intuit.developer.SendRequestXMLResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, elementQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.intuit.developer.ServerVersion param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

        java.lang.Object object = param;
        org.apache.axiom.om.ds.jaxb.JAXBOMDataSource source = new org.apache.axiom.om.ds.jaxb.JAXBOMDataSource(wsContext,
                new javax.xml.bind.JAXBElement(elementQName, object.getClass(),
                    object));
        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(elementQName.getNamespaceURI(),
                null);

        return factory.createOMElement(source, elementQName.getLocalPart(),
            namespace);
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.intuit.developer.ServerVersion param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, elementQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.intuit.developer.ServerVersionResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

        java.lang.Object object = param;
        org.apache.axiom.om.ds.jaxb.JAXBOMDataSource source = new org.apache.axiom.om.ds.jaxb.JAXBOMDataSource(wsContext,
                new javax.xml.bind.JAXBElement(elementQName, object.getClass(),
                    object));
        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(elementQName.getNamespaceURI(),
                null);

        return factory.createOMElement(source, elementQName.getLocalPart(),
            namespace);
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.intuit.developer.ServerVersionResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, elementQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.intuit.developer.GetLastError param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

        java.lang.Object object = param;
        org.apache.axiom.om.ds.jaxb.JAXBOMDataSource source = new org.apache.axiom.om.ds.jaxb.JAXBOMDataSource(wsContext,
                new javax.xml.bind.JAXBElement(elementQName, object.getClass(),
                    object));
        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(elementQName.getNamespaceURI(),
                null);

        return factory.createOMElement(source, elementQName.getLocalPart(),
            namespace);
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.intuit.developer.GetLastError param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, elementQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.intuit.developer.GetLastErrorResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

        java.lang.Object object = param;
        org.apache.axiom.om.ds.jaxb.JAXBOMDataSource source = new org.apache.axiom.om.ds.jaxb.JAXBOMDataSource(wsContext,
                new javax.xml.bind.JAXBElement(elementQName, object.getClass(),
                    object));
        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(elementQName.getNamespaceURI(),
                null);

        return factory.createOMElement(source, elementQName.getLocalPart(),
            namespace);
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.intuit.developer.GetLastErrorResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, elementQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.intuit.developer.Authenticate param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

        java.lang.Object object = param;
        org.apache.axiom.om.ds.jaxb.JAXBOMDataSource source = new org.apache.axiom.om.ds.jaxb.JAXBOMDataSource(wsContext,
                new javax.xml.bind.JAXBElement(elementQName, object.getClass(),
                    object));
        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(elementQName.getNamespaceURI(),
                null);

        return factory.createOMElement(source, elementQName.getLocalPart(),
            namespace);
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.intuit.developer.Authenticate param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, elementQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.intuit.developer.AuthenticateResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

        java.lang.Object object = param;
        org.apache.axiom.om.ds.jaxb.JAXBOMDataSource source = new org.apache.axiom.om.ds.jaxb.JAXBOMDataSource(wsContext,
                new javax.xml.bind.JAXBElement(elementQName, object.getClass(),
                    object));
        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(elementQName.getNamespaceURI(),
                null);

        return factory.createOMElement(source, elementQName.getLocalPart(),
            namespace);
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.intuit.developer.AuthenticateResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, elementQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.intuit.developer.ReceiveResponseXML param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

        java.lang.Object object = param;
        org.apache.axiom.om.ds.jaxb.JAXBOMDataSource source = new org.apache.axiom.om.ds.jaxb.JAXBOMDataSource(wsContext,
                new javax.xml.bind.JAXBElement(elementQName, object.getClass(),
                    object));
        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(elementQName.getNamespaceURI(),
                null);

        return factory.createOMElement(source, elementQName.getLocalPart(),
            namespace);
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.intuit.developer.ReceiveResponseXML param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, elementQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.intuit.developer.ReceiveResponseXMLResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

        java.lang.Object object = param;
        org.apache.axiom.om.ds.jaxb.JAXBOMDataSource source = new org.apache.axiom.om.ds.jaxb.JAXBOMDataSource(wsContext,
                new javax.xml.bind.JAXBElement(elementQName, object.getClass(),
                    object));
        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(elementQName.getNamespaceURI(),
                null);

        return factory.createOMElement(source, elementQName.getLocalPart(),
            namespace);
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.intuit.developer.ReceiveResponseXMLResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, elementQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.intuit.developer.ClientVersion param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

        java.lang.Object object = param;
        org.apache.axiom.om.ds.jaxb.JAXBOMDataSource source = new org.apache.axiom.om.ds.jaxb.JAXBOMDataSource(wsContext,
                new javax.xml.bind.JAXBElement(elementQName, object.getClass(),
                    object));
        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(elementQName.getNamespaceURI(),
                null);

        return factory.createOMElement(source, elementQName.getLocalPart(),
            namespace);
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.intuit.developer.ClientVersion param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, elementQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.intuit.developer.ClientVersionResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

        java.lang.Object object = param;
        org.apache.axiom.om.ds.jaxb.JAXBOMDataSource source = new org.apache.axiom.om.ds.jaxb.JAXBOMDataSource(wsContext,
                new javax.xml.bind.JAXBElement(elementQName, object.getClass(),
                    object));
        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(elementQName.getNamespaceURI(),
                null);

        return factory.createOMElement(source, elementQName.getLocalPart(),
            namespace);
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.intuit.developer.ClientVersionResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, elementQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.intuit.developer.CloseConnection param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

        java.lang.Object object = param;
        org.apache.axiom.om.ds.jaxb.JAXBOMDataSource source = new org.apache.axiom.om.ds.jaxb.JAXBOMDataSource(wsContext,
                new javax.xml.bind.JAXBElement(elementQName, object.getClass(),
                    object));
        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(elementQName.getNamespaceURI(),
                null);

        return factory.createOMElement(source, elementQName.getLocalPart(),
            namespace);
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.intuit.developer.CloseConnection param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, elementQName));

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.intuit.developer.CloseConnectionResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

        java.lang.Object object = param;
        org.apache.axiom.om.ds.jaxb.JAXBOMDataSource source = new org.apache.axiom.om.ds.jaxb.JAXBOMDataSource(wsContext,
                new javax.xml.bind.JAXBElement(elementQName, object.getClass(),
                    object));
        org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(elementQName.getNamespaceURI(),
                null);

        return factory.createOMElement(source, elementQName.getLocalPart(),
            namespace);
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.intuit.developer.CloseConnectionResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, elementQName));

        return envelope;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();
            org.apache.axiom.util.jaxb.UnmarshallerAdapter adapter = org.apache.axiom.util.jaxb.JAXBUtils.getUnmarshallerAdapter(param.getXMLStreamReaderWithoutCaching());
            unmarshaller.setAttachmentUnmarshaller(adapter.getAttachmentUnmarshaller());

            return unmarshaller.unmarshal(adapter.getReader(), type).getValue();
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class
