package html.logic;

public enum ElementType {
    PARAGRAPH("p"),
    CUSTOM("");

    private final String tag;

    ElementType(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }
}
