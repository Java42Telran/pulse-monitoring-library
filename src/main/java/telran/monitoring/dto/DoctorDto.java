package telran.monitoring.dto;

public class DoctorDto {
public String email;
public String name;
public DoctorDto(String email, String name) {
	this.email = email;
	this.name = name;
}
public DoctorDto() {
}
@Override
public String toString() {
	return "DoctorDto [email=" + email + ", name=" + name + "]";
}

}
