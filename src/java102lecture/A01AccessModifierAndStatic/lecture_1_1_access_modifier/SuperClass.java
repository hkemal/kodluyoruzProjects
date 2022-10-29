package java102lecture.A01AccessModifierAndStatic.lecture_1_1_access_modifier;

public class SuperClass {

    public String namePublic = "Patika";

    protected String nameProtected = "Dev";

    private String namePrivate = "Java 102";

    public String getNamePublic() {
        return namePublic;
    }

    public void setNamePublic(String namePublic) {
        this.namePublic = namePublic;
    }

    public String getNameProtected() {
        return nameProtected;
    }

    public void setNameProtected(String nameProtected) {
        this.nameProtected = nameProtected;
    }

    public String getNamePrivate() {
        return namePrivate;
    }

    public void setNamePrivate(String namePrivate) {
        this.namePrivate = namePrivate;
    }
}
