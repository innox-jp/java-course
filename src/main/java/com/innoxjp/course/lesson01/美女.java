package com.innoxjp.course.lesson01;

import com.innoxjp.course.能买房;

public class 美女 implements 能买房, java.io.Serializable{
    long 钱 = 30;
    Integer 美貌 = 1;
    Float 存款=100.00f;
    public void 化妆(){

    }
    public Integer 美貌(){
        return 美貌;
    }
    public Float 存款(){
        return 存款;
    }
    @Override
    public int 房子数量() {
        return 0;
    }

    @Override
    public boolean 能买房吗() {
        {

        }
        
        if (钱 > 10) {
            System.out.println(钱);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void 买房() {

    }
    public void setMoney(int i) {
    }
    public void setBeauty(int i) {
    }
    public void setDeposit(float f) {
    }

}
