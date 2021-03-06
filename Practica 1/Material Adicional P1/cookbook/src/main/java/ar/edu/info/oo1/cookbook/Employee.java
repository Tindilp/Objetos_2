package ar.edu.info.oo1.cookbook;

/**
 * Clase que define un empleado b�sico de una empresa.
 * @author dcano
 *
 */
public class Employee {

	/**
	 * Nombre del Empleado.
	 */
	private String name;

	/**
	 * Apellido del Empleado.
	 */
	private String surname;	

	/**
	 * Sueldo Basico del Empleado.
	 */
	private double basicIncome;

	
	/**
	 * Constructor. Crea una instancia de empleado a partir de los 
	 * par�metros recibidos.
	 * 
	 * @param name Nombre del empleado.
	 * @param surname Apellido del empleado.
	 * @param basicIncome Sueldo basico empleado.
	 */
	public Employee(String name, String surname, double basicIncome) {
		this.setName(name);
		this.setSurname(surname);
		this.setBasicIncome(basicIncome);
	}

	/**
	 *  Calculo del sueldo neto del empleado. Se le descuenta el 15 porciento por aportes jubilatorios.
	 */
	public double getFinalIncome(){
		return this.getBasicIncome()*0.85;
	}
	
	/**
	 * Incrementa el sueldo basico en el porcentaje indicado por parametro.
	 * 
	 * @param percentage Porcentaje a incrementar el sueldo basico.
	 */
	public void increaseIncome(double percentage){
		this.setBasicIncome(this.getBasicIncome()*(1+(percentage/100)));
	}
	
	
	
	/** Getters y Setters */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getBasicIncome() {
		return basicIncome;
	}

	public void setBasicIncome(double basicIncome) {
		this.basicIncome = basicIncome;
	}	

}
