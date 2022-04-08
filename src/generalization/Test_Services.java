package generalization;

public class Test_Services {

	public static void main(String[] args) {
		Airtel a = new Airtel();
		a.call();
		a.sms();
		a.internet();
		a.databack();
		System.out.println("airtel sim rate is " + a.SIM);
		System.out.println("******************************");
		Jio j = new Jio();
		j.call();
		j.sms();
		j.internet();
		j.jiotv();
		System.out.println("jio sim rate is " + a.SIM);
		System.out.println("********************************");
		VI v=new VI();
		v.call();
		v.sms();
		v.internet();
		v.callertune();
		System.out.println("vi sim rate is "+a.SIM);
	}

}

class Airtel implements TRAI {

	@Override
	public void call() {
		System.out.println("airtel call @ 0.50/min");
	}

	@Override
	public void sms() {
		System.out.println("airtel sms @ 200/day");
	}

	@Override
	public void internet() {
		System.out.println("airtel net>>1.5gb/day");
	}

	public void databack() {
		System.out.println("airtel unused data will back again");
	}
}

class Jio implements TRAI {

	@Override
	public void call() {
		System.out.println("jio call @ 1rs/m");
	}

	@Override
	public void sms() {
		System.out.println("jio sms >>100/day");
	}

	@Override
	public void internet() {
		System.out.println("jio net 2gb/day");
	}

	public void jiotv() {
		System.out.println("hotstar free for one month");
	}
}

class VI implements TRAI {

	@Override
	public void call() {
		System.out.println("vi call @1.2/m");
	}

	@Override
	public void sms() {
		System.out.println("vi sms >>150/day");
	}

	@Override
	public void internet() {
		System.out.println("net 2.5gb/day");
	}

	public void callertune() {
		System.out.println("vi callertune free for one month");
	}
}