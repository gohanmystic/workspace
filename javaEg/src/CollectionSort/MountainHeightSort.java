package CollectionSort;

import java.util.Comparator;

public class MountainHeightSort implements Comparator<Mountain>{
	
	@Override
	public int compare(Mountain o1, Mountain o2) {
		int result = -1;
		if(o1.getMountainHeight() > o2.getMountainHeight()) result = 1;
		else if(o1.getMountainHeight() == o2.getMountainHeight()) result = 0;
		
		return result;
	}

}
