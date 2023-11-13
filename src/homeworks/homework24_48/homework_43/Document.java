package homeworks.homework24_48.homework_43;

import java.time.LocalDate;

public class Document {

    Document document;


    private String title;

    private LocalDate createDate;

    private State state;

    public Document(String title, LocalDate createDate) {
        this.title = title;
        this.createDate = createDate;
        this.state = State.DRAFT;
    }

    public void publish() {
        if (this.getState() == State.DRAFT) {
            this.setState(State.PUBLISHED);
        } else {
            System.out.println("Нельзя перевести документ в этот State");
        }
    }

    public void delete() {
        if (this.getState() != State.DELETED) {
            this.setState(State.DELETED);
        } else {
            System.out.println("Нельзя перевести документ в этот State");
        }
    }

    public void correct() {
        if (this.getState() == State.PUBLISHED) {
            this.setState(State.DRAFT);
        } else {
            System.out.println("Нельзя перевести документ в этот State");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
