import br.com.xml.model.Host;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;


 class XMLCreator {
    public void createXML(Object objectXML) {

        Host hostXML = (Host) objectXML;
        try {
            File file = new File("d:\\host.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Class.forName(objectXML.getClass().getCanonicalName()));
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(hostXML, file);
            jaxbMarshaller.marshal(hostXML, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
