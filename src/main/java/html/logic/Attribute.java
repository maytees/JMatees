package html.logic;

import net.matees.MUtils;

public class Attribute {

    private String name;
    private String value;

    public Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Attribute() {
    }

    public String getAttribute() {
        return this.name + "=" + MUtils.wrapStr("\"", this.value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
