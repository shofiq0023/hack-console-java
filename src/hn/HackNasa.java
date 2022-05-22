package hn;

public class HackNasa {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";


	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(200);
		System.out.print("INITIALIZING SERVER");
		for(int server = 0; server < 7; server++) {
			System.out.print(".");
			Thread.sleep(500);
		}
		System.out.println();
		System.out.println("## SERVER CONNECTED ##");
		Thread.sleep(700);
		System.out.println("Fetching Required Libraries..");
		Thread.sleep(300);
		System.out.print("Progress: ");
		System.out.print("  ");
		int progress = 0;
		for(int fetch = 1; fetch < 100; fetch++) {
			progress++;
			System.out.print(progress + "%");
			Thread.sleep(50);
			if(progress <= 9) {
				System.out.print("\b\b");
			} else if(progress >= 9 && progress <= 99) {
				System.out.print("\b\b\b");
			} 
		}
		System.out.print("100%\n");
		Thread.sleep(300);
		System.out.println("=============");
		Thread.sleep(300);
		System.out.print(ANSI_GREEN + "\n##### PENETRATING " + ANSI_RESET + ANSI_YELLOW + "NASA"+ ANSI_RESET + ANSI_GREEN +" FIREWALL #####" + ANSI_RESET);
		Thread.sleep(500);
		System.out.print(" --Starting--\n");
		Thread.sleep(100);
		System.out.println("@@ PENETRATING");
		int penStep = 0;
		for(int n = 0; n <= 3; n++) {
			for(int pen = 0; pen < 10; pen++) {
				System.out.print(".");
				Thread.sleep(300);
			}
			penStep++;
			if(penStep == 4) {
				System.out.println(ANSI_GREEN + "\n---- PENETRATION SUCCESSFUL ----" + ANSI_RESET);
			} else {
				System.out.println(ANSI_RED + "\n# ATTEMPT FAILED, TRYING AGAIN #" + ANSI_RESET);
				Thread.sleep(800);
			}
			
		}
		
		Thread.sleep(1000);
		System.out.println("@@ Generating =Bridge=");
		Thread.sleep(700);
		
		System.out.println("$access _bridge.pl");
		for(int bri = 1; bri <= 6; bri++) {
			System.out.print(".");
			Thread.sleep(400);
		}
		System.out.println(ANSI_RED + " # ACCESS DENIED" + ANSI_RESET);
		Thread.sleep(700);
		
		System.out.println(ANSI_YELLOW + "## INITIATE _password_brk" + ANSI_RESET);
		Thread.sleep(1000);
		System.out.println();
		
		System.out.print("-- INITIATED -- ");
		Thread.sleep(500);
		System.out.print("| Getting password\n");
		Thread.sleep(500);
		System.out.print("$Password: ");
		for(int pass = 0; pass <= 12; pass++) {
			System.out.print(generateChar());
			Thread.sleep(500);
		}
		System.out.println("\n\n");
		System.out.println("-- Apply password --");
		Thread.sleep(1000);
		System.out.println("# Trying again\n");
		Thread.sleep(500);
		System.out.println("$access _bridge.pl");
		Thread.sleep(700);
		for(int tra = 1; tra <= 6; tra++) {
			System.out.print(".");
			Thread.sleep(400);
		}
		System.out.println();
		System.out.println(ANSI_GREEN + "-- Bridge Created --" + ANSI_RESET);
		Thread.sleep(500);
		System.out.println("$peer-to-peer handshake -holding");
		Thread.sleep(1000);
		System.out.println("\n================");
		System.out.println(ANSI_GREEN + "@Access Granted@" + ANSI_RESET);
		System.out.println("================\n");
	}
	
	public static String generateChar() {
		String[] words = {"!", "@", "#", "$", "%", "^", "&", "*", "q", "G", "{", "V", "+"};
		int rand = (int) (Math.random() * words.length);
		return words[rand];
	}
	

}
