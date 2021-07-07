package model.bys;

import java.util.Date;

public class Project {

    private Integer Id;

    private String Name;

    private String DM;

    private Date Create_time;

    private Date Update_time;

    public Project() {
    }

    public Project(String name, String DM) {
        Name = name;
        this.DM = DM;
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

    public String getDM() {
        return DM;
    }

    public void setDM(String DM) {
        this.DM = DM;
    }

    public Date getCreate_time() {
        return Create_time;
    }

    public void setCreate_time(Date Create_time) {
        this.Create_time = Create_time;
    }

    public Date getUpdate_time() {
        return Update_time;
    }

    public void setUpdate_time(Date Update_time) {
        this.Update_time = Update_time;
    }
}
