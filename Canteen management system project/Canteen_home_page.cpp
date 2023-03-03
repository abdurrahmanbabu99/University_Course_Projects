#include<iostream>
using namespace std;
class Person{

  protected:
      string Name;
      string Id;
      string Phn_num;
      string Address;
  public:
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
     void setPhn_num(string Phn_no){
    Phn_num=Phn_no;
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
class Employee:public Person{

 private:
       double emp_salary;
       string emp_designation;

   public:

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
     void setSalary(double s){
         emp_salary=s;
      }
      double getSalary(){
        return emp_salary;
      }
     void setDesignation(string d){
        emp_designation=d;
      }
      string getDesignation(){
        return emp_designation;
      }
       void setPhn_num(string phn_no){
        Phn_num=phn_no;
      }
      string getPhn_num(){
        return Phn_num;
      }

      void Display(){
      cout<<"=================Employee Details================"<<endl;
      cout<<"Employee Name        :"<< Name<<endl;
      cout<<"Employee Id          :"<< Id<<endl;
      cout<<"Employee Salary      :"<< emp_salary<<endl;
      cout<<"Employee Designation :"<< emp_designation<<endl;
      cout<<"Employee Phone No    :"<< Phn_num<<endl;
      cout<<"====================================="<<endl;

      }
};

int main()
{
    int Enter;
    //cout << endl;

    cout << "--------------- Canteen Management System---------- \n\n"

    cout << "===============================================================\n"
         << endl;
    cout << " ********************* 1.Admin **********************" << endl;
    cout << "********************** 2.OLD COUSTOMER **********************" << endl;
    cout << " ********************* 3.NEW COUSTOMER **********************" << endl;
    cout << "********************** 4.EXIT          **********************" << endl
         << endl;
    cout << "===============================================================\n\n"
         << endl;

    cout << "  How can i help you SIR/MAM ???PLEASE ENTER OUR KEY ???  " << endl;

    cin >> Enter;

     string name,Id,pass,sal,desig,num;
     int n;
     string emp[100]={"}
     for(int i=0;i<3;i++){
       if (Enter ==1)
    {
         cout << " Enter your Admin ID" << endl;
         cin>>Id;
        cout<<"Enter your Admin password:"<<endl;
        cin>> pass;
        if( Id=="17-12345" && pass=="12345"){

           cout<<"login successfully"<<endl;
           cout<<"******1.Add New Employee Details ******"<<endl;
           cout<<"******2.Display All Employee Record ******"<<endl;
           cout<<"******3.View Sales Record ******"<<endl;
           cout<<"******4.Clear Sales Record *****"<<endl;
           cout<<"Press Any key That You Want to Know:"<<endl;
           cin>>Enter;

           if(Enter==1){
          cout<<"****************Enter Your New Employee Details******************"<<endl;
          cout<<"Enter Your New Employee Name:"<<endl;
          cin>>name;
          cout<<"Enter Your New Employee Id:"<<endl;
          cin>>Id;
          cout<<"Enter Your New Employee Salary:"<<endl;
          cin>>sal;
          cout<<"Enter Your New Employee Designation:"<<endl;
          cin>>desig;
           cout<<"Enter Your New Employee Phone Number:"<<endl;
          cin>>num;
         }



          break;
        }
        else{
            cout<<"Please Enter Again:"<<endl;
        }

    }

     }
     //cout<<"Sorry:"<<endl;
}
