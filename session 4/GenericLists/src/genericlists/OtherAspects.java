package genericlists;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class OtherAspects {
  public static void main(String[] args) throws IOException {
    List<Double> nums = new ArrayList<>(100);
    //List<Double> nums = new LinkedList<>(100); // error

    nums.add(11.3);
    nums.add(-44.66);
    nums.add(115.22);
    System.out.println("nums  = " + nums);
    System.out.println();

    // write ArrayList object to file
    OutputStream ostr = new FileOutputStream("ArrayListDoubleData.dat");
    ObjectOutputStream oostr = new ObjectOutputStream(ostr);
    oostr.writeObject(nums);
    oostr.close();

    // duplicate nums in two ways and show the effects
    List<Double> nums1 = (List<Double>) ((ArrayList<Double>) nums).clone();
    //List<Double> nums1 = nums;

    nums1.set(1, 0.0);

    System.out.println("=> nums1 is a clone of nums");
    System.out.println("=> Reassign to postion 1 in nums1");
    System.out.println("nums1 = " + nums1);
    System.out.println("nums  = " + nums);
    System.out.println("=> observe that nums is unchanged");
  }
}
