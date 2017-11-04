package adapter_pattern;

public class AdapterImpl implements Adapter {

	/**
	 * Math의  twoTime이라는 함수는 리턴형이 double이므로,
	 * 바로 사용할 수 없으므로 Adapter를 사용.
	 */
	@Override
	public Float twiceOf(Float f) {
		// return (float)Math.twoTime(f.doubleValue());
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println("half 함수 호출 시작");
		return (float)Math.half(f.doubleValue());
	}

}
