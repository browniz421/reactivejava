package reactivejava.chapter02;

import io.reactivex.rxjava3.core.Observable;

public class Ch2_Observable23 {
    public static void main(String[] args) {
        Observable.error(() -> new Exception("Crash and burn!"))
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        e -> System.out.println("Error captured: " + e),
                        () -> System.out.println("Done!"));
    }
}