package co.edu.uniquindio.p1.cinema.application;

import co.edu.uniquindio.p1.cinema.view.Template;
import co.edu.uniquindio.p1.cinema.view.VentanaPrincipal;
import co.edu.uniquindio.p1.cinema.view.VentanaSelUsuario;

public class Aplicacion {
	public static void main(String[] args) {
		Template v = new VentanaSelUsuario(1000, 800);
		v.setVisible(true);
	}
}