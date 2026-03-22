import java.util.Scanner;
class JDBCDriverClass
{
	public static void main(String[] args){
		JDBCOperations j=new JDBCOperations();
		int res=0;
		String query="";
		System.out.println("1. create table , 2. Inset into table, 3.select table");
		System.out.println("Enter your option");
		Scanner s=new Scanner(System.in);
		int opt=s.nextInt();
		switch(opt){
		case 1:
			query="create table studinfo(id int, name varchar(20),qual varchar(20))";
			res =j.insertDataToDB(query);
			//4. Getting Results
			if(res == 1)
				System.out.println("1 row inserted successfully");
			else
				System.out.println("Unsuccessful");
			break;

		case 2:
			query="insert into studinfo values(2,'Neelima','BTech')";
			res=j.insertDataToDB(query);
			//4. Getting Results
			if(res == 1)
				System.out.println("1 row inserted successfully");
			else
				System.out.println("Unsuccessful");
			break;
		}
		

	}
}