package CollectionSort;

public class TongThong{
	String Name;
	Integer SoPhieu = 0;
	
	public Integer getSoPhieu() {
		return SoPhieu;
	}

	public void setSoPhieu(Integer soPhieu) {
		SoPhieu = soPhieu;
	}

	TongThong(String name) {
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "TongThong [Name=" + Name + "]";
	}
	
}
