package template8.template28.demo.entity1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@NamedQuery(name = "selectall", query = "Select c From Course c")

public class Course {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@OneToMany(mappedBy = "course")
	private List<Review> reviews = new ArrayList<>();

	@ManyToMany(mappedBy = "courses")
	private List<Student> students = new ArrayList<>();

	public Course(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course{" +
				"name='" + name + '\'' +
				'}';
	}

	public void addReview(Review reviews) {
		this.reviews.add(reviews);
	}

	public void removeReview(Review reviews) {
		this.reviews.remove(reviews);
	}
}