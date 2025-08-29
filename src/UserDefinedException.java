public class UserDefinedException  {
    public static void validate(int age) throws InvalidAgeException
    {
        if(age<18)
            throw new InvalidAgeException(" Cannot caste vote,Age less than 18");
        else
            System.out.println("Eligible to vote");

    }
}
