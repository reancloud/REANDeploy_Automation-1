# DeployNowAutomation

How to configure Java and Eclipse for your ubuntu operating system ??

Follow the steps below to configure java.

1) Download your jdk with your required version from

 http://www.oracle.com/technetwork/java/javase/downloads/index.html

2) After download, you found "jdk-8u73-linux-x64.tar.gz" in your download directoy.

3) Open your teminal, for installing JDK under "/usr/local/java" (or Ubuntu's default JDK directory /usr/lib/jvm).

   First, create a directory "java" under "/usr/local".

   Second, Extract the downloaded package (Check your downloaded filename!)

Write the Following commands for above 2 operations:

 cd /usr/local
 sudo mkdir java
 cd /usr/local/java
 sudo tar xzvf ~/Downloads/jdk-8u101-linux-x64.tar.gz
 
where     // x: extract, z: for unzipping gz, v: verbose, f: filename

4) So Now JDK shall be extracted in a folder "/usr/local/java/jdk1.8.0_101".


5) Now Informing Ubuntu to use this JDK/JRE:

// Setup the location of java, javac and javaws

$ sudo update-alternatives --install "/usr/bin/java" "java" "/usr/local/java/jdk1.8.0_101/jre/bin/java" 1
$ sudo update-alternatives --install "/usr/bin/javac" "javac" "/usr/local/java/jdk1.8.0_101/bin/javac" 1
$ sudo update-alternatives --install "/usr/bin/javaws" "javaws" "/usr/local/java/jdk1.8.0_101/jre/bin/javaws" 1

// Use this Oracle JDK/JRE as the default

$ sudo update-alternatives --set java /usr/local/java/jdk1.8.0_101/jre/bin/java
$ sudo update-alternatives --set javac /usr/local/java/jdk1.8.0_101/bin/javac
$ sudo update-alternatives --set javaws /usr/local/java/jdk1.8.0_101/jre/bin/javaws


These are the steps for set up symlinks java, javac, javaws at /usr/bin (which is in the PATH), that link to /etc/alternatives
and then to JDK bin directory.

The "alternatives" system aims to resolve the situation where several programs fulfilling the same function (e.g., different version of JDKs).

It sets up symlinks thru /etc/alternatives to refer to the actual programs to be used.

 cd /usr/bin
 ls -ld java*

lrwxrwxrwx 1 root root 22 Mar 31 20:41 java -> /etc/alternatives/java
lrwxrwxrwx 1 root root 23 Mar 31 20:42 javac -> /etc/alternatives/javac
lrwxrwxrwx 1 root root 24 Mar 31 20:42 javaws -> /etc/alternatives/javaws

 cd /etc/alternatives
 ls -ld java*

lrwxrwxrwx 1 root root 40 Aug 29 18:18 java -> /usr/local/java//jdk1.8.0_101/jre/bin/java
lrwxrwxrwx 1 root root 37 Aug 29 18:18 javac -> /usr/local/java/jdk1.8.0_101/bin/javac
lrwxrwxrwx 1 root root 42 Aug 29 18:19 javaws -> /usr/local/java/jdk1.8.0_101/jre/bin/javaws


6) To verify the JDK installation, issue these commands:
--------------------------------------------------------------------

// Show the Java Compiler (javac) version
   javac -version
   
   javac 1.8.0_73

// Show the Java Runtime (java) version
   java -version

   java version "1.8.0_73"
   Java(TM) SE Runtime Environment (build 1.8.0_73-b26)
   Java HotSpot(TM) 64-Bit Server VM (build 25.20-b23, mixed mode)

// Show the location of javac and java

   which javac
   /usr/bin/javac

   which java
   /usr/bin/java


7) Add JDK's binary directory ("bin") to the "PATH" by editing "/etc/profile":

   cd /etc
   $ sudo gedit profile   // OR "sudo nano profile" to use the console-based nano editor


   Add these lines at the end of the file "/etc/profile"

   export JAVA_HOME=/usr/local/java/jdk1.8.0_101
   export PATH=$JAVA_HOME/bin:$PATH

   Rerun the configuration file by:

    source /etc/profile

  // Check the new settings for JAVA_HOME and PATH

    echo $JAVA_HOME
   
    /usr/local/java/jdk1.8.0_73

    echo $PATH
    .....:/usr/local/java/jdk1.8.0_73/bin

