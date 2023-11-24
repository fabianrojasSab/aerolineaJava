package com.aerolinea.app.mtto.services;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.aerolinea.app.mtto.daos.IMaintenanceDao;
import com.aerolinea.app.mtto.daos.MaintenanceDao;
import com.creandosoft.fm.core.dtos.FmDto;
import com.creandosoft.fm.core.enumerations.EFmContentType;
import com.creandosoft.fm.core.models.FmModel;
import com.creandosoft.fm.core.persistences.FmEntity;
import com.creandosoft.fm.core.services.IBaseService;

@Service("baseImplService")
public class BaseImplService implements IBaseService {
  private static final long serialVersionUID = -7058600874336867926L;

  @Autowired
  private IMaintenanceDao mantenimientoDao;

  public void setMantenimientoDao(IMaintenanceDao mantenimientoDao) {
    this.mantenimientoDao = mantenimientoDao;
  }

  public MaintenanceDao getMantenimientoDao() {
    return (MaintenanceDao) mantenimientoDao;
  }

  @Override
  @Transactional(propagation = Propagation.REQUIRED)
  public long getSequence(String tabla) {
    return mantenimientoDao.getSequence(tabla);
  }

  @Override
  @Transactional(propagation = Propagation.REQUIRED)
  public boolean save(FmDto o) {
    try {
      // Se deben procesar los consecutivos de esta entidad, si existen
      o.getSequenceValue(this);
      FmEntity e = o.geEntityWithOption(EFmContentType.ALL);
      getMantenimientoDao().save(e);
    }
    catch (RuntimeException re) {
      return false;
    }
    return true;
  }

  @Override
  @Transactional(propagation = Propagation.REQUIRED)
  public boolean update(FmDto o) {
    try {
      // Se deben procesar los consecutivos de esta entidad, si existen
      o.getSequenceValue(this);
      FmEntity e = o.geEntityWithOption(EFmContentType.ALL);
      getMantenimientoDao().update(e);
    }
    catch (RuntimeException re) {
      return false;
    }
    return true;
  }

  @Override
  @Transactional(propagation = Propagation.REQUIRED)
  public <T extends FmEntity> boolean delete(Class<T> clazz, Serializable id) {
    try {
      FmEntity e = getMantenimientoDao().get(clazz, id);
      getMantenimientoDao().delete(e);
    }
    catch (RuntimeException re) {
      return false;
    }
    return true;
  }

  @SuppressWarnings("unchecked")
  @Override
  @Transactional(propagation = Propagation.REQUIRED)
  public <T extends FmDto> T get(Class<T> clazz, Serializable id, EFmContentType type) {
    Class<? extends FmEntity> zz = ((Class<? extends FmEntity>) FmModel.getClass(clazz));
    FmEntity entity = getMantenimientoDao().get(zz, id);
    FmDto dto = entity == null ? null : entity.getDtoWithOption(type);

    return (T) dto;
  }



}
