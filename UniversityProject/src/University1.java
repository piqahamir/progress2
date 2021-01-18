import java.util.*;
public class University1 {

	public static void main(String[] args) {
Scanner in = new Scanner (System.in);
		
		System.out.println("Welcome!");
		System.out.println("Here is the main menu for you to choose the service and make an order.");
		System.out.println();
		
		System.out.println("- Main Menu -");
		int[] menu1 = {1, 2, 3, 4, 5};
		String[] menu2 = {"Course Credit Hour", "Employees' Salaries", "Cafe",
							"Medical Fees", "Student Fees"};
		
		//List out the topics
		int i = 0;
		while(i < 1) {
			System.out.println(menu1[0] + ". " + menu2[0]);
			System.out.println(menu1[1] + ". " + menu2[1]);
			System.out.println(menu1[2] + ". " + menu2[2]);
			System.out.println(menu1[3] + ". " + menu2[3]);
			System.out.println(menu1[4] + ". " + menu2[4]);
			i++;
		} 
		System.out.println();
		
		int numtopic;
		
		do {
			System.out.print("Please enter the number of the topic: ");
			numtopic = in.nextInt();
			
			if (numtopic == menu1[0]) {
				System.out.println("You have choose : " + menu2[0]);
				System.out.println();
			}
			else if (numtopic == menu1[1]) {
				System.out.println("You have choose : " + menu2[1]);
				System.out.println();
			}
			else if (numtopic == menu1[2]) {
				System.out.println("You have choose : " + menu2[2]);
				System.out.println();
			}
			else if (numtopic == menu1[3]) {
				System.out.println("You have choose : " + menu2[3]);
				System.out.println();
			}
			else if (numtopic == menu1[4]) {
				System.out.println("You have choose : " + menu2[4]);
				System.out.println();
			}
			else {
				System.out.println();
				System.out.println("- You have entered invalid number -");
				System.out.println("- Please enter the correct number again -");
				System.out.println();
			}
			 
		} while (numtopic != menu1[0] && numtopic != menu1[1] && numtopic != menu1[2] 
				&& numtopic != menu1[3] && numtopic != menu1[4]);
		
		//Enter the selected topic
		if (numtopic == menu1[0]) {
			creditHours();
		}
		else if (numtopic == menu1[1]) {
			employeeSalary();
		}
		else if (numtopic == menu1[2]) {
			cafe();
		}
		else if (numtopic == menu1[3]) {
			medical();
		}
		else if (numtopic == menu1[4]) {
			studentFees();
		}
	}
	
		public static void creditHours() {
			Scanner in= new Scanner (System.in);
			personalbackground();
			detailofcourses();
			coursestaken();
			coursecredithours();	
		}
		
		public static void personalbackground() {
			Scanner in= new Scanner (System.in);
			System.out.print("Enter your name : ");
			String name=in.next();
			
			System.out.print("Enter your IC no : ");
			String icno=in.next();
			
			System.out.print("Enter your age : ");
			String age =in.next();
			
			System.out.print("Gender : ");
			String gender=in.next();
			
			System.out.print("Enter your citizenship: ");
			String citizenship= in.next();
			
			System.out.print("Enter your marital status : ");
			String maritalstatus=in.next();
			
			System.out.print("Enter your Hp: ");
			String hp= in.next();
			
			System.out.println("Customer Personal Background");
			System.out.println();
			
			String pb[][] = {{"Name","IC NO","Age","Gender", "Citizenship","Marital status","Hp"},
						    {name,icno, age,gender,citizenship,maritalstatus,hp}};
			
					System.out.println(pb[0][0]+" : " +pb[1][0]);
					System.out.println(pb[0][1]+" : " +pb[1][1]);
					System.out.println(pb[0][2]+" : " +pb[1][2]);
					System.out.println(pb[0][3]+" : " +pb[1][3]);
					System.out.println(pb[0][4]+" : " +pb[1][4]);
					System.out.println(pb[0][5]+" : " +pb[1][5]);
					System.out.println(pb[0][6]+" : " +pb[1][6]);
					System.out.println();
		}
		
			
			public static void detailofcourses() {
			Scanner in= new Scanner (System.in);
			System.out.println("Details of Courses Provided");
			System.out.println();
			
			String courses1 = "Course 1       : Programming 1 " + System.lineSeparator()
							+ "Course Code    : STA1113" + System.lineSeparator()
							+ "Credit Hours   : 3 " + System.lineSeparator()
							+ "Class Time     : 10.00am-11.30am" + System.lineSeparator()
							+ "Days for Class : Monday and Thursday";
			
			String courses2 = "Course 2       : Mathematics For IT " + System.lineSeparator()
							+ "Course Code    : STQM1203" + System.lineSeparator()
							+ "Credit Hours   : 3 " + System.lineSeparator()
							+ "Class Time     : 2.30pm-4.00pm" + System.lineSeparator()
							+ "Days for Class : Sunday and Tuesday";					
			
			String courses3 = "Course 3       : Statistics For IT " + System.lineSeparator()
							+ "Course Code    : STQS1023"+ System.lineSeparator()
							+ "Credit Hours   : 3 " + System.lineSeparator()
							+ "Class Time     : 8.00am-9.30am" + System.lineSeparator()
							+ "Days for Class : Wednesday and Thursday"; 
			
			
			String coursesdetail[]= {courses1,courses2,courses3};
			for (int i=0; i<3;i++) {
				System.out.println(coursesdetail[i]);
				System.out.println();
			}
			}
			
