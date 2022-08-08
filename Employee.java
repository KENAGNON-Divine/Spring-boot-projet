/*importation du package modèle. C'est dans ce package que se font
 la création des classes java et des entités.*/
package net.javaguides.springboot.model;

/*importation des bibliothèques java indispensables pour la création de la table employees
depuis la classe Employee.java*/
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*@Entity sert à specifier au code que la la classe qui sera créée
correspond à une table @Table(name = "nomTable") dans la base de données.*/
@Entity

//@Table pour spécifier le nom de la table qui sera créée dans la base de données.
@Table(name = "employees")
public class Employee {

    @Id
   //la ligne suivante sert à faire l'auto incrémentation de l'id (clé primaire) dans la base de données
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

     //@Column pour spécifier le nom des colonnes
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id")
    private String emailId;

 //Constructeurs
    public Employee() {

    }

    public Employee(String firstName, String lastName, String emailId) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    //getteurs et setteurs pour chaque attributs de la classe
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}