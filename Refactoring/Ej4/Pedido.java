package io.github.unlp_oo.archetype;

public class Pedido {

	private Cliente cliente;
	private List<Producto> productos;
	private String formaPago;

	public Pedido(Cliente cliente, List<Producto> productos, String formaPago) {
		if (!"efectivo".equals(formaPago)
				&& !"6 cuotas".equals(formaPago)
				&& !"12 cuotas".equals(formaPago)) {
			throw new Error("Forma de pago incorrecta");
		}
		this.cliente = cliente;
		this.productos = productos;
		this.formaPago = formaPago;
	}

	public double getCostoTotal() {
		double costoProductos = 0;
		for (Producto producto : this.productos) {
			costoProductos += producto.getPrecio();
		}
		double extraFormaPago = 0;
		if ("efectivo".equals(this.formaPago)) {
			extraFormaPago = 0;
		} else if ("6 cuotas".equals(this.formaPago)) {
			extraFormaPago = costoProductos * 0.2;
		} else if ("12 cuotas".equals(this.formaPago)) {
			extraFormaPago = costoProductos * 0.5;
		}
		int añosDesdeFechaAlta = Period.between(this.cliente.getFechaAlta(), LocalDate.now()).getYears();
// Aplicar descuento del 10% si el cliente tiene más de 5 años de antiguedad
		if (añosDesdeFechaAlta > 5) {
			return (costoProductos + extraFormaPago) * 0.9;
		}
		return costoProductos + extraFormaPago;
	}
}

//Replace Loop with Pipeline (líneas 16 a 19)	
	double costoProductos = this.productos.stream().mapToDouble().(p->p.getPrecio()).sum();
	
//Replace Conditional with Polymorphism (líneas 21 a 27)
	private FormaPago formaPago;
	
	public inteface FormaPago{
		public double extra();
	}
	
	public class Efectivo implements FormaPago{
		public public double extra() {
			return 0;
		}
	}
	public class SeisCuotas implements FormaPago{
		public public double extra() {
			return 0.2;
		}
	}
	public class DoceCuotas implements FormaPago{
		public public double extra() {
			return 0.5;
		}
	}
		
	double extraFormaPago = costoProductos * this.formaPago.extra();

	//Extract method y move method (línea 28)
		int añosDesdeFechaAlta = this.cliente.añosDesdeFechaAlta();
		
public class Cliente {
	public int añosDesdeFechaAlta() {
		return Period.between(this.getFechaAlta(), LocalDate.now()).getYears());
	}
}

//Extract method y replace temp with query (líneas 28 a 33)
	return (costoProductos + extraFormaPago) 
			* (1 - this.porcentajeDescuentoPorAntiguedad());

	private porcentajeDescuentoPorAntiguedad() {
		return this.cliente.añosDesdeFechaAlta() > 5 ? 0.1:0;
	}
	

