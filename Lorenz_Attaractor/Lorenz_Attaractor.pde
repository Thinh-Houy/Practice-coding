import peasy.*;


float x = 1;
float y = 1;
float z = 1;

float a = 10;
float b = 25;
float c = 8.0/3.0;

PeasyCam cam;

// Array list to store all points in line 26 - 28
ArrayList<PVector> points = new ArrayList<PVector>();

void setup(){
  
  size(700,600, P3D); 
  colorMode(HSB);
  cam = new PeasyCam(this, 500); 
  
}

void draw(){ 
  background(0);
  float dt = 0.01;
  
  float dx = (a * (y - x)) * dt;
  float dy = (x * (b - z) - y) * dt;
  float dz = ((x * y) - (c * z)) * dt;

  x = x + dx;
  y = y + dy;
  z = z + dz;
  
  /* adding all points into array list */
  points.add(new PVector(x, y, z));
  
  translate(0, 0, -80);
 // translate(width/2, height/2);
  scale(5);  // make it bigger 5 times bigger than the original
  stroke(255);
  noFill();
  float hu = 0;
  beginShape();
  for (PVector v: points){
    stroke(hu, 255, 255);
    point(v.x, v.y, v.z);  // can also use an other funtion to draw like " vertex()"
    hu += 0.1;
    if( hu > 255){
      hu =0;
    }
  }
  endShape();
  
 // println(x,y,z);
}
