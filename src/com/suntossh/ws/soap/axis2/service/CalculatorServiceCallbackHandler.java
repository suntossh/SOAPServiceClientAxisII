
/**
 * CalculatorServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.suntossh.ws.soap.axis2.service;

    // TODO: Auto-generated Javadoc
/**
     *  CalculatorServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class CalculatorServiceCallbackHandler{



    /** The client data. */
    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public CalculatorServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData.
     */
    public CalculatorServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data.
     *
     * @return the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for sub method
            * override this method for handling normal response from sub operation.
            *
            * @param result the result
            */
           public void receiveResultsub(
                    com.suntossh.ws.soap.axis2.service.CalculatorServiceStub.SubResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sub operation.
           *
           * @param e the e
           */
            public void receiveErrorsub(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for add method
            * override this method for handling normal response from add operation.
            *
            * @param result the result
            */
           public void receiveResultadd(
                    com.suntossh.ws.soap.axis2.service.CalculatorServiceStub.AddResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from add operation.
           *
           * @param e the e
           */
            public void receiveErroradd(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for testService method
            * override this method for handling normal response from testService operation.
            *
            * @param result the result
            */
           public void receiveResulttestService(
                    com.suntossh.ws.soap.axis2.service.CalculatorServiceStub.TestServiceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from testService operation.
           *
           * @param e the e
           */
            public void receiveErrortestService(java.lang.Exception e) {
            }
                


    }
    