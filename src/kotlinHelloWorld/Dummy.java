package kotlinHelloWorld;

public class Dummy {

    public String areYouAvailable(boolean isAvailable)
    {
        return isAvailable ? "Im available" :"Im working";
    }


    public void printArray(int [] val)
    {
        for(int value:val)
        {
            System.out.println("Values "+value);
        }
    }

}
