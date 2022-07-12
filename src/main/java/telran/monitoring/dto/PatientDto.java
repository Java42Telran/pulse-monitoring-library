package telran.monitoring.dto;

public class PatientDto {
public long id;
public String name;
public PatientDto(long id, String name) {
	this.id = id;
	this.name = name;
}
public PatientDto() {
}
@Override
public String toString() {
	return "PatientDto [id=" + id + ", name=" + name + "]";
}
}
