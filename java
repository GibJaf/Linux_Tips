There are 2 things :
1)JRE : Java Runtime Environment
	JRE is required to run a compiled java program

2)JDK : Java Development Kit
	JDK includes JRE plus the development tools(such as compiler and debugger), is needed for writing as well as running Java program. JRE is subset of JDK.


Now, there are several JDK implementations available for Linux such as 
1)Oracle JDK
2)Open JDK (default with Ubuntu, not 100% compatible with OracleJDK)

3)SunJDK
4)IBMJDK
5)GNU Java Compiler



INSTALLATION in Ubuntu
Default
Method 1:
	sudo apt install openjdk-8-jdk
	// This install OpenJDK version 8
	// Simple and easy , dont have to do anything else

Method 2:
	Here OracleJDK 11 is being installed
	1)Go to https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
	2)Download the Linux Compressed Archive .tar.gz version
	3)tar xvf jdk-11.0.7.tar.gz
	4)Put the resulting unzipped folder jdk-11.0.7 in desired location.Lets call it <LOCATION>
	5)Add export PATH=<LOCATION>/bin:PATH in ~/.bashrc file
	6)Source ~/.bashrc





COMPILE => 
	javac <program_name.java>
	// It generates a <program_name.class> file
	
RUN	=> java <program_name>


Oracle website account 
username  => gibraan.jafar@viit.ac.in
password => NeedOracleJDK20
