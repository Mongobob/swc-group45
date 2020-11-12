public class CustomerCounter {

        private static CustomerCounter uniqueInstance;

        private int CustomerID = 10000000;

        // instance variables coming here
        private CustomerCounter(){}

        public static CustomerCounter getInstance(){
            if (uniqueInstance == null){
                uniqueInstance = new CustomerCounter();
            }

            return uniqueInstance;
        }
        void increaseID(){
            CustomerID+= 1;
        }

        public int getCustomerID() {
            return CustomerID;
        }
    }

