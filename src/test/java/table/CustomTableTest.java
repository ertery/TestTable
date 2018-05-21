package table;

import exception.TableOutOfBoundsException;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CustomTableTest {
    private static CustomTable table;

    @BeforeClass
    public static  void initTable() throws Exception {
        table = new CustomTable(90, 100);
        table.put(90, 89, "test");
    }

    @Test
    public void put() throws Exception {
        assertNull(table.put(9, 4, "1"));
        assertEquals("1", table.get(9, 4));
    }

    @Test
    public void putInSamePlace() throws Exception {
        table.put(9, 4, "1");
        assertEquals("1", table.put(9, 4, "2"));
    }

    @Test(expected = TableOutOfBoundsException.class)
    public void putOutOfBounds() throws Exception {
        table.put(100, 4, "1");
    }

    @Test
    public void get() throws Exception {
        assertEquals("test", table.get(90, 89));
    }

    @Test(expected = TableOutOfBoundsException.class)
    public void getOutOfBounds() throws Exception {
        assertEquals("test", table.get(90, 90));
    }

}