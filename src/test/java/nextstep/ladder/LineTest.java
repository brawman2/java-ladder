package nextstep.ladder;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import nextstep.ladder.domain.Line;

public class LineTest {

	@Test
	@DisplayName("사람의 수만큼 블록을 생성, 사람 수는 1보다 커야함")
	void test() {
		Line line = new Line(5);

		assertThat(line.blocks().size()).isEqualTo(5);

		assertThatThrownBy(() -> {
			new Line(1);
		}).isExactlyInstanceOf(IllegalArgumentException.class);
	}
	
	// 생성과 실행 테스트
	// 1. 연속된 연결이 없는지 확인
	// 2. 참가자와 동일한 위치의 블록으로 진입
	// 임의로 라인 만들고 참가자의 위치 임의로 삽입, 의도된 결과 나오는지
}
