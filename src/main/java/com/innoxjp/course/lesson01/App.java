/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.innoxjp.course.lesson01;

import java.sql.Time;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

import com.innoxjp.course.能买房;

public class App {
    // public static void main(String[] args) {
    //     Bus bus = new Bus();
    //     System.out.println("Hello Remote World!");
    //     Long l = 5823405720435L;
    //     System.out.println(Long.toString(l, 10).toUpperCase());
    // }

    void 跳瑜伽(Time 时间, Duration duration) {
        时间.compareTo(new Date(2023, 1, 20));
        Bus bus = new Bus();

    }

    public static void main(String[] args) {
        帅哥 xiaoliu = new 帅哥();
        System.out.println(xiaoliu.钱);

        富婆 lily = new 富婆();
        美女 xiaoMei = new 美女();
        xiaoliu.结婚(xiaoMei);


        老板 boss = new 老板();

        xiaoliu.朋友.add(boss);

        xiaoliu.买房子();
        if(xiaoliu.能不能结婚(lily)){
            xiaoliu.结婚(lily);
        }

        System.out.println("xiaoliu married lily!");
    }
}

class 房子 {

}

class 老板 implements 能买房 {

    @Override
    public int 房子数量() {
        return 100;
    }

    @Override
    public boolean 能买房吗() {
        return true;
    }

    @Override
    public void 买房() {

    }

}

class 帅哥 {
    ArrayList<房子> 房子s = new ArrayList<>();
    ArrayList<美女> 女朋友s = new ArrayList<>();
    ArrayList<能买房> 朋友 = new ArrayList<>(Arrays.asList(new 老板(), new 美女()));
    int 钱;
    美女 老婆;
    帅哥 老公;

    // 房子[] 房子list = new 房子[100];

    public ArrayList<房子> 买房子() {

        房子s.add(new 房子());
        return 房子s;
    }

    public boolean 能不能结婚(美女 o美女) {
        // 要判断有多少房子，房子大于50，返回true,否则false
        if (房子s.size() > 50)
            return true;
        else
            return false;

    }
    public boolean 能不能结婚(富婆 o富婆) {
        // 要判断有多少房子，房子大于50，返回true,否则false
        if (房子s.size() > 50)
            return true;
        else
            return false;

    }

    public void 结婚(美女 o美女) {
        
        女朋友s.sort(Comparator.comparing(美女::房子数量).reversed()
                .thenComparing(美女::美貌).reversed()
                .thenComparing(美女::存款).reversed());
        if (能不能结婚(o美女)) {
            女朋友s.clear();
            老婆 = o美女;
        }
    }
    public void 结婚(富婆 o富婆) {
        
    }
    public void 结婚(老富婆 o老富婆) {
        if(老婆 == null){
            老婆 = o老富婆;
        };
        o老富婆.养生();
    }
    

    public <能结婚的类型  extends I富婆>void 结婚(能结婚的类型 未婚妻){
        
    }

    
}
interface I富婆{
    void 爱花钱(boolean 能不能负债);
}
interface I爱国{
    void 爱国();
    void 爱花钱();
}

interface I爱国富婆 extends I富婆, I爱国{
    
}
class 车 {
    String 左前轮;
    String 左后轮;
    String 右前轮;
    String 右后轮;

}

class 学生 {
}

class 富婆 extends 美女 {
    private int 房子数量;

    public 富婆() {
        this.房子数量 = 100;
    }

    @Override
    public int 房子数量() {
        return this.房子数量;
    }

    @Override
    public boolean 能买房吗() {
        return true;
    }

    @Override
    public void 买房() {
        System.out.println("买了一套房子");
    }
}

class 老富婆 extends 富婆 {
    void 养生() {
    }
}
class 班级 {
    动物[] 学生列表 = new 动物[100];
    ArrayList<鱼类> 女生列表 = new ArrayList<>();

}
