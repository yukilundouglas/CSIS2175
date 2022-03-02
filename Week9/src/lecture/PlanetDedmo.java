package lecture;

public class PlanetDedmo {
	
	public static void main(String[] args) {
		Planet myPlanet = Planet.EARTH;
		System.out.println(myPlanet
				+" "+ myPlanet.getDescription()
				+" It has gravity "+ myPlanet.surfaceFravity());
		
		Planet planet2 = Planet.MARS;
		System.out.println(planet2.getDescription()+" "+planet2.getMass());
	}
}
