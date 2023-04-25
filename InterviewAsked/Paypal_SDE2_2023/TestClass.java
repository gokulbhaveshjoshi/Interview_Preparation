package InterviewAsked.Paypal_SDE2_2023;

public class TestClass {
    public static void main(String[] args) {
        // System.out.println("Interview begin");
        ImmutableClass iv = new ImmutableClass("Bhavesh", "23-12-1998");
        // view
        System.out.println(iv.getName());
        System.out.println(iv.getDob());
        // Create new
        ImmutableClass i = new ImmutableClass("Ajay", "25-apr-2023");
        System.out.println(i.getNameWithDob());

        System.out.println(iv.getName());
    }

}
