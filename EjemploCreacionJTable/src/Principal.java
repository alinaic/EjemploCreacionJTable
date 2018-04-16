import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class Principal {

	public static void main(String[] args) {
		JFrame ventana = new JFrame();

		// agregar la tabla:
		JTable tabla = new JTable(new MiTableModel());
		// ventana.add(tabla);
		// si lo que queremos agregar en la tabla con una barra de scroll
		// agregamos la tabla a una barra de scroll
		// y lo que le agregamos a ña ventana es la barra de scroll

		tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));
		tabla.setFillsViewportHeight(true);

		// Create the scroll pane and add the table to it.
		JScrollPane scrollPane = new JScrollPane(tabla);
		// antes de agregar el scrollPane, le decimos que muestra la ultima
		// columna como botones:
		TableCellRenderer buttonRenderer = new JTableButtonRenderer();
		tabla.getColumn("BORRAR REGISTRO").setCellRenderer(buttonRenderer);

		ventana.add(scrollPane);
		ventana.setSize(800, 600);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}

}