			public static void coursestaken() {
			Scanner in= new Scanner (System.in);
			System.out.println();
			String courses1 = "Course 1       : Programming 1 " + System.lineSeparator()
							+ "Course Code    : STA1113" + System.lineSeparator()
							+ "Credit Hours   : 3 " + System.lineSeparator()
							+ "Class Time     : 10.00am-11.30am" + System.lineSeparator()
							+ "Days for Class : Monday and Thursday";

			String courses2 = "Course 2       : Mathematics For IT " + System.lineSeparator()
							+ "Course Code    : STQM1203" + System.lineSeparator()
							+ "Credit Hours   : 3 " + System.lineSeparator()
							+ "Class Time     : 2.30pm-4.00pm" + System.lineSeparator()
							+ "Days for Class : Sunday and Tuesday";					

			String courses3 = "Course 3       : Statistics For IT " + System.lineSeparator()
						 	+ "Course Code    : STQS1023"+ System.lineSeparator()
						 	+ "Credit Hours   : 3 " + System.lineSeparator()
						 	+ "Class Time     : 8.00am-9.30am" + System.lineSeparator()
						 	+ "Days for Class : Wednesday and Thursday"; 		

			int coursestaken;
			System.out.println("Courses Taken");
			System.out.print("Enter Total Courses Do You Want To Take : ");
		    int courses = in.nextInt();
			if(courses==1) {
				System.out.print("What Courses Do You Want To Take? ");
				System.out.println("Press 1 for courses1 ; Press 2 for courses2 ; Press 3 for courses3");
				System.out.println();		
				System.out.print("1. What Courses Do You Want To Take : ");
				System.out.println();	
				coursestaken =in.nextInt();
				if(coursestaken==1) {
					System.out.println(courses1);
				}
				else if(coursestaken==2) {
					System.out.println(courses2);
				}
				else if(coursestaken==3) {
					System.out.println(courses3);
				}
				else 
					System.out.println("Please enter valid number.");
				System.out.println();
				System.out.println("Congratulations. You are enrolled successfully!");
				
				System.out.println();	
				
			}else if(courses==2) {
				System.out.println("Press 1 for courses1 ; Press 2 for courses2 ; Press 3 for courses3");
				System.out.print("1. What Courses Do You Want To Take : ");
				coursestaken =in.nextInt();
				if(coursestaken==1) {
					System.out.println(courses1);
				}
				else if(coursestaken==2) {
					System.out.println(courses2);
				}
				else if(coursestaken==3) {
					System.out.println(courses3);
				}
				else 
					System.out.println("Please enter valid number.");
				
				System.out.println();	
				System.out.print("2. What Courses Do You Want To Take : ");
				coursestaken =in.nextInt();
				if(coursestaken==1) {
					System.out.println(courses1);
				}
				else if(coursestaken==2) {
					System.out.println(courses2);
				}
				else if(coursestaken==3) {
					System.out.println(courses3);
				}
				else 
					System.out.println("Please enter valid number.");
				System.out.println();
				System.out.println("Congratulations. You are enrolled successfully!");
				System.out.println();		
			
				
			}else if(courses==3) {
				System.out.println("Press 1 for courses1 ; Press 2 for courses2 ; Press 3 for courses3");
				System.out.print("1. What Courses Do You Want To Take : ");
				coursestaken =in.nextInt();
				if(coursestaken==1) {
					System.out.println(courses1);
				}
				else if(coursestaken==2) {
					System.out.println(courses2);
				}
				else if(coursestaken==3) {
					System.out.println(courses3);
				}
				else 
					System.out.println("Please enter valid number.");
				System.out.println();	
				
				
				System.out.print("2. What Courses Do You Want To Take : ");
				coursestaken =in.nextInt();
				if(coursestaken==1) {
					System.out.println(courses1);
				}
				else if(coursestaken==2) {
					System.out.println(courses2);
				}
				else if(coursestaken==3) {
					System.out.println(courses3);
				}
				else 
					System.out.println("Please enter valid number.");
				System.out.println();	
				
				System.out.print("3. What Courses Do You Want To Take : ");
				coursestaken =in.nextInt();
				if(coursestaken==1) {
					System.out.println(courses1);
				}
				else if(coursestaken==2) {
					System.out.println(courses2);
				}
				else if(coursestaken==3) {
					System.out.println(courses3);
				}
				else 
					System.out.println("Please enter valid number.");
				System.out.println();
				System.out.println("Congratulations. You are enrolled successfully!");
			}else 
					System.out.println("Please enter valid number. ");
			}
			public static void coursecredithours() {
				Scanner in= new Scanner (System.in);
				System.out.println();
				System.out.println("Calculation of Total Credit Hours");
				System.out.println();	
				System.out.print("Enter your total amount of courses taken:  ");
				int courses = in.nextInt();
				    System.out.println("Total Number of Courses Enrolled : " + courses);
				    System.out.println();	
					int coursescredit = (courses*3);
					System.out.println("Total Courses Credit Hours       : " + coursescredit);
				
					
	}
		
