package nextstep.ladder;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import nextstep.ladder.domain.Block;
import nextstep.ladder.domain.Direction;
import nextstep.ladder.domain.Participant;
import nextstep.ladder.domain.Position;

public class BlockTest {

	@Test
	@DisplayName("블록 생성")
	void test() {
		Block first = new Block(Direction.RIGHT, new Position(1));

		Block second = first.makeNext(Direction.LEFT);

		assertThat(second.direction()).isEqualTo(Direction.LEFT);
	}

	@Test
	@DisplayName("이동")
	void test2() {
		Block first = new Block(Direction.RIGHT, new Position(1));

		Participant participant = new Participant("test", new Position(1));

		first.enter(participant);

		assertThat(participant.position()).isEqualTo(new Position(2));
	}

	// 생성과 실행
	// 초기값에 따른 생성 확인 ex 오른 <-> 왼 / 무 <-> 무  / 왼 <-> 오른 or 무
	// 방향에 따라서 이동
}
