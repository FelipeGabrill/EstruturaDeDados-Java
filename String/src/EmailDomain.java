public class EmailDomain {

	public static void main(String[] args) {

		EmailInfo emailInfo1 = extractEmailInformation("joao.silva23@yahoo.com.br");
        System.out.println("Usuario: " + emailInfo1.username);
        System.out.println("Dominio: " + emailInfo1.domain);
        System.out.println("Brasileiro: " + (emailInfo1.isBrazilian ? "sim" : "nao"));
        
        EmailInfo emailInfo2 = extractEmailInformation1("maria123@gmail.com");
        System.out.println("Usuario: " + emailInfo2.username);
        System.out.println("Dominio: " + emailInfo2.domain);
        System.out.println("Brasileiro: " + (emailInfo2.isBrazilian ? "sim" : "nao"));
        
	}
	public static EmailInfo extractEmailInformation(String email) {
		int pos = email.indexOf("@");

		String username = email.substring(0, pos);

		String domain = email.substring(pos);

		Boolean isBrazilian;

		if (email.toLowerCase().endsWith(".br")) {
			isBrazilian = true;
		} else {
			isBrazilian = false;
		}

		return new EmailInfo(username, domain, isBrazilian);
	}

	public static EmailInfo extractEmailInformation1(String email) {

		String[] parts = email.split("@");
		String username = parts[0];
		String domain = parts[1];

		boolean isBrazilian = domain.endsWith(".br");

		return new EmailInfo(username, domain, isBrazilian);
	}
}

class EmailInfo {
	String username;
	String domain;
	boolean isBrazilian;

	public EmailInfo(String username, String domain, boolean isBrazilian) {
		this.username = username;
		this.domain = domain;
		this.isBrazilian = isBrazilian;
	}
}