		public static void employeeSalary() {
			Scanner in = new Scanner (System.in);
			
			printbackground();
			printserviceprovide();
			printquantityservice();
			printconfirmservice();
			
			in.close();
		}
		
			public static void printbackground() {
				Scanner in = new Scanner (System.in);
			
				System.out.println("1. Personal Background.");
				
				System.out.println("Please enter your personal information here.");
				System.out.print("Enter your name     : ");
				String name1 = in.next();
				System.out.print("Enter your college  : ");
				String college1 = in.next();
				System.out.print("Enter your school   : ");
				String school1 = in.next();
				System.out.print("Enter your job title: ");
				String job1 = in.next();
				System.out.println();	
				
				String[][] personal = { {"Name\t : ", "College\t : ", "School\t : ", "Job Title: "},
										{name1, college1, school1, job1} };
				
				printbackground(personal);
				
				System.out.println();
			}
				
			public static void printbackground(String[][]x) {
				System.out.println(x[0][0] + x[1][0]);
				System.out.println(x[0][1] + x[1][1]);
				System.out.println(x[0][2] + x[1][2]);
				System.out.println(x[0][3] + x[1][3]);
			}	
			
			public static void printserviceprovide() {
				Scanner in = new Scanner (System.in);
				
				System.out.println("2. Services Provided And Service Charge.");
				
				System.out.println("We provide:");
				
				String[] services1 = {"Service No.1", "Service No.2", "Service No.3"};
				String[] services2 = {"Count Monthly Basic Salary", "Check Allowance", "Total Of The Salary"};
				String[] services3 = {"RM10 per hour", "RM12 per hour", "RM15 per hour"};
				
				for(int i = 0; i < services1.length; i++) {
					System.out.println(services1[i] + ": " + services2[i] + " - " + services3[i]);
				}
			
			}
			
