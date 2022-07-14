package day51_inheritance.lyft;

public class LyftXL extends Lyft {
    // constructor needs to be called

    public LyftXL(String driver) {
        super(driver);
    }

    @Override
    public double calculateRates(int miles) {
        return super.calculateRates(miles) * 1.1;
        // super.calculateRate() calls the method in the Lyft class, parent class, then we multiply 1.1 to that result
    }
}
