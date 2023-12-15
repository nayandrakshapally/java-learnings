public class Exceptions {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int nums[] = new int[3];
        try {
            if (j == 0) {
                throw new NayanException("testing");
            }
            System.out.println(nums[4] + i);
        } catch (ArithmeticException e) {
        } catch (ArrayIndexOutOfBoundsException e) {
        } catch (NayanException e) {
        } catch (Exception e) {
        }
    }
}

class NayanException extends Exception {
    public NayanException(String error) {
        super(error);
    }
}
