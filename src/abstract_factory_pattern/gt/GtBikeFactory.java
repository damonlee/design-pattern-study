package abstract_factory_pattern.gt;

import abstract_factory_pattern.abst.BikeFactory;
import abstract_factory_pattern.abst.Body;
import abstract_factory_pattern.abst.Wheel;

public class GtBikeFactory implements BikeFactory {

	@Override
	public Body createBody() {
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		return new GtWheel();
	}

}
