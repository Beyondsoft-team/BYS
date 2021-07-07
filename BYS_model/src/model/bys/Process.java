package model.bys;

public class Process {

    private Integer Id;

    private Integer Type_id;

    private Integer Step_id;

    private Integer Owner_role_id;

    private Integer Duration;

    private String Title;

    private String Content;

    private String Status;

    public Process() {
    }

    public Process(Integer type_id) {
        Type_id = type_id;
    }

    public Process(Integer type_id, String title) {
        Type_id = type_id;
        Title = title;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getType_id() {
        return Type_id;
    }

    public void setType_id(Integer type_id) {
        Type_id = type_id;
    }

    public Integer getStep_id() {
        return Step_id;
    }

    public void setStep_id(Integer step_id) {
        Step_id = step_id;
    }

    public Integer getOwner_role_id() {
        return Owner_role_id;
    }

    public void setOwner_role_id(Integer owner_role_id) {
        Owner_role_id = owner_role_id;
    }

    public Integer getDuration() {
        return Duration;
    }

    public void setDuration(Integer duration) {
        Duration = duration;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
