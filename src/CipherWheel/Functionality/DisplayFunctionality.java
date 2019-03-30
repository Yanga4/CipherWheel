package CipherWheel.Functionality;

public class DisplayFunctionality {
	
	private Type type;
	private String text;
	
	public void Connecter(String text) {
		if(text.equals("Encrypt")) {
			this.type = Type.ENCRYPTION;
		}else {
			this.type = Type.DECRYPTION;
		}
	}
	
	private void sender(Type type) {
		
	}
}
