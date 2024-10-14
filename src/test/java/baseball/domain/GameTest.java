package baseball.domain;

import baseball.domain.game.Game;
import baseball.domain.game.GameStatus;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    void TDD_게임_시작_상태_답_저장() {
        // given
        Game game = new Game();

        // when
        game.setStatus(GameStatus.START);
        game.setAnswer("123");

        //then
        assertThat(game.getStatus()).isEqualTo(GameStatus.START);
        assertThat(game.getAnswer()).isEqualTo("123");
    }

    @Test
    void TDD_게임_답안_채점_정답() {
        //given
        Game game = new Game();

        game.setStatus(GameStatus.START);
        game.setAnswer("123");

        //when
        boolean isCorrect = game.correct("123");

        //then
        assertThat(isCorrect).isTrue();
    }
}
