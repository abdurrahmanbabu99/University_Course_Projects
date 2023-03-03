#include<iostream>
#include<string>
using namespace std;
int main(){

   cout<<"<<<<<--------CONTACT MANAGEMENT SYSTEM-------->>>>>"<<endl;

   int n;

   cout<<"How Many Number You Want to Store?:"<<endl;

   cin>>n;

  string num[100];

  string name[100];

  string Phone_Number_List[100];

  string Phone_Number_Name[100];

   const int Phone_Number=11;


for(int i=0;i<n;i++){

   bool flag=true;

    cout<<"Enter Your Number:"<<endl;

     cin>> num[i];

     cout<<"Enter Your Name:"<<endl;

     cin>> name[i];

   while(flag){

   if(num[i].length()==Phone_Number) {

          cout<<"Your Number is Valid:"<< num[i]<<endl;

     for(int j=0;j<i;j++){

        if(num[j]==num[i]){
            cout<<"This Number Is Already Stored!!!"<<endl;
            i--;
        }
     }
           flag=false;
 }
 else{

    cout<<"Your Number is Invalid!!!"<<endl;

    cout<<"Please Enter Your Valid Number:"<<endl;
    i--;
    break;

 }
}
}
        cout<<"========== Your Phone Contact List: =========="<<endl;

        for(int i=0;i<n;i++){
          int k=0;

         Phone_Number_List[k]= num[i];
         Phone_Number_Name[k]= name[i];

         cout<< Phone_Number_List[k]<<endl;
         cout<<Phone_Number_Name[k]<<endl;
    }
}


