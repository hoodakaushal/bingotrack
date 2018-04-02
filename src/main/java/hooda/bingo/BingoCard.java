package hooda.bingo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collections;
import java.util.Map;

@Getter
@AllArgsConstructor
public class BingoCard {
    private final int id;
    private String name;
    private Map<Integer, Integer> squareToBookMap;

    public Map<Integer, Integer> getSquareToBookMap() {
        return Collections.unmodifiableMap(squareToBookMap);
    }

    public void setBook(int squareId, int bookId) {
        squareToBookMap.put(squareId, bookId);
    }

    public void removeBook(int squareId) {
        squareToBookMap.remove(squareId);
    }
}
