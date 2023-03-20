import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class CliXmlFromDTD {
    public static void main(String[] args) throws Exception {
        //creation d'un nouveua document
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();
        //document.setXmlStandalone(true);

        Element cli = document.createElement("cli");
        document.appendChild(cli);
        // ajout de a

        Element a = document.createElement("argument");
        a.setAttribute("acces", "A");
        a.setAttribute("nb", "1");
        a.appendChild(document.createTextNode("Valeur de alpha"));
        cli.appendChild(a);

        // Ajout de l'argument indice
        Element i = document.createElement("argument");
        i.setAttribute("acces", "I");
        i.setAttribute("nb", "1");
        i.appendChild(document.createTextNode("Valeur de indice"));
        cli.appendChild(i);

        // Ajout du mode matrice pleine
        Element p = document.createElement("argument");
        p.setAttribute("acces", "P");
        p.appendChild(document.createTextNode("Mode matrice pleine"));
        cli.appendChild(p);

        // Ajout du mode matrice creuse
        Element c = document.createElement("argument");
        c.setAttribute("acces", "C");
        c.appendChild(document.createTextNode("Mode matrice creuse"));
        cli.appendChild(c);

        TransformerFactory transformerFactory =TransformerFactory.newInstance();
        Transformer transformer=transformerFactory.newTransformer();
        DOMSource source=new DOMSource(document);
        StreamResult streamResult=new StreamResult(new File("C:\\XML\\data.xml"));
        transformer.transform(source,streamResult);
    }
}