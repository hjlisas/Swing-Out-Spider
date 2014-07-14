import java.awt.*;
//import java.applet.Applet;

public class Eminem implements PartyAnimals
{
	protected int headRadius = 18;
	protected int armLength = 10;
	protected int armWidth = 30;
	protected int forearmLength = 20;
	protected int forearmWidth = 10;
	protected int kneeLength = 40;
	protected int kneeWidth = 20;
	protected int legLength = 30;
	protected int legWidth = 30;
	protected int x = 50;
	protected int y = 80;
	protected int numStates = 5;
	protected int state = 0;
	
	protected Point headCenter;
	protected Point leftArm, rightArm, leftForearm, rightForearm;
	protected Point leftLeg, rightLeg, leftKnee, rightKnee;
	
	public Eminem()
	{
		setXY( this.x, this.y );
	}
	
	public Eminem( int x, int y )
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
		
		this.headCenter = new Point( this.x, this.y );
		rightArm = new Point( headCenter.x + armWidth, headCenter.y + armLength );
		rightForearm = new Point( rightArm.x + forearmWidth, rightArm.y + forearmLength );
		leftArm = new Point( headCenter.x - armWidth, headCenter.y + armLength );
		leftForearm = new Point( leftArm.x - forearmWidth, leftArm.y + forearmLength );
		rightKnee = new Point( headCenter.x + kneeWidth, headCenter.y + kneeLength );
		rightLeg = new Point( rightKnee.x + legWidth, rightKnee.y + legLength );
		leftKnee = new Point( headCenter.x - kneeWidth, headCenter.y + kneeLength );
		leftLeg = new Point( leftKnee.x - legWidth, leftKnee.y + legLength );
	}
	
	private void drawLine( Graphics g, Point p1, Point p2 )
	{
		g.drawLine( p1.x, p1.y, p2.x, p2.y );
		g.drawLine( p1.x+1, p1.y+1, p2.x+1, p2.y+1 );
	}

	public void paint( Graphics g )
	{
		String objectName = new String( "m&m" );
		Font objectFont = new Font( "TimesRoman", Font.BOLD, 12 );
		
//		g.drawOval( this.x - headRadius, this.y - headRadius, 
//					headRadius * 2, headRadius * 2 );
		g.fillOval( this.x - headRadius, this.y - headRadius, 
					headRadius * 2, headRadius * 2 );
		drawLine( g, headCenter, rightArm );
		drawLine( g, rightArm, rightForearm );
		drawLine( g, headCenter, leftArm );
		drawLine( g, leftArm, leftForearm );
		drawLine( g, headCenter, rightKnee );
		drawLine( g, rightKnee, rightLeg );
		drawLine( g, headCenter, leftKnee );
		drawLine( g, leftKnee, leftLeg );
		g.setColor( Color.black );
		g.setFont( objectFont );
		g.drawString( objectName, x - 14, y + 3 );
	}
	
	public void act()
	{
	}
	
}