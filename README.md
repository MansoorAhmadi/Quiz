# Quiz PROJECT

CHANNELS - 
	*Tools
	*Internal classes - source code - model - services - repository
	*External classes - Spring web - controller - dto
	


1: IDE

	1.1: Download and install and IDE for the project source code and build

		*IntelliJ IDEA


1: MAVEN PROJECT
	
	1.1: Maven is a project builder and dependency manager. It has a default Life-Cycle and plugin

		*Life-Cycle -> INSTALL
		*Install will provide the jar file inside the target folder of your current project.


	1.2: We create an empty Maven project and define our domain and project name

		*POM.xml 
			*<groupId>org.bluebird</groupId>
   			*<artifactId>Quiz</artifactId>
    			*<version>1.0-SNAPSHOT</version>


	1.2: We add some dependencies to connect to our database & test model classes

		*POSTGRESQL
            		*<groupId>org.postgresql</groupId>
            		*<artifactId>postgresql</artifactId>
            		*<version>42.2.24</version>
		
		*JUNIT
			*<groupId>junit</groupId>
            		*<artifactId>junit</artifactId>
            		*<version>4.13.2</version>
            		*<scope>test</scope>



CHANNEL #1

1: Model

	1.1 - Quiz-Model - we define our quiz classes

		*
	










