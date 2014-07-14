import java.awt.*;

public class DancingEminem extends Eminem 
{
	public DancingEminem( int x, int y )
	{
		super( x, y );
		numStates = 5;
		state = 0;
	}

	public void paint( Graphics g )
	{
		g.setColor( Color.yellow );
		super.paint( g );
	}
	
	public void act()
	{
		state = ( state + 1 ) % numStates;
		
		switch( state )
		{
			case 0: stepA();
					break;
			case 1: stepB();
					break;
			case 2: stepC();
					break;
			case 3: stepD();
					break;
			case 4: stepE();
					break;
		}
	}
	
	public void stepA()
	{
		leftArm.x = x - 30;
		leftArm.y = y + 10;
		leftForearm.x = x - 40;
		leftForearm.y = y + 30;
		leftKnee.x = x - 20;
		leftKnee.y = y + 40;
		leftLeg.x = x - 30;
		leftLeg.y = y + 70;

		rightArm.x = x + 30;
		rightArm.y = y + 10;
		rightForearm.x = x + 40;
		rightForearm.y = y + 30;
		rightKnee.x = x + 20;
		rightKnee.y = y + 40;
		rightLeg.x = x + 30;
		rightLeg.y = y + 70;
	}
	
	public void stepB()
	{
		leftArm.x = x - 30;
		leftArm.y = y + 20;
		leftForearm.x = x - 50;
		leftForearm.y = y + 30;
		leftKnee.x = x  - 20;
		leftKnee.y = y + 40;
		leftLeg.x = x - 30;
		leftLeg.y = y + 70;

		rightArm.x = x + 30;
		rightArm.y = y + 10;
		rightForearm.x = x + 40;
		rightForearm.y = y + 30;
		rightKnee.x = x + 10;
		rightKnee.y = y + 50;
		rightLeg.x = x + 30;
		rightLeg.y = y + 70;
	}
	
	public void stepC()
	{
		leftArm.x = x - 30;
		leftArm.y = y - 10;
		leftForearm.x = x - 20;
		leftForearm.y = y - 30;
		leftKnee.x = x  - 20;
		leftKnee.y = y + 40;
		leftLeg.x = x - 30;
		leftLeg.y = y + 70;

		rightArm.x = x + 30;
		rightArm.y = y - 10;
		rightForearm.x = x + 20;
		rightForearm.y = y - 30;
		rightKnee.x = x + 20;
		rightKnee.y = y + 40;
		rightLeg.x = x + 30;
		rightLeg.y = y + 70;
	}
	
	public void stepD()
	{
		leftArm.x = x - 10;
		leftArm.y = y - 20;
		leftForearm.x = x - 10;
		leftForearm.y = y - 40;
		leftKnee.x = x  - 10;
		leftKnee.y = y + 40;
		leftLeg.x = x - 10;
		leftLeg.y = y + 70;

		rightArm.x = x + 10;
		rightArm.y = y - 20;
		rightForearm.x = x + 10;
		rightForearm.y = y - 40;
		rightKnee.x = x + 10;
		rightKnee.y = y + 40;
		rightLeg.x = x + 10;
		rightLeg.y = y + 70;
	}
	
	public void stepE()
	{
		leftArm.x = x - 30;
		leftArm.y = y + 10;
		leftForearm.x = x - 40;
		leftForearm.y = y + 30;
		leftKnee.x = x  - 10;
		leftKnee.y = y + 50;
		leftLeg.x = x - 20;
		leftLeg.y = y + 70;

		rightArm.x = x + 30;
		rightArm.y = y + 20;
		rightForearm.x = x + 40;
		rightForearm.y = y + 30;
		rightKnee.x = x + 20;
		rightKnee.y = y + 40;
		rightLeg.x = x + 30;
		rightLeg.y = y + 70;
	}
}
