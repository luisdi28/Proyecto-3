package xml;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.print.attribute.standard.Media;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;

public class xmlBuilder {
    private DocumentBuilderFactory factory;
    private DocumentBuilder builder;
    private DOMImplementation implementation;
    /* xml class constructor

     */
    public xmlBuilder() throws ParserConfigurationException {
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        implementation = builder.getDOMImplementation();

    }
    /* xml document builder , needs 3 arguments:
    green ant score, blue ant score, and the # of the current game played (lets say the game has been initialized
    3 times, and this is the 4 one so the gamemode argument needs to be 4.
     */
    public void endGamexml(String greenAnt, String blueAnt,String gamemode ) throws TransformerException {
        Document document = implementation.createDocument(null, "game" + gamemode, null);
        document.setXmlVersion("1.0");
        Element GreenAnt = document.createElement("greenAnt");
        Element BlueAnt = document.createElement("blueAnt");
        Text greenScore = document.createTextNode(greenAnt);
        Text blueScore = document.createTextNode(blueAnt);
        GreenAnt.appendChild(greenScore);
        BlueAnt.appendChild(blueScore);
        document.getDocumentElement().appendChild(GreenAnt);
        document.getDocumentElement().appendChild(BlueAnt);
        Source source = new DOMSource(document); //this pathname must be changed later on, remember to store the xml in a directory
        Result result = new StreamResult(new File("game" + gamemode + ".xml"));
        Transformer transformer = new TransformerFactory() {
            @Override
            public Transformer newTransformer(Source source) throws TransformerConfigurationException {
                return null;
            }

            @Override
            public Transformer newTransformer() throws TransformerConfigurationException {
                return null;
            }

            @Override
            public Templates newTemplates(Source source) throws TransformerConfigurationException {
                return null;
            }

            @Override
            public Source getAssociatedStylesheet(Source source, String media, String title, String charset) throws TransformerConfigurationException {
                return null;
            }

            @Override
            public void setURIResolver(URIResolver resolver) {

            }

            @Override
            public URIResolver getURIResolver() {
                return null;
            }

            @Override
            public void setFeature(String name, boolean value) throws TransformerConfigurationException {

            }

            @Override
            public boolean getFeature(String name) {
                return false;
            }

            @Override
            public void setAttribute(String name, Object value) {

            }

            @Override
            public Object getAttribute(String name) {
                return null;
            }

            @Override
            public void setErrorListener(ErrorListener listener) {

            }

            @Override
            public ErrorListener getErrorListener() {
                return null;
            }
        }.newInstance().newTransformer();
        transformer.transform(source, result); ///
        ;
    }

    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        xmlBuilder xmlBuilder = new xmlBuilder();
        xmlBuilder.endGamexml("8" , "9" , "1");
    }
}
