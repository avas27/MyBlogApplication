package blog.model;
import java.util.Date;
public class post {
    private String title;
    private String body;
    private Date date;

    public void setTitle(String title)
    {
        this.title=title;
    }
    public void setBody(String body)
    {
        this.body=body;
    }
    public void setDate(Date date)
    {
        this.date=date;
    }
    public String getTitle()
    {
        return title;
    }
    public String getBody()
    {
        return body;
    }
    public Date getDate()
    {
        return date;
    }
}
