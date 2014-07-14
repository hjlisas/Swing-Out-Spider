import java.awt.*;

public class StrungOutSpider extends Spider implements PartyAnimals
{
	int x, y;
	
	public StrungOutSpider( int x, int y )
	{
		super( x, y );
		this.x = x;
		this.y = y;
		numStates = 9;
		state = 0;
	}
	
	public void paint( Graphics g )
	{
		g.setColor( Color.red );
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
			case 5: step4();
					break;
			case 6: step3();
					break;
			case 7: step2();
					break;
			case 8: step1();
					break;
		}
	}
	
	public void step1()
	{
		headCenter.x = web.x ;
		headCenter.y = web.y + webLength + 20;
		neck.x = headCenter.x;
		neck.y = headCenter.y + headRadius;
		bodyCenter.x = neck.x;
		bodyCenter.y = neck.y + bodyRadius;
		rightArm1.x = neck.x + armWidth;
		rightArm1.y = neck.y - armLength;
		rightArm2.x = neck.x + armWidth;
		rightArm2.y = neck.y;
		rightArm3.x = neck.x + armWidth;
		rightArm3.y = neck.y + armLength;
		rightArm4.x = neck.x + armWidth;
		rightArm4.y = neck.y + armLength + 10;
		rightForearm1.x = rightArm1.x + ( forearmWidth - 10);
		rightForearm1.y = rightArm1.y - forearm1Length;
		rightForearm2.x = rightArm2.x + forearmWidth;
		rightForearm2.y = rightArm2.y - forearm2Length;
		rightForearm3.x = rightArm3.x + forearmWidth;
		rightForearm3.y = rightArm3.y + forearm3Length;
		rightForearm4.x = rightArm4.x + ( forearmWidth - 10);
		rightForearm4.y = rightArm4.y + forearm4Length;
		
		leftArm1.x = neck.x - armWidth;
		leftArm1.y = neck.y - armLength;
		leftArm2.x = neck.x - armWidth;
		leftArm2.y = neck.y;
		leftArm3.x = neck.x - armWidth;
		leftArm3.y = neck.y + armLength;
		leftArm4.x = neck.x - armWidth;
		leftArm4.y = neck.y + armLength + 10;
		leftForearm1.x = leftArm1.x - ( forearmWidth - 10);
		leftForearm1.y = leftArm1.y - forearm1Length;
		leftForearm2.x = leftArm2.x - forearmWidth;
		leftForearm2.y = leftArm2.y - forearm2Length;
		leftForearm3.x = leftArm3.x - forearmWidth;
		leftForearm3.y = leftArm3.y + forearm3Length;
		leftForearm4.x = leftArm4.x - ( forearmWidth - 10);
		leftForearm4.y = leftArm4.y + forearm4Length;
	}
	
	public void step2()
	{
		headCenter.x = web.x ;
		headCenter.y = web.y + webLength + 40;
		neck.x = headCenter.x;
		neck.y = headCenter.y + headRadius;
		bodyCenter.x = neck.x;
		bodyCenter.y = neck.y + bodyRadius;
		rightArm1.x = neck.x + armWidth;
		rightArm1.y = neck.y - armLength;
		rightArm2.x = neck.x + armWidth;
		rightArm2.y = neck.y;
		rightArm3.x = neck.x + armWidth;
		rightArm3.y = neck.y + armLength;
		rightArm4.x = neck.x + armWidth;
		rightArm4.y = neck.y + armLength + 10;
		rightForearm1.x = rightArm1.x + ( forearmWidth - 10);
		rightForearm1.y = rightArm1.y - forearm1Length;
		rightForearm2.x = rightArm2.x + forearmWidth;
		rightForearm2.y = rightArm2.y - forearm2Length;
		rightForearm3.x = rightArm3.x + forearmWidth;
		rightForearm3.y = rightArm3.y + forearm3Length;
		rightForearm4.x = rightArm4.x + ( forearmWidth - 10);
		rightForearm4.y = rightArm4.y + forearm4Length;
		
		leftArm1.x = neck.x - armWidth;
		leftArm1.y = neck.y - armLength;
		leftArm2.x = neck.x - armWidth;
		leftArm2.y = neck.y;
		leftArm3.x = neck.x - armWidth;
		leftArm3.y = neck.y + armLength;
		leftArm4.x = neck.x - armWidth;
		leftArm4.y = neck.y + armLength + 10;
		leftForearm1.x = leftArm1.x - ( forearmWidth - 10);
		leftForearm1.y = leftArm1.y - forearm1Length;
		leftForearm2.x = leftArm2.x - forearmWidth;
		leftForearm2.y = leftArm2.y - forearm2Length;
		leftForearm3.x = leftArm3.x - forearmWidth;
		leftForearm3.y = leftArm3.y + forearm3Length;
		leftForearm4.x = leftArm4.x - ( forearmWidth - 10);
		leftForearm4.y = leftArm4.y + forearm4Length;
	}
	
	public void step3()
	{
		headCenter.x = web.x ;
		headCenter.y = web.y + webLength + 60;
		neck.x = headCenter.x;
		neck.y = headCenter.y + headRadius;
		bodyCenter.x = neck.x;
		bodyCenter.y = neck.y + bodyRadius;
		rightArm1.x = neck.x + armWidth;
		rightArm1.y = neck.y - armLength;
		rightArm2.x = neck.x + armWidth;
		rightArm2.y = neck.y;
		rightArm3.x = neck.x + armWidth;
		rightArm3.y = neck.y + armLength;
		rightArm4.x = neck.x + armWidth;
		rightArm4.y = neck.y + armLength + 10;
		rightForearm1.x = rightArm1.x + ( forearmWidth - 10);
		rightForearm1.y = rightArm1.y - forearm1Length;
		rightForearm2.x = rightArm2.x + forearmWidth;
		rightForearm2.y = rightArm2.y - forearm2Length;
		rightForearm3.x = rightArm3.x + forearmWidth;
		rightForearm3.y = rightArm3.y + forearm3Length;
		rightForearm4.x = rightArm4.x + ( forearmWidth - 10);
		rightForearm4.y = rightArm4.y + forearm4Length;
		
		leftArm1.x = neck.x - armWidth;
		leftArm1.y = neck.y - armLength;
		leftArm2.x = neck.x - armWidth;
		leftArm2.y = neck.y;
		leftArm3.x = neck.x - armWidth;
		leftArm3.y = neck.y + armLength;
		leftArm4.x = neck.x - armWidth;
		leftArm4.y = neck.y + armLength + 10;
		leftForearm1.x = leftArm1.x - ( forearmWidth - 10);
		leftForearm1.y = leftArm1.y - forearm1Length;
		leftForearm2.x = leftArm2.x - forearmWidth;
		leftForearm2.y = leftArm2.y - forearm2Length;
		leftForearm3.x = leftArm3.x - forearmWidth;
		leftForearm3.y = leftArm3.y + forearm3Length;
		leftForearm4.x = leftArm4.x - ( forearmWidth - 10);
		leftForearm4.y = leftArm4.y + forearm4Length;
		
	}
	
	public void step4()
	{
		headCenter.x = web.x ;
		headCenter.y = web.y + webLength + 80;
		neck.x = headCenter.x;
		neck.y = headCenter.y + headRadius;
		bodyCenter.x = neck.x;
		bodyCenter.y = neck.y + bodyRadius;
		rightArm1.x = neck.x + armWidth;
		rightArm1.y = neck.y - armLength;
		rightArm2.x = neck.x + armWidth;
		rightArm2.y = neck.y;
		rightArm3.x = neck.x + armWidth;
		rightArm3.y = neck.y + armLength;
		rightArm4.x = neck.x + armWidth;
		rightArm4.y = neck.y + armLength + 10;
		rightForearm1.x = rightArm1.x + ( forearmWidth - 10);
		rightForearm1.y = rightArm1.y - forearm1Length;
		rightForearm2.x = rightArm2.x + forearmWidth;
		rightForearm2.y = rightArm2.y - forearm2Length;
		rightForearm3.x = rightArm3.x + forearmWidth;
		rightForearm3.y = rightArm3.y + forearm3Length;
		rightForearm4.x = rightArm4.x + ( forearmWidth - 10);
		rightForearm4.y = rightArm4.y + forearm4Length;
		
		leftArm1.x = neck.x - armWidth;
		leftArm1.y = neck.y - armLength;
		leftArm2.x = neck.x - armWidth;
		leftArm2.y = neck.y;
		leftArm3.x = neck.x - armWidth;
		leftArm3.y = neck.y + armLength;
		leftArm4.x = neck.x - armWidth;
		leftArm4.y = neck.y + armLength + 10;
		leftForearm1.x = leftArm1.x - ( forearmWidth - 10);
		leftForearm1.y = leftArm1.y - forearm1Length;
		leftForearm2.x = leftArm2.x - forearmWidth;
		leftForearm2.y = leftArm2.y - forearm2Length;
		leftForearm3.x = leftArm3.x - forearmWidth;
		leftForearm3.y = leftArm3.y + forearm3Length;
		leftForearm4.x = leftArm4.x - ( forearmWidth - 10);
		leftForearm4.y = leftArm4.y + forearm4Length;
	}
	
	public void step5()
	{
		headCenter.x = web.x ;
		headCenter.y = web.y + webLength + 100;
		neck.x = headCenter.x;
		neck.y = headCenter.y + headRadius;
		bodyCenter.x = neck.x;
		bodyCenter.y = neck.y + bodyRadius;
		rightArm1.x = neck.x + armWidth;
		rightArm1.y = neck.y - armLength;
		rightArm2.x = neck.x + armWidth;
		rightArm2.y = neck.y;
		rightArm3.x = neck.x + armWidth;
		rightArm3.y = neck.y + armLength;
		rightArm4.x = neck.x + armWidth;
		rightArm4.y = neck.y + armLength + 10;
		rightForearm1.x = rightArm1.x + ( forearmWidth - 10);
		rightForearm1.y = rightArm1.y - forearm1Length;
		rightForearm2.x = rightArm2.x + forearmWidth;
		rightForearm2.y = rightArm2.y - forearm2Length;
		rightForearm3.x = rightArm3.x + forearmWidth;
		rightForearm3.y = rightArm3.y + forearm3Length;
		rightForearm4.x = rightArm4.x + ( forearmWidth - 10);
		rightForearm4.y = rightArm4.y + forearm4Length;
		
		leftArm1.x = neck.x - armWidth;
		leftArm1.y = neck.y - armLength;
		leftArm2.x = neck.x - armWidth;
		leftArm2.y = neck.y;
		leftArm3.x = neck.x - armWidth;
		leftArm3.y = neck.y + armLength;
		leftArm4.x = neck.x - armWidth;
		leftArm4.y = neck.y + armLength + 10;
		leftForearm1.x = leftArm1.x - ( forearmWidth - 10);
		leftForearm1.y = leftArm1.y - forearm1Length;
		leftForearm2.x = leftArm2.x - forearmWidth;
		leftForearm2.y = leftArm2.y - forearm2Length;
		leftForearm3.x = leftArm3.x - forearmWidth;
		leftForearm3.y = leftArm3.y + forearm3Length;
		leftForearm4.x = leftArm4.x - ( forearmWidth - 10);
		leftForearm4.y = leftArm4.y + forearm4Length;
	}
}
