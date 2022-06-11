package com.windy.builderPattern;

/**
 * @author Kyrielle
 * @version 1.0
 * @date 2022/6/11 20:53
 * <p>
 * 将原本返回 void 的 set 方法, 构造成返回 builder 的方式, 这样可以使用链式调用
 * 使用场景：
 * 当一个类：
 * (1) 构造函数超过4个;
 * (2) 参数可选
 * 考虑使用建造者模式
 */
public class Computer {
    private final String cpu;       //  required
    private final String ram;       //  required
    private final int usbCount;     //  optional
    private final String keyboard;  //  optional
    private final String display;   //  optional

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyboard = builder.keyboard;
        this.display = builder.display;
    }

    public static class Builder {
        private String cpu;       //  required
        private String ram;       //  required
        private int usbCount;     //  optional
        private String keyboard;  //  optional
        private String display;   //  optional

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public int getUsbCount() {
        return usbCount;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getDisplay() {
        return display;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount=" + usbCount +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
