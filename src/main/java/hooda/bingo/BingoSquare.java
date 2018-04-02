package hooda.bingo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BingoSquare {
    //Refers to the position in the Bingo - goes 0..4 for first row, 5..9 for second row and so on.
    private final int id;
    private final String name;
    private final String description;
}
