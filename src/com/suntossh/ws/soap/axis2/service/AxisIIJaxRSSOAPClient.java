/*
 * 
 */
package com.suntossh.ws.soap.axis2.service;

import java.rmi.RemoteException;

// TODO: Auto-generated Javadoc
/**
 * The Class AxisIIJaxRSSOAPClient.
 */
public class AxisIIJaxRSSOAPClient {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws RemoteException the remote exception
	 */
	public static void main(String[] args) throws RemoteException {
		CalculatorServiceStub stub = new CalculatorServiceStub();

		CalculatorServiceStub.TestService testServiceParams = new CalculatorServiceStub.TestService();
		testServiceParams.setYourName("Suntossh");

		CalculatorServiceStub.TestServiceResponse testServiceResponse = stub.testService(testServiceParams);
		System.out.println("Axis 2 TestServicea Response is :" + testServiceResponse.get_return());

		CalculatorServiceStub.Add addParams = new CalculatorServiceStub.Add();
		addParams.setX(10);
		addParams.setY(20);

		CalculatorServiceStub.AddResponse addResponse = stub.add(addParams);
		System.out.println("Axis 2 Add Response is :" + addResponse.get_return());

		CalculatorServiceStub.Sub subParams = new CalculatorServiceStub.Sub();
		subParams.setX(10);
		subParams.setY(20);

		CalculatorServiceStub.SubResponse subResponse = stub.sub(subParams);
		System.out.println("Axis 2 Sub Response is :" + subResponse.get_return());

	}

}
