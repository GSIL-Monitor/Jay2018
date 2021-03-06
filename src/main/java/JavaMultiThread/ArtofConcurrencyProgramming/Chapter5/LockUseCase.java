package JavaMultiThread.ArtofConcurrencyProgramming.Chapter5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock使用方式，如何获取锁、释放锁
 *
 * @author xuanjian.xuwj
 */
public class LockUseCase {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		lock.lock();
		try {
			// access the resource protected by this lock
		} finally {
			lock.unlock();
		}
	}
}
