package Behavioral.ChainOfResponsibilityPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/5/31 17:26
 */
public abstract class ReviewPerson {
    protected ReviewPerson person;

    abstract void handle(String program);

    public ReviewPerson getPerson() {
        return person;
    }

    public void setPerson(ReviewPerson person) {
        this.person = person;
    }
}
