package com.aerolinea.app.mtto.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.aerolinea.app.mtto.daos.MaintenanceDao;
import com.aerolinea.app.mtto.dtos.UsuarioDto;

@Service("maintenanceImplService")
public class MaintenanceImplService extends BaseImplService implements IMaintenanceService {
	private static final long serialVersionUID = -263283833055397009L;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public MaintenanceDao dao() {
		return getMantenimientoDao();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public UsuarioDto login(String usuario, String clave) {
		try {
			
			/*List<Usuario> r =  dao().getEm().createQuery("select o from "+Usuario.class.getCanonicalName() + " o").getResultList();
			
			System.out.println(usuario + " " + clave);*/
			
		} catch (Exception e) {
			throw new RuntimeException(e);

		}
		return null;
	}

}
