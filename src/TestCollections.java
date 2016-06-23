import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TestCollections {
	
	public static void main(String args[]) {
//		//注意List是实现Collection接口的
//		List list = new ArrayList();
//		double array[] = { 112, 111, 23, 456, 231 };
//		for (int i = 0; i < array.length; i++) {
//			list.add(new Double(array[i]));
//		}
//		Collections.sort(list);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		// 结果：23.0 111.0 112.0 231.0 456.0
		SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String TimeString = time.format(new java.util.Date());
		System.out.println(TimeString);
	}
}
