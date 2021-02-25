package com.eragapati.config.envers;

import org.hibernate.envers.boot.internal.EnversService;
import org.hibernate.envers.event.spi.EnversPostInsertEventListenerImpl;
import org.hibernate.event.spi.PostInsertEvent;


public class HibernateEnversPostInsertListner extends EnversPostInsertEventListenerImpl {

	private static final long serialVersionUID = 8428297615274114026L;

	public HibernateEnversPostInsertListner(EnversService enversService) {
		super(enversService);
	}

	@Override
	public void onPostInsert(PostInsertEvent event) {
		System.err.print("No Audit for Insert");
		// super.onPostInsert(event);
	}

}
