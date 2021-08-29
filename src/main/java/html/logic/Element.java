package html.logic;

import net.matees.MUtils;

import java.util.LinkedList;
import java.util.List;

public interface Element {
    /**
     * Class for element e.g class="{className}"
     * @return Class Name
     */
    String getClassName();

    /**
     * Text which is inside tags
     * @return Element Content
     */
    String getContent();


    /**
     * Returns type e.g: PHARAGRAPH, which is a < p > tag
     * @return Element Type
     */
    ElementType getElementType();

    /**
     * Attributes for the element
     * @return List Of Attributes
     */
    LinkedList<Attribute> getAttributes();

    /**
     * Formats all attributes
     * @return Gets All the Attributes and Returns them formated
     */
    default String getWrittenAttributes() {
        String attrs = "";

        for (Attribute attribute : getAttributes()) {
            attrs = attrs + " " + attribute.getAttribute();
        }

        return attrs;
    }

    /**
     * Writes the element as a whole
     * @return Element As String
     */
    default String getElementWritten() {
        return "<"
                + getElementType().getTag()
                + " class=" + MUtils.wrapStr("\"", getClassName())
                + (getAttributes().isEmpty() ? "" : getWrittenAttributes())
                + ">"
                + getContent()
                + "</"
                + getElementType().getTag()
                + ">";
    }
}
