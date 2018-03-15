package hibernate101;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity(name="USER_DETAILS")
public class Udet1 {
@Id
@Column(name="ROLL_NO")
private int roll;
@Transient
private String name;
@Lob
private String description;
@Temporal(TemporalType.DATE)
private Date joindate;
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Date getJoinDate() {
	return joindate;
}
public void setJoinDate(Date joindate) {
	this.joindate = joindate;
}



}
