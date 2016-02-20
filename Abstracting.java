package Session6;

abstract class Instrument  {
	
	abstract public void play();

}

class Abstracting extends Instrument{
	
	@Override
	public void play() {
		
	System.out.println("Instrument is Playing");
		
	}
	
	public static void main(String args[])
		   {
		
		Abstracting violin=new Abstracting();
		
		violin.play();
		
	   }
	
}