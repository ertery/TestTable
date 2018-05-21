package table;

import exception.TableOutOfBoundsException;

public class CustomTable implements Table {

    private String[][] table;

    public CustomTable(int rowNums, int columnNums) {
        this.table = new String[rowNums][columnNums];
    }

    @Override
    public String put(int column, int row, String value) throws TableOutOfBoundsException {
        if (table.length <= row || table[0].length <= column) {
            throw new TableOutOfBoundsException("This index is out of table bounds");
        }
        String val = table[row][column];
        table[row][column] = value;
        return val;
    }

    @Override
    public String get(int column, int row) throws TableOutOfBoundsException {
        if (table.length <= row || table[0].length <= column) {
            throw new TableOutOfBoundsException("This index is out of table bounds");
        }
        return table[row][column];
    }
}
