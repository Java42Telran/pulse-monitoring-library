package telran.monitoring.dto;

public class PulseJump extends PulseProbe {
	public int newValue;

	public PulseJump(long patientId, int value, int newValue) {
		super(patientId, value);
		this.newValue = newValue;
	}
	public PulseJump() {
	}

}
