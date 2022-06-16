package telran.monitoring.dto;

public class PulseProbe {
public long timestamp;
public int seqNumber;
public long patientId;
public int value;
public PulseProbe() {
}
public PulseProbe(int seqNumber, long patientId, int value) {
	this.seqNumber = seqNumber;
	this.patientId = patientId;
	this.value = value;
	timestamp = System.currentTimeMillis();
}

}
