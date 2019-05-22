# Video-Streamer
An application that allows to take streams from various IP cameras and display them on various display devices (Ipads in our case) as per the messages received over CAN bus.
We have used Nvidia AGX Xavier as the processing unit over which all our codes are running. The Xavier Machine has been setup to receive CAN messgaes over its GPIO pins i.e. CAN_DIN and CAN_DOUT.  
