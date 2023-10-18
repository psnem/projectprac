package Revision;

import java.util.Scanner;
class RevisionPage implements Runnable{
	public void run() {
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Will show state");

		System.out.println("Before sleep"+RevPage.th.getState());
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("After sleep"+RevPage.th.getState());
	}
}