			public static void printquantityservice() {
				Scanner in = new Scanner (System.in);
				
				System.out.println();
				System.out.println("3. Order Services");
				
				System.out.println("Please enter your order here.");
				
				int servicenum;
				int servicehour;
				char confirm;
				
				do {
					System.out.print("Enter the service number you want to order: ");
					 servicenum = in.nextInt();
					System.out.print("Enter the service hour you want to order: ");
					 servicehour = in.nextInt();
					System.out.print("Confirm your order (Y/N): ");
					 confirm = in.next().charAt(0);
					 
					 if(confirm != 'Y' && confirm == 'N') {
						 System.out.println("Please re-enter your order.");
					 }
					 
					System.out.println();
					 
				} while (confirm != 'Y');
				
					if (servicenum == 1) {
						System.out.println("Service Ordered : Count Monthly Basic Salary");
					    System.out.println("Hours Ordered   : " + servicehour + " hours");
					    System.out.println("Total Charge    : RM" + servicehour*10);
					    
					} 
					
					else if (servicenum == 2) {
						System.out.println("Service Ordered : Check Allowance");
						System.out.println("Hours Ordered   : " + servicehour + " hours");
						System.out.println("Total Charge    : RM" + servicehour*12);
					} 
					
					else if (servicenum == 3) {
						System.out.println("Service Ordered : Total Of The Salary");
						System.out.println("Hours Ordered   : "+ servicehour + " hours");
						System.out.println("Total Charge    : RM" + servicehour*15);
					} 
					
					else {
						System.out.println("The number you entered is not in the services.");
					} 
				
				System.out.println();
			}
			
			public static void printconfirmservice() {
				Scanner in = new Scanner (System.in);
			
				char order;
			    System.out.print("Do you want to add-on order? (Y/N): ");
				order = in.next().charAt(0);
				if(order == 'Y') {
					printquantityservice();
				}
				
				else if(order != 'Y') {
					System.out.println();
				}
				
				char confirmPayment;
				System.out.print("Confirm your all order (Y/N): ");
				confirmPayment = in.next().charAt(0);
				
				if(confirmPayment == 'Y' || confirmPayment == 'y') {
					System.out.println("Please proceed to the counter for payment.");
				}
				
				else {
					System.out.println("Please exit and re-enter the information.");
				}
				
	}
			
		public static void medical() {
			Scanner in = new Scanner (System.in);
			
			System.out.println("Personal Background" );
			System.out.print("Enter your name: ");
			String name = in.next();
			
			System.out.print("Enter your gender: ");
			String str = in.next();
			char gender = str.charAt(0);
			
			System.out.print("Enter your age: ");
			int age = in.nextInt();
			
			System.out.print("Enter your IC number: ");
			String ic = in.next();
			
			System.out.print("Enter your matric number: ");
			int matric = in.nextInt();
			
			System.out.print("Enter your phone number: ");
			String phone = in.next();
			
			System.out.print("Enter your email: ");
			String email = in.next();
			
			System.out.println("Services: ");
			String[]service= {"Diagnosis", "Treatment", "Dental", "Vaccination", "Immunisation"};
			System.out.println("Enter '0' for 'DIAGNOSIS' , '1' for ' TREATMENT' , '2' for 'DENTAL' , '3' for 'VACCINATION' and '4' for 'IMMUNISATION'");
			int services = in.nextInt();
			
			System.out.println("Charges:");
			
			if(services == 0) {
			System.out.println("for "+service[0]);
			System.out.println("Enter how many hours do you want to use our service: ");
			double hours = in.nextDouble();
			if(hours == 1) {
				System.out.println("The charge is RM 20");
			}else if(hours <= 2 ) {
				System.out.println("The charge is RM 25");
			}else {
				System.out.println("The charge is RM 30");
			}
		} else if (services == 1) {
			System.out.println("for "+service[1]);
			System.out.println("Enter how many hours do you want to use our service: ");
			double hours1 = in.nextDouble();
			if(hours1 <= 1) {
				System.out.println("The charge is RM 25");
			}else if(hours1 <= 2 && hours1 > 1) {
				System.out.println("The charge is RM 30");
			}else {
				System.out.println("The charge is RM 35");
			}
		}else if (services == 2) {
			System.out.println("for "+service[2]);
			System.out.println("Enter how many hours do you want to use our service: ");
			double hours2 = in.nextDouble();
			if(hours2 <= 1) {
				System.out.println("The charge is RM 35");
			}else if(hours2 <= 2 && hours2 > 1) {
				System.out.println("The charge is RM 40");
			}else {
				System.out.println("The charge is RM 45");
			}
		}else if (services == 3) {
			System.out.println("for "+ service[3]);
			System.out.println("Enter how many hours do you want to use our service: ");
			double hours3 = in.nextDouble();
			if(hours3 <= 1) {
				System.out.println("The charge is RM 45");
			}else if(hours3 <= 2 && hours3 > 1) {
				System.out.println("The charge is RM 50");
			}else {
				System.out.println("The charge is RM 55");
			}
		} else if (services == 4) {
			System.out.println("for "+service[4]);
			System.out.println("Enter how many hours do you want to use our service: ");
			double hours4 = in.nextDouble();
			if(hours4 <= 1) {
				System.out.println("The charge is RM 45");
			}else if(hours4 <= 2 && hours4 > 1) {
				System.out.println("The charge is RM 50");
			}else {
				System.out.println("The charge is RM 55");
			} 
		} else
			System.out.println("Please enter the correct code, thank you.");

	}
	
