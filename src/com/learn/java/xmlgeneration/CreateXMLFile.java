package com.learn.java.xmlgeneration;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXMLFile {

	public static final String filePath = "resources/Employees.xml";

	public static void main(String[] args) {

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();

			// Create root element
			Element root = document.createElement("Company");
			document.appendChild(root);

			Element employee = document.createElement("employee");
			root.appendChild(employee);

			// Set values to the employee element
			Attr attr = document.createAttribute("id");
			attr.setValue("10");
			employee.setAttributeNode(attr);

			Element fisrtName = document.createElement("firstName");
			fisrtName.appendChild(document.createTextNode("Kuber"));
			employee.appendChild(fisrtName);

			Element lastName = document.createElement("lastName");
			lastName.appendChild(document.createTextNode("Pujar"));
			employee.appendChild(lastName);

			Element email = document.createElement("email");
			email.appendChild(document.createTextNode("kuberp1992@gmail.com"));
			employee.appendChild(email);

			Element department = document.createElement("department");
			department.appendChild(document.createTextNode("software engineer"));
			employee.appendChild(department);

			// Create xml file
			// transform dom object to xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			StreamResult steaResult = new StreamResult(new File(filePath));

			// stream result to stdout
			//StreamResult stdout = new StreamResult(System.out.toString());
			//System.out.println(stdout);

			transformer.transform(domSource, steaResult);

			System.out.println("done creating xml file");
		} catch (ParserConfigurationException pe) {
			pe.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}

}
