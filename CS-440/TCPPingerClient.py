# CS 440 Computer Networks
# Implemented by Prakhar Rampalli
#TCPPingerClient.py
from socket import *
import time
# creates client's socket which includes ipv4 address, and type TCP
serverName = '127.0.0.1' # includes the name of the server
serverPort = 12000       # includes the port number of the server
clientSocket = socket(AF_INET, SOCK_STREAM)
clientSocket.connect((serverName,serverPort))
#clientSocket.settimeout(0.1)
try:
    for i in range(1, 11): # 10 pings
        start = time.time()
        sentence = ('Ping' + str(i) + " " + time.ctime(start)) # message to be sent
        clientSocket.send(sentence.encode())
        try:
            print("Sent " + sentence)
            print("From Server: ", {sentence.encode()})
            end = time.time()
            RTT = end - start
            print("RTT: " + str(RTT) + " seconds\n")
        except timeout:
            print("#" + str(i) + " Requested Time out \n")
finally:
    print("closing socket")
    clientSocket.close()