package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;
import org.example.demo.ticket.model.bean.projet.Projet;

/**
 * Demo design pattern factory {@link ManagerFactory}
 *
 * @author hno
 */
public final class ManagerFactory {
	
	/** Design pattern singleton **/
	private static final ManagerFactory INSTANCE = new ManagerFactory();
	
	/**
	 * Constructeur
	 */
	private ManagerFactory() {
		super();
	}
	
	/**
	 * Renvoie l'instance unique de la classe (design pattern Singleton).
	 *
	 * @return {@link ManagerFactory}
	 */
	public static ManagerFactory getInstance(){
		return ManagerFactory.INSTANCE;
	}
	
	public ProjetManager getProjectManager() {
		return new ProjetManager();
	}
	
	public TicketManager getTicketManager() {
		return new TicketManager();
	}
	
}
