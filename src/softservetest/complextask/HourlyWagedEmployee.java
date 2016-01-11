package softservetest.complextask;

public class HourlyWagedEmployee extends AbstractEmployee {
    private Double hourlyRate;

    @Override
    public Double getAvarageMonthSalary() {
        return 20.8*8*hourlyRate;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public HourlyWagedEmployee() {
    }

    public HourlyWagedEmployee(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
