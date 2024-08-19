package vehicle;

public class Main {
	public static void main(String[] args) {
        Authentication authentication = Authentication.getInstance();
        boolean isAuthenticate = authentication.authenticateUser("username", "password");
        
        if (isAuthenticate) {
           
            VehicleFactory carFactory = new CarFactory();
            Vehicle car = carFactory.createVehicle();
            car.requestRide();
            
         
            VehicleFactory bikeFactory = new BikeFactory();
            Vehicle bike = bikeFactory.createVehicle();
            bike.requestRide();
            
          
            VehicleFactory scooterFactory = new ScooterFactory();
            Vehicle scooter = scooterFactory.createVehicle();
            scooter.requestRide();
            
           
            PaymentFactory creditCardFactory = new CreditCardFactory();
            Payment creditCardPayment = creditCardFactory.createPaymentMethod();
            creditCardPayment.pay(20.0);
            
            PaymentFactory payPalFactory = new PaypalFactory();
            payPalFactory.createPaymentMethod();
}
	}
}
