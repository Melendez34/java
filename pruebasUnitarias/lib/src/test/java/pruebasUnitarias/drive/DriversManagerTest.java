package pruebasUnitarias.drive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DriversManagerTest {

	private DriversManager driverManager = new DriversManager();
	
	@DisplayName("Prueba en el metodo addPassenger")
	@Test
	void isAddPassanger() {
		Passenger passanger1 = new Passenger("Pepe", "3030");
		driverManager.addPassenger(passanger1);
		
		assertEquals(passanger1, driverManager.getPassenger("3030"));
	}
	@Test
	void isAddDriver() {
		Driver driver1 = new Driver("Julio", "3031", 500);
		driverManager.addDriver(driver1);
		
		assertEquals(driver1, driverManager.getDriver("3031"));
	}

}
