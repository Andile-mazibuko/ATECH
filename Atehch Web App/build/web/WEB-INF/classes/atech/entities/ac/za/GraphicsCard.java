/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.entities.ac.za;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author andil
 */
@Entity
public class GraphicsCard extends Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private String model;// e.g AMD.. / Nvedia rtx 3050 ti
    private String cores;
    private String type; // GDDR6
    private String vram;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVram() {
        return vram;
    }

    public void setVram(String vram) {
        this.vram = vram;
    }

    public GraphicsCard() {
    }
}
