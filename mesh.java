package edu.cmu.lti;
import java.util.LinkedList;
import java.util.List;


public class mesh {
  
  private LinkedList<List<neuron>> AdjList = new LinkedList<List<neuron>>();
  //Semantically the above declarations can be understood by seeing the declarations below:-
  //private List<neuron> row = new ArrayList<neuron>();
  //private List<row> AdjList = new ArrayList<row>();
  
  public void insertNeuronList(List<neuron> nList) {
    this.AdjList.add(nList);
  }
  
  public void insertNeuronListat(int n,List<neuron> nList) {
    this.AdjList.add(n, nList);
  }
  
  public void insertNeuronat(int n, neuron ne) {
    List<neuron> tempList = this.AdjList.get(n);
    tempList.add(ne);
  }
  
  public void appendNeuronListat(int n, List<neuron> nList) {
    List<neuron> tempList = this.AdjList.get(n);
    tempList.addAll(nList);
  }
  
  public List<neuron> getat(int n) {
    return this.AdjList.get(n);
  }
  
  public void printat(int n) {
    System.out.print(n + " => ");
    List<neuron> tempList = this.AdjList.get(n);
    for (int i=0;i<tempList.size();i++) {
      if(i==tempList.size()-1)
        System.out.print(tempList.get(i).getId());
      else
        System.out.print(tempList.get(i).getId() + ", ");
    }
    System.out.println();
  }
  
  public void printAll() {
    
    System.out.println("\n------Adjacency List for the Neural Graph------\n");
    
    for (int p=0; p<this.AdjList.size();p++) {
      System.out.print(p + " => ");
      List<neuron> tempList = this.AdjList.get(p);
      for (int i=0;i<tempList.size();i++) {
        if(i==tempList.size()-1)
          System.out.print(tempList.get(i).getId());
        else
          System.out.print(tempList.get(i).getId() + ",");
      }
      System.out.println();
    }
  }
  
}
