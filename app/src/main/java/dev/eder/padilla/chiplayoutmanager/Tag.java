package dev.eder.padilla.chiplayoutmanager;

public class Tag {

    boolean selected;

    String name;

    public Tag(boolean selected, String name) {
        this.selected = selected;
        this.name = name;
    }

    public Tag() {
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean isSelected() {
        return selected;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "selected=" + selected +
                ", name='" + name + '\'' +
                '}';
    }
}
