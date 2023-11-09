package enteties;

public class Funcionario {

	private Integer id;
	private String name;
	private Double sallary;
	
	public Funcionario(Integer id, String name, Double sallary) {
		this.id = id;
		this.name = name;
		this.sallary = sallary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSallary() {
		return sallary;
	}

	public void increaseSallary(double percentage) {
		this.sallary *= 1 + (percentage/100);
	}

	@Override
	public String toString() {
		return String.format("%d, %s, %.2f", id, name, sallary);
	}
	
}
