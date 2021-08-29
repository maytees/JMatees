package html.elements;

import com.sun.source.doctree.AttributeTree;
import html.logic.Attribute;
import html.logic.Element;
import html.logic.ElementType;

import java.util.LinkedList;
import java.util.List;

public class Paragraph implements Element {
    private String className;
    private String content;
    private LinkedList<Attribute> attributes = new LinkedList<>();

    /**
     * Attributes constructor
     * @param className class name for the element
     * @param content   content of the element
     * @param attributes attributes of the element
     */
    public Paragraph(String className, String content, Attribute... attributes) {
        this.className = className;
        this.content = content;

        this.attributes.addAll(List.of(attributes));
    }

    /**
     * No attribute constructor
     * Since no list is given, attributes may be added later
     * using {@link #addAttributes(Attribute...)}
     * @param className class name for the element
     * @param content content of the element
     */
    public Paragraph(String className, String content) {
        this.className = className;
        this.content = content;
    }

    /**
     * Adds attributes to the elements
     * @param attributes attributes to add
     */
    public void addAttributes(Attribute... attributes) {
        this.attributes.addAll(List.of(attributes));
    }
    
    @Override
    public String getClassName() {
        return this.className;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public ElementType getElementType() {
        return ElementType.PARAGRAPH;
    }

    @Override
    public LinkedList<Attribute> getAttributes() {
        return this.attributes;
    }
}
