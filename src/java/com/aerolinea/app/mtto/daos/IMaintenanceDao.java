package com.aerolinea.app.mtto.daos;

public interface IMaintenanceDao {

  /**
   * 
   *
   * Trae el consecutivo de la tabla
   *
   * @autor raul.franco 2017/01/17
   * 
   * @param dto
   * @return
   *
   */
  long getSequence(String tabla);

  /**
   * 
   *
   * Trae el consecutivo de las tablas del esquema "fe"
   *
   * @autor raul.franco 2017/01/17
   * 
   * @param dto
   * @return
   *
   */
  long getSequenceFe(String tabla);

   
}
