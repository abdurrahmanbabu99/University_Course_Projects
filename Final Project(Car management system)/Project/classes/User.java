package classes;

import java.lang.*;

    public abstract class User
    {
        protected String userName;
        //protected String userType;
        protected String userNid;
        protected String userAddress;
        protected String userPhoneNo;

        public User(String userName, String userNid, String userAddress, String userPhoneNo) {
            this.userName = userName;
            this.userNid = userNid;
            this.userAddress = userAddress;
            this.userPhoneNo = userPhoneNo;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

       /* public String getUserType() {
            return userType;
        }
		*/

       /* public void setUserType(String userType) {
            this.userType = userType;
        }
		*/

        public String getUserNid() {
            return userNid;
        }

        public void setUserNid(String userNid) {
            this.userNid = userNid;
        }



        public String getUserAddress() {
            return userAddress;
        }

        public void setUserAddress(String userAddress) {
            this.userAddress = userAddress;
        }

        public String getUserPhoneNo() {
            return userPhoneNo;
        }

        public void setUserPhoneNo(String userPhoneNo) {
            this.userPhoneNo = userPhoneNo;
        }

        public abstract void showDetails();/* {
            System.out.println("User Name : " + userName);
            System.out.println("User Login : " + userId);
            System.out.println("User Type : " + userType);
            System.out.println("User Nid Number : " + userNid);
            System.out.println("User Password : " + userPassword);
            System.out.println("User Address : " + userAddress);
            System.out.println("User Phone Number : " + userPhoneNo);
        }*/

    }
