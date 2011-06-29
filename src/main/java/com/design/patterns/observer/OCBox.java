package com.design.patterns.observer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import javax.swing.JPanel;

class OCBox extends JPanel implements Observer {
    class ML extends MouseAdapter {
	@Override
	public void mousePressed(final MouseEvent e) {
	    OCBox.this.notifier.notifyObservers(OCBox.this);
	}
    }

    /**
     * 
     */
    private static final long serialVersionUID = -4580612112242627887L;

    static final Color newColor() {
	return colors[rand.nextInt(colors.length)];
    }

    Observable notifier;
    int x, y; // Locations in grid
    Color cColor = newColor();

    static final Color[] colors = { Color.BLACK, Color.BLUE, Color.CYAN,
	    Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY,
	    Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE,
	    Color.YELLOW };

    static Random rand = new Random();

    OCBox(final int x, final int y, final Observable notifier) {
	this.x = x;
	this.y = y;
	notifier.addObserver(this);
	this.notifier = notifier;
	addMouseListener(new ML());
    }

    private final boolean nextTo(final OCBox b) {
	return (Math.abs(this.x - b.x) <= 1) && (Math.abs(this.y - b.y) <= 1);
    }

    @Override
    public void paintComponent(final Graphics g) {
	super.paintComponent(g);
	g.setColor(this.cColor);
	final Dimension s = getSize();
	g.fillRect(0, 0, s.width, s.height);
    }

    @Override
    public void update(final Observable o, final Object arg) {
	final OCBox clicked = (OCBox) arg;
	if (nextTo(clicked)) {
	    this.cColor = clicked.cColor;
	    repaint();
	}
    }
}