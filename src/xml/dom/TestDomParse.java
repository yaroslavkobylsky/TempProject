package xml.dom;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import xml.Employee;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDomParse {
    private static final String CLASS_NAME = "Employee";
    private static final String ID = "id";
    private static final String AGE = "age";
    private static final String GENDER = "gender";
    private static final String NAME = "name";
    private static final String ROLE = "role";

    private File file;
    private DocumentBuilderFactory documentBuilderFactory;

    public TestDomParse(File file) {
        this.file = file;
        documentBuilderFactory = DocumentBuilderFactory.newInstance();
    }

    public List<Employee> parse() throws IOException, SAXException, ParserConfigurationException {
        List<Employee> employees = new ArrayList<>();
        DocumentBuilder dBuilder = documentBuilderFactory.newDocumentBuilder();
        org.w3c.dom.Document document = dBuilder.parse(file);

        NodeList nodeList = document.getElementsByTagName(CLASS_NAME);
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) node;
                Employee employee = new Employee();
                employee.setId(Integer.parseInt(element.getAttribute(ID)));
                employee.setAge(Integer.parseInt(element.getElementsByTagName(AGE).item(0).getTextContent()));
                employee.setRole(element.getElementsByTagName(ROLE).item(0).getTextContent());
                employee.setName(element.getElementsByTagName(NAME).item(0).getTextContent());
                employee.setGender(element.getElementsByTagName(GENDER).item(0).getTextContent());
                employees.add(employee);
            }
        }
        return employees;
    }

    public DocumentBuilderFactory getDocumentBuilderFactory() {
        return documentBuilderFactory;
    }

    public void setDocumentBuilderFactory(DocumentBuilderFactory documentBuilderFactory) {
        this.documentBuilderFactory = documentBuilderFactory;
    }
}
