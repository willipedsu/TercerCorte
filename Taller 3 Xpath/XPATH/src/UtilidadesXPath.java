
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class UtilidadesXPath {

	public static void main(String[] args) {        
		
		//CARGANDO EL ARCHIVO COMPLETO
//        try {
//            Document doc = UtilidadesXML.File2Document("libros.xml");       
//             System.out.println(UtilidadesXML.Node2String(doc.getDocumentElement()));                
//        } catch (Exception e) {            
//            e.printStackTrace();
//        }
		
		//MUESTRA LOS LIBROS QUE TENGAN AUTOR Miguel de Unamuno
//		try {
//            Document doc = UtilidadesXML.File2Document("libros.xml");
//            
//            XPath xpath = XPathFactory.newInstance().newXPath();
//            String expression = "/libros/libro[autor=\"Miguel de Unamuno\"]";        
//            NodeList nodes = (NodeList) xpath.evaluate(expression, doc.getDocumentElement(), XPathConstants.NODESET);
//            
//            System.out.println(UtilidadesXML.Nodes2String(nodes));
//            
//        } catch (Exception e) {            
//            e.printStackTrace();
//        }
        
      //MUESTRA LOS LIBROS QUE TENGAN PRECIO MENOR a 30
		try {
            Document doc = UtilidadesXML.File2Document("libros.xml");
            
            XPath xpath = XPathFactory.newInstance().newXPath();
            String expression = "/libros/libro[precio < 30.0]";        
            NodeList nodes = (NodeList) xpath.evaluate(expression, doc.getDocumentElement(), XPathConstants.NODESET);
            
            System.out.println(UtilidadesXML.Nodes2String(nodes));
            
        } catch (Exception e) {            
            e.printStackTrace();
        }
        
		
    }
	
}
