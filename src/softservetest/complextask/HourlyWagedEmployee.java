package softservetest.complextask;

public class HourlyWagedEmployee extends FixedPaymentEmployee {
    private Double hourlyRate;

    @Override
    public Double getAvarageMonthSalary() {
        return 20.8*8*hourlyRate;
    }

    public HourlyWagedEmployee() {
    }

    public HourlyWagedEmployee( Integer id, String name, Double hourlyRate) {
        super(new Double(0), id, name);
        this.hourlyRate = hourlyRate;
    }

    public HourlyWagedEmployee(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