		public static void cafe() {
			Scanner in = new Scanner (System.in);
			
			System.out.println("\t WELCOME TO THE CAFE!");
			
			
				//for loop
				for (int i=0; i<=20; i++) {
					System.out.print("* " );
				}
				
				System.out.println();
	        
				//method call
				title();
				personalDetail();
				printOrder();
	        
		}
			public static void personalDetail() {
				
				Scanner in = new Scanner (System.in);
				
				System.out.print("Enter Your Age: ");
				int age = in.nextInt();
				System.out.print("Are you a 'student' or 'worker' : ");
				String personal;
				personal = in.next();
	        
		}
			public static void title() {
				Scanner in = new Scanner (System.in);
				String[] title = {"Mr", "Mrs", "Miss"};
			
				System.out.print("Enter Your Name : ");
				String name = in.nextLine();
				System.out.print("Are you 'Mr', 'Mrs', or 'Miss' ? ");
				System.out.print("Enter \n '0' for 'Mr' \n '1' for 'Mrs' \n '2' for 'Miss' : ");
				int title1 = in.nextInt();
				System.out.println();
			
					if (title1 == 0) {
						System.out.println("Hi " + title[0] + " " + name + "!");
					}else if (title1 == 1) {
						System.out.println("Hi " + title[1] + " " + name + "!");
					}else if (title1 == 2) {
						System.out.println("Hi " + title[2] + " " + name + "!");
					}else
						System.out.println("Please Enter your code again");
					
					System.out.println();
			}
		
