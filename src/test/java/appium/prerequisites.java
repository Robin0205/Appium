package appium;

public class prerequisites {

	public static void main(String[] args) {

		/*-----------------PRE REQUISITES--------------                           ------------Andriod tools------------
		 * 
		 * Install JDK                                                             Andriod studio
		 * Eclipse                                                                 Appium server /Appium desktop(IDE,SDK,VIRTAUL DEVICES)
		 * Maven plugin                                                            Appium client library
		 * TestNG plugin
		 * Selenium standlone server
		 */

		/*
		 * Appium is a server which is developed by using the node J.S Node js is used
		 * to develop backend server and React js is used to develop front end client
		 * Andrio studio is in .exe file just like selenium To us this appium we need
		 * ANDRIOD STUDIO which act as a IDE and also it has SDK (just like JDK) SDK is
		 * a library which is used to develop mobile applications which are in Apk file
		 * format .ApK files are manditory before we run the application for testing APK
		 * are like (ANDRIOD APPLICATION PACKAGES) Andrio studio HAS AVD MANAGER which
		 * is used to create a virtual devices (simulator--iphone) andriod device(
		 * emulator) Appium server it is available in form of desktop application we can
		 * download and install on desktop As we are using java so we need to download
		 * client library of java or else we can add dependency if we are using maven
		 * project
		 * 
		 * C:\Program Files\Android\Android Studio\bin-------this is the location of a
		 * andriod studio After downloading Andriod studio and Appium we need to
		 * configure this both applications To andriod studio we need to make the
		 * variables in environments varibales for both tools,platform tools and build
		 * tools which are present under C:\Users\Robin\AppData\Local\Android\Sdk
		 * 
		 * Along with this we have to donwlaod appium client library which from appiu m
		 * client library website and go to github and select java client and donwnload
		 * all.jars from sonatype
		 * 
		 *
		 * 
		 * Open the Andrio studio and click on AVD manager a new tab will open
		 * displaying your virtual devices below thw winodw there will be option click
		 * create a virtual device.it will show the typw of mobile and version then
		 * click on next button then it show versions then click on finish.then give
		 * name to AVD device select andriod and click finish
		 * 
		 * click on the play button under actions colum then it will launch the virtual
		 * device.
		 * 
		 * we have to develop all apl files on virtual device so that we can start
		 * testing in it
		 * 
		 * SDK MANAGER & ADB.exe usage ======================================SDK manager
		 * contains all the packages that all required for developing and automating the
		 * applications adb.exe is also a component by which we can download the APK
		 * files in virtual or real device and we can alo know how many no of devices
		 * connected to this device.
		 * SDK MANAGER is used to develop different verisons of operataing systems
		 * Click on SDK manager and by default Andrio api 35 operating system is installed
		 * based on our wish we can download the desired operating system then click on ok
		 * 
		 * C:\Users\Robin\AppData\Local\Android\Sdk\tools\adb.exe----location of the adb.exe
		 * 
		 * 
		 */
	}

}
