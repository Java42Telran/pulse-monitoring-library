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

}
