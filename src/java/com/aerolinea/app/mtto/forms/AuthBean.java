package com.aerolinea.app.mtto.forms;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.aerolinea.app.mtto.services.IMaintenanceService;

@ManagedBean(name = "authBean")
@RequestScoped
public class AuthBean {

	@ManagedProperty(value = "#{maintenanceImplService}")
	private IMaintenanceService mantenimientoService;

	// Declaramos las propiedades
	private String username;

	private String password;

	
	
	public IMaintenanceService getMantenimientoService() {
		return mantenimientoService;
	}

	public void setMantenimientoService(IMaintenanceService mantenimientoService) {
		this.mantenimientoService = mantenimientoService;
	}

	// Getter y setter para username
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	// Getter y setter para password
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {

		System.out.println("Username: " + username);
		System.out.println("Password: " + password);

		boolean correcto = true;

		mantenimientoService.login(username, password);
		
		// El bean siempre debe invocar un servicio

		if (correcto) {
			return "paginaPrincipal";
		}

		return 	null;

//		if (usuario!= null && usuario.getContrasena().equals(password)) {
//			System.out.println("pasa if");
//			// Autenticación exitosa, redirigir a la página principal
//            return "paginaPrincipal"; // Cambiar a la página correcta
//		}else {
//			// Autenticación fallida, mostrar mensaje de error
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Nombre de usuario o contraseña incorrectos"));
//            return null;
//		}

	}

}
