package pune.project.springbootproject.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import pune.project.springbootproject.constraint.NameContains;

@Entity
@Table(name="STUDENT")
@Setter
@Getter
@EqualsAndHashCode(of = {"studentNo"} )
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sno")
	private Integer studentNo;
	
	@Column(name="sname")
	@NotNull(message="name is required")
	private String studentName;
	
	@Column(name="age")
	@NotNull(message="age is required")
	private Integer studentAge;
	
	
}
