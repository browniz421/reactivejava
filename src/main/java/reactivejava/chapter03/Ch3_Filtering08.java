package reactivejava.chapter03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_Filtering08 {
    public static void main(String[] args) {
        Observable.range(1, 100)
                .skip(90)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}