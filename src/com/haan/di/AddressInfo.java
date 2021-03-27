package com.haan.di;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/5/23
 */
public class AddressInfo {
    private String tel;        //基本类型
    private String city;

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "AddressInfo{" +
                "tel='" + tel + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
