package ca.carleton.COMP3005Application.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.Year;

@Entity
@Table(name = "FitnessEquipment")
public class FitnessEquipment {

    @Id
    @Column(name="serial_num")
    private String serialNum;

    @Column(name="model")
    private String model;

    @Column(name="manufacturing_year")
    private Year manufacturingYear;

    @Column(name="last_maintained")
    private Date lastMaintained;

    public FitnessEquipment() { }

    public FitnessEquipment(String serialNum, String model, Year manufacturingYear, Date lastMaintained) {
        this.serialNum = serialNum;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.lastMaintained = lastMaintained;
    }

    //Getters
    public String GetSerialNum() { return serialNum; }
    public String GetModel() { return model; }
    public Year GetYear() { return manufacturingYear; }
    public Date GetLastMaintained() { return lastMaintained; }

    //Setters
    public void SetModel(String newModel) { model = newModel; }
    public void SetYear(Year newManufacturingYear) { manufacturingYear = newManufacturingYear; }
    public void SetLastMaintained(Date newLastMaintained) { lastMaintained = newLastMaintained; }
}
