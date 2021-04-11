//LOVEPREET SINGH(201906247)
//MANPREET KAUR(201906676)
//HIMANSHY KAPOOR(201904058)
//GAGAN()
//MANISHA N/A(201906577)


import java.util.Random;;

public class First {
	
	public static void main(String[] args) {
		for(int i=1;i<11;i++) {
			Jungle.RunGame();
			Jungle.DoCompetition();
			Jungle.ReportOnWinner();
		}
	}
}

class Jungle{
	static Lion[] lions;
	static Tiger[] tigers;
	
	public static int NumberOfLionWinners = 0;
	public static int NumberOfTigerWinners = 0;

	public static void RunGame() {
		lions = new Lion[10];
		tigers = new Tiger[10];
		
		for(int i=0;i<10;i++) {
			lions[i]=new Lion();
			tigers[i]=new Tiger();
		}
	}
	
	public static void DoCompetition() {
		NumberOfLionWinners = 0;
		NumberOfTigerWinners = 0;
		
		for(int i=0;i<10;i++) {
			if( (lions[i]).getStrength() > (tigers[i]).getStrength() ) {
				Jungle.NumberOfLionWinners++;
			}else {
				Jungle.NumberOfTigerWinners++;
			}
		}
		
		if(NumberOfLionWinners > NumberOfTigerWinners) {
			int a =  NumberOfLionWinners;
			int b =  NumberOfTigerWinners;
			
			NumberOfLionWinners = b;
			NumberOfTigerWinners = a;
		}
		if(NumberOfLionWinners == NumberOfTigerWinners) {
			
			NumberOfLionWinners -= 2;
			NumberOfTigerWinners += 2;
		}
	}
	
	public static void ReportOnWinner() {
		System.out.println("Lions: "+ Jungle.NumberOfLionWinners);
		System.out.println("Tigers: "+ Jungle.NumberOfTigerWinners);
	}
}

class Feline{
	public float Strength;
	
	public void setStrength() {
		Random rand = new Random();
		this.Strength = rand.nextInt(100);
	}
	
	public float getStrength() {
		return this.Strength;
	}
}

class Lion extends Feline{
	public Lion() {
		setStrength();
	}
	public void setStrength() {
		Random rand = new Random();
		this.Strength = rand.nextInt(100);
	}
}

class Tiger extends Feline{
	public Tiger() {
		setStrength();
	}
	public void setStrength() {
		Random rand = new Random();
		this.Strength = rand.nextInt(100);
	}
}