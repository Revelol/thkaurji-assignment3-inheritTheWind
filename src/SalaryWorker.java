public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary ){
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

       @Override
        public double calculateWeeklyPay(double hoursWorked) {
        double weekly = this.annualSalary/52.0;
          return weekly;

    }
    //Override
    public String displayWeeklyPay(double hoursWorked){
        //super.displayWeeklyPay(hoursWorked);
        double weeklySalary = calculateWeeklyPay(hoursWorked);
        double salaryFrac = weeklySalary / annualSalary;
        String info = "The weekly pay is "+weeklySalary+" the annual salary is "+this.annualSalary+" the weekly pay is a"+salaryFrac+" of the yearly salary";
        return info;
    }

}
