package abstract_factory_pattern.abst;

public interface BikeFactory {

	public Body createBody();
	public Wheel createWheel();
}
