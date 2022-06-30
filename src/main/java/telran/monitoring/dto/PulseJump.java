package telran.monitoring.dto;

public class PulseJump extends PulseProbe {
	public int newValue;

	public PulseJump(long patientId, int value, int newValue) {
		super(patientId, value);
		this.newValue = newValue;
	}
	public PulseJump() {
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + newValue;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PulseJump other = (PulseJump) obj;
		if (newValue != other.newValue)
			return false;
		return true;
	}

}