8) Compile and Run a Hello-world Java Program

    Open "Folder" and create a new directory called "myProject" under your home directory to keep all your works.
    Open "Text Editor" (gedit). Enter the following source code and save as "Hello.java" under the "~/myProject" directory created earlier.

    public class Hello
    {  
       public static void main(String[] args)
       {
          System.out.println("Hello, world from Ubuntu!");
       }
    }

    To compile the Hello-world Java program, launch a Terminal and issue these commands:

    // Change directory to where the source code resides
     cd /home/myProject
    
    // List the contents of current directory. Check for "Hello.java"
    ls
    ...... Hello.java ....
    
    // Compile "Hello.java" into "Hello.class"
    javac Hello.java
    
    // Check for "Hello.class"
    ls
    ...... Hello.class ....

    Run the Hello-world Java program:

    // Run "Hello.class"
    java Hello
   

Hello, world from Ubuntu!

Download the Eclipse IDE and try to launch them on Desktop

1) Download the eclipse for linux i.e. downloaded in my download folder as "eclipse-inst-linux64.tar.gz"

2) Now for installing eclipse

Install:

// Unzip the tarball into /usr/local
$ cd /usr/local
$ sudo tar xzvf ~/Downloads/eclipse-inst-linux64.tar.gz
      // Extract the downloaded package
      // x: extract, z: for unzipping gz, v: verbose, f: filename
      // You can also unzip in "File Explorer" by double-clicking the tarball.

// Change ownership
$ cd /usr/local
$ sudo chown -R your-username:your-groupname eclipse
      // Change ownership to your chosen username and groupname
      // -R recursive

// Set up a symlink
$ cd /usr/bin

$ sudo ln -s /usr/local/eclipse/eclipse
      // Make a symlink in /usr/bin, which is in the PATH.

$ ls -ld eclipse
lrwxrwxrwx 1 root root 26 Aug 30 11:53 eclipse -> /usr/local/eclipse/eclipse

$ which eclipse
/usr/bin/eclipse

$ whereis eclipse
eclipse: /usr/bin/eclipse /usr/bin/X11/eclipse /usr/local/eclipse

then go to particular folder -  /home/eclipse/jee-mars/eclipse/
right there just right click on elipse launcher and click on create link and then copy those link shortcut to desktop.

In such manner, you can create the Desktop shortcut.
sudo tar xzvf ~/Downloads/eclipse-inst-linux64.tar.gz 
eclipse-inst-linux64
**********************************
for installing maven
	Maven Install Ubuntu 14.x, 15.x 

	$ sudo  apt-get install maven 

	Check the version, 
***********************

For chrome driver :

i.http://chromedriver.storage.googleapis.com/index.html?path=2.24/
ii.chmod 777


First, install Google Chrome for Debian/Ubuntu:

sudo apt-get install libxss1 libappindicator1 libindicator7
wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb

sudo dpkg -i google-chrome*.deb
sudo apt-get install -f
Now, let’s install xvfb so we can run Chrome headlessly:

sudo apt-get install xvfb
Install ChromeDriver:1

sudo apt-get install unzip

wget -N http://chromedriver.storage.googleapis.com/2.26/chromedriver_linux64.zip
unzip chromedriver_linux64.zip

chmod +x chromedriver

sudo mv -f chromedriver /usr/local/share/chromedriver
sudo ln -s /usr/local/share/chromedriver /usr/local/bin/chromedriver
sudo ln -s /usr/local/share/chromedriver /usr/bin/chromedriver 


How to trigger the test : 

1. clone the repo on the local machine
2. modify the test_parameters.properties.java file
3. add tag to the test case/feature file (RunCukesTest.java)
4. execute the test using eclipse or maven command from cli (mvn test -Dcucumber.options="--tags @$suite_number")


