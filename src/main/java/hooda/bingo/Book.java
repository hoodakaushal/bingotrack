package hooda.bingo;

import lombok.Getter;

import java.net.URL;
import java.util.List;

@Getter
public class Book {
    //Need this in case of multiple books of same name
    private int id;
    private String name;
    private String author;
    private URL goodreadsUrl;

    private List<SquareWithMode> applicableSquares;
    
}
