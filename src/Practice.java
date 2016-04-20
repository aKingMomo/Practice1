import java.util.ArrayList;
public class Practice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1,2,10,5,6,3,1,2};
		int a = FindMaxBooking(list);
		System.out.println(a);
	}
	
	private static int FindMaxBooking(int[] list){
		int max = 0; int current; int pos;
		ArrayList<Integer> results = new ArrayList<Integer>();
		for(int i=0;i<list.length;i++){
			current = list[i];
			results.add(current);
			if(current>max)
				max=current;
			for(int j=0;j<results.size()-1;j++){
				pos = results.get(j);
				if(pos+j<=i||(j>list.length&&pos<=i)){
					pos+=current;
					results.add(pos);
					if(pos>max)
						max=pos;
				}		
			}
		}
		return max;
	}

}
