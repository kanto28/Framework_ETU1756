package affichage;
import java.io.File;
import java.io.IOException;
import javax.sound.midi.SysexMessage;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
public class Affiche
{ 
   public static void main (String[] args)throws Exception
  {
    DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
    DocumentBuilder builder=factory.newDocumentBuilder();
    File xmlFile = new File("E:\\Study\\Study\\L2\\S4\\M_Naina\\sprint--0\\web.xml");
    Document document = builder.parse(xmlFile);

    Element rootElement= document.getDocumentElement();
    NodeList nodeList=rootElement.getElementsByTagName("path-after-WEB-INF");
    Element element=(Element)nodeList.item(0); //de le 1er satria iray ihany ny path-after-WEB-INF
    String path=element.getTextContent();
    System.out.println(path);
    nodeList=rootElement.getElementsByTagName("package-root");
    element=(Element)nodeList.item(0); 
    String pkgroot=element.getTextContent();
    System.out.println(pkgroot);
    

  } 
      
}