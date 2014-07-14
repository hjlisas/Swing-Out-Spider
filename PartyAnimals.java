import java.awt.*;

public interface PartyAnimals
{
	public void paint( Graphics g );
	public void act();
	public void setXY( int x, int y );
	public int getX();
	public int getY();
}