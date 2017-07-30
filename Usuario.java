import javax.swing.*;
public class Usuario {
	String nombre, direccion, curp, telefono;
	
	public Usuario(){
		this.nombre = "Alonso";
		this.direccion = "Calle Emiliano Zapata #1";
		this.curp = "HEMA980925HVZRRL09";
		this.telefono = "2321535057";
	}

	public String getNombre() {
		nombre=JOptionPane.showInputDialog("Ingrese Su Nombre");
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = "Alonso";
	}

	public String getDireccion() {
		direccion=JOptionPane.showInputDialog("Ingresa Tu Direccion");
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = "Calle Emiliano Zapata #1";
	}

	public String getCurp() {
		curp=JOptionPane.showInputDialog("Ingresa Tu Curp");
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = "HEMA980925HVZRRL09";
	}

	public String getTelefono() {
		telefono=JOptionPane.showInputDialog("Ingresa Tu # De Telefono");
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = "2321535057";
	}
	
}
