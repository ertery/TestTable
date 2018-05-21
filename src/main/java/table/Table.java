package table;

import exception.TableOutOfBoundsException;

public interface Table {

    String put(int column, int row, String value) throws TableOutOfBoundsException;

    String get(int column, int row) throws TableOutOfBoundsException;
}
