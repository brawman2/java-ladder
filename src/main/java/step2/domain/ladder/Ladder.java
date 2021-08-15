package step2.domain.ladder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ladder {
    private final List<LadderLine> ladderLines;

    private final Participants participants;

    public Ladder(List<LadderLine> ladderLines, List<String> names) {
        this.ladderLines = ladderLines;
        this.participants = Participants.of(names);
    }

    public static Ladder create(List<String> names, int height) {
        List<LadderLine> lines = createLines(height, names.size());
        return new Ladder(lines, names);
    }

    private static List<LadderLine> createLines(int height, int size) {
        return IntStream.range(0, height)
            .mapToObj(value -> LadderLine.of(size))
            .collect(Collectors.toList());
    }

    public List<String> inlineParticipants() {
        return participants.inline();
    }

    public List<LadderLine> getLadderLines() {
        return ladderLines;
    }
}
