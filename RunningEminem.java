import java.awt.*;

public class RunningEminem extends Eminem 
{
	public RunningEminem( int x, int y )
	{
		super( x, y );
		numStates = 5;
		state = 0;
	}

	public void paint( Graphics g )
	{
		g.setColor( Color.pink );
		super.paint( g );
	}

	public void act()
	{
		state = ( state + 1 ) % numStates;
		
		switch( state )
		{
			case 0: step1();
					break;
			case 1: step2();
					break;
			case 2: step3();
					break;
			case 3: step4();
					break;
			case 4: step5();
					break;
		}
	}
	
	public void step1()
	{
		leftArm.x = x - 30;
		leftArm.y = y + 10;
		leftForearm.x = x - 30;
		leftForearm.y = y - 10;
		leftKnee.x = x - 20;
		leftKnee.y = y + 40;
		leftLeg.x = x - 10;
		leftLeg.y = y + 60;

		rightArm.x = x + 30;
		rightArm.y = y + 10;
		rightForearm.x = x + 30;
		rightForearm.y = y + 30;
		rightKnee.x = x;
		rightKnee.y = y + 40;
		rightLeg.x = x + 10;
		rightLeg.y = y + 80;
	}
	
	public void step2()
	{
		leftArm.x = x - 30;
		leftArm.y = y + 10;
		leftForearm.x = x - 40;
		leftForearm.y = y + 30;
		leftKnee.x = x  - 20;
		leftKnee.y = y + 40;
		leftLeg.x = x - 20;
		leftLeg.y = y + 80;

		rightArm.x = x + 30;
		rightArm.y = y + 10;
		rightForearm.x = x + 30;
		rightForearm.y = y - 10;
		rightKnee.x = x + 10;
		rightKnee.y = y + 40;
		rightLeg.x = x + 10;
		rightLeg.y = y + 60;
	}
	
	public void step3()
	{
		leftArm.x = x - 30;
		leftArm.y = y + 20;
		leftForearm.x = x - 30;
		leftForearm.y = y;
		leftKnee.x = x  - 10;
		leftKnee.y = y + 40;
		leftLeg.x = x - 20;
		leftLeg.y = y + 70;

		rightArm.x = x + 30;
		rightArm.y = y + 10;
		rightForearm.x = x + 40;
		rightForearm.y = y + 20;
		rightKnee.x = x + 10;
		rightKnee.y = y + 40;
		rightLeg.x = x + 10;
		rightLeg.y = y + 80;
	}
	
	public void step4()
	{
		leftArm.x = x - 30;
		leftArm.y = y;
		leftForearm.x = x - 20;
		leftForearm.y = y + 20;
		leftKnee.x = x  - 10;
		leftKnee.y = y + 40;
		leftLeg.x = x - 20;
		leftLeg.y = y + 70;

		rightArm.x = x + 30;
		rightArm.y = y + 10;
		rightForearm.x = x + 40;
		rightForearm.y = y + 30;
		rightKnee.x = x + 10;
		rightKnee.y = y + 40;
		rightLeg.x = x + 20;
		rightLeg.y = y + 70;
	}
	
	public void step5()
	{
		leftArm.x = x - 30;
		leftArm.y = y + 10;
		leftForearm.x = x - 20;
		leftForearm.y = y - 10;
		leftKnee.x = x  - 10;
		leftKnee.y = y + 40;
		leftLeg.x = x - 20;
		leftLeg.y = y + 70;

		rightArm.x = x + 30;
		rightArm.y = y + 10;
		rightForearm.x = x + 10;
		rightForearm.y = y + 30;
		rightKnee.x = x + 10;
		rightKnee.y = y + 40;
		rightLeg.x = x + 20;
		rightLeg.y = y + 80;
	}
}
