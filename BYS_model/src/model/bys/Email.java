package model.bys;

public class Email {

    private Integer Id;

    private Integer Type_id;

    private Integer Step_id;

    private String Title;

    private String Content;

    public Email() {
    }

    public Email(Integer type_id, Integer step_id, String title) {
        Type_id = type_id;
        Step_id = step_id;
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
}
