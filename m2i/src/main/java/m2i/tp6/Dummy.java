package m2i.tp6;

public class Dummy {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("toto");
			}
			
		}) {
			
		};

	}

}
