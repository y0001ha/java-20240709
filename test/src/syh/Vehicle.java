package syh;

interface Vehicle {
    void accelerate();
    void stop();
    void setStart();
}

abstract class Car implements Vehicle {
    private String vin;
    private String color;
    private boolean isStart;

    public Car(String vin, String color, boolean isStart) {
        this.vin = vin;
        this.color = color;
        this.isStart = isStart;
    }
    
    public void setStart() {
    	this.isStart = !isStart;
    }
    
}

 abstract class Train implements Vehicle {
     private String trainNumber;
     private String departureStation;
     private String arrivalStation;
     private boolean isStart;

     public Train(String trainNumber, String departureStation, String arrivalStation, boolean isStart) {
         this.trainNumber = trainNumber;
         this.departureStation = departureStation;
         this.arrivalStation = arrivalStation;
         this.isStart = isStart;
        }    
     
     public void setStart() {
     	this.isStart = !isStart;
     }
     
 }
 
   class ManualCar extends Car {
     private int gear;

    	 public ManualCar(String vin, String color, boolean isStart, int gear) {
    	 super(vin, color, isStart);
    	 if (true) {
    	         
    	 }
    	 this.gear = gear;}
    	 
    	 
    	 public void accelerate() {
    		 System.out.println("수동 변속기 자동차가 가속합니다!");}
    		 
      	 public void stop() {
        	 System.out.println("수동 변속기 자동차가 정차합니다!");}
   }
      	 
      	 
     class AutomaticCar extends Car {

      	 public AutomaticCar (String vin, String color, boolean isStart) {
      	 super(vin, color, isStart); }
      	    	 
      	    	 
      	 public void accelerate() {
      	 System.out.println("자동 변속기 자동차가 가속합니다!");}
      	    		 
      	 public void stop() {
      	 System.out.println("자동 변속기 자동차가 정차합니다!");}
      	 
    }
     
    class PassengerTrain extends Train {
      private int passengerCount;

    	   public PassengerTrain(String trainNumber, String departureStation, String arrivalStation, boolean isStart, int passengerCount) {
    	   super(trainNumber, departureStation, arrivalStation, isStart);
    	   this.passengerCount = passengerCount;
    	   }
    	    
    	    public void accelerate() {
    	        System.out.println("여객 열차가 천천히 가속합니다!");
    	    }

    	    public void stop() {
    	        System.out.println("여객 열차가 천천히 정차합니다!");
    	    }
    	}
    
    class FreightTrain  extends Train {
        private double cargoWeight;

      	   public FreightTrain (String trainNumber, String departureStation, String arrivalStation, boolean isStart, double cargoWeight) {
      	   super(trainNumber, departureStation, arrivalStation, isStart);
      	   this.cargoWeight = cargoWeight;
      	   }
      	    
      	    public void accelerate() {
      	        System.out.println("화물 열차가 느리게 가속합니다!");
      	    }

      	    public void stop() {
      	        System.out.println("화물 열차가 느리게 정차합니다!");
      	    }
      	}    	 
   

public class Vehicle1 {
	
	public static void main(String[] args) {
	
        Vehicle manualCar = new ManualCar("10가1234", "blue", false, 0);
              
        Vehicle automaticCar = new AutomaticCar("10가1234", "blue", false);        
        
        Vehicle passengerTrain = new PassengerTrain("KTX001", "서울", "부산", false, 200);        
     
        Vehicle freightTrain = new FreightTrain("Cargo001", "부산", "구미", true, 100.0);

        
        manualCar.accelerate();
        manualCar.stop();
        manualCar.setStart();
       
        automaticCar.accelerate();
        automaticCar.stop();
        automaticCar.setStart(); 
        
        passengerTrain.accelerate();
        passengerTrain.stop();
        passengerTrain.setStart();
      
        freightTrain.accelerate();
        freightTrain.stop();
        freightTrain.setStart();
	}
	
	
}

