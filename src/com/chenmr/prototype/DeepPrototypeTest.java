package com.chenmr.prototype;

import com.chenmr.prototype.deep.Computer;
import com.chenmr.prototype.deep.Cpu;

/**
 * Created by Chenmr on 2018/4/7/007.
 */
public class DeepPrototypeTest {

    public static void main(String[] args) {


        try {
            Computer computer = new Computer();
            computer.setBrand("huipu");
            Cpu cpu = new Cpu();
            cpu.setBrand("intel");
            computer.setCpu(cpu);

            System.out.println(computer.getBrand());
            System.out.println(computer.getCpu());
            System.out.println(computer.getCpu().getBrand());

            Computer computer1 = computer.clone();
            System.out.println(computer1.getBrand());
            System.out.println(computer1.getCpu());
            System.out.println(computer1.getCpu().getBrand());


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
