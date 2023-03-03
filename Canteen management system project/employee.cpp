#include<iostream>
using namespace std;
class Employee{

   protected:
       string emp_name;
       string emp_id;
       double emp_salary;
       string emp_designation;
       string emp_phn_no;

   public:
      Employee(string n,string id,double s,string d,string phn_no){
        emp_name=n;
        emp_id=id;
        emp_salary=s;
        emp_designation=d;
        emp_phn_no=phn_no;
      }
      void setName(string n){
        emp_name=n;
      }
      string getName(){
        return emp_name;
      }

       void setId(string id){
        emp_id=id;
      }
      string getId(){
        return emp_id;
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
       void setPhn_no(string phn_no){
        emp_phn_no=phn_no;
      }
      string getPhn_no(){
        return emp_phn_no;
      }
      void Display(){
      cout<<"=================Employee Details================"<<endl;
      cout<<"Employee Name        :"<< emp_name<<endl;

      cout<<"Employee Id          :"<< emp_id<<endl;

      cout<<"Employee Salary      :"<< emp_salary<<endl;

      cout<<"Employee Designation :"<< emp_designation<<endl;

      cout<<"Employee Phone No    :"<< emp_phn_no<<endl;

      cout<<"====================================="<<endl;

      }
};
int main(){

    /*std::cout << "Enter a digit"
   std::cin >> digit;
   std::cin.ignore();

   obj.set_num(digit);

   std::cout << "num in obj is " << obj.get_num();

*/
    Employee E1(string n,string id,double s,string d,string phn_no);
      std::cout<<"Enter your employee name:"<<endl;
       std::cin >> emp_name;
       //std::cin.ignore();

        std::cout << "Enter your  emp Id:"<<endl;
   std::cin >> emp_id;
   //std::cin.ignore();
        std::cout << "Enter emp salary:"<<endl;
   std::cin >> emp_salary;
   //std::cin.ignore();

        std::cout << "Enter emp designation:"<<endl;
   std::cin >> emp_designation;
   //std::cin.ignore();

                             // cin>> E1.emp_na
           std::cout << "Enter your  emp phn no:"<<endl;
           std::cin >> emp_phn_no;
               //std::cin.ignore();

        //("Rashed","E121",12500,"Full Time","01832432333");
    //Employee E2;//("Rony","E122",6000,"Half Time","01873432333");

         E1.Display();
   // E2.Display();

    return 0;
}
