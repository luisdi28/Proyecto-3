package XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class xmlReader {
    private DocumentBuilderFactory factory;
    private DocumentBuilder builder;
    private Document doc;
    private String greenscore;
    private String blueScore;
    private String gameloop;
    public xmlReader() throws ParserConfigurationException {
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
    }
/*
xml reader method
the argument is a path name, which is taken from a list when the game ends.
 */
    public void readXML(String name) throws IOException, SAXException, ParserConfigurationException {
        System.out.println("el nombre del archivo es: " + name);
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        doc = builder.parse(new File(name));
        NodeList listanodo = doc.getElementsByTagName("greenAnt");
        Node nodo = listanodo.item(0);
        Element e = (Element) nodo;
        Node hijo = e.getFirstChild();
        System.out.println("el contenido es: " + hijo.getTextContent());
        greenscore = hijo.getTextContent();

        listanodo = doc.getElementsByTagName("blueAnt");
        nodo = listanodo.item(0);
        e = (Element) nodo;
        hijo = e.getFirstChild();
        System.out.println("el contenido es: " + hijo.getTextContent());
        blueScore = hijo.getTextContent();
    }
    public void readLoops(String name) throws ParserConfigurationException, IOException, SAXException {
        System.out.println("el nombre del archivo es: " + name);
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        doc = builder.parse(new File(name));
        NodeList listanodo = doc.getElementsByTagName("gamesplayed");
        Node nodo = listanodo.item(0);
        Element e = (Element) nodo;
        Node hijo = e.getFirstChild();
        System.out.println("el contenido es: " + hijo.getTextContent());
        gameloop = hijo.getTextContent();
    }
    public int getgamelop(){
        return Integer.parseInt(this.gameloop);
    }

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        xmlReader xmlReader = new xmlReader();
        xmlReader.readLoops("GameLoops\\gameplayed.xml");
        //xmlReader.readXML("GameRecords\\game2.xml");
    }
}
