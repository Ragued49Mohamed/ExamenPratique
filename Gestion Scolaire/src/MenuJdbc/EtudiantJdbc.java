package MenuJdbc;

import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantJdbc {
	
	
	public static void CreerEtudiant(String IdEtudiant,String NomEtu,String PrenomEtu,String EmailEtu,String AdresseEtu,String Tel,Date dateNaissEtu)
	{
		// Information d'accès à la base de données

				String url = "jdbc:mysql://localhost/gestionscolaire";
				String login = "root";
				String password = "";
				Connection connection = null;
				Statement statement = null;
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");				
					connection = DriverManager.getConnection(url, login, password);
					
					
					statement = connection.createStatement();
					
					String sql = ("INSERT INTO etudiant (IdEtu,NomEtu,PrenomEtu,EmailEtu,AdresseEtu,TelEtu,DateNaissEtu) "
					          +"VALUES ('" + IdEtudiant + "', '" + NomEtu + "','" + PrenomEtu + "', '" + EmailEtu + "','" +  AdresseEtu + "','" + Tel + "','" + dateNaissEtu + "')");
					statement.executeUpdate(sql);
					
					System.out.println("Bien Ajouter");
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
				catch (ClassNotFoundException e)
				{
					e.printStackTrace();
				}
				finally
				{
					try
					{
						//  Libérer ressources de la mémoire
						connection.close();
						statement.close();
					}
					catch (SQLException e)
					{
						e.printStackTrace();
					}
				}
		
	}
	
		private static void LireEtudiant(String IdEtu) {
			String url = "jdbc:mysql://localhost/gestionscolaire";
			String login = "root";
			String password = "";
			
			Connection connection = null;
			Statement statement = null;
			ResultSet result = null;
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				connection = DriverManager.getConnection(url, login, password);
				statement = connection.createStatement();
				
				String sql = "SELECT * FROM `etudiant` WHERE `IdEtu` =  '" + IdEtu + "'";
				
				result = statement.executeQuery(sql);
				
				System.out.println("L'etudiant :  " + IdEtu);
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					// Libérer ressources de la mémoire
					connection.close();
					statement.close();
				}
				catch (SQLException e)
				{
						e.printStackTrace();
					}
			}
		}
		
		private static void modifierEtudiant(String AncienNom, String NouveauNom)
		{
			String url = "jdbc:mysql://localhost/gestionscolaire";
			String login = "root";
			String password = "";
			
			Connection connection = null;
			Statement statement = null;
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url, login, password);
				
				statement = connection.createStatement();
				
				String sql = "UPDATE `etudiant`" + 
							"SET `NomEtu` = '" + NouveauNom + "'" + "WHERE `NomEtu` = '" + AncienNom + "'";
				
				statement.executeUpdate(sql);
				
				System.out.println(" Modification bien effectuer");
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					connection.close();
					statement.close();
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		private static void supprimerEtdudiant(String IdEtudiant)
		{
			String url = "jdbc:mysql://localhost/gestionscolaire";
			String login = "root";
			String password = "";
			
			Connection connection = null;
			Statement statement = null;
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url, login, password);
				
				statement = connection.createStatement();
				
				String sql = "DELETE FROM `etudiant` WHERE `IdEtu` = '" + IdEtudiant + "'";
				
				statement.executeUpdate(sql);

				System.out.println("Suppression Bien Effectuer");
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					connection.close();
					statement.close();
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		private static void afficherLesEtudiants() {
			String url = "jdbc:mysql://localhost/gestionscolaire";
			String login = "root";
			String password = "";
			
			Connection connection = null;
			Statement statement = null;
			ResultSet result = null;
			
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url, login, password);
				
				statement = connection.createStatement();
				
				String sql = "SELECT * FROM `etudiant`  ";

				System.out.println("Les Etudiants : ");
				result = statement.executeQuery(sql);
				
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					connection.close();
					statement.close();
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
				public static void main(String[] args) {
						
					//CreerEtudiant("M48", "Kada", "Yanis", "M4yanis@gmail.com8", "3 rue berno","0654587562", Date.valueOf("1980-01-04"));
					//LireEtudiant("M49");
					//modifierEtudiant("Ragued", "Kada");
					//supprimerEtdudiant("M49");
					//afficherLesEtudiants();
					
					/*System.out.println("---------------------Menu------------------------");
					         System.out.println("----------1. Ajout Etudiant-----------");
					         System.out.println("----------2. Affiche Etudiant----------");
					         System.out.println("----------3. Modifier Etudiant---------");
					         System.out.println("----------4. Afficher All Etudiants-----");
					         System.out.println("-----Taper votre choix----- !!");
					         */
					        
					
					
					
					
		}
	
	}
