 package Matriz;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
 
 		Scanner sc = new Scanner(System.in);
 		
 		int m = 0;
 		int s = 0;
 		int d = 0;
 		int i = 0;
  		int ud = 0;
 		int prid = 0;
  		double bx = 0;
 		int ano = 0;
 		int flagi = 0;
  		String dia = "  ";
  		String mes = " ";
  		
   		System.out.print("Digite ano: ");
 		ano = sc.nextInt();
 		System.out.println();

 		bx = ano % 4;
  		
 		System.out.print("Digite primeiro dia do ano: ");
 		prid = sc.nextInt();
 		System.out.println();
 		
  		for (m = 1 ; m < 13 ; m ++)
  		{	if (m == 1)
			{	mes = "Janeiro";
				ud = 31;		}
			if (m == 2)
	 		{	mes = "Fevereiro";
	 			if (bx == 0)
	 			{	ud = 29;	}
	 			else
	 			{	ud = 28;	}
	 		}
			if (m == 3)
	 		{	mes = "Março";
	 			ud = 31;		}
			if (m == 4)
	 	 	{	mes = "Abril";
	 	 		ud = 30;		}
			if (m == 5)
	 		{	mes = "Maio";
	 			ud = 31;		}
			if (m == 6)
			{	mes = "Junho";
	 	 		ud = 30;		}
			if (m == 7)
			{	mes = "Julho";
	 	 		ud = 31;		}
			if (m == 8)
	 		{	mes = "Agosto";
	 			ud = 31;		}
	 	 	if (m == 9)
	 	 	{	mes = "Setembro";
	 	 		ud = 30;		}
			if (m == 10)
	 		{	mes = "Outubro";
	 			ud = 31;		}
			if (m == 11)
	 		{	mes = "Novembro";
	 			ud = 30;		}
			if (m == 12)
	 	 	{	mes = "Dezembro";
	 	 		ud = 31;		}

			{	System.out.println();
				System.out.println("        " + mes + " " + ano);
				System.out.println("DOM SEG TER QUA QUI SEX SAB");
			}
			
 		String [][] semana = new String[7][8];
  		
 		for (s = 5; s < 7 ; s ++)
 		{	for (i = 1 ; i < 8 ; i ++)
 			{	semana[s][i] = "";
 			}
 		}
 		
   		for (s = 1 ; s < 7 ; s ++)
  		{ 	if (s == 1)
			{	for (i = prid ; i < 8 ; i ++)
 				{	d += 1;
 					if (d < 10)
 					{	dia = "0" + d;		}
 					if (d > 9)
 					{	dia = "" + d;		}
    				semana[s][i] = dia;
   					if (i == 7)
  					{	flagi = 0;
  			    		if (flagi == 0) 
  			    		{	if (semana[s][1] != null)
   			    			{	System.out.println(" "
   			    				+ semana[s][1] + "  " + semana[s][2] + "  "
  				    			+ semana[s][3] + "  " + semana[s][4] + "  "
  				    			+ semana[s][5] + "  " + semana[s][6] + "  "
  				    			+ semana[s][7]);
   				    			flagi = 1;
  				    		}
  				    	}
  				    	if (flagi == 0)	
  				    	{	if (semana[s][1] == null && semana[s][2] != null)
  				    		{	System.out.println("     " 
  				    			+ semana[s][2] + "  " + semana[s][3] + "  "
  				    			+ semana[s][4] + "  " + semana[s][5] + "  " 
  				    			+ semana[s][6] + "  " + semana[s][7]);
  				    			flagi = 1;
  				    		}	
  				    	}
  				    	if (flagi == 0)
  				    	{	if (semana[s][2] == null && semana[s][3] != null)
  				    		{	System.out.println("         " 
  				    			+ semana[s][3] + "  " + semana[s][4] + "  " 
  				    			+ semana[s][5] + "  " + semana[s][6] + "  "
  				    			+ semana[s][7]); 							
  				    			flagi = 1;
  				    		}
  				    	}
  				    	if (flagi == 0)
  				    	{	if (semana[s][3] == null && semana[s][4] != null)
  				    		{	System.out.println("             " 
  				    			+ semana[s][4] + "  " + semana[s][5] + "  "
  				    			+ semana[s][6] + "  " + semana[s][7]);
  				    			flagi = 1;
  				    		}
  				    	}
  				    	if (flagi == 0)
  				    	{	if (semana[s][4] == null && semana[s][5] != null)
  				    		{	System.out.println("                 " 
  				    			+ semana[s][5] + "  " + semana[s][6] + "  "
  				    			+ semana[s][7]);
  				    			flagi = 1;
  				    		}
  				    	}
  				    	if (flagi == 0)
  				    	{	if (semana[s][5] == null && semana[s][6] != null)
  				    		{	System.out.println("                     " 
  				    			+ semana[s][6] + "  " + semana[s][7]);
  				    			flagi = 1;
  				    		}
  				    	}  				    		
  				    	if (flagi == 0)
  				    	{	if (semana[s][6] == null && semana[s][7] != null)
  				    		{	System.out.println("                         "
  				    			+ semana[s][7]); 	
  				    		}  							
  				    	}
  					}
 				}
 			}
 			if (s > 1)
 			{	for (i = 1 ; i < 8 ; i ++)
 				{	d += 1;
					if (d < 10)
 					{	dia = "0" + d;		}
 					if (d > 9)
 					{	dia = "" + d;		}
  					if (d <= ud)
 					{	semana[s][i] = dia;
 					}
  					
					if (d == ud)
    			 	{	System.out.println(" " 
   		  	   			+ semana[s][1] + "  " + semana[s][2] + "  "
   		        		+ semana[s][3] + "  " + semana[s][4] + "  "
   		 	    		+ semana[s][5] + "  " + semana[s][6] + "  "
   		 	    		+ semana[s][7]);
    			 		prid = i;
    			 		i = 15;
    			 	}
    			 	if (i == 7)
    			 	{	System.out.println(" " 
       		  	   		+ semana[s][1] + "  " + semana[s][2] + "  "
       		        	+ semana[s][3] + "  " + semana[s][4] + "  "
       		 	    	+ semana[s][5] + "  " + semana[s][6] + "  "
       		 	    	+ semana[s][7]);
    			 		if (s == 6)
    			 		{	prid = i;
        					i = 15;
    			 		}
       			 	}
    			 		
    			 	if (i == 15 && m < 12)
    			 	{	System.out.println();
      			 		char sn = 'f';
    			 		do
    			 		{	System.out.print("Próximo mes (s/n): ");
     			 			sn = sc.next().charAt(0);
    			 		}	while (sn != 'S' && sn != 'N');
    			 		System.out.println();	
    			 		if (sn == 'N')
    			 		{	m = 15;
    			 		}
 
    			 		if (sn == 'S')
    			 		{	s = 15;
    			 			d = 0;
    			 			prid += 1;
    			 			if (prid > 7)
    			 			{	prid -= 7;
    			 			}
     			 		}
    			 	}
 				}	
 			}	
 		}
 		}
   					 					
  		sc.close();
 		
	}
}