				public static void printOrder() {
				Scanner in = new Scanner (System.in);
				
					
					System.out.print("How many order do u want to take? ");
					int order = in.nextInt();
			
													    
						System.out.println();
						System.out.println("---------------------------------------------");
						System.out.println(">>>>Drink only RM2 and Eat only for RM4<<<<");
						System.out.println("---------------------------------------------");
						System.out.println();
	        
	      
						System.out.print("Do you want to order? (Y/N): ");
						char order1 = in.next().charAt(0);
						System.out.println("To proceed in making order, press 'n' , if not press any button");
						char ord = in.next().charAt(0);
						
						while (ord == 'n') {
						//do while loop
						do { 
							System.out.print("What do you want from our service 'drink only(D)' or 'eat only (E)' or both(B) ?: ");
							char service = in.next().charAt(0);
							if (service == 'd' || service == 'D'){
								System.out.print("What is the quantity of your drink : ");
								double quantityDrink = in.nextDouble();
								double totalPrice1 = quantityDrink*2;
								System.out.println("Your total price is RM " +totalPrice1);
							} else if (service == 'e' || service == 'E')  {
								System.out.print("Please enter your quantity of meal : ");
								int quantityMeal = (int) in.nextDouble();
								double totalPrice2 = quantityMeal*4;
								System.out.println("Your total price is RM " +totalPrice2);
							} else if (service == 'b' || service == 'B'){
								System.out.print("What is the quantity of your drink : ");
								int quantityDrink = in.nextInt();
								System.out.print("What is the quantity of your meal : ");
								int quantityMeal = in.nextInt();
								double totalDrink = quantityDrink*2;
								double totalMeal = quantityMeal*4;
								double totalPrice3 = totalDrink+totalMeal;
								System.out.println();
								System.out.println("Your total price is RM " +totalPrice3);
							}
							System.out.print("Do you still want to order? (Y/N): ");
								order1 = in.next().charAt(0);
						} while (order1 == 'Y'|| order1 == 'y');        		        	            
	      	
						System.out.println("Are you sure?");
						System.out.println("Enter 'y' for 'YES' and 'n' for 'NO' ");
						ord = in.next().charAt(0);
						
			}
				
				System.out.println("THANK YOU, PLEASE COME AGAIN");
				System.out.println("AND DON'T FORGET TO ENJOY YOUR FOODS AND DRINKS!");
		}
			public static void studentFees() {
				int semester,age,matric;
				
				Scanner in = new Scanner (System.in);
				
				for (int i=0; i<=20; i++) {
					System.out.print("- ");
				}
				System.out.println();
				System.out.println("\t STUDENT FEES");
				for (int i=0; i<=20; i++) {
					System.out.print("- ");
				}
				System.out.println();

				System.out.print("Your name: ");
				String name = in.nextLine();
				
				System.out.print("Your Matric Number: ");
				matric = in.nextInt();
				
				System.out.print("Your semester: ");
				semester = in.nextInt();
				
				System.out.print("Your program: ");
				String program = in.next();
				
				System.out.println();
				System.out.println("********************************************");
				System.out.println("\t ----Your Details----");
				System.out.println("\t Name: " + name);
				System.out.println("\t Matric Number: " + matric);
				System.out.println("\t Semester: " + semester);
				System.out.println("\t Program: " + program);
				System.out.println("********************************************");
				System.out.println();
			
				double sport = 30.00;
				double dental = 20.00;
				double health = 30.00;
				double library = 35.00;
				double welfare = 13.00;
				double tuition = 660.00;
				double registration = 634.00;
				double ICT = 75.00;
				double transportation = 80.00;
				double medical_checkup = 80.00;
				double retake = 100.00;
				double i;
				double sum1 = sport + dental + health + library + welfare + tuition + registration + ICT + transportation + medical_checkup + retake;
				
				System.out.print("Please choose the items: \n '1' for SPORT \n '2' for DENTAL \n '3' for HEALTH \n '4'  LIBRARY \n '5' for WELFARE \n '6' for TUITION \n '7' for REGISTRATION \n '8' for ICT \n '9' for TRANSPORTATION \n '10' for  MEDICAL CHECK-UP \n '11' for RETAKE \nEnter ther code:");
				int description = in.nextInt();
				System.out.println();
				if(description == 1 ) {
					System.out.println("End Year Balance: " + sport);
				}else if (description == 2 ) {
					System.out.println("End Year Balance: " + dental);
				}else if (description == 3 ) {
					System.out.println("End Year Balance: " + health);
				}else if (description == 4 ) {
					System.out.println("End Year Balance: " + library);
				}else if (description == 5 ) {
					System.out.println("End Year Balance: " + welfare);
				}else if (description == 6 ) {
					System.out.println("End Year Balance: " + tuition);
				}else if (description == 7 ) {
					System.out.println("End Year Balance: " + registration);
				}else if (description == 8 ) {
					System.out.println("End Year Balance: " + ICT);
				}else if (description == 9 ) {
					System.out.println("End Year Balance: " + transportation);
				}else if (description == 10 ) {
					System.out.println("End Year Balance: " + medical_checkup);
				}else if (description == 11 ) {
					System.out.println("End Year Balance: " + retake);
				}else
					System.out.println("Please enter the correct code, thank you");
				
				System.out.println("------Question 1-------");
				System.out.println("Welcome to join UUM");
				
				String sem1[] = {"Sport, Dental, Health, Library, Tuition, Welfare, Registration, Computer/ICT, Transportation, Medical Check-Up"};
				String price1[] = {"30,20,30,35,660,13,634,75,80,80"};
				
				System.out.println("\n" + "Description of fees: ");
				for (String fees : sem1) {
					System.out.println(fees);
					
				System.out.println("\n" + "Price of fees: ");
				for (String price : price1) {
					System.out.println(price);
				}
			}
				
				System.out.println("------Question 2-------");
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter 1 if you retaking Exam && Enter 0 if NOT retaking Exam" );
		        int exam = scan.nextInt();
				if (exam == 1) {
				System.out.println("The fees will be additional RM50");
				} else
				System.out.println("No additional charges");
				
				System.out.println("------Question 3-------");
				welcome();
				newstudent(30,20,30,35,660,13,634,75,80,80);
				registeredstudent(1657,634,80);
				retakestudent(1657,634,80,50);

				}
				public static void welcome() {
					System.out.println("\n" + "Welcome to study in UUM");
				}
			
				public static void newstudent(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
					System.out.println("Total student fees (New Student):" + (a + b + c + d + e + f + g + h + i + j));
				}
				public static void registeredstudent(int a, int b, int c) {
					System.out.println("Total student fees (Sem 2 above):" + (a - b - c));
				}
				public static void retakestudent(int a, int b, int c, int d) {
					System.out.println("Total student fees (Student retaking exam):" + ((a - b - c) + d));


	}

}
