Terminal 1:

idlj -fall ReverseModule.idl
javac *.java ReverseModule/*.java
orbd -ORBInitialPort 1056&
java ReverseServer -ORBInitialPort 1056& 

Terminal 2:

java ReverseClient -ORBInitialPort 1056 -ORBInitialHost localhost
