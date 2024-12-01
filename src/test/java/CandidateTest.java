import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CandidateTest {
    @Test
    void match_three() {
        Candidate candidate = new Candidate(new Lotto(1,2,3,4,5,6));

        Lotto winning = new Lotto(1,2,3,14,15,16); // match 3

        assertThat(candidate.match(winning).is(3)).isTrue();
    }
}
