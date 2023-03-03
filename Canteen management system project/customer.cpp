#include<iostream>
using namespace std;

class Customer{
  private:
      string customer_name;
      string customer_id;
      string customer_phn_no;
  public:
    Customer(string c_n,string c_id,string c_phn_no){
       customer_name=c_n;
       customer_id=c_id;
       customer_phn_no=c_phn_no;
    }

    void setName(string c_n){
       customer_name=c_n;
    }
   string getName(){
     return customer_name;
   }

    void setId(string c_id){
       customer_id=c_id;
    }
   string getId(){
     return customer_id;
   }

    void setPhn_no(string c_phn_no){
       customer_phn_no=c_phn_no;
    }
   string getPhn_no(){
     return customer_phn_no;
   }

   void showDetails(){
     cout<<"======================================="<<endl;
     cout<<"Customer Name      :"<<customer_name<<endl;
     cout<<"Customer Id        :"<<customer_id<<endl;
     cout<<"Customer Phone No  :"<<customer_phn_no<<endl;
     cout<<"======================================="<<endl;


   }


};
int main(){
    Customer c1("Rakib","c101","12345654344");
    Customer c2("Sakib","c102","12345634444");

       c1.showDetails();
        c2.showDetails();

   return 0;
}
