package com.aerolinea.app.mtto.services;

import com.aerolinea.app.mtto.daos.MaintenanceDao;
import com.aerolinea.app.mtto.dtos.UsuarioDto;
import com.creandosoft.fm.core.services.IBaseService;

public interface IMaintenanceService extends IBaseService {

  MaintenanceDao dao();

  public UsuarioDto login(String usuario, String clave);
  
 
}