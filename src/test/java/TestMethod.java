import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMethod {

   @Test
   public void checkHasDuplicatesMethod() {
      int[] num1 = {4, 2, -1, 3, 7, 6, 6, 1};
      int[] num2 = {4, 2, -1, 3, 7, -6, 6, 1};
      int[] num3 = {};
      int[] num4 = {1};
      int[] num5 = {3, 3};
      int[] num6 = {-1, 2, 3, 4, 5, -1, 5, 3, 0};
      Assertions.assertTrue(Program.hasDuplicates(num1));
      Assertions.assertFalse(Program.hasDuplicates(num2));
      Assertions.assertFalse(Program.hasDuplicates(num3));
      Assertions.assertFalse(Program.hasDuplicates(num4));
      Assertions.assertTrue(Program.hasDuplicates(num5));
      Assertions.assertTrue(Program.hasDuplicates(num6));
   }
}
