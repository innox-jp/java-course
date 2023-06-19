package com.innoxjp.course.lesson01;
class 物体{
    public Integer money;
    public static String TYPE = "物体";
}


class 动物 extends 物体{
    private Integer woshiprivate; 
    protected Integer age;
    
    public void 呼吸(){}
}

interface 打高尔夫{
    void 打高尔夫();
}
class 鱼类 extends 动物 {}

public class 人类 extends 动物 {
    String 国家;
    String 性别;
    float fmoney;
    public Float money;
    void 购物(){
        //ldsjfaldfjas
        super.money = super.money -10; 
        super.呼吸();
        //asdlfja;dlsf
        this.money = money - 100.00f;
        

    }

    public void 吃饭(){}
    public void 睡觉(){}
    public void 做瑜伽(){}
    public static void main(String[] 参数) {

        Integer 丽华的数 = new Integer("0");
        //Integer 小刘的数 = new Integer("小刘");
        String 丽华的名字 = "张丽华";
        String 王的名字 = "张亮";
        String 小时 = "";
        System.out.println(丽华的名字.length());
        System.out.println(王的名字.length());
        System.out.println(String.format("好漂亮的 %s",王的名字));
        System.out.println(小时.isEmpty());
        System.out.println(丽华的名字.charAt(2));
        System.out.println(王的名字.startsWith("张"));
        
    }
}

class LiHua extends 人类 implements 打高尔夫{

    public void 打高尔夫() {
        Integer 分数 = new Integer("0");
    }

}
