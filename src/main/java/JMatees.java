import html.elements.Paragraph;
import html.logic.Attribute;
import html.logic.Element;

import java.util.LinkedList;

public class JMatees {

    public static void main(String[] args) {
        Element pElement = new Paragraph(
                "introduction",
                "This is the best lib that you will ever use!",
                new Attribute("write", "Bye"),
                new Attribute("read", "doodoo")
        );

        System.out.println(pElement.getElementWritten());
    }
}
