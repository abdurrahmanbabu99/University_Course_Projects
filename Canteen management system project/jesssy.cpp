#include<iostream>
using namespace std;

/* class Person
{
  protected:
      string Name;
      string Id;
      string Phn_num;
      string Address;
  public:
  Person(string n,string id,string Phn_no,string add){





      Name=n;
      Id=id











      Phn_num=Phn_no;
      Address=add;
    }
    void setName(string n){
    Name=n;
    }
    string getName(){
    return Name;
    }
    void setId(string id){
    Id=id;
    }
    string getId(){
    return Id;
    }
     void setPhn_num(string phn_no){
    Phn_num=phn_no;
    }
    string getPhn_num(){
    return Phn_num;
    }
     void setAddress(string add){
    Address=add;
    }
    string getAddress(){
    return Address;
    }




};*/
class Canteen{
protected:
    string canteenId;
    string canteenName;
    string address;
    string houseNo;
    string streetName;
    string city;



public:
    Canteen()
    {
        cout <<endl;
    }
    Canteen(string cId, string cName, string a, string hNo, string sName, string c)
    {
        cout << "Valued constructor" << endl;
        canteenId = cId;
        canteenName = cName;
        address = a;
        houseNo = hNo;
        streetName = sName;
        city = c;
    }
    void setCanteenId(string cId)
    {
        canteenId = cId;
    }
    string getCanteenId()
    {
        return canteenId;
    }
    void setCanteenName(string cName)
    {
        canteenName = cName;
    }
    string getCanteenName()
    {
        return canteenName;
    }
    void setAddress(string a)
    {
        address = a;
    }
    string getAddress()
    {
        return address;
    }
    void setHouseNo(string hNo)
    {
        houseNo = hNo;
    }
    string getHouseNo()
    {
        return houseNo;
    }
    void setStreetName(string sName)
    {
        streetName = sName;
    }
    string getStreetName()
    {
        return streetName;
    }
    void setCity(string c)
    {
        city = c;
    }
    string getCity()
    {
        return city;
    }



    void showInfo()
    {
        cout << "=======> Canteen Details <=========" << endl;
        cout << "CanteenId        : " << canteenId << endl;
        cout <<"CanteenName      : " << canteenName << endl;
        cout << "Address          : " << address << endl;
        cout << "HouseNo          : " << houseNo << endl;
        cout << "StreetName       : " << streetName << endl;
        cout << "City             :" << city << endl;
        cout << "================================" << endl;
    }
};



class CUSTOMER : public Canteen
 {
protected:
    string customer_id;
    string customer_name;
    string customer_email;
    string customer_password;

public:
      CUSTOMER()
    {
        cout  << endl;
    }
    Customer(string cId, string cName, string cEmail, string cPass)
    {



        customer_id = cId;
        customer_name = cName;
        customer_email = cEmail;
        customer_password = cPass;
    }
    void setCustomerId(string cId)
    {
        customer_id = cId;
    }
    string getCustomerId()
    {
        return customer_id;
    }
    void setCustomerName(string cName)
    {
        customer_name = cName;
    }
    string getCustomerName()
    {
        return customer_name;
    }
    void setCustomerEmail(string cEmail)
    {
        customer_email = cEmail;
    }
    string getCustomerEmail()
    {
        return customer_email;
    }
    void setCustomerPassword(string cPass)
    {
        customer_password = cPass;
    }
    string getCustomerPassword()
    {
        return customer_password;
    }



    void showInfo()
    {
        cout << "=======> Customer Details <=========" << endl;
        cout << "CustomerId        : " << customer_id << endl;
        cout << "CustomerName      : " << customer_name << endl;
        cout << "CustomerEmail         : " << customer_email << endl;
        //cout << "CustomerPassword      : " << customer_password << endl;
        cout << "================================" << endl;
    }
};
class TEACHER : public CUSTOMER
{
protected:
    string teacher_name="Forkan";
    string teacher_id="T-2020";
    string teacher_email="forkan@gmail.com";
    string teacher_password="1111";
public:
   Teacher(string name,string id, string email, string password)
    {



        teacher_name=name;
        teacher_id = id;
        teacher_email = email;
        teacher_password = password;
    }
   /* void setteachername(string name){
        teacher_name=name;
    }
    string getteachername(){
    return teacher_name;
    }*/
    void setteacherid(string id){
        teacher_id=id;
    }
    string getteacherid(){
    return teacher_id;
    }
    void setteacheremail(string email){
        teacher_email=email;
    }
    string getteacheremail(){
    return  teacher_email;
    }
    void setteacherpassword(string password){
        teacher_password=password;
    }
    string getteacherpassword(){
    return  teacher_password;
    }



