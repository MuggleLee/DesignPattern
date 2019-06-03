package Behavioral.MementoPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/22 11:46
 */
public class Article {
    private String title;
    private String content;
    private String img;


    public ArticleMemento saveArticle(){
        return new ArticleMemento(this.title,this.content,this.img);
    }

    public ArticleMemento undoArticle(ArticleMemento articleMemento){
        return articleMemento;
    }

    public Article() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
