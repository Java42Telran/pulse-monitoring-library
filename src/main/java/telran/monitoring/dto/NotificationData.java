package telran.monitoring.dto;

public class NotificationData {
public String doctorMail;
public String doctorName;
public String patientName;
public NotificationData(String doctorMail, String doctorName, String patientName) {
	this.doctorMail = doctorMail;
	this.doctorName = doctorName;
	this.patientName = patientName;
}
public NotificationData() {
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((doctorMail == null) ? 0 : doctorMail.hashCode());
	result = prime * result + ((doctorName == null) ? 0 : doctorName.hashCode());
	result = prime * result + ((patientName == null) ? 0 : patientName.hashCode());
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
	NotificationData other = (NotificationData) obj;
	if (doctorMail == null) {
		if (other.doctorMail != null)
			return false;
	} else if (!doctorMail.equals(other.doctorMail))
		return false;
	if (doctorName == null) {
		if (other.doctorName != null)
			return false;
	} else if (!doctorName.equals(other.doctorName))
		return false;
	if (patientName == null) {
		if (other.patientName != null)
			return false;
	} else if (!patientName.equals(other.patientName))
		return false;
	return true;
}
}
