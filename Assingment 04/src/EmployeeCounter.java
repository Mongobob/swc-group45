
public class EmployeeCounter {

        private static EmployeeCounter uniqueInstance;

        private int EmployeeID = 10000;

        // instance variables coming here
        private EmployeeCounter(){}

        public static EmployeeCounter getInstance(){
            if (uniqueInstance == null){
                        uniqueInstance = new EmployeeCounter();
                    }

            return uniqueInstance;
        }
        void increaseID(){
            EmployeeID+= 1;
        }

    public int getEmployeeID() {
        return EmployeeID;
    }
}
