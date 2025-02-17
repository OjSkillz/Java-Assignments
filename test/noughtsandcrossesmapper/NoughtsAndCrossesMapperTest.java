package noughtsandcrossesmapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NoughtsAndCrossesMapperTest {

    private NoughtsAndCrossesMapper mapper;

    @BeforeEach
    public void createMapper() {
        mapper = new NoughtsAndCrossesMapper();
    }

    char[][] noughtsAndCrosses = {{'X', 'O', 'X'},
                                  {'X', 'X', 'O'},
                                  {'X', 'O', 'O'}};

    @Test
    public void noughtsAndCrossesReturns1sAnd0sTest() {
        int[][] mappedNoughtsAndCrosses = {{1, 0, 1}, {1, 1, 0}, {1, 0, 0}};
        assertArrayEquals(mappedNoughtsAndCrosses, mapper.mapNoughtsAndCrosses(noughtsAndCrosses));

    }
}
