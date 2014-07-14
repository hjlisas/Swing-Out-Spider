import java.awt.*;
import java.applet.Applet;

public class Spider implements PartyAnimals
{
	protected int webLength = 40;
	protected int headRadius = 5;
	protected int bodyRadius = 8;
	protected int armLength = 10;
	protected int armWidth = 20;
	protected int forearm1Length = 20;
	protected int forearm2Length = 10;
	protected int forearm3Length = 0;
	protected int forearm4Length = 20;
	protected int forearmWidth = 20;
	protected int x = 40;
	protected int y = 30;
	protected int numStates = 5;
	protected int state = 0;
	
	protected Point web, headCenter, neck, bodyCenter;
	protected Point rightArm1, rightArm2, rightArm3, rightArm4;
	protected Point rightForearm1, rightForearm2, rightForearm3, rightForearm4;
	protected Point leftArm1, leftArm2, leftArm3, leftArm4;
	protected Point leftForearm1, leftForearm2, leftForearm3, leftForearm4;
	
	public Spider()
	{
		setXY( this.x, this.y );
	}

	public Spider( int x, int y )
	{
		setXY( x, y );
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public void setXY( int x, int y )
	{
		this.x = x;
		this.y = y;
		
		web = new Point( this.x, this.y - 40 );
		headCenter = new Point( x, y + webLength );
		neck = new Point( headCenter.x, headCenter.y + headRadius );
		bodyCenter = new Point( neck.x, neck.y + bodyRadius );
		rightArm1 = new Point( neck.x + armWidth, neck.y - armLength );
		rightArm2 = new Point( neck.x + armWidth, neck.y );
		rightArm3 = new Point( neck.x + armWidth, neck.y + armLength );
		rightArm4 = new Point( neck.x + armWidth, neck.y + armLength + 10 );
		rightForearm1 = new Point( rightArm1.x + ( forearmWidth - 10 ), rightArm1.y - forearm1Length );
		rightForearm2 = new Point( rightArm2.x + forearmWidth, rightArm2.y - forearm2Length );
		rightForearm3 = new Point( rightArm3.x + forearmWidth, rightArm3.y + forearm3Length );
		rightForearm4 = new Point( rightArm4.x + ( forearmWidth - 10 ), rightArm4.y + forearm4Length );

		leftArm1 = new Point( neck.x - armWidth, neck.y - armLength );
		leftArm2 = new Point( neck.x - armWidth, neck.y );
		leftArm3 = new Point( neck.x - armWidth, neck.y + armLength );
		leftArm4 = new Point( neck.x - armWidth, neck.y + armLength + 10 );
		leftForearm1 = new Point( leftArm1.x - ( forearmWidth - 10 ), leftArm1.y - forearm1Length );
		leftForearm2 = new Point( leftArm2.x - forearmWidth, leftArm2.y - forearm2Length );
		leftForearm3 = new Point( leftArm3.x - forearmWidth, leftArm3.y + forearm3Length );
		leftForearm4 = new Point( leftArm4.x - ( forearmWidth - 10 ), leftArm4.y + forearm4Length );
	}
	
	private void drawLine( Graphics g, Point p1, Point p2 )
	{
		g.drawLine( p1.x, p1.y, p2.x, p2.y );
	}

	public void paint( Graphics g )
	{
		drawLine( g, web, headCenter );
		drawLine( g, headCenter, neck );
		drawLine( g, neck, rightArm1 );
		drawLine( g, neck, rightArm2 );
		drawLine( g, neck, rightArm3 );
		drawLine( g, neck, rightArm4 );
		drawLine( g, rightArm1, rightForearm1 );
		drawLine( g, rightArm2, rightForearm2 );
		drawLine( g, rightArm3, rightForearm3 );
		drawLine( g, rightArm4, rightForearm4 );
		drawLine( g, neck, leftArm1 );
		drawLine( g, neck, leftArm2 );
		drawLine( g, neck, leftArm3 );
		drawLine( g, neck, leftArm4 );
		drawLine( g, leftArm1, leftForearm1 );
		drawLine( g, leftArm2, leftForearm2 );
		drawLine( g, leftArm3, leftForearm3 );
		drawLine( g, leftArm4, leftForearm4 );
		g.fillOval( headCenter.x - headRadius, headCenter.y - headRadius, 
					headRadius * 2, headRadius * 2 );
		g.fillOval( bodyCenter.x - bodyRadius, bodyCenter.y - bodyRadius, 
					bodyRadius * 2, bodyRadius * 3 );

	}
	
	public void act()
	{
	}
}

