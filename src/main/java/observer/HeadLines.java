package observer;

import observer.Domain.TimesOfIndiaData;
import observer.Domain.User1;
import observer.Domain.User2;

/**
 * Created by gurinder on 10/4/16.
 */
public class HeadLines {
    public static void main(String[] args) {
        TimesOfIndiaData news = new TimesOfIndiaData();
        User1 user1 = new User1(news);
        User2 user2 = new User2(news);

        news.setMessage("Man hanged himself");
    }
}
