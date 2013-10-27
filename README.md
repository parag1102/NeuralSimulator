NeuralSimulator
===============

A graph of Neurons simulating neural processes in our brain

Features:
1) Supports any type of neural graph with any amount of connections. We use adjacency list to represent the neural graph.

2) Uses a signal damping factor per hop. Therefore even though we have cycles the simulation will 
stop after the signal strength falls below a threshold.

3) Uses breadth first traversal and therefore a neuron can send signal to its connections simultaneously. 
We use two queues for traversing the graph in breadth first style.

4) Each neuron has an "isOn" feature which depicts whether the neuron will propagate the signal further or not.

5) Each neuron has a "maxCurrent" feature. Sending current more than this max value will damage 
the neuron and the isOn feature is changed to false. So, then this neuron will not propagate the signal further.
