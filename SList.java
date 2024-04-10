public class SList {
    private int _length = 0;
    private Cell _head;
    private Cell _end;

    void add(int value){
        if(_length == 0) {
            _head = new Cell(value);
            _end = _head;
        }
        else
        {
            Cell newCell = new Cell(value);
            _end.connect(newCell);
            _end = newCell;
        }
        _length++;
    }

    void show(){
        Cell curr = _head;
        while(curr.getNext() != null) {
            System.out.print(String.valueOf(curr.getValue()) + ", ");
            curr = curr.getNext();
        }
        System.out.print(String.valueOf(curr.getValue()) + ";");
    }
}
