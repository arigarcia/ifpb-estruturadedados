import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class Main {

	/**
	 * Contexto - JAX
	 * Marshaller - responsável por converter obj -> xml
	 * Unmarshaller - responsável por converter xml -> obj
	 * 
	 * 
	 * @param args
	 * @throws JAXBException
	 */
	public static void main(String[] args) throws JAXBException {
		//criando o contexto
		JAXBContext jax = JAXBContext.newInstance(Cliente.class);
		//criar o marshaller
		Marshaller marshaller = jax.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		//criar o objeto cliente
		Cliente cliente = new Cliente("Ari Garcia", "74658374658");
		//converter em xml
		marshaller.marshal(cliente, System.out);
	}

}
