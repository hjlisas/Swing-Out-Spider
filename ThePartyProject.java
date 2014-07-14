import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
import java.io.*;

public class ThePartyProject extends Applet implements ActionListener, 
                                                       MouseListener, 
                                                       MouseMotionListener
																			
{
	PartyAnimals[] partyAnimals;
	Button runningEminem, dancingEminem, swingOutSpider, 
		   strungOutSpider, partyOn;
	int numOfPartyAnimals, origX, origY, addX, p;
	
	public void init()
	{
		numOfPartyAnimals = 0;
		origX = 120;
		origY = 80;
		addX = 120;
		partyAnimals = new PartyAnimals[ 15 ];
		
		partyOn = new Button( "Party On!" );
		runningEminem = new Button( "Running M&M" );
		dancingEminem = new Button( "Dancing M&M" );
		swingOutSpider = new Button( "Swing Out Spider" );
		strungOutSpider = new Button( "Strung Out Spider" );
		add( runningEminem );
		add( dancingEminem );
		add( swingOutSpider );
		add( strungOutSpider );
		add( partyOn );

		runningEminem.addActionListener(this);
		dancingEminem.addActionListener(this);
		swingOutSpider.addActionListener(this);
		strungOutSpider.addActionListener(this);
		partyOn.addActionListener(this);
      addMouseListener(this);
      addMouseMotionListener(this);
	}
	
	public void paint( Graphics g )
	{
		for( int i = 0; i < numOfPartyAnimals; i++ )
		{
			partyAnimals[ i ].paint( g );
		}
	}
	
	public void actionPerformed( ActionEvent e )
	{
		if ( e.getSource() == runningEminem && numOfPartyAnimals < partyAnimals.length )
		{
			partyAnimals[ numOfPartyAnimals ] = new RunningEminem( origX, origY );
			repaint();
			numOfPartyAnimals++;
			if ( numOfPartyAnimals == 5 )
			{
				origX = 0;
				origY = 250;
			}
			else if ( numOfPartyAnimals == 10 )
			{
				origX = 0;
				origY = 400;
			}
			origX+=addX;
		}
		else if ( e.getSource() == dancingEminem && numOfPartyAnimals < partyAnimals.length )
		{
			partyAnimals[ numOfPartyAnimals ] = new DancingEminem( origX, origY );
			repaint();
			numOfPartyAnimals++;
			if ( numOfPartyAnimals == 5 )
			{
				origX = 0;
				origY = 250;
			}
			else if ( numOfPartyAnimals == 10 )
			{
				origX = 0;
				origY = 400;
			}
			origX+=addX;
		}
		else if ( e.getSource() == swingOutSpider && numOfPartyAnimals < partyAnimals.length )
		{
			partyAnimals[ numOfPartyAnimals ] = new SwingOutSpider( origX, origY );
			repaint();
			numOfPartyAnimals++;
			if ( numOfPartyAnimals > 4 )
			if ( numOfPartyAnimals == 5 )
			{
				origX = 0;
				origY = 250;
			}
			else if ( numOfPartyAnimals == 10 )
			{
				origX = 0;
				origY = 400;
			}
			origX+=addX;
		}
		else if ( e.getSource() == strungOutSpider && numOfPartyAnimals < partyAnimals.length )
		{
			partyAnimals[ numOfPartyAnimals ] = new StrungOutSpider( origX, origY );
			repaint();
			numOfPartyAnimals++;
			if ( numOfPartyAnimals == 5 )
			{
				origX = 0;
				origY = 250;
			}
			else if ( numOfPartyAnimals == 10 )
			{
				origX = 0;
				origY = 400;
			}
			origX+=addX;
		}
		else if ( e.getSource() == partyOn )
		{
			for ( int i = 0; i < numOfPartyAnimals; i++ )
			{
				partyAnimals[ i ].act();
  			}
			repaint();
		}
	}
	
    public void mouseClicked( MouseEvent e ){}
    public void mouseEntered( MouseEvent e ){}
    public void mouseExited( MouseEvent e ){}
    public void mousePressed( MouseEvent e )
    {
        for(int i = 0; i < numOfPartyAnimals; i++ )
        {
            if( Math.sqrt(  ( partyAnimals[i].getX() - e.getX() ) *
                            ( partyAnimals[i].getX() - e.getX() )
                          + ( partyAnimals[i].getY() - e.getY() ) *
                            ( partyAnimals[i].getY() - e.getY() )  )  < 15 )
            {
                p = i;
                break;
            }
        }                   
    }
    public void mouseReleased( MouseEvent e )
    {
        p = -1;
    }

    public void mouseDragged( MouseEvent e )
    {
        if( p >= 0 )
        {
            partyAnimals[p].setXY( e.getX(), e.getY() );
            repaint();
        }
    }

    public void mouseMoved( MouseEvent e ){}
}
