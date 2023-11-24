package com.aerolinea.app.mtto.daos;

import org.springframework.stereotype.Repository;

@Repository
public class MaintenanceDao extends BaseMaintenanceDao implements IMaintenanceDao {
	private static final long serialVersionUID = -6350137462735843811L;

	// @SuppressWarnings("unchecked")
	// private synchronized Long getValorSequencia(String tabla) {
	// List<java.math.BigInteger> l = getEm().createNativeQuery("select
	// nextval('administrativo."+tabla+"')").getResultList();
	// if(l != null && !l.isEmpty()){
	// return l.get(0).longValue();
	// }
	// return null;
	// }

	@Override
	public long getSequence(String tabla) {
		return 0l;
	}

	@Override
	public long getSequenceFe(String tabla) {
		return 0;
	}

}