package zadanie1;

public abstract class AcademicTeacher {
    private String name;

    public AcademicTeacher(String name) { this.name = name; }
    public final String getName() { return name; }

    public abstract int getId();
}

