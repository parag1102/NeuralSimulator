package edu.cmu.lti;
import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.Queue;


public class neuronSimulator {
  private double startCurrent;
  private double dampingFactor;
  
  public void setStartCurrent(double c) {
    this.startCurrent = c;
  }
  
  public void setDampingFactor(double d) {
    this.dampingFactor = d;
  }

  public void run(mesh M) {
    
    DecimalFormat myForm = new DecimalFormat("#0.0000");
    
    System.out.println("\n------Simulating the Neural Graph------");
    System.out.println("\n------Our Simulation also supports parallelism------");
    System.out.println("------where a neuron is able to send current simultaneously to all its connections.------\n");
    System.out.println("------Starting with a signal strength of "+ this.startCurrent + "------\n");
    System.out.println("------Loss in strength per hop is "+ this.dampingFactor + "------\n");
    
    Queue<neuron> cq = new ArrayDeque<neuron>();
    Queue<neuron> nq = new ArrayDeque<neuron>();
    
    double nowCurrent = this.startCurrent;
    
    System.out.println("Neuron 00 => isOn: true Current: " + myForm.format(nowCurrent) + " #Connections: " + M.getat(0).size());
    double nextCurrent = nowCurrent*this.dampingFactor;
    if (nextCurrent >= 0.001) {
      for (int j= 0; j<M.getat(0).size();j++) {
        cq.add(M.getat(0).get(j));
        M.getat(0).get(j).setCurrent(nextCurrent);
      }
    }
    
    int countHops = 1;
    
    while (null != cq.peek()) {
      neuron tempne = cq.poll();
      int i = tempne.getId();
      tempne.setConnections(M.getat(i).size());
      tempne.printState();
      //System.out.print(i + " ");
      nowCurrent = tempne.getCurrent();
      nextCurrent = nowCurrent*this.dampingFactor;
      if (nextCurrent >= 0.001) {
        for (int j= 0; j<M.getat(i).size();j++) {
          nq.add(M.getat(i).get(j));
          M.getat(i).get(j).setCurrent(nextCurrent);
        }
      }
        
      if(null == cq.peek()) {
        System.out.println();
        countHops++;
        this.swap(cq,nq);
      }
    }
    
    System.out.println("\n------Total number of hops over which the signal propagated is "+ countHops + "------\n");
    
  }

  private void swap(Queue<neuron> cq, Queue<neuron> nq) {
    Queue<neuron> temp = new ArrayDeque<neuron>(cq);
    cq.clear();
    cq.addAll(nq);
    nq.clear();
    nq.addAll(temp);
  }

}
