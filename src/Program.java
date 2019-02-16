import java.util.ArrayList;

public class Program {
    public static void main(String []args){
        //Worker objects
        Worker worker1 = new Worker("0001","Mike", "Scott", "Mr.", 1995,10.0);
        Worker worker2 = new Worker("0002","Jane", "Humes","Miss",1999,15.0);
        Worker worker3 = new Worker("0003","Kyle","Jones", "Mr.",2000,20.5);

        SalaryWorker sWorker1 = new SalaryWorker("0001","Liam", "Hudson", "Mr.", 1995,30.0,55900 );
        SalaryWorker sWorker2 = new SalaryWorker("0002","Lilly", "Slyh","Miss",1999,25.0,65400);
        SalaryWorker sWorker3 = new SalaryWorker("0003","Sabrina","Davis", "Mr.",2000,35.5,50000);
        //New ArrayList
        ArrayList<Worker> worker= new ArrayList<>();
         worker.add(worker1);
         worker.add(worker2);
         worker.add(worker3);
         worker.add(sWorker1);
         worker.add(sWorker2);
         worker.add(sWorker3);

        //displaying info
         for(int i=0; i <worker.size(); i++){
             String formal = worker.get(i).formalName();
             String id = worker.get(i).getID();

             System.out.println("Worker: ");
             System.out.println(formal+"   ID: "+id);
             String week1 = worker.get(i).displayWeeklyPay(40);
             System.out.println(week1);
             String week2 = worker.get(i).displayWeeklyPay(50);
             System.out.println(week2);
             String week3 = worker.get(i).displayWeeklyPay(40);
             System.out.println(week3);
             System.out.println();
         }






    }
}
