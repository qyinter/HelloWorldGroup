package ccg.helloworld.domain;

import java.io.Serializable;

/**
 * 食物的实体类
 */
public class Food implements Serializable {
    private Integer rid;
    private String food_name;
    private String food_details;
    private String food_address;
    private String small_imgs;
    private String big_imgs;
    private String making_method;
    private String food_material;
    private Integer cid;
    private Integer time;
    private Integer energy;
    private Double salt;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getFood_details() {
        return food_details;
    }

    public void setFood_details(String food_details) {
        this.food_details = food_details;
    }

    public String getFood_address() {
        return food_address;
    }

    public void setFood_address(String food_address) {
        this.food_address = food_address;
    }

    public String getSmall_imgs() {
        return small_imgs;
    }

    public void setSmall_imgs(String small_imgs) {
        this.small_imgs = small_imgs;
    }

    public String getBig_imgs() {
        return big_imgs;
    }

    public void setBig_imgs(String big_imgs) {
        this.big_imgs = big_imgs;
    }

    public String getMaking_method() {
        return making_method;
    }

    public void setMaking_method(String making_method) {
        this.making_method = making_method;
    }

    public String getFood_material() {
        return food_material;
    }

    public void setFood_material(String food_material) {
        this.food_material = food_material;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Double getSalt() {
        return salt;
    }

    public void setSalt(Double salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return "Food{" +
                "rid=" + rid +
                ", food_name='" + food_name + '\'' +
                ", food_details='" + food_details + '\'' +
                ", foot_address='" + food_address + '\'' +
                ", small_imgs='" + small_imgs + '\'' +
                ", big_imgs='" + big_imgs + '\'' +
                ", making_method='" + making_method + '\'' +
                ", foot_material='" + food_material + '\'' +
                ", cid=" + cid +
                ", time=" + time +
                ", energy=" + energy +
                ", salt=" + salt +
                '}';
    }
}
