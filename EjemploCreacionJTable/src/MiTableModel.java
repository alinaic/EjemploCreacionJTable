import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

//cuando implementamos un interfaz debemos tener en la clase
//los metodos que me diga el interfaz

//cuando heredamos de una clase abstacta estamos obligados
// a tener en la clase actual todos los metodos abstractos

public class MiTableModel extends AbstractTableModel {

	private String[] columnas = { "nombre", "direccion", "poblacion",
			"BORRAR REGISTRO" };

	private String[][] datos =

	{ { "BAR JULIAN", "CALLE OLMO, 31", "SALAMANCA" },
			{ "RESTAURANTE ANA", "CALLE SOL, 65", "SALAMANCA" },

	};

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnas.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return datos.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return columnas[columnIndex];
	}

	@Override
	public Object getValueAt(int numeroFila, int numeroColumna) {
		if (numeroColumna == columnas.length - 1) {
			JButton botonBorrar = new JButton("BORRAR");
			botonBorrar.setActionCommand("se pulso el boton del indice: "
					+ numeroFila);
			botonBorrar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("se pulso el boton, me llego como"
							+ "action command: " + e.getActionCommand());

				}
			});
			return botonBorrar;
		}
		return datos[numeroFila][numeroColumna];
	}

}
