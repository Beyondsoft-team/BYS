package model.bys;

public class Process_type {

    private Integer Id;

    private String Name;

    public Process_type() {
    }

    public Process_type(Integer id, String name) {
        Id = id;
        Name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
