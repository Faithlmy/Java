package com.lmy1;
import java.io.IOException;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 * @author Alexia
 * 
 * JDOM ½âÎöXMLÎÄµµ
 * 
 */
public class JDomDemo implements XmlDocument {

    public void parserXml(String fileName) {
        SAXBuilder builder = new SAXBuilder();

        try {
            Document document = builder.build(fileName);
            Element users = document.getRootElement();
            List<Element> userList = users.getChildren("user");

            for (int i = 0; i < userList.size(); i++) {
                Element user = (Element) userList.get(i);
                List<Element> userInfo = user.getChildren();

                for (int j = 0; j < userInfo.size(); j++) {
                    System.out.println(((Element) userInfo.get(j)).getName()
                            + ":" + ((Element) userInfo.get(j)).getValue());

                }
                System.out.println();
            }
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

	@Override
	public void pXml(String filename) {
		// TODO Auto-generated method stub
		
	}
}