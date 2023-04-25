package InterviewAsked.Paypal_SDE2_2023;

public final class ImmutableClass {

    private final String name;
    private final String dob;
    private final String nameWithDob;
    // Initial (Setter)
    public ImmutableClass(String name, String dob){
        this.name = name;
        this.dob = dob;
        this.nameWithDob = name + "-" + dob;
    }

    // getter
    // getting name
    public String getName(){
        return name;
    }

    // getting dob
    public String getDob(){
        return dob;
    }

    // getting name with dob
    public String getNameWithDob(){
        return nameWithDob;
    }
}

/*
 * Round 3
    Concept of immutability. Design a class which takes in name and date of birth 
    (dob) and proviede simple getters. Make the class immutable. Name and dob should 
    not be modifable after the object has been created.
 */