
public class Cell
{
    private int _value;
    private Cell _next;

    public Cell(int value){
        _value = value;
        _next = null;
    }

    public void connect(Cell next){
        _next = next;
    }

    public Cell getNext(){
        return _next;
    }

    public int getValue(){
        return _value;
    }
}
