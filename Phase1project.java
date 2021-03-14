import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
public class Phase1project 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
char a='y', a2='y' ;
System.out.println("Welcome to LockedMe.com\n\n" + "Developer : Dhruv Bhalla\n");
while(a=='y') 
{	a2='y';
	System.out.println("\n\tMAIN MENU\t\n");
	System.out.println("1. Display File Names\n"+
	"2. Other Options\n"+
	"3. Exit");
	System.out.print("Enter your choice : ");
    String  options =  sc.nextLine();        	
    switch (options)
    {
    case "1":
            System.out.print("Enter the path where you want to sort and display files : ");
       		String pathdir = sc.nextLine();
       		File file = new File(pathdir);
       	
            try
           {
	String[] fileList = file.list();
            ArrayList<String> arrlist = new ArrayList<String>();
            for(String str : fileList) 
            {
            	arrlist.add(str);
            }
            System.out.println("Files in sorted order are :");
            Collections.sort(arrlist);
            for(String str : fileList) 
            {
               System.out.println(str);
         	}}
catch(Exception e)
{ System.out.println("Wrong pathname entered! Choose again! ");
}
            break;
    case "2":
             while(a2=='y')
             {
            	 System.out.println("\n-> Other options\n\n"+
            		 "a. Add a file\n"+
            		 "b. Delete a file\n"+
            		 "c. Search a file\n"+
            		 "d. Go to Main Menu");
            	 System.out.print("Choose anyone from a, b, c and d : ");
            	 String choice2=sc.nextLine();
            	 String path;
            	 switch(choice2)
            	 { 
            	 	case "a":
            	 		System.out.print("Enter the directory where you want to add the file : ");
            	 		String dir=sc.nextLine();
            	 		System.out.print("Enter the (filename).(extension) which you want to create : ");
            	 		path=sc.nextLine();
            	 		try 
            	 		{
            	 			File myObj = new File(dir, path);
            	 			if (myObj.exists())
            	 			{
            	 				System.out.println("File already exists. So, cannot create another file of same name. Choose again! ");
            	 			}
            	 			else if (myObj.createNewFile()) 
            	 			{
            	 				System.out.println("File created: " + myObj.getName());
            	 			} 
            	 		}
            	 		catch (Exception e) 
            	 		{
            	 			System.out.println("Wrong directory path entered. Choose again and enter valid path");
            	 			
            	 		}
            	 		break;
            	 	case "b":
            	 		System.out.print("Enter the directory from where you want to delete the file : ");
            	 		String dirr=sc.nextLine();
            	 		System.out.print("Enter the (filename).(extension) which you want to delete : ");
            	 		String pathh=sc.nextLine();
            	 		try {
            	 			File f=null;
            	 			f=new File(dirr,pathh);
            	 			if(f.exists())
            	 			{
            	 				boolean b=f.delete();
            	 				System.out.println("File deleted " );
            	 			}
            	 			else
            	 				System.out.println("File doesn't exist " );	 
            	 			}
            	 		catch (Exception e) 
            	 		{
            	 			System.out.println("Wrong path name or file name entered! Choose again! ");
            	 		}
            	 		break;
            	 	case "c":
            	 		
            	 		System.out.print("Enter the directory path in which you want to search : ");
            	 		String pathdirr = sc.nextLine();
                                                     try{
            	 		File filee = new File(pathdirr);
            	 		String[] fileListt = filee.list();
            	 		if(fileListt==null)
            	 		{System.out.println("Empty directory or wrong directory!\n");}
            	 		else {
            	 			ArrayList<String> arrrlist = new ArrayList<String>();
            	 			for(String str : fileListt) 
            	 			{
            	 				arrrlist.add(str);
            	 			}
            	 			System.out.print("Enter the file you need to search: ");
            	 			String search=sc.nextLine();
            	 			boolean ans = arrrlist.contains(search);
            	 			if (ans) 
            	 				System.out.println("The directory contains "+ search); 
            	 			else
            	 				System.out.println("The directory does not contains " + search);}}
catch(Exception e)
{System.out.println("Wrong file name or directory path entered! Choose again!");}
            	 			break;
            	 	case "d":   
            	 		a2='x';  
            	 		break;
            	 	default :
            	 		System.out.println("You have made an invalid choice, Make a valid choice!");
            	 }
            }
            break;
    
    case "3":
                try{ System.out.println("Sure you want to close the Application? If yes enter 3 again else press any other number: ");
                int sure=sc.nextInt();

               if(sure==3)
{
          	System.out.println("Closing your application... \nThank you!");
   	        System.exit(0);
}
else
           { System.out.println("As you are unsure of your choice! Choose again!");
break;}}
catch(Exception e)
{System.out.println("Enter a numeral value only! Choose again"); break;}
    default : 
            System.out.println("You have made an Invalid choice, Make a valid choice!");
            
    }            
  
}            
sc.close();
}
}