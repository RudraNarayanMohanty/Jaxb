package in.ashokit.main;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import in.ashokit.bean.Customer;

public class jaxbMain {
	public static void main(String[] args) throws JAXBException, IOException {

		Customer customer = new Customer();
		customer.setCustomerId(123);
		customer.setCustomerName("Ashok");
		customer.setCustomerAddress("Hyderabad");

		JAXBContext context = JAXBContext.newInstance(Customer.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(customer, new FileWriter("customer.xml"));
		System.out.println("Marshelling done------");
	}
}
