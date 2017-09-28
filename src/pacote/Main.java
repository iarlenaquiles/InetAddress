package pacote;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) throws UnknownHostException {
		String host = "www.google.com.br";
		InetAddress address = InetAddress.getByName(host);
		System.out.println(address);
	}

}
