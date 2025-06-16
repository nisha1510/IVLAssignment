package core_java_day6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MovieApp {
    int total_seats = 180;

    synchronized void bookSeats(int seats) {
        if (total_seats >= seats) {
            System.out.println(Thread.currentThread().getName() + " booked " + seats + " seats successfully.");
            total_seats -= seats;
            System.out.println("Seats left: " + total_seats);
        } else {
            System.out.println(Thread.currentThread().getName() + " failed to book " + seats + " seats.");
            System.out.println("Seats available: " + total_seats);
        }
    }
}

public class BookMyShowWithPool {
    public static void main(String[] args) {
        MovieApp movie = new MovieApp();
        ExecutorService pool = Executors.newFixedThreadPool(5); // 5 threads in the pool

        int[] seatRequests = {40, 60, 20, 10, 20, 5, 75};

        for (int i = 0; i < seatRequests.length; i++) {
            int seats = seatRequests[i];
            pool.execute(() -> movie.bookSeats(seats));
        }

        pool.shutdown(); // Always shut down the pool when done
    }
}
