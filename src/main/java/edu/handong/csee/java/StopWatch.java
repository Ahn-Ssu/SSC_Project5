package edu.handong.csee.java;

import java.time.Clock;
import java.util.Timer;
import java.util.TimerTask;

public class StopWatch {
	private static long begin = 0l;
	private static long end = 0l;

	private int secCount = 15;
	private int allTime;

	private static int startTime;

	Timer secTimer = new Timer();
	TimerTask task15 = new TimerTask() {

		@Override
		public void run() {
			if (secCount > -1) {
				PlayFrame.getInstance().setCountDownLabelBody(secToMMSS(secCount));
				secCount--;
			} else {
				task15.cancel();
			}
		}
	};

	public void startCountDown() {
		secTimer.schedule(task15, 0, 1000);
	}

	public void stopCountDown() {
		task15.cancel();
	}

	static Timer playTimer = new Timer();
	static TimerTask taskAll = new TimerTask() {
		@Override
		public void run() {
			PlayFrame.getInstance()
					.setPlayTimeLabelBody(secToMMSS((int) System.currentTimeMillis() / 1000 - startTime));
		}
	};

	public static void startPlayTimeCount() {
		startTime = (int) System.currentTimeMillis() / 1000;
		playTimer.schedule(taskAll, 0, 1000);
	}

	public static void stopPlayTimeCount() {
		playTimer.cancel();
	}

	public static String secToMMSS(int secs) {
		int min, sec;

		sec = secs % 60;
		min = secs / 60 % 60;

		return String.format("%02d : %02d", min, sec);
	}
}
