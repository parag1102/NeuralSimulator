import java.util.ArrayList;
import java.util.List;

import edu.cmu.lti.mesh;
import edu.cmu.lti.neuron;
import edu.cmu.lti.neuronSimulator;


public class paragaMain {
  
  public static void main(String[] args) {
    
    // create 51 neurons
    List<neuron> tempneList = new ArrayList<neuron>();
    for (int i=0; i<52 ; i++) {
      neuron tempne = new neuron();
      tempne.setId(i);
      tempne.setIsOn(true);
      tempne.setMaxCurrent(10);
      tempneList.add(tempne);           
    }
    
    // create a neuron mesh
    mesh M = new mesh();
    
    List<neuron> neList0 = new ArrayList<neuron>(); 
    neList0.add(tempneList.get(1));
    neList0.add(tempneList.get(2));
    neList0.add(tempneList.get(3));
    M.insertNeuronListat(0,neList0);
    
    List<neuron> neList1 = new ArrayList<neuron>();
    neList1.add(tempneList.get(4));
    M.insertNeuronListat(1,neList1);
    
    List<neuron> neList2 = new ArrayList<neuron>();
    neList2.add(tempneList.get(5));
    neList2.add(tempneList.get(6));
    M.insertNeuronListat(2,neList2);
    
    List<neuron> neList3 = new ArrayList<neuron>();
    neList3.add(tempneList.get(7));
    M.insertNeuronListat(3,neList3);
    
    List<neuron> neList4 = new ArrayList<neuron>();
    neList4.add(tempneList.get(5));
    M.insertNeuronListat(4,neList4);
    
    List<neuron> neList5 = new ArrayList<neuron>();
    neList5.add(tempneList.get(9));
    neList5.add(tempneList.get(10));
    M.insertNeuronListat(5,neList5);
   
    List<neuron> neList6 = new ArrayList<neuron>();
    neList6.add(tempneList.get(3));
    M.insertNeuronListat(6,neList6);
    
    List<neuron> neList7 = new ArrayList<neuron>();
    neList7.add(tempneList.get(8));
    M.insertNeuronListat(7,neList7);
    
    List<neuron> neList8 = new ArrayList<neuron>();
    neList8.add(tempneList.get(6));
    neList8.add(tempneList.get(11));
    M.insertNeuronListat(8,neList8);
    
    List<neuron> neList9 = new ArrayList<neuron>();
    neList9.add(tempneList.get(14));
    neList9.add(tempneList.get(16));
    M.insertNeuronListat(9,neList9);
    
    List<neuron> neList10 = new ArrayList<neuron>();
    neList10.add(tempneList.get(11));
    M.insertNeuronListat(10,neList10);
    
    List<neuron> neList11 = new ArrayList<neuron>();
    neList11.add(tempneList.get(12));
    M.insertNeuronListat(11,neList11);
    
    List<neuron> neList12 = new ArrayList<neuron>();
    neList12.add(tempneList.get(13));
    M.insertNeuronListat(12,neList12);
    
    List<neuron> neList13 = new ArrayList<neuron>(); 
    neList13.add(tempneList.get(10));
    neList13.add(tempneList.get(14));
    neList13.add(tempneList.get(15));
    M.insertNeuronListat(13,neList13);
    
    List<neuron> neList14 = new ArrayList<neuron>();
    neList14.add(tempneList.get(20));
    M.insertNeuronListat(14,neList14);
    
    List<neuron> neList15 = new ArrayList<neuron>();
    neList15.add(tempneList.get(24));
    M.insertNeuronListat(15,neList15);
    
    List<neuron> neList16 = new ArrayList<neuron>(); 
    neList16.add(tempneList.get(17));
    neList16.add(tempneList.get(18));
    neList16.add(tempneList.get(19));
    M.insertNeuronListat(16,neList16);
    
    List<neuron> neList17 = new ArrayList<neuron>();
    neList17.add(tempneList.get(23));
    M.insertNeuronListat(17,neList17);
    
    List<neuron> neList18 = new ArrayList<neuron>();
    neList18.add(tempneList.get(20));
    M.insertNeuronListat(18,neList18);
    
    List<neuron> neList19 = new ArrayList<neuron>();
    neList19.add(tempneList.get(25));
    M.insertNeuronListat(19,neList19);
    
    List<neuron> neList20 = new ArrayList<neuron>();
    neList20.add(tempneList.get(21));
    neList20.add(tempneList.get(22));
    M.insertNeuronListat(20,neList20);
    
    List<neuron> neList21 = new ArrayList<neuron>();
    neList21.add(tempneList.get(17));
    M.insertNeuronListat(21,neList21);
    
    List<neuron> neList22 = new ArrayList<neuron>();
    neList22.add(tempneList.get(15));
    M.insertNeuronListat(22,neList22);
    
    List<neuron> neList23 = new ArrayList<neuron>();
    neList23.add(tempneList.get(32));
    M.insertNeuronListat(23,neList23);
    
    List<neuron> neList24 = new ArrayList<neuron>();
    neList24.add(tempneList.get(22));
    M.insertNeuronListat(24,neList24);
    
    List<neuron> neList25 = new ArrayList<neuron>();
    neList25.add(tempneList.get(26));
    M.insertNeuronListat(25,neList25);
    
    List<neuron> neList26 = new ArrayList<neuron>();
    neList26.add(tempneList.get(27));
    neList26.add(tempneList.get(31));
    M.insertNeuronListat(26,neList26);
    
    List<neuron> neList27 = new ArrayList<neuron>();
    neList27.add(tempneList.get(28));
    M.insertNeuronListat(27,neList27);
    
    List<neuron> neList28 = new ArrayList<neuron>();
    neList28.add(tempneList.get(29));
    M.insertNeuronListat(28,neList28);
    
    List<neuron> neList29 = new ArrayList<neuron>();
    neList29.add(tempneList.get(30));
    M.insertNeuronListat(29,neList29);
    
    List<neuron> neList30 = new ArrayList<neuron>();
    neList30.add(tempneList.get(26));
    M.insertNeuronListat(30,neList30);
    
    List<neuron> neList31 = new ArrayList<neuron>();
    neList31.add(tempneList.get(46));
    M.insertNeuronListat(31,neList31);
    
    List<neuron> neList32 = new ArrayList<neuron>();
    neList32.add(tempneList.get(33));
    M.insertNeuronListat(32,neList32);
    
    List<neuron> neList33 = new ArrayList<neuron>();
    neList33.add(tempneList.get(34));
    M.insertNeuronListat(33,neList33);
    
    List<neuron> neList34 = new ArrayList<neuron>();
    neList34.add(tempneList.get(35));
    M.insertNeuronListat(34,neList34);
    
    List<neuron> neList35 = new ArrayList<neuron>();
    neList35.add(tempneList.get(33));
    M.insertNeuronListat(35,neList35);
    
    List<neuron> neList36 = new ArrayList<neuron>();
    neList36.add(tempneList.get(37));
    neList36.add(tempneList.get(38));
    M.insertNeuronListat(36,neList36);
    
    List<neuron> neList37 = new ArrayList<neuron>();
    neList37.add(tempneList.get(48));
    M.insertNeuronListat(37,neList37);
    
    List<neuron> neList38 = new ArrayList<neuron>();
    neList38.add(tempneList.get(39));
    neList38.add(tempneList.get(40));
    neList38.add(tempneList.get(41));
    M.insertNeuronListat(38,neList38);
    
    List<neuron> neList39 = new ArrayList<neuron>();
    neList39.add(tempneList.get(44));
    M.insertNeuronListat(39,neList39);
    
    List<neuron> neList40 = new ArrayList<neuron>();
    neList40.add(tempneList.get(50));
    M.insertNeuronListat(40,neList40);
    
    List<neuron> neList41 = new ArrayList<neuron>();
    neList41.add(tempneList.get(42));
    M.insertNeuronListat(41,neList41);
    
    List<neuron> neList42 = new ArrayList<neuron>();
    neList42.add(tempneList.get(43));
    M.insertNeuronListat(42,neList42);
    
    List<neuron> neList43 = new ArrayList<neuron>();
    neList43.add(tempneList.get(41));
    M.insertNeuronListat(43,neList43);
    
    List<neuron> neList44 = new ArrayList<neuron>();
    neList44.add(tempneList.get(45));
    M.insertNeuronListat(44,neList44);
    
    List<neuron> neList45 = new ArrayList<neuron>();
    neList45.add(tempneList.get(40));
    M.insertNeuronListat(45,neList45);
    
    List<neuron> neList46 = new ArrayList<neuron>();
    neList46.add(tempneList.get(47));
    M.insertNeuronListat(46,neList46);
    
    List<neuron> neList47 = new ArrayList<neuron>();
    neList47.add(tempneList.get(26));
    M.insertNeuronListat(47,neList47);
    
    List<neuron> neList48 = new ArrayList<neuron>();
    neList48.add(tempneList.get(49));
    M.insertNeuronListat(48,neList48);
    
    List<neuron> neList49 = new ArrayList<neuron>();
    neList49.add(tempneList.get(36));
    M.insertNeuronListat(49,neList49);
    
    List<neuron> neList50 = new ArrayList<neuron>();
    neList50.add(tempneList.get(51));
    M.insertNeuronListat(50,neList50);
    
    List<neuron> neList51 = new ArrayList<neuron>();
    neList51.add(tempneList.get(43));
    M.insertNeuronListat(51,neList51);
    
    // print the neural graph
    M.printAll();
    
    // simulator with start signal strength as 10
    // and damping factor per hop is 0.56
    neuronSimulator mySimulator = new neuronSimulator();
    mySimulator.setStartCurrent(10.00);
    mySimulator.setDampingFactor(0.56);
    mySimulator.run(M);    
  }
  
}
