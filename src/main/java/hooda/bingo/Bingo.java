package hooda.bingo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Bingo {
    private final int year;
    private final List<BingoSquare> bingoSquares;
}
