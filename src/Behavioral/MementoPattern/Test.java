package Behavioral.MementoPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/22 11:28
 */
public class Test {
    public static void main(String[] args) throws Exception {
        ArticleCaretaker ac  = new ArticleCaretaker();
        Article article = new Article();

        article.setTitle("设计模式之备忘录模式");
        article.setContent("定义：保存一个对象的某个状态，以便在适当的时候恢复对象。");
        article.setImg("MementoUML.png");
        ac.saveArticle(article.saveArticle());
        System.out.println(ac.get().getTitle());

        article.setTitle("设计模式之单例模式");
        article.setContent("定义：保证一个类只有一个实例，并提供全局访问点。");
        article.setImg("SingletonUML.png");
        ac.saveArticle(article.saveArticle());
        System.out.println(ac.get().getTitle());

        article.setTitle("设计模式之享元模式");
        article.setContent("定义：使用共享的方式高效的支持大量的细粒度的对象。\n");
        article.setImg("FlyweightUML.png");
        ac.saveArticle(article.saveArticle());
        System.out.println(ac.get().getTitle());

        System.out.println("------------------- 执行撤销操作  -------------------");

        ArticleMemento articleMemento1 = article.undoArticle(ac.undoArticle());
        System.out.println(articleMemento1.getTitle());

        ArticleMemento articleMemento2 = article.undoArticle(ac.undoArticle());
        System.out.println(articleMemento2.getTitle());

        ArticleMemento articleMemento3 = article.undoArticle(ac.undoArticle());
        System.out.println(articleMemento3.getTitle());
    }
}
