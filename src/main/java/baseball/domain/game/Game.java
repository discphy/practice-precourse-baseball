package baseball.domain.game;

public class Game {

    private GameStatus status;
    private String answer;

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public GameStatus getStatus() {
        return status;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean correct(String submit) {
        return answer.equals(submit);
    }
}
