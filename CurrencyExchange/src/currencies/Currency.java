package currencies;

public class Currency {
	
	private String name;
	private String abbreviatedName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name==null)
			throw new NullPointerException("Error in name typing!");
		else if(name.isEmpty())
			throw new IllegalArgumentException("Enter the name!");
		else this.name = name;
	}
	public String getAbbreviatedName() {
		return abbreviatedName;
	}
	public void setAbbreviatedName(String abbreviatedName) {
		if(abbreviatedName==null)
			throw new NullPointerException("Error in abbreviatedName typing!");
		else if(abbreviatedName.isEmpty())
			throw new IllegalArgumentException("Enter the abbreviatedName!");
		else this.abbreviatedName = abbreviatedName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abbreviatedName == null) ? 0 : abbreviatedName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Currency other = (Currency) obj;
		if (abbreviatedName == null) {
			if (other.abbreviatedName != null)
				return false;
		} else if (!abbreviatedName.equals(other.abbreviatedName))
				return false;
		return true;
	}
	@Override
	public String toString() {
		return "Currency [Name=" + name + ", AbbreviatedName=" + abbreviatedName + "]";
	}
	
	
	
	
}
