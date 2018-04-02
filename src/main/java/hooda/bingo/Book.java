package hooda.bingo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class Book {
    //Need this in case of multiple books of same name
    private final UUID id;
    private String name;
    private String author;
    private URL goodreadsUrl;

    //Square id -> isHardMode
    private Map<Integer, Boolean> squareToModeMap;

    public Map<Integer, Boolean> getSquareToModeMap() {
        return Collections.unmodifiableMap(squareToModeMap);
    }

    //Will add a square, or if it's already there, then will update the mode
    public void addOrUpdateSquare(int squareId, boolean isHardMode) {
        squareToModeMap.put(squareId, isHardMode);
    }

    public void removeSquare(int squareId) {
        squareToModeMap.remove(squareId);
    }
}
