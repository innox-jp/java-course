package com.innoxjp.course.lesson01;
class 物体{
    public Integer money;
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
}

class LiHua extends 人类 implements 打高尔夫{

    public void 打高尔夫() {
    }

}
