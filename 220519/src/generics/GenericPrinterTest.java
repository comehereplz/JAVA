package generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		
		GenericPrinter<ABS> absPrinter = new GenericPrinter<>();
		absPrinter.setMaterial(new ABS());
		ABS abs = absPrinter.getMaterial();
		System.out.println(absPrinter);
		
		GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
		waterPrinter.setMaterial(new Water());
		Water water = waterPrinter.getMaterial();
		System.out.println(waterPrinter);
	}

}
