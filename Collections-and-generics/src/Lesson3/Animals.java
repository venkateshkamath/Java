package Lesson3;

public class Animals {
	String type;
	int age;
	public Animals(String type, int age) {
		super();
		this.type = type;
		this.age = age;
	}
	
	public String toString() {
		return "Animals [type=" + type + ", age=" + age + "]";
	}

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animals other = (Animals) obj;
		if (age != other.age)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	

}
