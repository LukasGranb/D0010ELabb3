package Labb3.vy;

import Labb3.modell.Gång;
import Labb3.modell.Nivå;
import Labb3.modell.Rum;
import Labb3.modell.Väderstreck;
import Labb3.verktyg.Punkt;

import javax.swing.*;
import java.awt.*;

import static Labb3.GlobalaKonstanter.MARKFÄRG;

// TODO: Ändra nästa rad så att en Målarduk "är-en" JPanel.
public class Målarduk extends JPanel {

	private final Nivå enNivå;

	public Målarduk(Nivå enNivå) {
		this.enNivå = enNivå;
		// TODO: Sätt bakgrundsfärgen på this till MARKFÄRG.
		this.setBackground(MARKFÄRG);
		// TODO: Anropa metoden setFocusable på this och med argumentet true.
		// Detta behövs för att lyssnaren i programmet ska reagera.
		this.setFocusable(true);
	}

	// TODO: Lätt till @Override på metoden nedan.
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Lägg till ett anrop till paintComponent i omedelbara
		// överklassen (JPanel). Skicka med g som argument.
		super.paintComponent(g);		//super anropar till överklassen vilken i detta fall är Jpanel

		// TODO: Lägg till kod som ritar ut en grafisk vy av enNivå.
		// För att underlätta finns hjälpmetoder som ska skrivas klara. Studera
		// noga bilderna i labbinstruktionen för att få fram formlerna för
		// bas- och pivotpunkternas koordinater. Använd ritmetoderna i klassen
		// labb3.verktyg.Grafik. Anropa hjälpmetoderna från paintComponent.
		for (Rum R: enNivå.getExisterandeRum()) {
			ritaRum(g, R);
		}



}

	private void ritaRum(Graphics g, Rum ettRum) {
		g.setColor(ettRum.getFärg());
		g.fillRect(ettRum.getÖvPunkt().x(), ettRum.getÖvPunkt().y(), getWidth(), getHeight());
	}

	private void ritaGångarFrånRum(Graphics g, Rum ettRum) {
		for (Väderstreck utgångar: Väderstreck.values()){

		}
	}

	private Punkt baspunkt(Rum ettRum, Väderstreck enRiktning) {
		return null; /* endast här för att Eclipse inte ska klaga */
	}

	private Punkt pivotpunkt(Rum ettRum, Väderstreck enRiktning) {
		return null; /* endast här för att Eclipse inte ska klaga */
	}

	private void ritaGång(Graphics g, Gång enGång) {

	}

	private void ritaMarkörFörVarAnvändarenÄr(Graphics g) {

	}
}
