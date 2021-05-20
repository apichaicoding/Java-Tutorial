abstract class Student {
    private String id;
    private String name;

    public abstract void Register();

    public abstract void Pretest();

    public abstract void Posttest();

    public void setID(String id) {
        this.id = id;
    }
}
