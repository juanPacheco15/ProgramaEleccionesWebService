
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Tabla extends DefaultTableModel {

    public Tabla() {
    }

    public Tabla(int rowCount, int columnCount) {
        super(rowCount, columnCount);
    }

    public Tabla(Vector<?> columnNames, int rowCount) {
        super(columnNames, rowCount);
    }

    public Tabla(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
    }

    public Tabla(Vector<? extends Vector> data, Vector<?> columnNames) {
        super(data, columnNames);
    }

    public Tabla(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }

    public boolean isCellEditable(int row, int column) {
        // Aquí devolvemos true o false según queramos que una celda
        // identificada por fila,columna (row,column), sea o no editable
        if (column == 3) {
            return true;
        }
        return false;
    }

}
