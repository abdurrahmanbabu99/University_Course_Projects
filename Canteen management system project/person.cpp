#include<iostream>
using namespace std;

class Person{
  protected:
      string Name;
      string Id;
      string Phn_num;
      string Address;
  public:
  /*Person(string n,string id,string Phn_no,string add){

      Name=n;
      Id=id;
      Phn_num=Phn_no;
      Address=add;
    }*/
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

};
class Customer : public Person
{
    private:
    string customer_type;

    public:

     void setName(string c_n){
       Name=c_n;
    }
   string getName(){
     return Name;
   }
   void setcType(string c_t){
       customer_type=c_t;
    }
   string getcType(){
     return customer_type;
   }


    void setId(string c_id){
       Id=c_id;
    }
   string getId(){
     return Id;
   }

    void setPhn_num(string c_phn_num){
    Phn_num=c_phn_num;
    }
   string getPhn_num(){
     return Phn_num;
   }
   void showDetails(){
     cout<<"======================================="<<endl;
      cout<<"Customer Type      :"<<customer_type<<endl;
      cout<<"Customer Name      :"<< Name<<endl;
      cout<<"Customer Id        :"<< Id<<endl;
      cout<<"Customer Phone No  :"<< Phn_num<<endl;
      cout<<"======================================="<<endl;

   }
};
  /* class Teacher : public Customer, public Person{
     protected:
    string t_n;
    string t_id;
    string t_phn_num;

     public:
     /*void setTeacher(string tn,string tid,string tPhn_nom){
       t_n=tn;
       t_id=tid;
     t_phn_nom=tPhn_nom;

       }
     void setT_name(string t_n){
       Name=t_
    }
   string getT_Name(){
     return Name;
   }

    void setT_id(string t_id){
     Id=t_id;
    }
   string getT_id(){
     return Id;
   }

    void setPhn_num(string t_Phn_num){
      Phn_num=t_Phn_num;

    }
      string getPhn_num(){
     return Phn_num;
   }
   void showDetails1(){
     cout<<"======================================="<<endl;
     cout<<"Teacher Name      :"<< Name<<endl;
     cout<<"Teacher Id        :"<< Id<<endl;
     cout<<"Teacher Phone No  :"<< Phn_num<<endl;
     cout<<"======================================="<<endl;
   }

   };*/
int main(){

     string c_n,type,id,Phn_no;
     cout<<"Enter Your Customer Type:"<<endl;
    cin>>type;
     cout<<"Enter your Customer Name:"<<endl;
    cin>>c_n;
     cout<<"Enter Your Customer Id:"<<endl;
    cin>>id;
     cout<<"Enter Your Customer Number:"<<endl;
     cin>>Phn_no;

     Customer c1;
     c1.setcType(type);
     c1.setName(c_n);
     c1.setId(id);
     c1.setPhn_num(Phn_no);



     c1.showDetails();
     //t2.showDetails1();

}



