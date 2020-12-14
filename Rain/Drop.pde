class Drop {
   float x = random(width);
   float y = random(-400, 100);
   float z = random (0, 20);
   float len = map(z, 0, 20, 10, 20);
   float yspeed = map(z, 0, 20, 4, 10);
   
   
   void fall(){
     y = y + yspeed;
     yspeed = yspeed + 0.1;
     
     if(y > height){
       //x = random (width);
       y = random(-200, -100);
       yspeed = map(z, 0, 20, 4, 10);
       
     }
   }
   
   void show(){
     float thick = map(z, 0, 20, 1, 3);
     strokeWeight(thick);
     stroke(138, 43, 216);
     
     line(x, y, x, y + len);
   }
   
}
