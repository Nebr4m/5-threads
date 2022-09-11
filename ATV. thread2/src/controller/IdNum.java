package controller;

public class IdNum extends Thread {
	public IdNum() {

	}

	@Override
	public void run() {

		System.out.println("#" + getId());

	}

}