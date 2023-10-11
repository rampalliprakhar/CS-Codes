# CS 440 Computer Networks
# Implemented by Prakhar Rampalli
#UDPPingerClient.py
from socket import *
import time

# creates client's socket which includes ipv4 address, and type UDP
serverAddress = ('127.0.0.1', 12000) # (server_name, server_port)
clientSocket = socket(AF_INET, SOCK_DGRAM)
clientSocket.settimeout(1)
clientSocket.connect(serverAddress) # the client socket connects server address
print("Server connected")
for i in range(1, 11): # 10 pings
    startTime = time.time()
    message = ('Ping ' + str(i) + " " + time.ctime(startTime))
    sentMessage = clientSocket.sendto(message.encode(), serverAddress)
    try:
        dataMessage, receivingServer = clientSocket.recvfrom(1024)
        print("Sent " + message)
        endTime = time.time();
        RTT = endTime - startTime # this is the RTT that is calculated by end - start time
        print("RTT: " + str(RTT) + " seconds\n")
    except timeout:
        print("#" + str(i) + " Requested Time out\n") # if server does not respond
print("closing socket")
clientSocket.close()
