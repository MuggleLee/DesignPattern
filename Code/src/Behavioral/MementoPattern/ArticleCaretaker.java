package Behavioral.MementoPattern;

import java.util.Stack;

/**
 * @author Muggle Lee
 * @Date: 2019/5/22 11:49
 */
public class ArticleCaretaker {
    private Stack<ArticleMemento> stack = new Stack();

    public ArticleMemento get() throws Exception {
        if (stack.size() == 0) {
            throw new Exception("暂存区没有数据...");
        }
        ArticleMemento articleMemento = stack.get(stack.size() - 1);
        return articleMemento;
    }

    public void saveArticle(ArticleMemento articleMemento) {
        stack.push(articleMemento);
    }

    //撤销操作
    public ArticleMemento undoArticle() {
        if (!stack.empty()) {
            stack.pop();
            try {
                return get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
