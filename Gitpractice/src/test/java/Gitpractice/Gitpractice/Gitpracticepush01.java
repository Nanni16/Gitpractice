package Gitpractice.Gitpractice;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Gitpracticepush01 {
	
	{
		static WebDriver driver;
		 
			public String DestinationFile;
			
			//public  int iRow;
			
			// Draws a red border around the found element. Does not set it back anyhow.
			public WebElement findElement(By by)throws Exception {
			    WebElement elem = driver.findElement(by);
			 
			    // draw a border around the found element
			    if (driver instanceof JavascriptExecutor) {
			        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
			    } 
			    Thread.sleep(10);
			    
			    return elem;
			    
			    
			    
			}
		 	
		    
		   

		    @Test
			public void File_upload()throws Exception
			  {
				
				//SendKeys
		    	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
					 driver =new ChromeDriver();
					 driver.manage().window().maximize() ;	
					 driver.get("https://opensource-demo.orangehrmlive.com/");
		    	
					findElement(By.id("txtUsername")).sendKeys("Admin");
					findElement(By.id("txtPassword")).sendKeys("admin123");
					findElement(By.id("btnLogin")).click();
					
				 	 findElement(By.linkText("PIM")).click();
				 	 findElement(By.id("menu_pim_viewEmployeeList")).click();
				 	 
				 	 Thread.sleep(100);
				 	 findElement(By.linkText("0020")).click();
				 	 
				 	 Thread.sleep(3000);
				 	 
				 
				 	 
				 	//<input type="file" name="photofile" id="photofile">

				 	//findElement(By.name("photofile")).click();
				 	
					 findElement(By.id("btnAddAttachment")).click();
				 	
						Thread.sleep(1000);
						WebElement  button=findElement(By.id("ufile"));
						//button.click();
						
						//findElement(By.name("ufile")).click();
						
						Actions actions = new Actions(driver);
					  	actions.moveToElement(button).click().perform();
				 	 
				 	
				 	 
				 	 String str1="C:\\HTML Report\\EMP_Photos\\bsnl.txt";
				 	 PhotoUpload(str1);
			        
				 	 
			  }	 	 
				 	 
		
		

			
			public   void PhotoUpload(String PhotoPath)throws Exception
			{
				
				
			  
				 
				
			  	
				
				StringSelection sel = new StringSelection(PhotoPath);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
				 
				 System.out.println("selection" +sel);
				 
				 
				 // Create object of Robot class
				 Robot robot = new Robot();
				 Thread.sleep(2000);
				      
				 
				  // Press CTRL+V
				 robot.keyPress(KeyEvent.VK_CONTROL);
				 robot.keyPress(KeyEvent.VK_V);
				 
				 robot.keyRelease(KeyEvent.VK_CONTROL);
				 robot.keyRelease(KeyEvent.VK_V);
				 Thread.sleep(2000);
				        

			       //  Press Enter 
				 robot.keyPress(KeyEvent.VK_ENTER);
				 robot.keyRelease(KeyEvent.VK_ENTER);
				 
				 Thread.sleep(8000);
			
				findElement(By.id("txtAttDesc")).sendKeys("comments 123");
			
				findElement(By.name("btnSaveAttachment")).click();
				Thread.sleep(10000);
			
			}
			
			
			
		
		}

}
