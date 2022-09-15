import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class XSLT {

    public static void main(String[] args) throws SAXException, IOException,
            ParserConfigurationException, TransformerException, org.xml.sax.SAXException {

        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        File target = new File("C:\\Users\\dt234148\\Desktop\\v16_Schema.xml");
        Document targetDom = builder.parse(target);
        Node targetSections = targetDom.getDocumentElement();
        System.out.println(targetSections.getNodeName());
        File[] sources = new File[0];
        for (File source : sources) {
            Node sourceSection = builder.parse(new File("C:\\Users\\dt234148\\Desktop\\v15_NY_CLAIM.xml"));
                    ((Document) sourceSection).getElementsByTagName("pricingRequest").item(0);
            // continued inside
            targetSections.appendChild(targetDom.adoptNode(sourceSection.cloneNode(true)));
            TransformerFactory.newInstance().newTransformer().transform(
                    new DOMSource(targetDom),
                    new StreamResult(new FileWriter(target))
            );
        }


    }
}
