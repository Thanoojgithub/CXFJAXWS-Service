package com.cxfjaxws;

import javax.jws.WebService;

/**
 * The @WebService annotation on the implementation class lets CXF know which
 * interface to use when creating WSDL. In this case its simply our HelloWorld
 * interface.
 * 
 * @author thanooj
 *
 */
@WebService(endpointInterface = "com.cxfjaxws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	public String sayHi(String text) {
		System.out.println("sayHi called");
		return "Hello " + text;
	}
}
