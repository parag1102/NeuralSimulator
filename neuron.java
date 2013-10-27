package edu.cmu.lti;

import java.text.DecimalFormat;

public class neuron {
  
  private int id;
  private boolean isOn;
  private double Current;
  private double maxCurrent;
  private int Connections;
  
  public int getId() {
    return this.id;
  }
  
  public void setId(int i) {
    this.id = i;
  }
  
  public boolean getIsOn() {
    return this.isOn;
  }
  
  public void setIsOn(boolean b) {
    this.isOn = b;
  }
  
  public double getCurrent() {
    return this.Current;
  }
  
  public void setCurrent(double c) {
    this.Current = c;
  }
  
  public double getMaxCurrent() {
    return this.maxCurrent;
  }
  
  public void setMaxCurrent(double mc) {
    this.maxCurrent = mc;
  }
  
  public int getConnections() {
    return this.Connections;
  }
  
  public void setConnections(int c) {
    this.Connections = c;
  }
  
  public void printState () {
    DecimalFormat myForm = new DecimalFormat("#00.0000");
    DecimalFormat idForm = new DecimalFormat("00");
    System.out.print("Neuron "+idForm.format(this.id)+" => isOn: " +this.isOn+ " Current: " +myForm.format(this.Current) + " #Connections: " + this.Connections + "\t\t");
  }
  
}
