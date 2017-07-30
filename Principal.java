import javax.swing.*;
public class Principal {
	public static void main(String [] args) {
		Usuario alex = new Usuario();
		String nombre=alex.getNombre();
		String curp = alex.getCurp();
		String direccion = alex.getDireccion();
		String telefono = alex.getTelefono();
		
		JOptionPane.showMessageDialog(null, "Su Nombre Es: "+nombre+",\n Su Curp Es: "+curp+","
				+ " \n Su Direccion Es: "+direccion+", \n Su Numero De Telefono es: "+telefono);
		
		
		
	}

}
