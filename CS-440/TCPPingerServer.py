# CS 440 Computer Networks
# Implemented by Prakhar Rampalli
#TCPPingerServer.py
import random
from socket import *
# Create a TCP socket
serverPort = 12000 # port number

# Notice the use of SOCK_STREAM for TCP packets
serverSocket = socket(AF_INET,SOCK_STREAM)

# Assign IP address and port number to socket
serverSocket.bind(('',serverPort))
serverSocket.listen(1)
print('The server is ready to receive')
while True:
	# Generate random number in the range of 0 to 10
    rand = random.randint(0, 10)

    # Receive the client packet along with the address
    connectionSocket, addr = serverSocket.accept()

    # Decode the encoded message from the client
    sentence = connectionSocket.recv(1024).decode()

    # Capitalize the message from the client
    capitalizedSentence = sentence.upper()

    # If rand is less than 4, consider the packet lost and do not respond
    if rand < 4:
       continue
    # Otherwise, the server responds
    connectionSocket.send(capitalizedSentence.encode()) # respond to client

