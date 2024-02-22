package com.example.springFacam;

import com.example.springFacam.adapter.*;
import com.example.springFacam.aop.AopBrowser;
import com.example.springFacam.decorator.*;
import com.example.springFacam.observer.Button;
import com.example.springFacam.observer.IButtonListener;
import com.example.springFacam.proxy.Browser;
import com.example.springFacam.proxy.BrowserProxy;
import com.example.springFacam.proxy.IBrowser;
import com.example.springFacam.singleton.AClazz;
import com.example.springFacam.singleton.BClazz;
import com.example.springFacam.singleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {
        /*
        // [singleton]
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두 개의 객체가 동일한가");
        System.out.println(aClient.equals(bClient));

        // [adapter]
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);

        //proxy
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        browser.show();


        //aop
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();
        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );
        aopBrowser.show();
        System.out.println("loading time: "+end.get());
        aopBrowser.show();
        System.out.println("loading time: "+end.get());




        // decorator
        ICar audi = new Audi(1000);
        audi.showPrice();

        // a3
        ICar audi3 = new A3(audi,"A3");
        audi3.showPrice();
        // a4
        ICar audi4 = new A4(audi,"A4");
        audi4.showPrice();
        // a5
        ICar audi5 = new A5(audi,"A5");
        audi5.showPrice();

        // obeserver
        Button button = new Button("버튼");
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });
        button.click("메시지 전달 : click1");
        button.click("메시지 전달 : click2");
        button.click("메시지 전달 : click3");
        button.click("메시지 전달 : click4");

         */
    }
    /*
    // adapter
    // 콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }

*/

}
