/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.entities.ac.za;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author andil
 */
@Entity
public class Computer extends Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "motherboard",nullable = false)
    private String motherboard; //e.g 
    
    @Column(nullable = false)
    private String ram;//e.g. 16gb ram 2666mhz
    
    @Column(nullable = true)
    private String gpu;//e.g Asus rtx 3090
    
   @Column(nullable = false)
    private String processor;//e.g i5 12400f/6 cores 12 threads

    public Computer() {
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}
