package com.example.instagram;

public class ModelClass {

   private int userImage;
   private int postPic;
   private String userName;

   public int getUserImage() {
      return userImage;
   }

   public int getPostPic() {
      return postPic;
   }

   public String getUserName() {
      return userName;
   }

   public ModelClass(int userImage, int postPic, String userName) {
      this.userImage = userImage;
      this.postPic = postPic;
      this.userName = userName;
   }
}
