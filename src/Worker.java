public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(){
        super();
    }
    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate){
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate= hourlyPayRate;
    }

    public double getHourlyPayRate() {

        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {

        this.hourlyPayRate = hourlyPayRate;
    }
    public double calculateWeeklyPay(double hoursWorked){
        double total = 0;
        if(hoursWorked <= 40){
            total = hoursWorked * hourlyPayRate;
        }
        else
        {
           double overTime = hoursWorked - 40;
           total = (40 * hourlyPayRate) + (overTime * 1.5 * hourlyPayRate);

        }
        return total;
    }
    public String displayWeeklyPay(double hoursWorked){
        double total = calculateWeeklyPay(hoursWorked);
        double regular;
        double overTime;
        double overTimePay;
        String info;
        if(hoursWorked <= 40){
            regular = hoursWorked * hourlyPayRate;
            info = "Number of hours for regular pay is "+hoursWorked+", Number of overtime pay is 0, and combined total pay is "+total;
        }
        else{
            overTime = hoursWorked - 40;
//            overTimePay = overTime * 1.5 * hourlyPayRate;
//            regular = 40 * hourlyPayRate;
            info = "Number of hours for regular pay is "+hoursWorked+", Number of overtime pay is"+overTime+", and combined total pay is "+total;
        }
        return info;

    }
    public static void main(String []args){
        Worker worker = new Worker("1","Jay","Thakur","Miss",2000,10.0);
        System.out.println(worker.getFirstName());
        System.out.println(worker.calculateWeeklyPay(4));

    }
}
