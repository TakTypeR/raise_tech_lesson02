package com.company;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //P37の課題他；抜粋
        quick_test();
        System.out.println();

        List<Communication> com_list = new ArrayList<>() {
            {
                add(new WorkplaceCommunication());
                add(new HighSchool());
            }
        };

        //1.職場でHelloと言われたら、挨拶する:P38
        System.out.println("----Part1----");
        System.out.println("Try saying Hello");
        for (Communication c: com_list) {
            if (c.isWorkplace())
                System.out.println("Message:" + c.greet("Hello") + "(" + c.location() + ")");
            else
                System.out.println("Not workplace. skipped(" + c.location() + ")");
        }
        System.out.println();

        //Hello以外の言葉を言ってみる
        System.out.println("Try saying not Hello");
        com_list.forEach(i -> System.out.println("Message:" + i.greet("How are you doing?") + "(" + i.location() + ")"));
        System.out.println();
        System.out.println();

        //2.各場で話しかけて来た人に応答をする。部外者では例外発生:P39
        System.out.println("----Part2----");
        try {
            List<Person> persons = new ArrayList<>() {
                {
                    add(new Boss());
                    add(new Colleague());
                    add(new Student());
                    add(new Outsider());            //部外者
                }
            };

            //各場
            for(Communication c: com_list){
                System.out.println("Location:" + c.location());
                //対象者
                for(Person p: persons){
                    System.out.println(p.position() + " said: " + p.greet());
                    System.out.println(">>Response:" + c.greet(p));
                }
                System.out.println();
            }

        }catch (MyException e){
            //部外者の場合
            System.out.println("====Warning!!!====");
            System.out.println("Location:" + e.getLocation());
            System.out.println(e);

        }catch (Exception e) {
            //上記以外の例外処理
            System.out.println(e);
        }finally {
            System.out.println("The end of the program");
        }
    }

    /**
     * quick_test:P37の改題他（抜粋）
     */
    private static void quick_test(){
        System.out.println("quick test start----------------");
        //BigDecimalテスト
        BigDecimal b1 = new BigDecimal("1.15");
        BigDecimal b2 = new BigDecimal("2.32");
        BigDecimal b3 = new BigDecimal("3.73");

        BigDecimal b4 = b1.add(b2).add(b3);
        System.out.println(b4);
        System.out.println(b1.multiply(b3));
        System.out.println();

        //1--10までの可算
        int sum = 0;
        for(int i = 1; i < 11; i++ )sum += i;
        System.out.println("sum1:" + sum);

        sum = 0;
        int data[] = {1,2,3,4,5,6,7,8,9,10};
        for( int d: data ){ sum += d; }
        System.out.println("sum2:" + sum);
        System.out.println();

        //現在日時を取得して 3年後の曜日を調べる
        final LocalDateTime currentDate = LocalDateTime.now();
        System.out.println(currentDate + "の3年後は" + currentDate.plusYears(3).getDayOfWeek());

        System.out.println("quick test end----------------");
    }
}
