package telran.monitoring.dto;

public class PulseProbe {
public long timestamp;

public long patientId;
public int value;
public PulseProbe() {
}
public PulseProbe(long patientId, int value) {

	this.patientId = patientId;
	this.value = value;
	timestamp = System.currentTimeMillis();
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (patientId ^ (patientId >>> 32));
	result = prime * result + value;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PulseProbe other = (PulseProbe) obj;
	if (patientId != other.patientId)
		return false;
	if (value != other.value)
		return false;
	return true;
}

}
