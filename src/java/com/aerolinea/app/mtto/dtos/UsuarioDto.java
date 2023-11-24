package com.aerolinea.app.mtto.dtos;

import com.aerolinea.app.mtto.entities.Usuario;
import com.creandosoft.fm.core.annotations.FmLinkMark;
import com.creandosoft.fm.core.dtos.FmDto;
import com.creandosoft.fm.csm.annotations.CsmKeyMark;
import com.creandosoft.fm.csm.annotations.CsmQueryMark;

@FmLinkMark(persistence = Usuario.class)
public class UsuarioDto extends FmDto {

	private static final long serialVersionUID = 856712571510591651L;

	@CsmKeyMark
	@CsmQueryMark
	private long usuarioId;
	@CsmQueryMark
	private String nombre;
	@CsmQueryMark
	private String correo;
	@CsmQueryMark
	private String contrasena;
	@CsmQueryMark
	private String estado;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}
