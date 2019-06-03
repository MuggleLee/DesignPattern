package Behavioral.MementoPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/22 11:47
 */
public class ArticleMemento {

    private String title;
    private String content;
    private String img;

    public ArticleMemento(String title, String content, String img) {
        this.title = title;
        this.content = content;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImg() {
        return img;
    }
}
