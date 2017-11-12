package abstract_factory_pattern.samcheonly;

import abstract_factory_pattern.abst.BikeFactory;
import abstract_factory_pattern.abst.Body;
import abstract_factory_pattern.abst.Wheel;

public class SamcheonlyFactory implements BikeFactory{

	@Override
	public Body createBody() {
		return new SamcheonlyBody();
	}

	@Override
	public Wheel createWheel() {
		return new SamcheonlyWheel();
	}

}