    void showteacher(){
        cout<<"----Teachers Details----"<<endl;
        cout<<"Name:"<<teacher_name<<endl;
        cout<<"ID:"<<teacher_id<<endl;
        cout<<"Email:" <<teacher_email<<endl;
        //cout<<"Password: "<<teacher_password<<endl;



        cout<<"----------------------------"<<endl;
    }




};



  class STUDENT : public TEACHER{






protected:
    string Student_name="Prosit";
    string Student_id="S-2020";
    string Student_email="prosit@aiub.edu";
    string Student_password="2222";
public:
   Student(string Sname, string Sid, string Semail, string Spassword)
    {
       Student_name= Sname;
        Student_id = Sid;
        Student_email = Semail;
        Student_password = Spassword;
    }
    void setStudentname(string Sname){
        Student_name= Sname;
    }
    string getStudentname(){
    return Student_name;
    }
    void setStudentid(string Sid){
        Student_id = Sid;
    }
    string getStudentid(){
    return Student_id;
    }
    void setStudentemail(string Semail){
       Student_email = Semail;
    }
    string getStudentemail(){
    return Student_email ;
    }
    void setStudentpassword(string Spassword){
      Student_password = Spassword;
    }
    string getStudentpassword(){
    return  Student_password;
    }



    void showstudent(){
        cout<<"----Student Details----"<<endl;
        cout<<"Name: "<<Student_name<<endl;
        cout<<"ID:"<<Student_id<<endl;
        cout<<"Email:" <<Student_email<<endl;
        //cout<<"Password: "<<Student_password<<endl;



        cout<<"----------------------------"<<endl;
    }




};


int main()
{


    string cus_type;
    cout<<"Enter Your Customer Type:"<<endl;
    cin>> cus_type;
     TEACHER T1;
     STUDENT S1;
    string id,pass,email;

   /*cout<<"Enter Your Customer Name:"<<endl;
   cin>> name;*/

    cout<<"Enter Your Customer Id:"<<endl;

    cin>> id;
    cout<<"Enter Your Password:"<<endl;
   cin>> pass;
   if(id==T1.getteacherid() &&  pass == T1.getteacherpassword()){

    cout<<"Login Successfully:"<<endl;
    T1.showteacher();

   }
   else{
    cout<<"Please Enter Again:"<<endl;
   }
   if(id==S1.getStudentid() && pass== S1.getStudentpassword()){

     cout<<"Login Successfully:"<<endl;
     S1.showstudent();
   }
   else{
     cout<<"Please Enter Again:"<<endl;

   }



  /*cout<<"Admin Id:"<<endl;
  cin>> id;
  cout<<"Enter Your Password:"<<endl;
  cin>> pass;
  if(id==A1.getADMINId() && pass==A1.getADMINpassword()){





    cout<<"Login Successfully:"<<endl;
     A1.showInfo();





  }
  else
    cout<<"Please Enter Again:";





    Canteen C1;
    string name
    C1.setCanteenId("1223455");
    C1.setCanteenName("Azmir store");
    C1.setAddress("Abdullah khan badurtala");
    C1.setHouseNo("407");
    C1.setStreetName("Kapashgola road");
    C1.setCity("Chittagong");



    C1.showInfo();




     CUSTOMER c1;
     c1.setCustomerName("Rezwan");
     c1.setCustomerId("12345");
     c1.setCustomerEmail("Rezwan123");
     c1.setCustomerPassword("1234");
     c1.showInfo();



     TEACHER t1;
     t1.setteachername("Md Asif");
     t1.setteacherid("4321");
     t1.setteacherage("30 years");
     t1.setteacherphonenumber("0177723232");
     t1.showteacher();



     STUDENT s1;
     s1.setStudentname("Md israf");
     s1.setStudentid("4521");
     s1.setStudentage("20 years");
     s1.setStudentphonenumber("0177724562");
     s1.showstudent();

 */


}

