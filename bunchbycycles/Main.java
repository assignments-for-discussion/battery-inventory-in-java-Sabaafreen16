package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) 
  {
     CountsByUsage counts = new CountsByUsage();
    for(int i=0;i<cycles.length;i++)
    {
    if cycles[i]<410 // to check if the charge cycle is less than 410
    {
    counts.lowcount++; // incrementing low count if charge is less than 420
    }
      else if cycles[i] > 410 && cycles[i] <950  // to check if the charge cycle is greater than 410 and less than 950
      {
      counts.mediumcount++;// incrementing medium count if charge is greater than 410 and less than 950
      }
      else cycles[i]>=950  // to check if the charge cycle is greater than or equal to 950
      {
        counts.highcount++; // incrementing high count if the charge cycle is greater than or equal to 950
      }
    }
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    assert(counts.lowCount == 2);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 1);
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}
